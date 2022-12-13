package com.scaler.homework;

public class EvenSubarrays {
    public String solve(int[] A) {
        int n = A.length;
        if (A[0] % 2 == 0 && A[n - 1] % 2 == 0 && n % 2 == 0) return "YES";
        return "NO";
    }
}


/*Q2. Even Subarrays
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given an integer array A.

Decide whether it is possible to divide the array into one or more subarrays of even length such that the first and last element of all subarrays will be even.

Return "YES" if it is possible; otherwise, return "NO" (without quotes).



Problem Constraints
1 <= |A|, A[i] <= 106



Input Format
The first and the only input argument is an integer array, A.



Output Format
Return a string "YES" or "NO" denoting the answer.



Example Input
Input 1:

 A = [2, 4, 8, 6]
Input 2:

 A = [2, 4, 8, 7, 6]


Example Output
Output 1:

 "YES"
Output 2:

 "NO"


Example Explanation
Explanation 1:

 We can divide A into [2, 4] and [8, 6].
Explanation 2:

 There is no way to divide the array into even length subarrays.
*/

/*If the first and the last element are even and the size of the array is even, then only the answer will be “YES.”
Otherwise will be “NO,” as we can’t divide the array into subarrays that meet the given conditions in the question.

So, if(A[0]%2 == 0 and A[n-1]%2 == 0 and n%2 == 0)
return “YES”;*/

/*Method 1: (Simple)

Use two loops. The outer loop runs from 0 to size – 1 and, one by one, picks all elements from left to the right. The inner loop compares the picked element to all the elements to its right side. If the picked element is greater than all the elements to its right side, then the picked element is the leader.
Time Complexity: O(N2)

Method 2: (Scan from right) Optimized Approach

Note that for an element to be greater than all the elements towards its right , it just needs to be greater than the maximum element towards its right.
Keep a variable ‘mx’ which stores the maximum till now and initialize it with the last element of the array and also add the last element to our answer array. Iterate from n-2 to 0 , at every index we check if that number is greater than the variable mx. If it is we add the element to our answer array and change mx to that variable.

Time Complexity: O(N)
Space Complexity: O(1)*/