package com.scaler.dsa.assignment;

import java.util.ArrayList;

public class PrimeSubsequences {
    int mn = (int) (1e6 + 5);
    long mod = (long) (1e9 + 7);

    boolean[] prime = new boolean[mn];

    public int solve(ArrayList<Integer> A) {
        sieve();
        long count = 0;
        for (int i : A) {
            count += !prime[i] ? 1 : 0;
        }
        return (int) ((fpow(2L, count) - 1 + mod) % mod);
    }


    public long fpow(long x, long y) {
        long res = 1;
        while (y > 0) {
            if ((y & 1) == 1) {
                res *= x;
                res %= mod;
            }
            x *= x;
            x %= mod;
            y = y >> 1;
        }
        return res;
    }


    public void sieve() {
        if (prime[0]) return;
        prime[0] = prime[1] = true;
        int n = (int) Math.sqrt(mn);
        for (int i = 2; i < n; i += 1) {
            if (!prime[i]) {
                for (int j = i * i; j < mn; j += i) {
                    prime[j] = true;
                }
            }
        }
    }
}

/*Anther solutin*/

  class PrimeSubsequences1 {
    public int solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        long count = 0L;
        int mod = 1000000007;
        for (int i = 0; i < A.size(); i++) {
            max = Math.max(max, A.get(i));
        }
        boolean isPrime[] = new boolean[max + 1];
        sieve(max, isPrime);
        long num = 1L;
        for (int i = 0; i < A.size(); i++) {
            if (isPrime[A.get(i)] == true) {
                count = ((count % mod) + (num % mod)) % mod;
                num = (num * 2) % mod; //this line is important
            }
        }
        return (int) count;
    }

    public boolean sieve(int n, boolean isPrime[]) {
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i] == true) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return false;
    }
}


/*#define long long long int

const int mn = 1e6 + 5;
const ll mod = 1e9+7;

bool prime[mn];

ll fpow(ll a, ll g) {
    ll ag = 1;
    while(g) {
        if(g & 1) ag = (ag * a) % mod;
        a = (a * a) % mod;
        g >>= 1;
    }
    return ag;
}

void sieve() {
    if(prime[0]) return;
    prime[0] = prime[1] = 1;
    int n = sqrt(mn);
    for(int i = 2; i < n; i += 1) {
        if(!prime[i]) {
            for(int j = i*i; j < mn; j += i) {
                prime[j] = 1;
            }
        }
    }
}

int Solution::solve(vector<int> &A) {
    sieve();
    ll a = 0;
    for(auto &i : A) {
        a += !prime[i];
    }
    return (fpow(2ll, a) - 1 + mod) % mod;
}*/

/*
* steps
1. First make SOE for checking element given in array is prime or not
2. We know that total number of subsequences possible if all elements in array are prime is 2^n - 1 excluding empty steps
 Based on this, while iterating through array, if element is prime then it will give us 2^n - 1 prime sequence
 similar concept I used while calculating total below
TC : O(n)*/

/*Q4. Prime Subsequences
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given an array A having N positive numbers. You have to find the number of Prime subsequences of A.

A Prime subsequence is one that has only prime numbers, for example [2, 3], [5] are the Prime subsequences where [2, 4] and [1, 2, 3, 4] are not.



Input Format

The first argument given is an Array A, having N integers.
Output Format

Return an integer X, i.e number of Prime subsequences.
As X can be very large print X % (1000000007), here % is modulus operator.
Constraints

1 <= N <= 1e3
1 <= A[i] <= 1e6
For Example

Input:
    A = [1, 2, 3]
Output:
     3

Explanation:
    no. Subsequences      Prime subsequences
    1.  [1]                     No
    2.  [1, 2]                  No
    3.  [1, 3]                  No
    4.  [1, 2, 3]               No
    5.  [2]                     Yes
    6.  [2, 3]                  Yes
    7.  [3]                     Yes
    8.  []                      No

    here we have 3 subsequences(5, 6, 7) those have only prime number(s).
See Expected Output*/

/*Let M be the number of prime integers in an array, then the number of Prime Subsequences will be ((2 ^ M) - 1).
Can you prove this?*/