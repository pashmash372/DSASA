package com.scaler.dsa.assignment;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpression {
    public int evalRPN(ArrayList<String> A) {
        Stack<Integer> values = new Stack<Integer>();
        int first;
        int second;
        for (String str : A) {
            // on encountering an operator, pop the top two elements from the stack,
            // perform the operation and push that back into the stack
            if (equal(str, "+")) {
                second = values.pop();
                first = values.pop();
                values.push(first + second);
            } else if (equal(str, "*")) {
                second = values.pop();
                first = values.pop();
                values.push(first * second);
            } else if (equal(str, "/")) {
                second = values.pop();
                first = values.pop();
                values.push(first / second);
            } else if (equal(str, "-")) {
                second = values.pop();
                first = values.pop();
                values.push(first - second);
            } else {
                first = Integer.parseInt(str);
                values.push(first);
            }
        }
        return values.peek();
    }

    public boolean equal(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }
}


/*Q4. Evaluate Expression
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
An arithmetic expression is given by a string array A of size N. Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each string may be an integer or an operator.



Problem Constraints
1 <= N <= 105



Input Format
The only argument given is string array A.



Output Format
Return the value of arithmetic expression formed using reverse Polish Notation.



Example Input
Input 1:
    A =   ["2", "1", "+", "3", "*"]
Input 2:
    A = ["4", "13", "5", "/", "+"]


Example Output
Output 1:
    9
Output 2:
    6


Example Explanation
Explaination 1:
    starting from backside:
    * : () * ()
    3 : () * (3)
    + : (() + ()) * (3)
    1 : (() + (1)) * (3)
    2 : ((2) + (1)) * (3)
    ((2) + (1)) * (3) = 9
Explaination 2:
    + : () + ()
    / : () + (() / ())
    5 : () + (() / (5))
    13 : () + ((13) / (5))
    4 : (4) + ((13) / (5))
    (4) + ((13) / (5)) = 6
*/

/*This is pretty much a simulation problem.
Think using stack.

When you encounter an operator, that is when you need the top 2 numbers on the stack, perform the operation on them, and put them on the stack.*/