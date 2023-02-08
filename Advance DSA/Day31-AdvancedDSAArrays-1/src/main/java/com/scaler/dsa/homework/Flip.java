package com.scaler.dsa.homework;


import java.util.ArrayList;

public class Flip {
    public ArrayList<Integer> flip(String A) {
        int cur = 0;
        int maxx = 0, l = 0, r = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(-1);
        ans.add(-1);
        //basic kadane's algorithm implementation
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '1') cur--;
            else cur++;
            if (cur > maxx) {
                ans.set(0, l + 1);
                ans.set(1, r + 1);
                maxx = cur;
            }
            if (cur < 0) {
                cur = 0;
                l = i + 1;
                r = i + 1;
            } else r++;
        }
        if (maxx == 0) {
            return new ArrayList<Integer>();
        } else return ans;
    }
}

//JAVA - Kadane's Algo - Same approach as Maximum sum contiguous array

  class Flip1 {
    public int[] flip(String A) {
        //create an empty array
        int ans [] = new int [0];
        // if String is empty then return empty array
        if(A.length()==0)
        {
            return ans;
        }
        //create an array with values 0 as "1" ans 1 as "-1". because we need to find maximum 0 present in the array
        int Bin [] = new int [A.length()];
        // initializing a count variable  to count number of 1's present in the array
        int count =0;
        for (int i=0; i<A.length(); i++)
        {
            if (A.charAt(i)=='0')
            {
                Bin[i]= 1;
            }
            else if (A.charAt(i)=='1')
            {
                Bin[i]= -1;
                count++;
            }
        }
        //Test: -System.out.println (Arrays.toString (Bin));
        // if the number of 1's count is equal to string length then no change required return empty array
        if (count ==A.length())
        {
            return ans;
        }
        // now find the maximum using kadane algorithm, store Start and end of subarray in s, e
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int s=0, sc=0, e=0; // s- start, e- end, sc- temporary start
        for (int i=0;i<Bin.length;i++)
        {
            if (sum<0)
            {
                sc=i;
                sum=0;
            }
            sum+=Bin[i];
            if (maxSum<sum)
            {
                maxSum=sum;
                s=sc;
                e=i;
            }
        }
        // storing the start in array
        ans = new int [2];
        ans[0]=s+1;
        ans[1]=e+1;
        return ans;
    }
}
/*Q4. Flip
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN. In a single operation, you can choose two indices, L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. By flipping, we mean changing character 0 to 1 and vice-versa.

Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized.

If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.



Problem Constraints
1 <= size of string <= 100000



Input Format
First and only argument is a string A.



Output Format
Return an array of integers denoting the answer.



Example Input
Input 1:

A = "010"
Input 2:

A = "111"


Example Output
Output 1:

[1, 1]
Output 2:

[]


Example Explanation
Explanation 1:

A = "010"

Pair of [L, R] | Final string
_______________|_____________
[1 1]          | "110"
[1 2]          | "100"
[1 3]          | "101"
[2 2]          | "000"
[2 3]          | "001"

We see that two pairs [1, 1] and [1, 3] give same number of 1s in final string. So, we return [1, 1].
Explanation 2:

No operation can give us more than three 1s in final string. So, we return empty array [].
*/

/*Note the net change in the number of 1s in string S when we flip bits of string S.
Say it has A 0s and B 1s. Eventually, there are B 0s and A 1s.

So, the number of 1s increased by A - B. We want to choose a subarray that maximizes this. Note that if we change 1s to -1, the sum of values will give us A - B. Then, we have to find a subarray with the maximum sum, which can be done via Kadane’s Algorithm.*/