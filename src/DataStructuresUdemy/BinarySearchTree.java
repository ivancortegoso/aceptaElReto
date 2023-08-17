package DataStructuresUdemy;

import java.util.Stack;


public class BinarySearchTree {

    private Node root;

    class Node {

        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) {
                return false;
            }
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public Integer kthSmallest(int k) {
        Stack<Integer> stack = new Stack<>();
        class Traversal {

            Traversal(Node n) {
                if (n.left != null) {
                    new Traversal(n.left);
                }
                stack.push(n.value);
                if (n.right != null) {
                    new Traversal(n.right);
                }
            }
        }
        new Traversal(this.root);
        if (stack.size() < k) return null;
        Integer res = stack.pop();
        for (int i = stack.size(); i >= k; i--) res = stack.pop();
        return  res;
    }

}
