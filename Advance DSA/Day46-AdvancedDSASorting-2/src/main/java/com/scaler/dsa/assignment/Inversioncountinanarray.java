package com.scaler.dsa.assignment;



public class Inversioncountinanarray {
    private int Mod = 1000 * 1000 * 1000 + 7;
    public int solve(int[] A) {
        return (int) mergeSort(A);
    }
    public long mergeSort(int[] A) {
        int[] temp = new int[A.length];
        return _mergeSort(A, temp, 0, A.length - 1) % Mod;
    }
    public long _mergeSort(int arr[], int temp[], int left, int right) {
        int mid;
        long inv_count = 0;
        if (right > left) {
            /* Divide the array into two parts and
            call _mergeSortAndCountInv()
            for each of the parts */
            mid = (right + left) / 2;
            /* Inversion count will be sum of
            inversions in left-part, right-part
            and number of inversions in merging */
            inv_count += _mergeSort(arr, temp, left, mid);
            inv_count += _mergeSort(arr, temp, mid + 1, right);
            /*Merge the two parts*/
            inv_count += merge(arr, temp, left, mid + 1, right);
        }
        return inv_count % Mod;
    }
    public long merge(int arr[], int temp[], int left, int mid, int right) {
        int i, j, k;
        long inv_count = 0;
        i = left; /* i is index for left subarray*/
        j = mid; /* j is index for right subarray*/
        k = left; /* k is index for resultant merged subarray*/
        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else {
                temp[k++] = arr[j++];
                inv_count = inv_count + (mid - i);
            }
        }
        /* Copy the remaining elements of left subarray
                (if there are any) to temp*/
        while (i <= mid - 1)
            temp[k++] = arr[i++];
        /* Copy the remaining elements of right subarray
                (if there are any) to temp*/
        while (j <= right)
            temp[k++] = arr[j++];
        /*Copy back the merged elements to original array*/
        for (i = left; i <= right; i++)
            arr[i] = temp[i];
        return inv_count % Mod;
    }
}
/*Q1. Inversion count in an array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j) is called an inversion of A. Find the total number of inversions of A modulo (109 + 7).



Problem Constraints
1 <= length of the array <= 100000

1 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return the number of inversions of A modulo (109 + 7).



Example Input
Input 1:

A = [3, 2, 1]
Input 2:

A = [1, 2, 3]


Example Output
Output 1:

3
Output 2:

0


Example Explanation
Explanation 1:

 All pairs are inversions.
Explanation 2:

 No inversions.*/

/*Naive Approach Traverse through the array from start to end Find the count of elements smaller than the current number up to that index for every element using another loop. Sum up the count of inversion for every index. Print the count of inversions.

Efficient Approach using Merge Sort

Suppose we know the number of inversions in the left half and the right half of the array, lets call them inv_l and inv_r.
Which inversions are not counted in inv_l+inv_r ? The elements in the left half which are greater than the elements in the right half. These are the inversions which are not counted.

Lets assume that both left half and right half are sorted. Can we count the number of inversions now?
We can just merge the two arrays and whenever we find that a[i] > a[j] (where i is the pointer of left half of the array and j is the pointer of the right half of the array) we simply increment the number of inversions.
The final answer will be inv_l + inv_r + number of inversions found during merge step.

Does this remind of a famous algorithm?

Yes, thats right. It is Merge Sort with a slight modification.*/