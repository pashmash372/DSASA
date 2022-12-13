package com.scaler.dsa.assignment;


public class ExcelColumnNumber {
    public int titleToNumber(String A) {
        int value = 0;
        // traverse each character
        for(int i = 0; i < A.length(); i++){
            char c = A.charAt(i);
            value = value * 26 + (c - 'A' + 1);
        }
        return value;
    }
}

/*Q1. Excel Column Number
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a column title as appears in an Excel sheet, return its corresponding column number.



Problem Constraints
1 <= length of the column title <= 5



Input Format
The only argument is a string that represents the column title in the excel sheet.



Output Format
Return a single integer that represents the corresponding column number.



Example Input
Input 1:

 AB
Input 2:

 BB


Example Output
Output 1:

 28
Output 2:

 54


Example Explanation
Explanation 1:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
Explanation 2:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 ...
 AZ -> 52
 BA -> 53
 BB -> 54

*/

/*Simple math.

This is just like base 26 number conversion.

number = 26^0 * (S[n - 1] - ‘A’ + 1) + 26^1 * (S[n - 2] - ‘A’ + 1) + ….

We recommend you to check out the piece on base number conversion in articles again. Please also attempt the sample problem associated with it.*/