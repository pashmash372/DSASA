package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ColorfulNumber {
    public int colorful(int A) {
        HashSet< Integer > hashSet = new HashSet < > ();
        ArrayList< Integer > numbers = new ArrayList < > ();
        while (A != 0) {
            int num = A % 10;
            numbers.add(num);
            A /= 10;
        }
        Collections.reverse(numbers);
        int n = numbers.size();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int prod = 1;
                // prod stores the product of every digit in the range [i..j]
                for (int k = i; k <= j; k++) {
                    prod *= numbers.get(k);
                }
                // check if the product is unique
                if (hashSet.contains(prod))
                    return 0;
                hashSet.add(prod);
            }
        }
        return 1;
    }
}

/*Q3. Colorful Number
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a number A, find if it is COLORFUL number or not.

If number A is a COLORFUL number return 1 else, return 0.

What is a COLORFUL Number:

A number can be broken into different contiguous sub-subsequence parts.
Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245.
And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different.


Problem Constraints
1 <= A <= 2 * 109



Input Format
The first and only argument is an integer A.



Output Format
Return 1 if integer A is COLORFUL else return 0.



Example Input
Input 1:

 A = 23
Input 2:

 A = 236


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 Possible Sub-sequences: [2, 3, 23] where
 2 -> 2
 3 -> 3
 23 -> 6  (product of digits)
 This number is a COLORFUL number since product of every digit of a sub-sequence are different.
Explanation 2:

 Possible Sub-sequences: [2, 3, 6, 23, 36, 236] where
 2 -> 2
 3 -> 3
 6 -> 6
 23 -> 6  (product of digits)
 36 -> 18  (product of digits)
 236 -> 36  (product of digits)
 This number is not a COLORFUL number since the product sequence 23  and sequence 6 is same.
*/


/*It is one of the easiest problems in this section.
You just need to simulate what has been stated in the problem.
Iterate over all substrings of number, and then check if the number resulting from the multiplication has been stored by us or not using hashing.

Example:

N = 123
1 2 3 12 23 123
1 -> 1
2 -> 2
3 -> 3
12 -> 2  we have already encountered 2 before. Return 0
*/