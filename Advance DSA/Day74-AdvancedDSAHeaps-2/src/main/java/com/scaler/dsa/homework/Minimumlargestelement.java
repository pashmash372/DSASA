package com.scaler.dsa.homework;


import java.util.Comparator;
import java.util.PriorityQueue;

public class Minimumlargestelement {
    public int solve(int[] A, int B) {

        PriorityQueue<Pair> pq = new PriorityQueue(new CustomComp2());
        int s = A.length;

        //Let's keep a state array to keep track of the value of every element in the array after K operations.
        //Initially state array will be the same as the inital array.
        int[] state = new int[s];
        System.arraycopy(A, 0, state, 0, s);// same as copy of array

        //Consider a min heap. And initially push the next state of every element in the heap.
        //Note that you need to keep track of the indices of every element in the heap, present in the initial array.
        for (int i = 0; i < s; i++) {
            pq.offer(new Pair(2 * A[i], i));
        }

        while (B-- > 0) {
            Pair top = pq.poll();

            //Pick the top element, and change the state of that element, in the state array.
            state[top.ss] = top.ff;

            pq.offer(new Pair(A[top.ss] + top.ff, top.ss));
        }

        int mx = state[0];
        for (int i = 0; i < s; i++) mx = Math.max(mx, state[i]);
        return mx;
    }
}

class Pair {
    int ff;
    int ss;

    public Pair(int c, int d) {
        this.ff = c;
        this.ss = d;
    }
}

/*increasing order*/
class CustomComp2 implements Comparator<Pair> {
    @Override
    public int compare(Pair a, Pair b) {
        return a.ff - b.ff;
    }
}


/*Java solution using minHeap*/

class Minimumlargestelement1 {
    public int solve(int[] A, int B) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        int n = A.length;
        int ans = Integer.MIN_VALUE;
        int[] states = new int[n];

        //pushing next state of all elements into minHeap
        for (int i = 0; i < n; i++) {
            ans = Math.max(A[i], ans);
            minHeap.add(new int[]{A[i] + A[i], i});
        }

        for (int i = 0; i < B; i++) {
            // choosing element contains min value in next state
            int[] temp = minHeap.peek();
            int index = temp[1];
            int val = temp[0];
            states[index] = val;
            minHeap.poll();
            minHeap.add(new int[]{A[index] + val, index});
        }

        //edge case
        if (ans < 0) return ans;

        for (int num : states)
            ans = Math.max(num, ans);

        return ans;
    }
}



/*Q1. Minimum largest element
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A of N numbers, you have to perform B operations. In each operation, you have to pick any one of the N elements and add the original value(value stored at the index before we did any operations) to its current value. You can choose any of the N elements in each operation.

Perform B operations in such a way that the largest element of the modified array(after B operations) is minimized.
Find the minimum possible largest element after B operations.



Problem Constraints
1 <= N <= 106
0 <= B <= 105
-105 <= A[i] <= 105



Input Format
The first argument is an integer array A.
The second argument is an integer B.



Output Format
Return an integer denoting the minimum possible largest element after B operations.



Example Input
Input 1:

 A = [1, 2, 3, 4]
 B = 3
Input 2:

 A = [5, 1, 4, 2]
 B = 5


Example Output
Output 1:

 4
Output 2:

 5


Example Explanation
Explanation 1:

 Apply operation on element at index 0, the array would change to [2, 2, 3, 4]
 Apply operation on element at index 0, the array would change to [3, 2, 3, 4]
 Apply operation on element at index 0, the array would change to [4, 2, 3, 4]
 Minimum possible largest element after 3 operations is 4.
Explanation 2:

 Apply operation on element at index 1, the array would change to [5, 2, 4, 2]
 Apply operation on element at index 1, the array would change to [5, 3, 4, 2]
 Apply operation on element at index 1, the array would change to [5, 4, 4, 2]
 Apply operation on element at index 1, the array would change to [5, 5, 4, 2]
 Apply operation on element at index 3, the array would change to [5, 5, 4, 4]
 Minimum possible largest element after 5 operations is 5.

*/

/*Let’s keep a state array to keep track of the value of every element in the array after K operations.
Maintain a state array, which tells about the state of the array after every operation.
Initially, the state array will be the same as the initial array.

We need to consider the next state of every element in the array.
Consider a min-heap. And initially push the next state of every element in the heap.
Note that you need to keep track of the indices of every element in the heap, present in the initial array.
Pick the top element, and change the state of that element in the state array.
Pop this element and push the next state in the heap.
At every operation, we are choosing the element whose next state is minimum hence there are only two possibilities:
1) Either the maximum element remains the same, and we return that element directly.
2) The next state of the popped element is the maximum.
We made sure changing the state of this element is the best option, as the next state of this element is the minimum.
Hence the maximum will be the least using this approach.*/