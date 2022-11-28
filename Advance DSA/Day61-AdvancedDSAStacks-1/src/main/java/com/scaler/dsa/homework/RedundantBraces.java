package com.scaler.dsa.homework;

import java.util.Stack;

public class RedundantBraces {
    boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public int braces(String A) {
        char[] s = A.toCharArray();
        int n = s.length;
        Stack<Character> st = new Stack<>();
        for (char c : s) {
            if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                // finds the no of characters between adjacent '(' and ')' pair
                char top = st.peek();
                if (!isOperator(top)) return 1;
                while (isOperator(st.peek())) st.pop();
                if (st.peek() != '(') return 1;
                st.pop();
            } else if (isOperator(c)) {
                st.push(c);
            }
        }
        while (!st.isEmpty() && isOperator(st.peek())) st.pop();
        return st.isEmpty() ? 0 : 1;
    }
}


/*Q3. Redundant Braces
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A denoting an expression. It contains the following operators '+', '-', '*', '/'.

Check whether A has redundant braces or not.

NOTE: A will be always a valid expression and will not contain any white spaces.



Problem Constraints
1 <= |A| <= 105



Input Format
The only argument given is string A.



Output Format
Return 1 if A has redundant braces else, return 0.



Example Input
Input 1:

 A = "((a+b))"
Input 2:

 A = "(a+(a+b))"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 ((a+b)) has redundant braces so answer will be 1.
Explanation 2:

 (a+(a+b)) doesn't have have any redundant braces so answer will be 0.
*/

/*If we somehow pick out sub-expressions surrounded by ( and ), then if we are left with () as a part of the string, we know we have redundant braces.

Let us take an example:

(a+(a+b))

We keep pushing elements onto the stack till we encounter ')'. When we encounter ')', we start popping elements until we find a matching '('.
If the number of elements popped does not correspond to '()', we are fine, and we can move forward.
Otherwise, voila! Matching braces have been found.
Some Extra Hints:

Try to run your code on test cases like (a*(a))  and (a) ??
Happy Coding

*/