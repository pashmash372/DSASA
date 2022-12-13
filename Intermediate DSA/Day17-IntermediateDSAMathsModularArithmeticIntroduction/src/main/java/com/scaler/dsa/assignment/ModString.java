package com.scaler.dsa.assignment;


public class ModString {
    public int findMod(String A, int B) {
        long ans = 0;
        long mod = B;
        int n = A.length();
        long curr = 1;
        for(int i = n - 1; i >= 0; i--){
            long dig = A.charAt(i) - 48;
            long term = (dig * curr) % mod;
            ans = (ans + term) % mod;
            curr = (curr * 10) % mod;
        }
        return (int)ans;
    }
}


/*Q4. Mod String
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a large number in the form of a string A where each character denotes a digit of the number.
You are also given a number B. You have to find out the value of A % B and return it.



Problem Constraints
1 <= A.length() <= 105
0 <= Ai <= 9
1 <= B <= 109


Input Format
The first argument is a string A.
The second argument is an integer B.


Output Format
Return a single integer denoting the value of A % B.


Example Input
Input 1:
A = "143"
B = 2
Input 2:

A = "43535321"
B = 47


Example Output
Output 1:
1
Output 2:

20


Example Explanation
Explanation 1:
143 is an odd number so 143 % 2 = 1.
Explanation 2:

43535321 % 47 = 20*/

/*We can use the two following properties:

(a * b) mod x = [(a mod x) * (b mod x)] mod x

(a + b) mod x = [(a mod x) + (b mod x)] mod x


We can represent a number "abcd" as (a * 1000) + (b * 100) + (c * 10) + (d * 1).
We can use the above properties of modular arithmetic to solve the problem.

We will iterate from the end of the string (least significant digit).
We will keep a variable that will store the values of powers of 10 modulo B at every step.
Then, we will perform the operations accordingly.
Be careful of integer overflows.

Refer to the complete solution for more implementation details.*/