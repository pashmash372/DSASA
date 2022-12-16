package com.scaler.dsa.homework;


import java.util.Comparator;
import java.util.PriorityQueue;

public class SpecialMedian {
    static PriorityQueue< Integer > maxHeap;
    static PriorityQueue < Integer > minHeap;
    public int solve(int[] A) {
        int n = A.length;
        minHeap = new PriorityQueue();
        maxHeap = new PriorityQueue(new CustomComp3());
        for (int i = 0; i < (n - 1); i++) {
            add_number(A[i]);
            if (A[i + 1] == find_median()) return 1;
        }
        minHeap = new PriorityQueue();
        maxHeap = new PriorityQueue(new CustomComp3());
        for (int i = n - 1; i > 0; i--) {
            add_number(A[i]);
            if (A[i - 1] == find_median()) return 1;
        }
        return 0;
    }
    public static void add_number(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.peek());
        maxHeap.poll();
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.peek());
            minHeap.poll();
        }
    }
    public static int find_median() {
        if (maxHeap.size() > minHeap.size()) return maxHeap.peek();
        else {
            int ans = maxHeap.peek() + minHeap.peek();
            if (ans % 2 != 0) return Integer.MAX_VALUE; //answer is a fraction
            else return ans / 2;
        }
    }
}
/*decreasing order*/
class CustomComp3 implements Comparator< Integer > {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}
/*Q3. Special Median
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given an array A containing N numbers. This array is called special if it satisfies one of the following properties:

There exists an element A[i] in the array such that A[i] is equal to the median of elements [A[0], A[1], ...., A[i-1]]
There exists an element A[i] in the array such that A[i] is equal to the median of elements [A[i+1], A[i+2], ...., A[N-1]]
The Median is the middle element in the sorted list of elements. If the number of elements is even then the median will be (sum of both middle elements) / 2.

Return 1 if the array is special else return 0.

NOTE:

Do not neglect decimal point while calculating the median
For A[0] consider only the median of elements [A[1], A[2], ..., A[N-1]] (as there are no elements to the left of it)
For A[N-1] consider only the median of elements [A[0], A[1], ...., A[N-2]]


Problem Constraints
1 <= N <= 1000000.
A[i] is in the range of a signed 32-bit integer.



Input Format
The first and only argument is an integer array A.



Output Format
Return 1 if the given array is special else return 0.



Example Input
Input 1:

 A = [4, 6, 8, 4]
Input 2:

 A = [2, 7, 3, 1]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explantion 1:

 Here, 6 is equal to the median of [8, 4].
Explanation 2:

 No element satisfies any condition.
*/

/*This problem is the same as finding the median in a stream of numbers. You can use max and min heaps to solve this problem. Following is the detailed algorithm:

Use two heaps:

A max-heap to store all the elements that are less than or equal to the effective median at any point.
A min-heap to store all the elements that are more than the effective median at any point.
Now, if the number of elements to find the median is odd, then the median is equal to the root of the max-heap. If the number of elements is even, then the median is equal to (the root of min-heap + root of max-heap)/2.

Note that the size of both the heaps at any point will differ by at most 1.

Using the Priority_queue interface of C++, the coding part is very easy.*/