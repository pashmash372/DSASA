package com.scaler.dsa.homework;


public class SubarraysXorLessThanB {
    static int mod = 1000000007;
    public int solve(int[] A, int B) {
        return solveQ(A, B);
    }
    static class Trie {
        Trie[] child = new Trie[2];
        int value;
        Trie() {
            value = 0;
            for (int i = 0; i < 2; i++) {
                child[i] = null;
            }
        }
    }
    private static void insert(int preXOR) {
        Trie crawl = start;
        for (int i = 20; i >= 0; i--) {
            int indx = (preXOR & (1 << i)) > 0 ? 1 : 0;
            if (crawl.child[indx] == null) {
                crawl.child[indx] = new Trie();
            }
            crawl = crawl.child[indx];
            crawl.value++;
        }
    }
    private static int query(int preXOR, int k) {
        int ans = 0;
        Trie crawl = start;
        for (int i = 20; crawl != null && i >= 0; i--) {
            int q = (k & (1 << i)) > 0 ? 1 : 0;
            int indx = (preXOR & (1 << i)) > 0 ? 1 : 0;

            if (q == 1) {
                if (crawl.child[indx] != null) {
                    ans += crawl.child[indx].value;
                }
                crawl = crawl.child[1 - indx];
            } else {
                crawl = crawl.child[indx];
            }
        }
        return ans;
    }
    private static Trie start;

    public static int solveQ(int[] A, int B) {
        start = new Trie();
        int preXOR = 0;
        long count = 0;
        insert(preXOR);
        for (int i = 0; i < A.length; i++) {
            preXOR ^= A[i];
            count += (long) query(preXOR, B);
            count %= mod;
            insert(preXOR);
        }
        return (int) count;
    }
}

/*Q2. Subarrays Xor Less Than B
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given an array of integers A. Find and return the number of subarrays whose xor values is less than B.
NOTE: As the answer can be very large, return the answer modulo (109+7).



Problem Constraints

1 <= length of the array <= 100000
1 <= A[i] <= 105
1 <= B <= 106



Input Format

The argument given is the integer array A
Second argument is an integer B.



Output Format

Return an integer denoting the number of subarrays whose xor values is less than B.



Example Input

Input 1:

 A = [8, 3, 10, 2, 6, 7, 6, 9, 3]
 B = 3
Input 2:

 A = [9, 4, 3, 11]
 B = 7


Example Output

Output 1:
 5
Output 2:

 3


Example Explanation

Explanation 1:

 Generate all the subarrays and their corresponding xor and there are only 5 such subaraays which have xor less than 3.
Explanation 2:

 Subarrays with xor < 7 are : [9, 4, 3, 11], [4] and [3].
 So, the answer is 3.


*/


/*Use trie data structure. An efficient approach will be to calculate all of the prefix xor values i.e. a[1:i] for all i. It can be verified that the xor of a subarray a[l:r] can be written as (a[1:l-1] xor a[1:r]), where a[i, j] is the xor of all the elements with index such that, i <= index <= j.

We will store a number as binary number in trie. The left child will shows that the next bit is 0 and the right child will show the next bit is 1. If xor[i, j] represents the xor of all elements in the subarray a[i, j], then at an index i what we have is, a trie which has xor[1:1], xor[1:2]…..xor[1:i-1] already inserted. Now we somehow count how many of these (numbers in trie) are such that its xor with xor[1:i] is smaller than k. This will cover all the subarrays ending at the index i and having xor i.e. xor[j, i] <=k;
Now, to count the numbers that are below a given node, we modify the trie and each node will also store the number of leafs in that subtree and this would be modified after each insertion.

Time complexity: O(n*log(max)), where max is the maximum element in the array.

*/