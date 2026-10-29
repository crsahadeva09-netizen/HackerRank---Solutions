// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/22cs102033s/challenges/priority-queue-ayushi-and-the-magical-chocolate-piles/problem?isFullScreen=true
// Problem     Priority Queue - Ayushi and the Magical Chocolate Piles
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 11:13 a.m.
// Technique   max-priority-queue-simulation
// Time        O(k log N + N)
// Space       O(N)
// Insight     The algorithm maintains a max-heap to repeatedly extract the largest pile, update it to its integer square root, and reinsert it into the heap for k iterations.
// Interview   Before: "How would you efficiently track the largest pile after each modification?" After: "Using a max-heap allows O(log N) extraction and insertion, resulting in O(k log N) total time complexity, which is optimal for k iterations over N piles."
// Pitfalls    (1) Using a standard min-heap instead of a max-heap, which fails to target the largest pile as required by the problem statement.  (2) Forgetting to cast the square root result to an integer, which causes type mismatch errors or incorrect values.  (3) Failing to re-insert the updated pile into the priority queue, which leads to an incorrect final sum.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=1; i<=size; i++){
            pq.add(sc.nextInt());
        }
        
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            int x = pq.poll();
            x = (int)Math.sqrt(x);
            pq.add(x);
        }
        
        int sum = 0;
        
        for(int i:pq){
            sum += i;
        }
        
        System.out.println(sum);
        
    }
}
