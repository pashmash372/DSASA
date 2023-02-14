package com.scaler.dsa.assignment;


import java.util.Arrays;

public class PrimeSum {
    public int[] sieve(int N) {
        // Generate isPrime List less equal than N
        int[] isPrime = new int[N + 1];
        isPrime[0] = 0;
        isPrime[1] = 0;
        for (int i = 2; i <= N; i++) {
            isPrime[i] = 1;
        }
        // Sieve of Erastothenes
        for (int i = 2; i <= N; i++) {
            if (isPrime[i] == 0) continue;
            if (i > N / i) break;
            for (int j = i * i; j <= N; j += i)
                isPrime[j] = 0;
        }
        return isPrime;
    }

    public int[] primesum(int A) {
        int[] isPrime = sieve(A);
        int[] ans = new int[2];
        for (int i = 2; i <= A; ++i) {
            if (isPrime[i] == 1 && isPrime[A - i] == 1) {
                ans[0] = i;
                ans[1] = A - i;
                return ans;
            }
        }
        return ans;
    }
}

class PrimeSum1 {
    public int[] sieve(int N) {
//        0 => not prime , 1 =>  prime
        int[] s = new int[N + 1];
        Arrays.fill(s, 1);

        int sqrtOfN = (int) Math.sqrt(N);

        s[0] = 0;
        s[1] = 0;
        for (int i = 2; i < sqrtOfN; i++) {
            if (s[i] == 1) {
                for (int j = i * 2; j < N; j += i) {
                    s[j] = 0;
                }
            }
        }
        return s;
    }

    public int[] primesum(int A) {
        int[] isPrime = sieve(A);
        int[] ans = new int[2];
        for (int i = 2; i <= A; ++i) {
            if (isPrime[i] == 1 && isPrime[A - i] == 1) {
                ans[0] = i;
                ans[1] = A - i;
                return ans;
            }
        }
        return ans;
    }
}
/*
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an even number A ( greater than 2 ), return two prime numbers whose sum will be equal to the given number.

If there is more than one solution possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b, and [c,d] is another solution with c <= d, then
[a, b] < [c, d], If a < c OR a==c AND b < d.
NOTE: A solution will always exist. Read Goldbach's conjecture.



Problem Constraints
4 <= A <= 2*107



Input Format
First and only argument of input is an even number A.



Output Format
Return a integer array of size 2 containing primes whose sum will be equal to given number.



Example Input
 4


Example Output
 [2, 2]


Example Explanation
 There is only 1 solution for A = 4.*/

/*Read hint1 if you have not already.

Now, coming to the problem of generating prime numbers quickly, we already have a problem SIEVE where we did it.
However, re-iterating, there are multiple ways of doing it. Probably the easiest way is Sieve of Eratosthenes.

Look at the following video to get a detailed idea about the approach :*/