package com.scaler.dsa.assignment;


import java.util.Stack;

public class BalancedParantheses {
    public int solve(String A) {
        Stack<Character> s = new Stack<Character>();
        for(int i = 0; i < A.length(); ++i){
            if(A.charAt(i) == '('){
                s.push(A.charAt(i));
            }
            else if(s.empty()){
                return 0;
            }
            else{
                s.pop();
            }
        }
        if(s.empty()){
            return 1;
        }
        return 0;
    }
}

/*Q2. Balanced Parantheses!
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A consisting only of '(' and ')'.

You need to find whether parentheses in A are balanced or not, if it is balanced then return 1 else return 0.



Problem Constraints
1 <= |A| <= 105



Input Format
First argument is an string A.



Output Format
Return 1 if parantheses in string are balanced else return 0.



Example Input
Input 1:

 A = "(()())"
Input 2:

 A = "(()"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 Given string is balanced so we return 1.
Explanation 2:

 Given string is not balanced so we return 0.

*/

/*Algorithm:

Declare a character stack S.
Now traverse the expression string exp.
If the current character is a starting bracket ‘(‘ then push it to stack.
If the current character is a closing bracket ‘)’ then pop from the stack, and if the popped character is the matching starting bracket,else if the stack is empty, then parenthesis is not balanced.
After complete traversal, if there is some starting bracket left in the stack, then unbalanced.
Time Complexity: O(len(A))
Auxiliary Space: O(len(A)) for stack.*/