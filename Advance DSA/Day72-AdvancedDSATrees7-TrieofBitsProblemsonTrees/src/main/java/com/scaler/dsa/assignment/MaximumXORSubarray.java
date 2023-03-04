package com.scaler.dsa.assignment;

import java.util.HashMap;

public class MaximumXORSubarray {
    static final int INT_SIZE = 32;
    static TrieNode root;

    static void insert(int pre_xor, int index) {
        TrieNode temp = root;
        for (int i = INT_SIZE - 1; i >= 0; i--) {
            int val = (pre_xor & (1 << i)) >= 1 ? 1 : 0;
            if (temp.arr[val] == null) temp.arr[val] = new TrieNode();

            temp = temp.arr[val];
        }
        temp.value = pre_xor;
        temp.end = index;
    }

    static pair query(int pre_xor) {
        TrieNode temp = root;
        for (int i = INT_SIZE - 1; i >= 0; i--) {
            int val = (pre_xor & (1 << i)) >= 1 ? 1 : 0;
            if (temp.arr[1 - val] != null) temp = temp.arr[1 - val];
            else if (temp.arr[val] != null) temp = temp.arr[val];
        }
        return (new pair(pre_xor ^ (temp.value), temp.end));
    }

    public int[] solve(int[] arr) {
        int n = arr.length;
        root = new TrieNode();
        insert(0, -1);
        int[] res = new int[2];
        int result = Integer.MIN_VALUE;
        int pre_xor = 0;
        int start = -1;
        int end = 0;
        for (int i = 0; i < n; i++) {
            pre_xor = pre_xor ^ arr[i];
            insert(pre_xor, i);
            pair ans = query(pre_xor);
            if (ans.a > result) {
                result = ans.a;
                end = i;
                start = ans.b + 1;
            } else if (ans.a == result) {
                int currLen = end - start + 1;
                int newLen = i - (ans.b + 1) + 1;
                if (newLen < currLen) {
                    start = ans.b + 1;
                    end = i;
                } else if (newLen == currLen && (ans.b + 1) < start) {
                    start = ans.b + 1;
                    end = i;
                }
            }
        }
        res[0] = start + 1;
        res[1] = end + 1;
        return res;
    }

    static class TrieNode {
        int value;
        int end;
        TrieNode[] arr = new TrieNode[2];

        public TrieNode() {
            end = -1;
            value = 0;
            arr[0] = null;
            arr[1] = null;
        }
    }
}

class pair {
    int a, b;

    public pair(int c, int d) {
        this.a = c;
        this.b = d;
    }
}


/*Java: Trie Prefix XOR Approach: TC: O(N) and SC: O(N)*/

class MaximumXORSubarray2 {
    Node root = new Node();

    //ADD NUMBER TO TRIE AND CALCULATE ITS MAX XOR//
    public int addNumAndReturnMaxXor(Node root, int num) {
        Node curr = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (curr.children[bit] == null) {
                curr.children[bit] = new Node();
            }
            curr = curr.children[bit];
        }
        int xor = 0;
        curr = root;
        for (int i = 31; i >= 0; i--) {
            int bit = ((num >> i) & 1) ^ 1;
            if (curr.children[bit] != null) {
                xor += (1 << i);
                curr = curr.children[bit];
            } else {
                curr = curr.children[bit ^ 1];
            }
        }
        return xor;
    }

    public int[] solve(int[] A) {
        int[] prefXor = new int[A.length + 1];
        prefXor[0] = 0;
        for (int i = 1; i < prefXor.length; i++) {
            prefXor[i] = A[i - 1] ^ prefXor[i - 1];
        }
        int maxXor = Integer.MIN_VALUE;
        for (int i = 0; i < prefXor.length; i++) {
            int xor = addNumAndReturnMaxXor(root, prefXor[i]);
            maxXor = Math.max(maxXor, xor);
        }
//FOUND MAX_XOR, NOW FIND START AND END INDEX OF THE SUBARRAY, SUCH THAT ITS LENGTH AND START ARE MINIMUM//
        HashMap<Integer, Integer> map = new HashMap<>();
        int minLen = Integer.MAX_VALUE;
        int minStart = Integer.MAX_VALUE;
        int minEnd = Integer.MAX_VALUE;
        for (int i = 0; i < prefXor.length; i++) {
            int val = maxXor ^ prefXor[i];
            if (map.containsKey(val)) {
                int start = map.get(val) + 1;
                int end = i;
                int len = end - start + 1;
                if (len < minLen) {
                    minLen = len;
                    minStart = start;
                    minEnd = end;
                } else if (len == minLen && start < minStart) {
                    minLen = len;
                    minStart = start;
                    minEnd = end;
                }
            }
            map.put(prefXor[i], i);
        }
        return new int[]{minStart, minEnd};
    }

    //NODE STRUCTURE AND CONSTRUCTOR//
    class Node {
        Node[] children;

        Node() {
            this.children = new Node[2];
        }
    }
}


/*Q2. Maximum XOR Subarray
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array, A of integers of size N. Find the subarray AL, AL+1, AL+2, ... AR with 1<=L<=R<=N, which has maximum XOR value.

NOTE: If there are multiple subarrays with the same maximum value, return the subarray with minimum length. If the length is the same, return the subarray with the minimum starting index.



Problem Constraints
1 <= N <= 100000
0 <= A[i] <= 109



Input Format
First and only argument is an integer array A.



Output Format
Return an integer array B of size 2. B[0] is the starting index(1-based) of the subarray and B[1] is the ending index(1-based) of the subarray.



Example Input
Input 1:

 A = [1, 4, 3]
Input 2:

 A = [8]


Example Output
Output 1:

 [2, 3]
Output 2:

 [1, 1]


Example Explanation
Explanation 1:

 There are 6 possible subarrays of A:
 subarray            XOR value
 [1]                     1
 [4]                     4
 [3]                     3
 [1, 4]                  5 (1^4)
 [4, 3]                  7 (4^3)
 [1, 4, 3]               6 (1^4^3)

 [4, 3] subarray has maximum XOR value. So, return [2, 3].
Explanation 2:

 There is only one element in the array. So, the maximum XOR value is equal to 8 and the only possible subarray is [1, 1].  */

/*Build a prefXor array in which the ith element represents the xor of all elements from 0 to i. To find the xor of any subarray[l..r], we can just take the xor of prefXor[r] and prefXor[l-1].

To find the maximum xor subarray ending at the index i, insert the bit representation(starting from most significant bit) of all the elements of prefXor array upto i-1 into the trie data structure.
We have two possible cases at ith index.

The prefix itself has maximum xor.
We need to remove some prefix (ending at index from 0 to i-1).Try to have most significant bit to be set bit i.e. 1. As we have maintained the trie data structure of bit representation of i-1 elements of prefXor array, we can find the maximum xor in O(logm) where m is the maximum number present in the given array.
We can find the maximum subarray ending at every index and return the subarray, which has the maximum XOR value.

*/