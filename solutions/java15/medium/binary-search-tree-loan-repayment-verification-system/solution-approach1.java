// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/22cs102033s/challenges/binary-search-tree-loan-repayment-verification-system/problem?isFullScreen=true
// Problem     Binary Search Tree - Loan Repayment Verification System
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-22, 11:47 a.m.
// Technique   recursive-dfs-path-sum
// Time        O(N log N) on average, O(N^2) worst case
// Space       O(H) where H is tree height
// Insight     The algorithm recursively subtracts the current node's value from the target sum and returns true if a leaf node is reached with a remaining target sum of zero.
// Interview   Before: "How do I verify if a path sum exists?" After: "Perform a recursive DFS, subtracting node values from the target. A path is valid only if the target reaches zero exactly at a leaf node, resulting in O(N) time complexity for the traversal."
// Pitfalls    (1) The code fails to identify a path if the target sum is reached at an internal node rather than a leaf node.  (2) The BST construction logic does not handle duplicate transaction values, which may lead to unexpected tree structures if duplicates are provided in the input.
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

    public boolean func(Node root, int target){
        if(root == null){
            return false;
        }
        
        target = target - root.data;
        if(root.left == null && root.right == null){
            if(target == 0){
                return true;
            }else  return false;
        }
        return func(root.left, target) || func(root.right, target);
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
        
        System.out.println(bst.func(root, k));
        
    }
}
