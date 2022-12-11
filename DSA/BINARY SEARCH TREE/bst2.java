import java.util.ArrayList;

public class bst2 {
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
            root.left = insert(root.left, val);
        } else {
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
        } else if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }

    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else {
                Node IS = inorderSuccesser(root.right);
                root.data = IS.data;
                root.right = delete(root.right, val);
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

    public static void printInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        } else if (root.data >= y) {
            printInRange(root.left, x, y);
        } else {
            printInRange(root.right, x, y);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void RtoLPath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        // leaf
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            RtoLPath(root.left, path);
            RtoLPath(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        // int values[] = { 8, 5, 3, 6, 10, 11, 14 };
        Node root = null;

        // this is for insert the value in the tree
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // this is for print the inorder of tree
        inorder(root);

        // this is for search the value in the tree
        System.out.println();
        System.out.println(search(root, 9));

        // this is for delete the node
        delete(root, 7);
        inorder(root);

        // this is for print in range
        System.out.println();
        printInRange(root, 1, 3);

        // this is for root to leaf path with use of arraylist
        System.out.println();
        RtoLPath(root, new ArrayList<>());
    }
}
