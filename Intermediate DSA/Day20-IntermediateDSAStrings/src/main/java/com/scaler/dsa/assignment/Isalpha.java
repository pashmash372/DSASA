package com.scaler.dsa.assignment;


import java.util.ArrayList;

public class Isalpha {
    public int solve(ArrayList<Character> A) {
        for(Character x: A){
            if(!Character.isAlphabetic(x)){
                return 0;
            }
        }
        return 1;
    }
}
/*Q6. Isalpha()
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are given a function isalpha() consisting of a character array A.

Return 1 if all the characters of the character array are alphabetical (a-z and A-Z), else return 0.



Problem Constraints

1 <= |A| <= 105



Input Format

Only argument is a character array A.



Output Format

Return 1 if all the characters of the character array are alphabetical (a-z and A-Z), else return 0.



Example Input

Input 1:

 A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y']
Input 2:

 A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']


Example Output

Output 1:

 1
Output 2:

 0


Example Explanation

Explanation 1:

 All the characters are alphabets.
Explanation 2:

 All the characters are NOT alphabets i.e ('#', '2', '0', '2', '0').*/


/*```
Loop through the character array and use the inbuilt function to check if the character is an alphabet or NOT.
In C/C++, isalpha() function takes a character and return 0 if the character is NOT an alphabet.
Similarly, in python we can use character.isalnum().
``

Still unable to solve the problem after this hin*/