package com.scaler.dsa.assignment;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParanthesis {
    public int solve(String A) {
        HashMap<Character, Character> mp = new HashMap<>();
        Stack<Character> st = new Stack<>();
        mp.put(')', '(');
        mp.put('}', '{');
        mp.put(']', '[');
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                // push any opening bracket into the stack
                st.push(c);
            } else if (st.empty() || st.peek() != mp.get(c)) {
//                check if the last unpaired opening bracket is of the same type
//                as the current closing bracket
                return 0;
            } else {
                st.pop();
            }
        }
//        checks if all the opening brackets are paired
        if (st.empty()) return 1;
        return 0;
    }
}

/*Q1. Balanced Paranthesis
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]” are correct in A.

Refer to the examples for more clarity.



Problem Constraints
1 <= |A| <= 100



Input Format
The first and the only argument of input contains the string A having the parenthesis sequence.



Output Format
Return 0 if the parenthesis sequence is not balanced.

Return 1 if the parenthesis sequence is balanced.



Example Input
Input 1:

 A = {([])}
Input 2:

 A = (){
Input 3:

 A = ()[]


Example Output
Output 1:

 1
Output 2:

 0
Output 3:

 1


Example Explanation
You can clearly see that the first and third case contain valid paranthesis.

In the second case, there is no closing bracket for {, thus the paranthesis sequence is invalid.

*/


/*First, let us look at the impossible cases:
1) [() : There is no corresponding closing bracket for an opening bracket.
2) [) : Incorrect closing bracket for an opening bracket.
3) } : No opening bracket for a closed bracket.

Now, we can observe that the earlier a bracket is encountered in the string, the later it is closed.
We can guess that the Stack Data Structure will be used using this observation.

We traverse the given string from the left. If the i-th character is an opening bracket, we push it onto the stack.
If it is a closing bracket, we check for the impossible case 2 and case 3. If they are being violated, then we can simply return 0. Otherwise, we can pop the topmost bracket from the stack.
To check for case 1, if our stack is not empty at the end of our traversal, then we can say that the brackets are not correctly matched.

If all the conditions are fulfilled, then we can return 1.

*/