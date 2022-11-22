package com.scaler.dsa.assignment;

import java.util.HashMap;

public class LongestSubstringWithoutRepeat {
    public int lengthOfLongestSubstring(String A) {
        int count = 0;
        int max = 0;
        int n = A.length();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char c;
        int prevIndex;
        for (int i = 0; i < n; i++) {
            c = A.charAt(i);
            // hashMap stores the last occurrence of c in A
            if (hashMap.containsKey(c)) {
                prevIndex = hashMap.get(c);
                count = Math.min(count + 1, i - prevIndex);
                hashMap.put(c, i);
            } else {
                count++;
                hashMap.put(c, i);
            }
            max = Math.max(max, count);
        }
        return max;
    }
}



/*Q4. Longest Substring Without Repeat
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A, find the length of the longest substring without repeating characters.
Note: Users are expected to solve in O(N) time complexity.



Problem Constraints
1 <= size(A) <= 106

String consists of lowerCase,upperCase characters and digits are also present in the string A.



Input Format
Single Argument representing string A.



Output Format
Return an integer denoting the maximum possible length of substring without repeating characters.



Example Input
Input 1:

 A = "abcabcbb"
Input 2:

 A = "AaaA"


Example Output
Output 1:

 3
Output 2:

 2


Example Explanation
Explanation 1:

 Substring "abc" is the longest substring without repeating characters in string A.
Explanation 2:

 Substring "Aa" or "aA" is the longest substring without repeating characters in string A.
*/


/*Method 1- Brute Force:

We can consider all substrings one by one and check for each substring whether it contains all unique characters or not. There will be n*(n+1)/2 substrings. Whether a substring contains all unique characters or not can be checked in linear time by scanning it from left to right and keeping a map of visited characters.
Time complexity of this solution would be O(n^3).

Method 2- Better:

The idea is to use window sliding. Whenever we see repetition, we remove the previous occurrence and slide the window.
Time complexity of this solution would be O(n^2).

Method 3- Optimized:

This solution uses extra space to store the last indexes of already visited characters. The idea is to scan the string from left to right, keep track of the maximum length Non-Repeating Character Substring seen so far in res. When we traverse the string, to know the length of current window we need two indexes.
1) Ending index ( j ) : We consider current index as ending index.
2) Starting index ( i ) : It is same as previous window if current character was not present in the previous window. To check if the current character was present in the previous window or not, we store last index of every character in an array lasIndex[]. If lastIndex[str[j]] + 1 is more than previous start, then we updated the start index i. Else we keep same i.

Time Complexity: O(n + d) where n is length of the input string and d is number of characters in input string alphabet. For example, if string consists of lowercase English characters then value of d is 26.
Auxiliary Space: O(d)

*/