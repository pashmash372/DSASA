package com.scaler.dsa.homework;


import java.util.ArrayList;

public class Ceilinginasortedarray {
    public int solve(int A, ArrayList<Integer> B) {
        Integer ans=Integer.MIN_VALUE;
        for(int i=0; i<A; i++){
            ans=Math.max(ans, B.get(i));
        }
        return ans;
    }
}
/*Q2. Ceiling in a sorted array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a sorted array B of integers of size A, and a integer value C, return the ceiling of C which is present in array B.


Problem Constraints
1 <= A <= 105,
-109 <= B[i] <= 109,
-109 <= C <= 109


Input Format
The first argument A is the size of the array.
The second argument B is the sorted array.
The third argument C is the integer value whose ceil in the array is to be obtained.


Output Format
A single integer, denoting the ceil of C present in array B. If no ceil is present return -1.


Example Input
Input 1:

A = 5
B = [2, 5, 6, 9, 18]
C = 7
Input 2:

A = 6
B = [3, 7, 9, 11, 19, 20]
C = 22


Example Output
Output 1:
9
Output 2:

-1


Example Explanation
Explanation 1:
The greatest integer greater than or equal to 7, and present in array B is 9.
Explanation 2:

There is no integer greater than or equal to 22, which is present in array B, so the result is -1.*/


/*Since the array is monotonically increasing, we can use binary search for searching the ceil value.
First initialize l = 0, and r = A - 1, which represents the end points of our current binary search range.
Next we will consider mid = (l + r)/2 (taking its floor value), and compare B[mid] with C.

If C <= B[mid]:
then B[mid] can be a possible candidate for ceil, we assign ans = B[mid], and our ans would be surely less than or equal to B[mid].
We also assign r = mid - 1,
as all the elements B[i] where i > mid, cannot be our ceil_value, as B[i] > B[mid] will always hold true, and the ceil_value ≤ B[mid].

If C > B[mid]:
we assign l = mid + 1,
as all the elements B[i] where i <= mid, cannot be our ceil_value, as B[i] ≤ B[mid] will always hold true, and the ceil value cannot be less than C.
We continue the binary search until l ≤ r.

Time complexity: O(log(A))
Space complexity: O(1)

Refer to the complete solution for more details.
*/