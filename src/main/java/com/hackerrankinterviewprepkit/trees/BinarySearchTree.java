package com.hackerrankinterviewprepkit.trees;


public class BinarySearchTree {

    class Node {
        int key;

        Node left;
        Node right;

        Node(int item) {
            this.key = item;
            left = null;
            right = null;
        }
    }

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }


    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
        } else if (key > root.key){
            root.right = insertRec(root.right, key);
        } else if (key < root.key){
            root.left = insertRec(root.left, key);
        }

        return root;
    }
}
