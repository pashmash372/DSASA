package com.scaler.dsa.assignment;


public class ComputenCrp {
    public int solve(int A, int B, int C) {
        if(C == 1)
            return 0;
        if(A == 1)
            return 1;
        long mx = Math.max(A - B, B);
        long mn = Math.min(A - B, B);
        long denominator = 1, numerator = 1;
        // nCr = (n * (n - 1) * ... * (n - r + 1)) * inverse(fact[r])
        // nCr = (n * (n - 1) * ... * (r + 1)) * inverse(fact[n - r])
        for(long n = mx + 1; n < A + 1; n++) {
            numerator = (numerator * n) % C;
        }
        for(int d = 2 ; d < mn + 1; d++) {
            denominator = (denominator * d) % C;
        }
        return (int)((numerator * pow(denominator, C - 2, C)) % C);
    }

    public long pow(long x, int y, int k) {
        long result = 1;
        while(y > 0) {
            if(y % 2 == 1) {
                result = (result * x) % k;
                y--;
            }
            y >>= 1;
            x = (x * x) % k;
        }
        return result;
    }
}
/*Q2. Compute nCr % p
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given three integers A, B, and C, where A represents n, B represents r, and C represents p and p is a prime number greater than equal to n, find and return the value of nCr % p where nCr % p = (n! / ((n-r)! * r!)) % p.

x! means factorial of x i.e. x! = 1 * 2 * 3... * x.

NOTE: For this problem, we are considering 1 as a prime.



Problem Constraints
1 <= A <= 106
1 <= B <= A
A <= C <= 109+7


Input Format
The first argument given is the integer A ( = n).
The second argument given is the integer B ( = r).
The third argument given is the integer C ( = p).



Output Format
Return the value of nCr % p.



Example Input
Input 1:

 A = 5
 B = 2
 C = 13
Input 2:

 A = 6
 B = 2
 C = 13


Example Output
Output 1:

 10
Output 2:

 2


Example Explanation
Explanation 1:

 nCr( n=5 and r=2) = 10.
 p=13. Therefore, nCr%p = 10.
*/

/*This problem can be solved using Fermat’s Little theorem.

a^p = a (mod p) where p is a prime number.

a^(p-1) = 1 (mod p)

Multiply by an inverse on both sides

a^(p-2) = a^(-1) (mod p).
Using the above result, nCr can be calulated as ( fact[n]%p ) * inversemodulo( fact[n-r] %p ) * inversemodulo( fact[r] %p ).*/