package com.spring.leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution589 {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            this.children = _children;
        }
    }


    static class Solution {
        public List<Integer> preorder(Node root) {
            LinkedList<Node> stack = new LinkedList<>();
            LinkedList<Integer> output = new LinkedList<>();
            if (root == null) {
                return output;
            }

            stack.add(root);
            while (!stack.isEmpty()) {
                Node node = stack.pollLast();
                output.add(node.val);
                Collections.reverse(node.children);
                for (Node item : node.children) {
                    stack.add(item);
                }
            }
            return output;
        }

    }


    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        List<Node> objects = new ArrayList<>();
        objects.add(n2);
        objects.add(n3);
        objects.add(n4);
        n1.children = objects;
        List<Node> s = new ArrayList<Node>();
        s.add(n5);
        s.add(n6);
        n3.children = s;

        List<Integer> preorder = new Solution().preorder(n1);
        for (Integer i : preorder) {
            System.out.print(i + " ");
        }
    }

}
