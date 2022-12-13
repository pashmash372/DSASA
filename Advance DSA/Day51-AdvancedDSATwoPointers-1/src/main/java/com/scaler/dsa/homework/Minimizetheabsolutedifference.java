package com.scaler.dsa.homework;

public class Minimizetheabsolutedifference
{
    /*int Solution::solve(vector<int> &A, vector<int> &B, vector<int> &C) {
    int ans = INT_MAX;
    int i=A.size()-1,j=B.size()-1,k=C.size()-1;
    while(i>=0 and j>=0 and k>=0)
    {
        int maxe = max(A[i], max(B[j],C[k]));
        int mine = min(A[i], min(B[j],C[k]));
        ans = min(ans, maxe - mine);
        if(A[i]==maxe) i--;
        else if(B[j]==maxe) j--;
        else if(C[k]==maxe) k--;
    }
    return ans;
}*/
}
/*Q2. Minimize the absolute difference
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given three sorted arrays A, B and Cof not necessarily same sizes.

Calculate the minimum absolute difference between the maximum and minimum number from the triplet a, b, c such that a, b, c belongs arrays A, B, C respectively. i.e. minimize | max(a,b,c) - min(a,b,c) |.

Example :

Input:

A : [ 1, 4, 5, 8, 10 ]
B : [ 6, 9, 15 ]
C : [ 2, 3, 6, 6 ]
Output:

1
Explanation: We get the minimum difference for a=5, b=6, c=6 as | max(a,b,c) - min(a,b,c) | = |6-5| = 1.*/

/*Start with the largest elements in each of the arrays A,B & C. Maintain a variable to update the answer during each of the steps to be followed.
In every step, the only possible way to decrease the difference is to decrease the maximum element out of the three elements.
So traverse to the next largest element in the array containing the maximum element for this step and update the answer variable.
Repeat this step until the array containing the maximum element ends.

For the given sample example,
initially, the triplets are { 10, 15, 6} and difference is (15 - 6) = 9 and answer is 9
in the next step, { 10, 9, 6 }, diff is (10 - 6) = 4 and answer is updated to 4
next step, { 8, 9, 6 } and diff is 3
next step, { 8, 6, 6 } and diff is 2
next step, {5, 6, 6 } and diff is 1
finally after next two steps we reach { 5, 6, 3 } and cannot continue since array B has ended. Thus the answer is 1.
Note: you can also start with min element triplet and increment the smallest element at every step.*/