// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/22cs102033s/challenges/sorting-arranging-students-by-marks/problem?isFullScreen=true
// Problem     Sorting - Arranging Students by Marks
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-26, 03:19 p.m.
// Technique   insertion-sort-array
// Time        O(n^2)
// Space       O(1)
// Insight     The algorithm maintains a sorted prefix of the array by iteratively shifting elements greater than the current key to the right and inserting the key into its correct position.
// Interview   Before: "How would you sort an array of marks efficiently if the data is nearly sorted?" After: "Insertion sort is ideal here, achieving O(n^2) worst-case time complexity while using O(1) auxiliary space, which is efficient for small or partially ordered datasets."
// Pitfalls    (1) Starting the outer loop index at 0 instead of 1, which causes an unnecessary comparison for the first element.  (2) Incorrectly handling the inner loop boundary condition j >= 0, which leads to an ArrayIndexOutOfBoundsException when the key is smaller than all elements in the sorted prefix.  (3) Failing to correctly place the key at arr[j+1] after the while loop terminates, resulting in an unsorted array.
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
        
        // Insertion Sort
        
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1] = key;
        }
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


// for(int i=1; i<n; i++){
//             int key = arr[i];
//             for(int j=i-1; j>=0; j--){
//                 if(arr[j]>key){
//                     arr[j+1] = arr[j];
//                 }else{
//                     arr[j] = key;
//                     continue;
//                 }
//             }
//         }
        
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }
