package com.scaler.dsa.assignment;


import java.util.ArrayList;

public class toupper {
    public ArrayList<Character> to_upper(ArrayList<Character> A) {
        for(int i = 0; i < A.size(); ++i){
            A.set(i, Character.toUpperCase(A.get(i)));
        }
        return A;
    }
}

/*Q4. toupper()
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a function to_upper() consisting of a character array A.

Convert each charater of A into Uppercase character if it exists. If the Uppercase of a character does not exist, it remains unmodified.
The lowercase letters from a to z is converted to uppercase letters from A to Z respectively.

Return the uppercase version of the given character array.



Problem Constraints
1 <= |A| <= 105



Input Format
Only argument is a character array A.



Output Format
Return the uppercase version of the given character array.



Example Input
Input 1:

 A = ['S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
Input 2:

 A = ['S', 'c', 'a', 'L', 'e', 'R', '#', '2', '0', '2', '0']


Example Output
Output 1:

 ['S', 'C', 'A', 'L', 'E', 'R', 'A', 'C', 'A', 'D', 'E', 'M', 'Y']
Output 2:

 ['S', 'C', 'A', 'L', 'E', 'R', '#', '2', '0', '2', '0']


Example Explanation
Explanation 1:

 All the characters in the returned array are in uppercase alphabets.

*/

/*
character backgroundcharacter
Solution Approach
Loop through the character array and use the inbuilt function to convert the lowercase character to an uppercase character.
In C/C++, toupper() function takes a character and converts it into uppercase.
Similarly, in python, we can use character.upper().*/