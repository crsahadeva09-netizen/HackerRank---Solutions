// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/22cs102033s/challenges/priority-queue-leaderboard-ranking-in-a-coding-contest/problem?isFullScreen=true
// Problem     Priority Queue - Leaderboard Ranking in a Coding Contest
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 11:44 a.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<size; i++){
            pq.add(sc.nextInt());
        }
        
        int n = sc.nextInt();
        
        for(int i=1; i<n; i++){
            pq.poll();
        }
        
        System.out.println(pq.poll());
    }
}
