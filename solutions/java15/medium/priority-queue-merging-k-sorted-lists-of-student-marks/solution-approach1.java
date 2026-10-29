// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/22cs102033s/challenges/priority-queue-merging-k-sorted-lists-of-student-marks/problem?isFullScreen=true
// Problem     Priority Queue - Merging K Sorted Lists of Student Marks
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 12:11 p.m.
// Technique   priority-queue-min-heap
// Time        O(N log N)
// Space       O(N)
// Insight     The implementation aggregates all elements from K sorted lists into a single min-heap and extracts them in non-decreasing order.
// Interview   Before: "I would merge these lists using a k-way merge with a min-heap of size K." After: "Since the total number of elements N is small, I used a single min-heap to store all elements, resulting in O(N log N) time and O(N) space complexity."
// Pitfalls    (1) The implementation ignores the sorted property of input lists by inserting all elements into a single heap.  (2) The memory usage scales linearly with the total number of elements N rather than the number of lists K.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        while(T--!=0){
            int size = sc.nextInt();
            
            for(int i=0; i<size; i++){
                pq.add(sc.nextInt());
            }
        }
        
        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }
    }
}
