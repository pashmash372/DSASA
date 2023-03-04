package com.scaler.dsa.homework;

import java.util.*;

public class BthSmallestPrimeFraction {
    public int[] solve(int[] A, int B) {
        int K = B;
        PriorityQueue<Pair> q = new PriorityQueue<>(new CustomComp());
        Map<Integer, Integer> nxt = new HashMap<>();
        for (int i = A.length - 1; i > 0; i--) {
            if (nxt.containsKey(A[i])) nxt.replace(A[i], A[i - 1]);
            else nxt.put(A[i], A[i - 1]);
        }
        double last = A[A.length - 1];
        double d;
        if (nxt.containsKey(1)) nxt.replace(1, 0);
        else nxt.put(1, 0);

        for (int i = 0; i < A.length; i++) {
            d = (double) A[i] / last;
            q.offer(new Pair(d, A[i], (int) last));
        }
        while (q.size() > 0 && K > 0) {
            K--;
            if (K == 0) break;
            Pair p = q.poll();
            if (nxt.containsKey(p.tt) && nxt.get(p.tt) != 0) {
                p.tt = nxt.get(p.tt);
                d = (double) p.ss / (double) p.tt;
                q.offer(new Pair(d, p.ss, p.tt));
            }
        }
        int[] ret = new int[2];
        ret[0] = q.peek().ss;
        ret[1] = q.peek().tt;
        return ret;
    }
}

class Pair {
    double ff;
    int ss;
    int tt;

    public Pair(double ff, int ss, int tt) {
        this.ff = ff;
        this.ss = ss;
        this.tt = tt;
    }
}

/*increasing order sorting */
class CustomComp implements Comparator<Pair> {

    @Override
    public int compare(Pair a, Pair b) {
        if (a.ff > b.ff) return 1;
        return -1;
    }
}

/*Custom Comparator using Pair, MAX HEAP*/

class BthSmallestPrimeFraction1 {
    public int[] solve(int[] A, int B) {

        ArrayList<Pair1> arr = new ArrayList<>();
        int n = A.length;

        for (int i = 0; i < n; i++) {
            int p = A[i];
            for (int j = i + 1; j < n; j++) {
                int q = A[j];
                if (p < q) {
                    arr.add(new Pair1(p, q));
                }
            }
        }

        PriorityQueue<Pair1> pq = new PriorityQueue<>(new CustomComparator());
        for (Pair1 p : arr) {
            if (pq.size() < B) {
                pq.add(p);
            } else {
                Pair1 p2 = pq.peek();
                double f1 = (double) p.x / p.y;
                double f2 = (double) p2.x / p2.y;
                if (f1 < f2) {
                    pq.poll();
                    pq.add(p);
                }
            }
        }

        Pair1 top = pq.peek();
        return new int[]{top.x, top.y};
    }
}

class Pair1 {
    int x;
    int y;

    public Pair1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// decreasing order
class CustomComparator implements Comparator<Pair1> {
    public int compare(Pair1 p1, Pair1 p2) {
        double f1 = (double) p1.x / p1.y;
        double f2 = (double) p2.x / p2.y;
        return Double.compare(f2, f1);
    }
}


/*Q3. B-th Smallest Prime Fraction
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a sorted array of integers A which contains 1 and some number of primes.
Then, for every p < q in the list, we consider the fraction p / q.

What is the B-th smallest fraction considered?

Return your answer as an array of integers, where answer[0] = p and answer[1] = q.



Problem Constraints
1 <= length(A) <= 2000
1 <= A[i] <= 30000
1 <= B <= length(A)*(length(A) - 1)/2



Input Format
The first argument of input contains the integer array, A.
The second argument of input contains an integer B.



Output Format
Return an array of two integers, where answer[0] = p and answer[1] = q.



Example Input
Input 1:

 A = [1, 2, 3, 5]
 B = 3
Input 2:

 A = [1, 7]
 B = 1


Example Output
Output 1:

 [2, 5]
Output 2:

 [1, 7]


Example Explanation
Explanation 1:

 The fractions to be considered in sorted order are:
 [1/5, 1/3, 2/5, 1/2, 3/5, 2/3]
 The third fraction is 2/5.
Explanation 2:

 The fractions to be considered in sorted order are:
 [1/7]
 The first fraction is 1/7.
*/

/*The brute-force solution for this problem would be to generate all the possible combinations, sort them by their value and then return the Kth element.

The complexity of this solution would be O(N2log2(N2),
which exceeds the allocated time limit.

Instead, what we can do is use a min-heap such that its size never exceeds N.
We can achieve this by maintaining a heap that stores the following structure:

(A[j]/A[i], i, j)
We know that if we increase the denominator, the value of the fraction decreases.

Initially, we push all the elements divided by the largest element, as they will be the smallest fractions.
Now, we remove the smallest element in the min-heap,
increase its denominator if possible and then insert it back into the min-heap.

After doing this B times, the element on the top will be the B-th smallest fraction.
The complexity of this solution will be O(N2log2(N)).*/