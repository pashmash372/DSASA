package com.scaler.dsa.homework;



public class DivideIntegers {
    public int divide(int A, int B) {
        long n = A, m = B;
        // determine sign of the quotient
        int sign = 1;
        if ((n < 0 && m >= 0) || (n >= 0 && m < 0))
            sign = -1;
        // remove sign of operands
        n = Math.abs(n);
        m = Math.abs(m);
        // q stores the quotient in computation
        long q = 0, t = 0;
        // test down from the highest bit
        // accumulate the tentative value for valid bits
        for (int i = 31; i >= 0; i--) {
            if (t + (m << i) <= n) {
                t += m << i;
                q |= (long) 1 << i;
            }
        }
        // assign back the sign
        if (sign < 0)
            q = -q;
        // check for overflow and return
        if (q > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else
            return (int) q;
    }
}
/*Q2. Divide Integers
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Divide two integers without using multiplication, division and mod operator.

Return the floor of the result of the division.

Also, consider if there can be overflow cases i.e output is greater than INT_MAX, return INT_MAX.

NOTE: INT_MAX = 2^31 - 1



Problem Constraints
-231 <= A, B <= 231-1

B != 0



Input Format
The first argument is an integer A denoting the dividend.
The second argument is an integer B denoting the divisor.



Output Format
Return an integer denoting the floor value of the division.



Example Input
Input 1:

 A = 5
 B = 2
Input 2:

 A = 7
 B = 1


Example Output
Output 1:

 2
Output 2:

 7


Example Explanation
Explanation 1:

 floor(5/2) = 2*/

/*Think in terms of bits.

How do you divide with bits?

How do you determine the most significant bit in the answer?
Iterate on the bit position ‘i’ from 31 to 1 and find the first bit for which divisor«i is less than the dividend.

How do you use (1) to move forward similarly?*/