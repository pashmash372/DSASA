package com.scaler.assignment;


//Method 1:

public class Pickfrombothsides {
    public int solve(int[] A, int B) {
        int n = A.length;
        int[] suff = new int[n + 1];
        suff[n] = 0;
        suff[n - 1] = A[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = A[i] + suff[i + 1];
        }
        int pref_sum = 0;
        int ans = suff[n - B];
        for (int i = 0; i < B; i++) {
            pref_sum = pref_sum + A[i];
            int suff_sum = suff[n - B + (i + 1)];
            ans = Math.max(ans, pref_sum + suff_sum);
        }
        return ans;
    }


//Method 2: better solution

    static class Pickfrombothsides1 {
        public int solve(int[] A, int B) {
            int n = A.length;
            int cur = 0;
            for (int i = 0; i < B; i++) {
                cur += A[i]; // calculate cur with all first B elements
            }
            int back = B - 1; // idx for left side sum
            int ans = cur;
            for (int j = n - 1; j >= n - B; j--) {
                cur += A[j]; // adding right side value to sum
                cur -= A[back]; // subtracting  left side sum using back ptr
                back--;
                ans = Math.max(ans, cur);
            }
            return ans;
        }
    }
}

/*Q3. Pick from both sides!
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given an integer array A of size N.

You have to pick B elements in total. Some (possibly 0) elements from left end of array A and some (possibly 0) from the right end of array A to get the maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4, and array A contains 10 elements, then

You can pick the first four elements or can pick the last four elements, or can pick 1 from front and 3 from the back, etc. You need to return the maximum possible sum of elements you can pick.


Problem Constraints
1 <= N <= 105

1 <= B <= N

-103 <= A[i] <= 103



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return an integer denoting the maximum possible sum of elements you picked.



Example Input
Input 1:

 A = [5, -2, 3 , 1, 2]
 B = 3
Input 2:

 A = [1, 2]
 B = 1


Example Output
Output 1:

 8
Output 2:

 2


Example Explanation
Explanation 1:

 Pick element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
Explanation 2:

 Pick element 2 from end as this is the maximum we can get



See Expected Output*/

/*Approach using Prefix and Suffix Sums:

Maintain two arrays prefix[i] and suffix[i] where prefix[i] denotes sum of elements from index [0,i] and suffix[i] denotes sum of elements from index [i,N-1].

Now iterate from left and one by one pick elements from left for example: if you pick ‘a’ elements from left and remaining ‘k-a’ elements from right.
So the sum in this case will be prefix[a-1] + suffix[n-(k-a)]

Maintain the maximum among all and return it.

Time Complexity: O(N)
Space Complexity: O(N)

where N is number of elements in array A

Bonus: Try solving it in O(1) space.*/