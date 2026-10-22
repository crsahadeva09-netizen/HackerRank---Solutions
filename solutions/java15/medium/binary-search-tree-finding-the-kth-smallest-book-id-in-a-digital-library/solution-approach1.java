// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/22cs102033s/challenges/binary-search-tree-finding-the-kth-smallest-book-id-in-a-digital-library/problem?isFullScreen=true
// Problem     Binary Search Tree - Finding the Kth Smallest Book ID in a Digital Library
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-22, 11:10 a.m.
// Technique   recursive-in-order-traversal
// Time        O(N)
// Space       O(H)
// Insight     The algorithm performs an in-order traversal of the binary search tree, incrementing a counter at each node until the counter matches the target rank k.
// Interview   Before: "How do I find the Kth smallest element in a BST?" After: "Perform an in-order traversal, which visits nodes in ascending order. By maintaining a counter, we stop at the Kth node. This approach takes O(N) time and O(H) space, where H is the tree height."
// Pitfalls    (1) Failing to handle the case where k exceeds the total number of nodes in the tree.  (2) Using a local variable for the counter instead of a class-level field, which prevents the count from persisting across recursive calls.  (3) Incorrectly assuming the tree is balanced, leading to O(N) space complexity in the worst-case scenario of a skewed tree.
// ──────────────────────────────────────────────────

import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int val){
        data = val;
        left = null;
        right = null;
    }
}
class BinarySearchTree{
    public Node buildbst(Node root,int val){
        if(root == null)
            return new Node(val);
        else if(val>root.data)
            root.right = buildbst(root.right,val);
        else if(val<root.data)
            root.left = buildbst(root.left,val);

        return root;
    }
    
    int count = 0;

    public void inorder(Node root, int k){
        if(root == null || count>k){
            return;
        }
        
        inorder(root.left, k);
        count++;
        if(count == k){
            System.out.println(root.data);
            return;
        }
        inorder(root.right, k);
    }
    
}

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        int n = sc.nextInt();
        Node root = null;
        for(int i = 0;i<n;i++){
            int val = sc.nextInt();
            root = bst.buildbst(root,val);

        }
        
        int k = sc.nextInt();
        
        bst.inorder(root, k);
        
    }
}



