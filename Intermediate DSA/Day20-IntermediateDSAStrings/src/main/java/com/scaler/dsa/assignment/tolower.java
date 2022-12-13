package com.scaler.dsa.assignment;


import java.util.ArrayList;

public class tolower {
    public ArrayList<Character> to_lower(ArrayList<Character> A) {
        for(int i = 0; i < A.size(); ++i){
            A.set(i, Character.toLowerCase(A.get(i)));
        }
        return A;
    }
}
/*Q3. tolower()
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a function to_lower() which takes a character array A as an argument.

Convert each character of A into lowercase characters if it exists. If the lowercase of a character does not exist, it remains unmodified.
The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.

Return the lowercase version of the given character array.



Problem Constraints
1 <= |A| <= 105



Input Format
The only argument is a character array A.



Output Format
Return the lowercase version of the given character array.



Example Input
Input 1:

 A = ['S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
Input 2:

 A = ['S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0']


Example Output
Output 1:

 ['s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y']
Output 2:

 ['s', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']


Example Explanation
Explanation 1:

 All the characters in the returned array are in lowercase alphabets.

*/

/*```
Loop through the character array and use the inbuilt function to convert the uppercase character to a lowercase character.
In C/C++, tolower() function takes a character and converts it into lowercase.
Similarly, in python, we can use character.lower().
``*/