package com.scaler.dsa.homework;


public class LargestCoprimeDivisor {
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public int cpFact(int A, int B) {
        while (gcd(A, B) != 1) {
            // dividing A by gcd(A, B)
            A = A / gcd(A, B);
        }
        return A;
    }
}

/*1) X lies in the range [1, A] both inclusive
2) X will also be a factor of A as A % X == 0.
Suppose X has possible values. i.e. factors as {X1, X2, X3, …, Xn}
3) If GCD of (A, B) is Xk Then Xk can never be our answer as GCD(Xk, B) != 1
4) So our aim is to eliminate all the common factors amongst A,B
5) To achieve step 4 we will iteratively keep dividing A / GCD(A, B) until we get GCD(Ai, B) as 1.
Note: When we divide A with some factor of A, then the new value that we get is also a factor of A.
Therefore we are still maintaining some factor of A at the A position*/


/*Q2. Largest Coprime Divisor
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are given two positive numbers A and B . You need to find the maximum valued integer X such that:

X divides A i.e. A % X = 0
X and B are co-prime i.e. gcd(X, B) = 1


Problem Constraints

1 <= A, B <= 109



Input Format

First argument is an integer A.
Second argument is an integer B.



Output Format

Return an integer maximum value of X as descibed above.



Example Input

Input 1:

 A = 30
 B = 12
Input 2:

 A = 5
 B = 10


Example Output

Output 1:

 5
Output 2:

 1


Example Explanation

Explanation 1:

 All divisors of A are (1, 2, 3, 5, 6, 10, 15, 30).
 The maximum value is 5 such that A%5 == 0 and gcd(5,12) = 1
Explanation 2:

 1 is the only value such that A%5 == 0 and gcd(1,10) = 1
*/

/*We can try to remove the common factors of A and B from A by finding the greatest common divisor (gcd) of A and B and dividing A with that gcd.

Mathematically, A = A / gcd(A, B) —— STEP1
Now, we repeat STEP1 till we get gcd(A, B) = 1.
Atlast, we return X = A

How does this work ?

On doing prime factorization of A and B, we get :

A = p1x1 . p2x2 . … . pkxk
B = q1y1 . q2y2 . … . qlyl
Where pi ; i = 1, 2, …, k are prime factors of A and xi ; i = 1, 2, …, k are their respective powers
Similarly, qj ; i = 1, 2, …, l are prime factors of B and yi ; j = 1, 2, …, l are their respective powers

Let ri ; i = 1, 2, …, m be the common factors of A and B. By repeating STEP1, we are reducing the respective powers of ri by at least one each time (Proof of this is left to the reader). Therefore, we reach a point where powers of ri become zero, and the product of the rest prime-powers in A form the largest divisor of A that is co-prime with B.*/