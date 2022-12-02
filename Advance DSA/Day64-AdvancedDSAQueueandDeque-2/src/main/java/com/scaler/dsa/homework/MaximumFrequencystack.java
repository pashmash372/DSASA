package com.scaler.dsa.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;


public class MaximumFrequencystack {
    // to store frequence of an element in the stack.
    private final HashMap<Integer, Stack<Integer>> stacks = new HashMap<Integer, Stack<Integer>>();
    // to maintain the structure of stack and pop out top most element in case of a tie.
    private final HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
    private int maxfreq = 0;

    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            int oper = A.get(i).get(0);
            //push operation
            if (oper == 1) {
                int x = A.get(i).get(1);
                if (freq.get(x) == null) {
                    freq.put(x, 1);
                } else {
                    freq.put(x, freq.get(x) + 1);
                }
                int fr = freq.get(x);
                maxfreq = Math.max(fr, maxfreq);
                if (stacks.get(fr) != null) {
                    Stack<Integer> tmp = stacks.get(fr);
                    tmp.push(x);
                } else {
                    Stack<Integer> tmp = new Stack<Integer>();
                    tmp.push(x);
                    stacks.put(fr, tmp);
                }
                ans.add(-1);
            } else {
                //pop operation
                Stack<Integer> tmp = stacks.get(maxfreq);
                int x = tmp.peek();
                ans.add(x);
                freq.put(x, maxfreq - 1);
                tmp.pop();
                if (tmp.empty()) maxfreq--;
            }
        }
        return ans;
    }
}


/*Q2. Maximum Frequency stack
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a matrix A of size N x 2 which represents different operations.
Assume initially you have a stack-like data structure you have to perform operations on it.

Operations are of two types:

1 x: push an integer x onto the stack and return -1.

2 0: remove and return the most frequent element in the stack.

If there is a tie for the most frequent element, the element closest to the top of the stack is removed and returned.

A[i][0] describes the type of operation to be performed. A[i][1] describe the element x or 0 corresponding to the operation performed.



Problem Constraints
1 <= N <= 100000

1 <= A[i][0] <= 2

0 <= A[i][1] <= 109



Input Format
The only argument given is the integer array A.



Output Format
Return the array of integers denoting the answer to each operation.



Example Input
Input 1:

A = [
            [1, 5]
            [1, 7]
            [1, 5]
            [1, 7]
            [1, 4]
            [1, 5]
            [2, 0]
            [2, 0]
            [2, 0]
            [2, 0]  ]
Input 2:

 A =  [
        [1, 5]
        [2, 0]
        [1, 4]   ]


Example Output
Output 1:

 [-1, -1, -1, -1, -1, -1, 5, 7, 5, 4]
Output 2:

 [-1, 5, -1]


Example Explanation
Explanation 1:

 Just simulate given operations.
Explanation 2:

 Just simulate given operations.

*/

/*Pushing into a stack looks like this:
void push(int x)
{
    freq[x]++;
    if(freq[x] > max_freq) max_freq = freq[x];

    if(stacks.count(freq[x]))
    {
        stacks[freq[x]].push(x);
    }
    else
    {
        stack st;
        st.push(x);
        stacks[freq[x]] = st;
    }
}
This helps in maintaining the required answer and getting the answer to each of the
parts that need to be done such as push and pop of the elements</pre>
*/

/**/