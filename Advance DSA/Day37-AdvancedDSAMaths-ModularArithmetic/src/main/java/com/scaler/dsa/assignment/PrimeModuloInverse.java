package com.scaler.dsa.assignment;


public class PrimeModuloInverse {
    long power(long x, long y, long p) {
        long res = 1;        // Initialize result
        x = x % p;        // Update x if it is more than or equal to p
        while (y > 0) {
            // If y is odd, multiply x with result
            if ((y & 1) == (long)1)
                res = (res*x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    public int solve(int A, int B) {
        // Modular inverse of A Modulo B = pow(A, B - 2, B)
        return (int)power(A, B - 2, B);
    }
}

/*powerFunctionRecursion*/

class powerFunctionRecursion{
    private double power(double x, int n)
    {
        if(n == 0)
            return 1;
        if(x == 0.0)
            return x;
        if(n == 1)
            return x;

        double ans = power(x, n/2);
        if(n%2 == 0)
            return ans*ans;
        else
            return x*ans*ans;
    }

    public double myPow(double x, int n) {
        return n > 0 ? power(x,n) : 1/power(x,n);
    }
}

/*Q3. Prime Modulo Inverse
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given two integers A and B. Find the value of A-1 mod B where B is a prime number and gcd(A, B) = 1.

A-1 mod B is also known as modular multiplicative inverse of A under modulo B.



Problem Constraints
1 <= A <= 109
1<= B <= 109
B is a prime number



Input Format
First argument is an integer A.
Second argument is an integer B.



Output Format
Return an integer denoting the modulor inverse



Example Input
Input 1:

 A = 3
 B = 5
Input 2:

 A = 6
 B = 23


Example Output
Output 1:

 2
Output 2:

 4


Example Explanation
Explanation 1:

 Let's say A-1 mod B = X, then (A * X) % B = 1.
 3 * 2 = 6, 6 % 5 = 1.
Explanation 2:

 Similarly, (6 * 4) % 23 = 1.

*/

/*Fermats’s little theorem:

AB-1 ≡ 1 (mod B) where B is prime and A is not a multiple of B.
Multiply by A-1 on both sides, We get

AB-2 ≡ A-1 (mod B) where B is prime and A is not a multiple of B.
We just have to calculate AB-2 (mod B). This will be the modular multiplicative inverse of A under modulo B.*/