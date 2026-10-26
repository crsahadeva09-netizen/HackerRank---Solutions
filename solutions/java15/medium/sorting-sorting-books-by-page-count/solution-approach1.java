// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/22cs102033s/challenges/sorting-sorting-books-by-page-count/problem?isFullScreen=true
// Problem     Sorting -  Sorting Books by Page Count
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-26, 02:40 p.m.
// Technique   selection-sort
// Time        O(n^2)
// Space       O(n)
// Insight     The algorithm iteratively identifies the minimum element in the unsorted portion of the array and swaps it into the current position, effectively building the sorted sequence from left to right.
// Interview   Before: "How would you implement a sorting algorithm for this list?" After: "I used selection sort, which has an O(n^2) time complexity. It repeatedly finds the smallest element in the remaining unsorted subarray and places it at the beginning, ensuring the list is sorted in ascending order."
// Pitfalls    (1) The implementation uses selection sort instead of the requested bubble sort algorithm.  (2) The nested loop structure iterates up to n-1, which may cause an index out of bounds error if the input n is zero.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<n-1; i++){
            int minidx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minidx]){
                    minidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
