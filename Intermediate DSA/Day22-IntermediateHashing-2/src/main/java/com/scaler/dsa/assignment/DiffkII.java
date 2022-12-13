package com.scaler.dsa.assignment;


import java.util.HashMap;

public class DiffkII {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int diffPossible(final int[] A, int B) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : A) {
            if (hashMap.containsKey(num)) {
                int value = hashMap.get(num);
                value++;
                hashMap.put(num, value);
            } else {
                hashMap.put(num, 1);
            }
        }

        for (int num : A) {

            int n = B + num;

            if (hashMap.containsKey(n)) {
                if (num == n && hashMap.get(n) > 1)
                    return 1;
                else if (num != n)
                    return 1;
            }

            n = num - B;

            if (hashMap.containsKey(n)) {
                if (num == n && hashMap.get(n) > 1)
                    return 1;
                else if (num != n)
                    return 1;
            }
        }

        return 0;
    }
}


/*Q2. Diffk II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A of integers and another non negative integer B .

Find if there exists 2 indices i and j such that A[i] - A[j] = B and i != j.



Problem Constraints
1 <= |A| <= 106

0 <= A[i] <= 109

0 <= B <= 109



Input Format
First argument A is an array of integer

Second argument B is an integer



Output Format
Return 1 if two such indexes are found and 0 otherwise


Example Input
Input 1:
A = [1, 5, 3]
B = 2
Input 2:
A = [2, 4, 3]
B = 3


Example Output
Output 1:
1
Output 2:
0


Example Explanation
For Input 1:
The given value of A[1] = 1 and A[3] = 3.
The value of A[3] - A[1] = 2.
For Input 2:
There are no pairs such that difference is B.*/

/*We are looking to find pair of integers where A[i] - A[j] = k, k being known entity
Lets say we fix A[i] ( i.e. we know A[i]), do we know what A[j] should be ?
A[j] = A[i] - k.

We can store all the numbers in a hashmap / hashset and then lookup A[j] in it to find out if A[j] exists.

Corner case : How do you handle case when k = 0 cleanly ?*/