// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/22cs102033s/challenges/sorting-arranging-students-by-marks/problem?isFullScreen=true
// Problem     Sorting - Arranging Students by Marks
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-26, 03:19 p.m.
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
