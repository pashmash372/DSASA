package com.scaler.dsa.homework;

/* This question is simlar to the rotated sorted array.
 we will solve this in 3log(N) approach
 1st bin Search to find the pivot element -> log(n).
 2nd bin Search to find the element from 0 -> Pivot -> log(n). [Array is in increasing order]
 3rd bin Search to find the element from Pivot+1 -> N-1 -> log(n). [Array is in decreasing order]
 Total time complexity is O(logN) <- O(3logN) <- O(logN+logN+logN).
 However, since constraints is till 10^8, even a simple linear Search TC O(N) will alsso accepted for this question.
*/

class SearchinBitonicArray1 {
    public int solve(int[] A, int B) {

        int N = A.length;
        int start = 1, end = N - 2;
        // find the bitonic point.
        int pivot = 0;
        if (A[N - 1] > A[N - 2]) pivot = N - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
                pivot = mid;
                break;
            } else if (A[mid] < A[mid - 1])// pivot is on the left
                end = mid - 1;
            else start = mid + 1;
        }

        // now that we have got the pivot we just have to do 2 binary searches 1 from 0->pivot && other from pivot+1 -> N-1.

        start = 0;
        end = pivot;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A[mid] == B) return mid;
            else if (A[mid] < B) start = mid + 1;
            else end = mid - 1;
        }

        start = pivot + 1;
        end = N - 1;
        // elements from pivot to n-1 would be in descending order so adjust the conditions accordingly.
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A[mid] == B) return mid;
            else if (A[mid] < B) end = mid - 1;
            else start = mid + 1;
        }

        return -1; // Element is not present in the array
    }
}

// /* Linear Search O(N) approach
// public class Solution {
//     public int solve(int[] A, int B) {
//        int N = A.length;
//         for (int i=0; i< N; i++){
//             if (A[i] == B)
//                 return i;
//         }
//         return -1;
//     }
// }*/

public class SearchinBitonicArray {
    /*// Function for binary search in ascending part
int ascendingBinarySearch(vector < int > & arr, int low,
  int high, int key) {
  while (low <= high) {
    int mid = low + (high - low) / 2;
    if (arr[mid] == key)
      return mid;
    if (arr[mid] > key)
      high = mid - 1;
    else
      low = mid + 1;
  }
  return -1;
}

// Function for binary search in descending part of array
int descendingBinarySearch(vector < int > & arr, int low,
  int high, int key) {
  while (low <= high) {
    int mid = low + (high - low) / 2;
    if (arr[mid] == key)
      return mid;
    if (arr[mid] < key)
      high = mid - 1;
    else
      low = mid + 1;
  }
  return -1;
}

// finding bitonic point
int findBitonicPoint(vector < int > & arr, int n, int l, int r) {
  int mid;
  mid = (r + l) / 2;
  if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
    return mid;
  } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
    return findBitonicPoint(arr, n, mid, r);
  } else if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
    return findBitonicPoint(arr, n, l, mid);
  }
}

// Function to search key in bitonic array
int searchBitonic(vector < int > & arr, int n, int key, int index) {
  if (key > arr[index])
    return -1;

  else if (key == arr[index])
    return index;

  else {
    int temp = ascendingBinarySearch(arr, 0, index - 1, key);
    if (temp != -1) {
      return temp;
    }

    // Search in right of k
    return descendingBinarySearch(arr, index + 1, n - 1, key);
  }
}
int solveQ(vector < int > & arr, int b) {
  int index = findBitonicPoint(arr, arr.size(), 0, arr.size() - 1);
  int x = searchBitonic(arr, arr.size(), b, index);
  return x;
}
int Solution::solve(vector < int > & A, int B) {
  return solveQ(A, B);
}*/
}


/*Q3. Search in Bitonic Array!
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a bitonic sequence A of N distinct elements, write a program to find a given element B in the bitonic sequence in O(logN) time.

NOTE:

A Bitonic Sequence is a sequence of numbers which is first strictly increasing then after a point strictly decreasing.


Problem Constraints
3 <= N <= 105

1 <= A[i], B <= 108

Given array always contain a bitonic point.

Array A always contain distinct elements.



Input Format
First argument is an integer array A denoting the bitonic sequence.

Second argument is an integer B.



Output Format
Return a single integer denoting the position (0 index based) of the element B in the array A if B doesn't exist in A return -1.



Example Input
Input 1:

 A = [3, 9, 10, 20, 17, 5, 1]
 B = 20
Input 2:

 A = [5, 6, 7, 8, 9, 10, 3, 2, 1]
 B = 30


Example Output
Output 1:

 3
Output 2:

 -1


Example Explanation
Explanation 1:

 B = 20 present in A at index 3
Explanation 2:

 B = 30 is not present in A*/

/*A simple solution is to do linear search. Time complexity of this solution would be O(N).

An efficient solution is based on Binary Search. The idea is to find the bitonic point k which is the index of the maximum element of given sequence. If the element to be searched is greater than maximum element return -1, else search the element in both halves. Below is the step by step algorithm on how to do this.

Find the bitonic point in the given array, i.e the maximum element in the given bitonic array. This can be done in log(N) time by modifying the binary search algorithm. You can refer to this post on how to do this.
If the element to be searched is equal to the element at bitonic point then print the index of bitonic point.
If the element to be searched is greater than element at bitonic point then element does not exist in the array.
If the element to be searched is less than element at bitonic point then search for element in both half of the array using binary search.*/