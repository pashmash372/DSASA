package com.scaler.dsa.homework;

import java.util.ArrayList;
import java.util.Collections;


public class AnotherCoinProblem {
    public int solve(int A) {
        ArrayList< Integer > v = new ArrayList < Integer > ();

        int val = 1;

        // Storing all denominations of coins
        while (val <= 2000000000) {
            v.add(val);
            val = val * 5;
        }
        // Sort in decreasing order
        Collections.reverse(v);

        int ans = 0;
        // Loop from the largest denomination
        for (int i = 0; i < v.size(); i++) {
            ans += A / v.get(i);
            A = A % v.get(i);
        }
        return ans;
    }
}

/*Q2. Another Coin Problem
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
The monetary system in DarkLand is really simple and systematic. The locals-only use coins. The coins come in different values. The values used are:

 1, 5, 25, 125, 625, 3125, 15625, ...
Formally, for each K >= 0 there are coins worth 5K.

Given an integer A denoting the cost of an item, find and return the smallest number of coins necessary to pay exactly the cost of the item (assuming you have a sufficient supply of coins of each of the types you will need).



Problem Constraints
1 <= A <= 2×109



Input Format
The only argument given is integer A.



Output Format
Return the smallest number of coins necessary to pay exactly the cost of the item.



Example Input
Input 1:

 A = 47
Input 2:

 A = 9


Example Output
Output 1:

 7
Output 2:

 5


Example Explanation
Explanation 1:

 Representation of 7 coins will be : (1 + 1 + 5 + 5 + 5 + 5 + 25).
Explanation 2:

 Representation of 5 coins will be : (1 + 1 + 1 + 1 + 5).

*/

/*We will use the Greedy solution.

Start from the largest possible denomination and keep adding denominations while the remaining value is greater than 0.

The number of the chosen coin is determined by the A/(coin value).*/