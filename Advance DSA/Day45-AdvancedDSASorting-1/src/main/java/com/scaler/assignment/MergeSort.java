package com.scaler.assignment;

public class MergeSort {
    // example of merge sort in Java
// merge function take two intervals
// one from start to mid
// second from mid+1, to end
// and merge them in sorted order
    int[] solve(int[] A) {

        mergeSort(A, 0, A.length - 1);
        return A;
    }

    void merge(int Arr[], int start, int mid, int end) {

        // create a temp array
        int temp[] = new int[end - start + 1];

        // crawlers for both intervals and for temp
        int i = start, j = mid + 1, k = 0;

        // traverse both arrays and in each iteration add smaller of both elements in temp
        while (i <= mid && j <= end) {
            if (Arr[i] <= Arr[j]) {
                temp[k] = Arr[i];
                k += 1;
                i += 1;
            } else {
                temp[k] = Arr[j];
                k += 1;
                j += 1;
            }
        }

        // add elements left in the first interval
        while (i <= mid) {
            temp[k] = Arr[i];
            k += 1;
            i += 1;
        }

        // add elements left in the second interval
        while (j <= end) {
            temp[k] = Arr[j];
            k += 1;
            j += 1;
        }

        // copy temp to original interval
        for (i = start; i <= end; i += 1) {
            Arr[i] = temp[i - start];
        }
    }

// Arr is an array of integer type
// start and end are the starting and ending index of current interval of Arr

    void mergeSort(int Arr[], int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(Arr, start, mid);
            mergeSort(Arr, mid + 1, end);
            merge(Arr, start, mid, end);
        }
    }
}


/*Q3. Merge Sort
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer array A, sort the array using Merge Sort.


Problem Constraints
1 <= |A| <= 105
1 <= A[i] <= 109


Input Format
First argument is an integer array A.


Output Format
Return the sorted array.


Example Input
Input 1:-
A = [1, 4, 10, 2, 1, 5]
Input 2:-
A = [3, 7, 1]


Example Output
Output 1:-
[1, 1, 2, 4, 5, 10]
Output 2:-
[1, 3, 7]


Example Explanation
Explanation 1:
Return the sorted array.*/