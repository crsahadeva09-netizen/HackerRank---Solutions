// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/22cs102033s/challenges/binary-search-tree-finding-the-cheapest-product/problem?isFullScreen=true
// Problem     Binary Search Tree - Finding the Cheapest Product
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-21, 10:13 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

class Node{
    int data;
    Node right;
    Node left;
    
    public Node(int data){
        this.data = data;
        right = left = null;
    }
}

class  Binarysearchtree
{
   public Node buildbst(Node root,  int val)
   {
       if(root == null)
         return new Node(val);  
       else if(val < root.data)
         root.left = buildbst(root.left , val);
       else if(val > root.data)
         root.right = buildbst(root.right , val);
         
      return root;
   }
   
   public int cheap(Node root){
        if(root.left == null){
            return root.data;
        }
        
        return cheap(root.left);
   }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        Binarysearchtree bst = new Binarysearchtree();
        Node root = null;
        
        for(int i=0; i<size; i++){
            root = bst.buildbst(root, sc.nextInt());
        }
        
        System.out.print(bst.cheap(root));
    }
}
