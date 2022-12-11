
// due to bst the time complaxity is O(log(n)) so that is a good property for search in a tree
// properties of BST
// a> left subtree nodes < root
// b> right subtree nodes > root
// c> left and right subtree are also ast withno duplicates

// importent- in binary serarch tree inorder sequence is always a sorted sequence in increasing order 
// worst case time complaxity in bst in O(h) h is height of tree 
// worst case time complaxity is bst is O(log(n)) when tree is compleatly balance

public class bst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right sub tree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {// left sub tree
            return search(root.left, key);
        }
        if (root.data == key) {// match
            return true;
        } else {// right subtree
            return search(root.right, key);
        }
    }

    // delete a node
    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // case 1
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else {
                Node IS = inorderSuccesser(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }

        }
        return root;
    }

    public static Node inorderSuccesser(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        // time complaxity is O(H)
        System.out.println(search(root, 4));
        System.out.println();

        delete(root, 5);
        inorder(root);
    }

}