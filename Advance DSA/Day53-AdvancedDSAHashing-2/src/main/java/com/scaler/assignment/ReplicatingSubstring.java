package com.scaler.assignment;

public class ReplicatingSubstring {
    public int solve(int A, String B) {
        // hash array to keep a track of frequency of each character
        int[] hash = new int[26];
        for (int i = 0; i < B.length(); i++) {
            hash[B.charAt(i) - 'a']++;
        }
        int flag = 0;
        for (int i = 0; i < 26; i++) {
            // if the frequency of a charatcer present in the string isn't divisble by A, set a flag which
            // indicates that it will never be possible to represent B as concatenation of A strings
            if (hash[i] % A != 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) return -1;
        else return 1;
    }
}

/*Q3. Replicating Substring
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given a string B, find if it is possible to re-order the characters of the string B so that it can be represented as a concatenation of A similar strings.

Eg: B = aabb and A = 2, then it is possible to re-arrange the string as "abab" which is a concatenation of 2 similar strings "ab".

If it is possible, return 1, else return -1.



Problem Constraints

1 <= Length of string B <= 1000

1 <= A <= 1000

All the alphabets of S are lower case (a - z)



Input Format

First argument is an integer A.
Second argument is a string B.



Output Format

Your function should return 1 if it is possible to re-arrange the characters of the string B so that it can be represented as a concatenation of A similar strings. If it is not, return -1.



Example Input

Input 1:

 A = 2
 B = "bbaabb"
Input 2:

 A = 1
 B = "bc"


Example Output

Output 1:

 1
Output 2:

 1


Example Explanation

Explanation 1:

 We can re-order the given string into "abbabb".
Explanation 2:

 String "bc" is already arranged.
*/


/*Each character must come in multiples of A if we are to represent the string as a concatenation of A strings.
Why?

Because that count divided by A will the number of times that particular character appears in 1 string.

So we maintain a hash which stores the frequency of each character.

Then we iterate over the hash and check if each character that appeared in the array appeared as a mutiple of A or not.
If there exists even 1 character whose hash[i] % A is not equal to 0, it implies we cannot represent the string as A concatenated strings
Else the answer is yes.*/