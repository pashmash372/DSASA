package com.scaler.dsa.assignment;



public class FindnthMagicNumber {
    public int solve(int A) {
        int ans = 0, x = 1;
        // converting to binary representation
        while(A > 0) {
            x *= 5;
            if(A % 2 == 1)
                ans += x;
            A /= 2;
        }
        return ans;
    }
}

/*Q5. Find nth Magic Number
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer A, find and return the Ath magic number.

A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….



Problem Constraints
1 <= A <= 5000



Input Format
The only argument given is integer A.



Output Format
Return the Ath magic number.



Example Input
Example Input 1:

 A = 3
Example Input 2:

 A = 10


Example Output
Example Output 1:

 30
Example Output 2:

 650


Example Explanation
Explanation 1:

 Magic Numbers in increasing order are [5, 25, 30, 125, 130, ...]
 3rd element in this is 30
Explanation 2:

 In the sequence shown in explanation 1, 10th element will be 650.
*/

/*As we know **5n > 51 + 52 + ... + 5n-1**
So, we can find the sum of all subsets of the first 13 power of 5.
since no element will overlap, we will have 2^13 - 1 elements or 8000 elements.
Simply sort them and answer the query in O(1).
Time Complexity: O(A*logA).

Else we can use a much faster approach.
We can represent A in its binary representation.
If the ith bit(1 based indexing) is set we will add 5i to our answer.
Time Complexity:- O(log(A))*/