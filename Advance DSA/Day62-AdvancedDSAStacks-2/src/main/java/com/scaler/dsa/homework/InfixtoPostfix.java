package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.Stack;

public class InfixtoPostfix {
    public String solve(String A) {
        return infixToPostfix(A);
    }

    public int prec(char c) {
        if (c == '^') return 3;
        else if (c == '*' || c == '/') return 2;
        else if (c == '+' || c == '-') return 1;
        else return -1;
    }

    // Function to convert infix expression
    //to postfix expression
    public String infixToPostfix(String s) {
        Stack<Character> st = new Stack<Character>();
        st.push('N');
        ArrayList<Character> ns = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char C = s.charAt(i);
            // If the scanned character is an operand, add it to output string.
            if ((C >= 'a' && C <= 'z') || (C >= 'A' && C <= 'Z')) ns.add(C);
                // If the scanned character is an '(', push it to the stack.
            else if (C == '(') st.push('(');
                // If the scanned character is an ')', pop and to output string from the stack
                // until an '(' is encountered.
            else if (C == ')') {
                while (st.peek() != 'N' && st.peek() != '(') {
                    char c = st.peek();
                    st.pop();
                    ns.add(c);
                }
                if (st.peek() == '(') {
                    char c = st.peek();
                    st.pop();
                }
            }
            //If an operator is scanned
            else {
                while (st.peek() != 'N' && prec(C) <= prec(st.peek())) {
                    char c = st.peek();
                    st.pop();
                    ns.add(c);
                }
                st.push(C);
            }
        }
        //Pop all the remaining elements from the stack
        while (st.peek() != 'N') {
            char c = st.peek();
            st.pop();
            ns.add(c);
        }
        StringBuilder result = new StringBuilder(ns.size());
        for (Character c : ns) {
            result.append(c);
        }
        return result.toString();
    }
}


/*Q5. Infix to Postfix
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given string A denoting an infix expression. Convert the infix expression into a postfix expression.

String A consists of ^, /, *, +, -, (, ) and lowercase English alphabets where lowercase English alphabets are operands and ^, /, *, +, - are operators.

Find and return the postfix expression of A.

NOTE:

^ has the highest precedence.
/ and * have equal precedence but greater than + and -.
+ and - have equal precedence and lowest precedence among given operators.


Problem Constraints
1 <= length of the string <= 500000



Input Format
The only argument given is string A.



Output Format
Return a string denoting the postfix conversion of A.



Example Input
Input 1:

 A = "x^y/(a*z)+b"
Input 2:

 A = "a+b*(c^d-e)^(f+g*h)-i"


Example Output

Output 2:

"abcd^e-fgh*+^*+i-"


Example Explanation
Explanation 1:

Ouput dentotes the postfix expression of the given input.
*/

/**/

/*Given the algorithm below, we have used a stack to keep the operators in the precedence order.

Algorithm:

Scan the infix expression from left to right.
If the scanned character is an operand, output it.
Else,
3.1 If the precedence of the scanned operator is greater than that of the operator in the stack(or the stack is empty, or the stack contains a ‘(‘ ), push it.
3.2 Else, Pop all the operators from the stack which are greater than or equal to in precedence than that of the scanned operator. After doing that, Push the scanned operator to the stack. (If you encounter parenthesis while popping, stop there and push the scanned operator in the stack.)
If the scanned character is an ‘(‘, push it to the stack.
If the scanned character is an ‘)’, pop the stack and output it until a ‘(‘ is encountered, and discard both the parenthesis.
Repeat steps 2-6 until infix expression is scanned.
Print the output
Pop and output from the stack until it is not empty.
*/