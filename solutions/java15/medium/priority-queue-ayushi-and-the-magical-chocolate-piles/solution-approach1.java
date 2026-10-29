// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/22cs102033s/challenges/priority-queue-ayushi-and-the-magical-chocolate-piles/problem?isFullScreen=true
// Problem     Priority Queue - Ayushi and the Magical Chocolate Piles
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 11:13 a.m.
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
