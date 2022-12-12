package com.scaler.dsa.homework;

public class GCD_CMPL {
}
/*Q1. GCD_CMPL
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
In the following C++ function, let n >= m.

    int gcd(int n, int m) {
            if (n%m ==0) return m;
            if (n < m) swap(n, m);
            while (m > 0) {
                n = n%m;
                swap(n, m);
            }
            return n;
    }
What is the time complexity of the above function assuming n > m?.
Θ symbol represents theta notation and Ω symbol represents omega notation.*/

/*Choose the correct answer from below:
Θ(logn)
Ω(n)
Θ(loglogn)
Θ(sqrt(n))*/

/* ans is */
/*Θ(logn)*/