package com.scaler.dsa.assignment;


import java.util.ArrayList;

public class Isalnum {
    public int solve(ArrayList<Character> A) {
        for(Character x: A){
            if(!Character.isLetterOrDigit(x)){
                return 0;
            }
        }
        return 1;
    }
}
/*Q5. Isalnum()
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a function isalpha() consisting of a character array A.

Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.



Problem Constraints
1 <= |A| <= 105



Input Format
Only argument is a character array A.



Output Format
Return 1 if all the characters of the character array are alphanumeric (a-z, A-Z and 0-9), else return 0.



Example Input
Input 1:

 A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
Input 2:

 A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 All the characters are alphanumeric.
Explanation 2:

 All the characters are NOT alphabets i.e ('#').*/

/*Loop through the character array and use the inbuilt function to check if the character is an alphabet or a number.
In C/C++, isalnum() function takes a character and return 0 if the character is NOT an alphabet or a number.
Similarly, in python, we can use character.isalnum().*/