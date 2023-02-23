package com.scaler.dsa.assignment;

import java.util.HashMap;

public class WindowString {
    public String minWindow(String A, String B) {
        if (A.length() < B.length()) return "";
        HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
        for (int i = 0; i < B.length(); i++) {
            if (counts.get(B.charAt(i)) == null) {
                counts.put(B.charAt(i), 1);
            } else {
                counts.put(B.charAt(i), counts.get(B.charAt(i)) + 1);
            }
        }
        int start = 0;
        int length = 0;
        int total = 0;
        for (int head = 0, tail = 0; tail < A.length(); tail++) {
            if (counts.get(A.charAt(tail)) == null) {
                // If this character is not present in B at all,
                // we don't care about this character.
                continue;
            }
            counts.put(A.charAt(tail), counts.get(A.charAt(tail)) - 1);
            // We check if the current character represented by tail caused
            // a character to be included which is relevant to B and is still
            // in deficit.
            // For example, if B has 3 As, then the first 3 A are relevant to us
            // but the 4th one is not.
            if (counts.get(A.charAt(tail)) >= 0) {
                total++;
            }
            // check if we have all characters in B covered.
            if (total == B.length()) {
                // Now move the head pointer till popping out those characters
                // still makes sure that all characters in B are covered.
                while (counts.get(A.charAt(head)) == null || counts.get(A.charAt(head)) < 0) {
                    if (counts.get(A.charAt(head)) != null) counts.put(A.charAt(head), counts.get(A.charAt(head)) + 1);
                    head++;
                }
                // Now [head - 1, tail] is a valid substring. Update the answer.
                if (length == 0 || tail - head + 1 < length) {
                    length = tail - head + 1;
                    start = head;
                }
            }
        }
        return A.substring(start, start + length);
    }
}

/*JAVA -Sliding Window -Explained*/

/*      1) We create a frequency array to store the frequecies of all the characters of the String b.
        2)The variable 'k' is used to store the no of distinct characters in the String b.
        3) Then we keep left=0, and iterate over the right , which is standard template of sliding window.
        4)At each iteration , we reduce that character's frequency , and if that character's frequency became zero that means , our window has the complete frequency of that character.
        5) k==0 signifies that our window has all the characters of b.
        6) So, we store that answer, we also perform left++  to make our window  have one less character. and we will continue our for loop iteration
*/

class WindowString1 {
    public String minWindow(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        if (len2 > len1) return "";
        int[] freq = new int[128];
        int k = 0;

        for (int i = 0; i < len2; i++) {
            if (freq[b.charAt(i) - '0'] == 0) k++;
            freq[b.charAt(i) - '0']++;
        }


        int left = 0;
        int leftAns = 0;
        int rightAns = 10000000;

        for (int right = 0; right < len1; right++) {
            char c = a.charAt(right);
            freq[c - '0']--;
            if (freq[c - '0'] == 0) k--;

            while (k == 0) {

                while (rightAns - leftAns + 1 > right - left + 1) {
                    rightAns = right;
                    leftAns = left;
                }
                if (freq[a.charAt(left) - '0'] == 0) k++;
                freq[a.charAt(left) - '0']++;
                left++;

            }

        }

        if (rightAns > len1 - 1) return "";
        return a.substring(leftAns, rightAns + 1);


    }
}


/*Q3. Window String
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A and a string B, find the window with minimum length in A, which will contain all the characters in B in linear time complexity.
Note that when the count of a character c in B is x, then the count of c in the minimum window in A should be at least x.

Note:

If there is no such window in A that covers all characters in B, return the empty string.
If there are multiple such windows, return the first occurring minimum window ( with minimum start index and length )


Problem Constraints
1 <= size(A), size(B) <= 106



Input Format
The first argument is a string A.
The second argument is a string B.



Output Format
Return a string denoting the minimum window.



Example Input
Input 1:

 A = "ADOBECODEBANC"
 B = "ABC"
Input 2:

 A = "Aa91b"
 B = "ab"


Example Output
Output 1:

 "BANC"
Output 2:

 "a91b"


Example Explanation
Explanation 1:

 "BANC" is a substring of A which contains all characters of B.
Explanation 2:

 "a91b" is the substring of A which contains all characters of B.
*/

/*Essentially you have a start and end pointer starting from the beginning of the string.

You keep moving the end pointer and including more characters until you have all B characters included.

At this point, you start moving start pointer and popping out characters until you still have all the characters of B included. Update your answer and keep repeating the process.

*/