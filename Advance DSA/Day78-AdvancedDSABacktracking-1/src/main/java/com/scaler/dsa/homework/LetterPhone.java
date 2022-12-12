package com.scaler.dsa.homework;


import java.util.ArrayList;

public class LetterPhone {
    public ArrayList< String > letterCombinations(String A) {
        ArrayList < Character > digits[];
        digits = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            digits[i] = new ArrayList < > ();
        }
        // create mapping of digit to letters
        digits[0].add('0');
        digits[1].add('1');
        char c = 'a';
        int k;
        for (int i = 2; i < 10; i++) {
            k = 3;
            // 4 characters possible for number 7 and 9
            if (i == 7 || i == 9)
                k = 4;
            for (int j = 0; j < k; j++) {
                digits[i].add(c);
                c++;
            }
        }
        int i = 0;
        int n = A.length();
        int dig;
        ArrayList < String > res = new ArrayList < > ();
        ArrayList < String > temp = new ArrayList < > ();
        ArrayList < String > x;
        res.add("");
        while (i < n) {
            dig = A.charAt(i) - '0';
            // loop through all possible letters for that index
            for (String str: res) {
                for (char ch: digits[dig]) {
                    String st = str + ch;
                    temp.add(st);
                }
            }
            x = res;
            res = temp;
            temp = x;
            temp.clear();
            i++;
        }
        return res;
    }
}
/*Q3. Letter Phone
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a digit string A, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.



The digit 0 maps to 0 itself. The digit 1 maps to 1 itself.

NOTE: Make sure the returned strings are lexicographically sorted.



Problem Constraints
1 <= |A| <= 10



Input Format
The only argument is a digit string A.



Output Format
Return a string array denoting the possible letter combinations.



Example Input
Input 1:

 A = "23"
Input 2:

 A = "012"


Example Output
Output 1:

 ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
Output 2:

 ["01a", "01b", "01c"]


Example Explanation
Explanation 1:

 There are 9 possible letter combinations.
Explanation 2:

 Only 3 possible letter combinations.
*/

/*Think  of recursion.

Think about possibilites at any place and move on.

For every integer, you have 1 or 3 or 4 options. Try appending every letter in the option to the string and move forward.
For digit 0 and 1: there is only one possibility.
For digit 7 and 9: there are 4 possibility.
For all others: there are 3 possibility.

Note that the string array should be lexicographically sorted.*/