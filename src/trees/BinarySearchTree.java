package trees;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

    // Helper method for insertion
    public void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    private Node insertRec(Node root, int key) {
        // 1. If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // 2. Otherwise, recur down the tree
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }

        // return the (unchanged) node pointer
        return root;
    }
}