package com.scaler.dsa.homework;



public class Stringoperations {
    public String solve(String A) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)>='a' && A.charAt(i)<='z')
            {
                if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u')
                {
                    res.append("#");
                }
                else
                {
                    res.append(A.charAt(i));
                }
            }
        }
        res.append(res);
        return res.toString();
    }
}

/*Q4. String operations
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:

Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.

NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.



Problem Constraints

1<=N<=100000


Input Format

First argument is a string A of size N.



Output Format

Return the resultant string.



Example Input

A="AbcaZeoB"



Example Output

"bc###bc###"



Example Explanation

First concatenate the string with itself so string A becomes "AbcaZeoBAbcaZeoB".
Delete all the uppercase letters so string A becomes "bcaeobcaeo".
Now replace vowel with '#'.
A becomes "bc###bc###".


*/

/*It can be solved using bruteforce solution i.e you just follow the operations.

Firstly concatenate the string with itself.

Then create an empty string and loop through the above obtained string and check if it is uppercase character then ignore that.
If it is vowel then replace it by ‘#’.

Finally return the output.*/