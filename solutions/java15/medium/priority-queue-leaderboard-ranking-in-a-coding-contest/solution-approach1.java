// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/22cs102033s/challenges/priority-queue-leaderboard-ranking-in-a-coding-contest/problem?isFullScreen=true
// Problem     Priority Queue - Leaderboard Ranking in a Coding Contest
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 11:44 a.m.
// Technique   max-priority-queue-poll
// Time        O(N log N)
// Space       O(N)
// Insight     The implementation uses a max-priority queue to store all scores and extracts the top element K times to retrieve the Kth largest value.
// Interview   Before: "How would you find the Kth largest element in an unsorted list?" After: "I would use a max-priority queue to sort the elements in O(N log N) time, then poll K times to reach the target rank, ensuring O(N) space complexity."
// Pitfalls    (1) The code assumes K is within the range [1, N] as per the problem logic, but does not explicitly validate if K exceeds the number of elements.  (2) Using a max-priority queue for all N elements results in O(N log N) time complexity, which may be inefficient for very large N compared to a min-heap of size K.
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
