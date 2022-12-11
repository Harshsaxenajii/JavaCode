import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

// top is called root
// connected with branches
// and the links elemants are called leaf

// build tree perorder

//a> preorder treversal
// 1- Root 
// 2- left subtree
// 3- right subtree

//b> inorder treversal
// left subtree
// root
// right sub tree

//c> postroder treversal
// left subtree
// right subtree
// root

//d> level order terversal
//use iteration
//use queue data staracture due to fifo property
// sivling se pahle child ko nikal de aapne new array se
//bfs - brefth first search order property use here 
//dfs - is no present here it is present on above all serarch

//count of node

public class tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root) {
        // time complexity O(n)
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void inOrder(Node root) {
        // time complexity O(n)
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        // time complexity O(n)
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // function for counting of totel nodes
    // time complaxity is O(n)
    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;

    }

    // some of all nodes data
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;

    }

    // height of tree
    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeigth = heightOfTree(root.left);
        int rightHeigth = heightOfTree(root.right);
        int myHeight = Math.max(leftHeigth, rightHeigth) + 1;
        return myHeight;

    }

    // diameter of nodes ( importent question )
    // time complaxity = O(n^2)
    public static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameterOfTree(root.left);
        int diam2 = diameterOfTree(root.right);
        int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;
        return Math.max(diam3, Math.max(diam1, diam2));

    }

    // another way with time complaxity is O(n)
    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameterOfTree1(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameterOfTree1(root.left);
        TreeInfo right = diameterOfTree1(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;
        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;
    }

    // find subtree of another tree ((leet code problem def to run here ))
    public static boolean isIdent(Node root, Node subroot) {
        if (root == null && subroot == null) {
            return true;
        }
        if (root == null || subroot == null) {
            return false;
        }
        if (root.data == subroot.data) {
            return isIdent(root.left, subroot.left) && isIdent(root.right, subroot.right);
        }
        return false;
    }

    public static boolean subTree(Node root, Node subroot) {
        if (subroot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdent(root, subroot)) {
                return true;
            }

        }
        return subTree(root.left, subroot) || subTree(root.right, subroot);
    }

    public static void main(String[] args) {
        // preorder sequence of the tree
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("this is the value of node");
        System.out.println(root.data);

        System.out.println("this is perorder treversal");
        preorder(root);
        System.out.println();

        System.out.println("this is inorder treversal");
        inOrder(root);
        System.out.println();

        System.out.println("this is postorder terversal");
        postOrder(root);
        System.out.println();

        System.out.println("this is level order treversal");
        levelOrder(root);

        int count = countOfNodes(root);
        System.out.println("the total number of nodes are: " + count);

        int sum = sumOfNodes(root);
        System.out.println("the total sum of nodes are: " + sum);

        int height = heightOfTree(root);
        System.out.println("the height of the tree is: " + height);

        int diameter = diameterOfTree(root);
        System.out.println("the diameter of tree is: " + diameter);

        System.err.println(diameterOfTree1(root).diam);

    }

}