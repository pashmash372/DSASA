package com.scaler.dsa.assignment;

import java.util.Stack;

public class Sortstackusinganotherstack {
    public int[] solve(int[] A) {
        if (A.length <= 1) return A;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> helper = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            s1.push(A[i]);
        }
        while (!s1.empty()) {
            int temp = s1.peek();
            s1.pop();
            /*keep popping from helper till its peek value is more than temp*/
            while (!helper.empty() && helper.peek() > temp) {
                s1.push(helper.peek());
                helper.pop();
            }
            helper.push(temp);
        }
        while (!helper.empty()) {
            s1.push(helper.peek());
            helper.pop();
        }
        int[] ans = new int[A.length];
        int i = 0;
        while (!s1.empty()) {
            ans[i] = s1.peek();
            s1.pop();
            i++;
        }
        return ans;
    }
}


/*Q4. Sort stack using another stack
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a stack of integers A, sort it using another stack.

Return the array of integers after sorting the stack using another stack.



Problem Constraints
1 <= |A| <= 5000

0 <= A[i] <= 109



Input Format
The only argument is a stack given as an integer array A.



Output Format
Return the array of integers after sorting the stack using another stack.



Example Input
Input 1:

 A = [5, 4, 3, 2, 1]
Input 2:

 A = [5, 17, 100, 11]


Example Output
Output 1:

 [1, 2, 3, 4, 5]
Output 2:

 [5, 11, 17, 100]


Example Explanation
Explanation 1:

 Just sort the given numbers.
Explanation 2:

 Just sort the given numbers.
*/


/*Create a temporary stack say B.

While input stack is not empty:
1. pop an element from input stack calls it x.
2. while the temporary stack is not empty and top of the temporary stack is greater than x pop from the temporary stack and push it into input stack.
3. push x in the temporary stack.

The sorted numbers are in the temporary stack.

Worst case time complexity O(n^2).*/