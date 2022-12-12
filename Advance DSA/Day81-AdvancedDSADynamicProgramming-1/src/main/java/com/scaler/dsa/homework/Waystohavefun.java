package com.scaler.dsa.homework;

import java.util.HashMap;
import java.util.Map;


/*Intuition:

        If a person is sleeping on ith day, he must be either sleeping on (i-1)th day or eating pizza on (i-1)th day or watching TV on (i-1)th day.
        So, for sleep, Recurrence Relation would be f(i,S) = f(i-1,S) + f(i-1,P) + f(i-1,T)

        Similarly for pizza, Relation would be

        f(i,P) = f(i-1,S) + (f-1,T). Now here f(i-1,P) can't be done because Pizza can be eaten every alternate day. If person is eating pizza on ith day, on (i-1)th day, he cant eat pizza.

        Similarly for TV, Relation would be :
        f(i,T) = f(i-1,P) + f(i-1,S) -2*f(i-1,T). Now why we are subtracting 2*f(i-1,T) because if a person is watching TV on ith day, he cant watch TV in earlier 2 days. Now if you see the Reccurence Relation for
        Pizza and Sleep. It is already calculating TV for (i-1)th day but we dont want it.*/

public class Waystohavefun {
    public int solve(int A) {
// memorization map
        Map<Integer, Map<Character, Long>> mem = new HashMap<>();
        int mod = 1000000007;
        long sleepPattern = solve(A, 'S', mem) % mod;
        long tvPattern = solve(A, 'T', mem) % mod;
        long pizaPattern = solve(A, 'P', mem) % mod;
        long ans = (sleepPattern + tvPattern + pizaPattern) % mod;
        ans = (ans + mod) % mod;
        return (int) (ans);

    }

    private long solve(int n, char s, Map<Integer, Map<Character, Long>> mem) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        int mod = 1000000007;
        if (mem.get(n) != null && mem.get(n).get(s) != null) {
            return mem.get(n).get(s);
        }
// finding for Sleep
        if (s == 'S') {
            long count = ((solve(n - 1, 'S', mem) + solve(n - 1, 'P', mem)) % mod + solve(n - 1, 'T', mem)) % mod;
            addInMap(n, 'S', mem, count);
        }
// find for Pizza
        if (s == 'P') {
            long count = (solve(n - 1, 'S', mem) + solve(n - 1, 'T', mem)) % mod;
            addInMap(n, 'P', mem, count);
        }
// find for TV
        if (s == 'T') {
            long count = ((solve(n - 1, 'P', mem) + solve(n - 1, 'S', mem)) % mod - (2L * solve(n - 2, 'T', mem) % mod)) % mod;
            addInMap(n, 'T', mem, count);
        }
        return mem.get(n).get(s);
    }

    private void addInMap(int n, char ch, Map<Integer, Map<Character, Long>> mem, long count) {
        int mod = 1000000007;
        Map<Character, Long> hm = mem.get(n);
        if (hm == null) {
            hm = new HashMap<>();
        }
        hm.put(ch, count % mod);
        mem.put(n, hm);
    }

}


/*Q3. Ways to have fun
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Find the number of ways you can have fun in A days, given you can sleep every day, Pizza can be eaten every alternate day and you can watch Tv shows every two days.

Since the answer could be large, return answer % 109 + 7.



Problem Constraints

1 <= A <= 105



Input Format

First and only argument is an integer A denoting the number of days.



Output Format

Return an integer denoting the number of ways you can have fun in A days.



Example Input

Input 1:

 A = 2
Input 2:

 A = 3


Example Output

Output 1:

 7
Output 2:

 15


Example Explanation

Explanation 1:

 There will be 7 ways to have fun:
 (SS), (SP), (ST), (PS), (PT), (TS), (TP).
Explanation 2:

 There will be 15 ways to have fun.
*/

/*We will use dynamic programming to solve the problem.

Create a 2D array dp[A+1][3] where:

dp[i][0] = number of ways when you sleep i<sup>th</sup> day
dp[i][1] = number of ways when yor eat pizza i<sup>th</sup> day
dp[i][2] = number of ways when you watch Tv show i<sup>th</sup> day
Answer will be dp[A][0] + dp[A][1] + dp[A][2].*/