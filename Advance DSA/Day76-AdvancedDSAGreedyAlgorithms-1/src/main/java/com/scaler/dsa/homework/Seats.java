package com.scaler.dsa.homework;


public class Seats {
    private static final int MOD = 10000003;

    public int seats(String A) {
        int n;
        int i;
        int first, last;
        int countLeft[];
        int total = 0;
        int midVal;

        if (A == null || A.length() == 0)
            return 0;
        n = A.length();
        countLeft = new int[n];
        first = last = -1;

        for (i = 0; i < n; i++) {
            countLeft[i] = i > 0 ? countLeft[i - 1] : 0;
            if (A.charAt(i) == 'x') {
                if (first == -1)
                    first = i;
                last = i;
                countLeft[i]++;
                total++;
            }
        }

        midVal = (total + 1) / 2;

        if (first == -1 || first == last)
            return 0;

        int mid;

        for (i = first; i <= last; i++) {
            if (countLeft[i] == midVal)
                break;
        }
        mid = i;
        long res = 0;
        int count = 0;

        for (i = mid; i >= first; i--) {
            if (A.charAt(i) == 'x') {
                res += (mid - i - count);
                res %= MOD;
                count++;
            }
        }
        count = 0;
        mid++;
        for (i = mid; i <= last; i++) {
            if (A.charAt(i) == 'x') {
                res += (i - mid - count);
                res %= MOD;
                count++;
            }
        }
        return (int) res;
    }
}
/*Q1. Seats
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
There is a row of seats represented by string A. Assume that it contains N seats adjacent to each other.
There is a group of people who are already seated in that row randomly. i.e. some are sitting together & some are scattered.

An occupied seat is marked with a character 'x' and an unoccupied seat is marked with a dot ('.')

Now your target is to make the whole group sit together i.e. next to each other, without having any vacant seat between them in such a way that the total number of hops or jumps to move them should be minimum.

In one jump a person can move to the adjacent seat (if available).

NOTE: 1. Return your answer modulo 107 + 3.



Problem Constraints
1 <= N <= 1000000
A[i] = 'x' or '.'



Input Format
The first and only argument is a string A of size N.



Output Format
Return an integer denoting the minimum number of jumps required.



Example Input
Input 1:

 A = "....x..xx...x.."
Input 2:

 A = "....xxx"


Example Output
Output 1:

 5
Output 2:

 0


Example Explanation
Explanation 1:

 Here is the row having 15 seats represented by the String (0, 1, 2, 3, ......... , 14)
                 . . . . x . . x x . . . x . .
 Now to make them sit together one of approaches is -
                 . . . . . . x x x x . . . . .
 Steps To achieve this:
 1) Move the person sitting at 4th index to 6th index: Number of jumps by him =   (6 - 4) = 2
 2) Bring the person sitting at 12th index to 9th index: Number of jumps by him = (12 - 9) = 3
 So, total number of jumps made: 2 + 3 = 5 which is the minimum possible.

 If we other ways to make them sit together but the number of jumps will exceed 5 and that will not be minimum.

Explanation 2:

 They are already together. So, the cost is zero.



See Expected Output*/

/*Let us take an example:

string :  .x..x..x.
positions where x are present {1, 4, 7}
The Median is 4. So we will move all x near our median. 1st person would need to jump two steps, and 3rd person would also need to jump two steps. Total answer = 4.
Can you prove why this approach works?

Happy Coding*/