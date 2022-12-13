package com.scaler.dsa.homework;

import java.util.HashMap;
import java.util.Map;

public class KOccurrences {

    public int getSum(int A, int B, int[] C) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int sz = C.length;
        for (int i = 0; i < sz; i++) {
            if (mp.containsKey(C[i])) {
                mp.replace(C[i], mp.get(C[i]), mp.get(C[i]) + 1);
            } else {
                mp.put(C[i], 1);
            }
        }
        int flag = 0, cnt = 0;
        for (Map.Entry<Integer, Integer> x : mp.entrySet()) {
            if (flag == 0 && x.getValue() == B) {
                flag = 1;
            }
            if (x.getValue() == B) {
                cnt += x.getKey();
                cnt %= 1000000007;
            }
        }
        if (cnt == 0 && flag == 0) {
            cnt = -1;
        }
        return cnt;
    }


}
/*Q1. K Occurrences
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Groot has N trees lined up in front of him where the height of the i'th tree is denoted by H[i].

He wants to select some trees to replace his broken branches.

But he wants uniformity in his selection of trees.

So he picks only those trees whose heights have frequency B.

He then sums up the heights that occur B times. (He adds the height only once to the sum and not B times).

But the sum he ended up getting was huge so he prints it modulo 10^9+7.

In case no such cluster exists, Groot becomes sad and prints -1.

Constraints:

1.   1<=N<=100000
2.   1<=B<=N
3.   0<=H[i]<=10^9
Input: Integers N and B and an array C of size N

Output: Sum of all numbers in the array that occur exactly B times.

Example:

Input:

N=5 ,B=2 ,C=[1 2 2 3 3]
Output:

5
Explanation:

There are 3 distinct numbers in the array which are 1,2,3.
Out of these, only 2 and 3 occur twice. Therefore the answer is sum of 2 and 3 which is 5.*/

/*In this problem you just have to iterate over the array and store the frequency of that in map
And at last iterate over the map and if the frequency of element is exactly B the add its value in the answer.
To maintain that whether there is any element with frequency B we can maintain flag for that and make that true if got any element with frequency B.
If the flag is false then print -1 else print ans.*/