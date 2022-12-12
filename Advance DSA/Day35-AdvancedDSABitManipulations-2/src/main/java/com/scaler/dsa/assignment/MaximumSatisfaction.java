package com.scaler.dsa.assignment;


public class MaximumSatisfaction {
    public int solve(int[] A) {
        int n = A.length;
        int ans = 0;
        for (int i = 30; i >= 0; --i) {
            int temp = ans | (1 << i);
            if (check(temp, A))
                ans = temp;
        }
        return ans;
    }
    public static boolean check(int x, int[] a) {
        int y = 0;
        for (int it: a)
            if ((it & x) == x)
                ++y;
        return (y > 3);
    }
}
/*Q3. Maximum Satisfaction
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A of size N denoting the quality of the fruits. A[i] represents the fruit quality of the ith fruit.

Shaun needs to pick four fruits, but he needs to pick them so that his satisfaction value will be maximum.

If a, b, c, and d are fruit quality of the four fruits picked, then the satisfaction value(a, b, c, d) = (a & b & c & d) where & is bitwise AND operator.

Find the maximum satisfaction value Shaun can obtain.



Problem Constraints
4 <= N <= 105

1 <= A[i] <= 2 * 109



Input Format
The only argument given is the integer array A.



Output Format
Return the maximum satisfaction value Shaun can obtain.



Example Input
Input 1:

 A = [10, 20, 15, 4, 14]
Input 2:

 A = [2, 2, 7, 15]


Example Output
Output 1:

 4
Output 2:

 2


Example Explanation
Explanation 1:

 Shaun can pick fruits with fruits quality 20, 15, 4, 14 and satisfaction value is (20 & 15 & 4 & 15) = 4
Explanation 2:

 Shaun will pick fruits with fruits quality 2, 2, 7, 15 and satisfaction value is(2 & 2 & 7 & 15) = 2
*/


/*Numbers up to 2*109 can be represented in a 32-bit binary system. So as we want the largest answer, we will start traversing from the most significant bit and check whether this bit, along with the bits set in the previous answer, is set in at least four numbers. If possible, we add corresponding power of two to the answer. Similarly, we will do this for each bit in decreasing order and update the answer accordingly.*/