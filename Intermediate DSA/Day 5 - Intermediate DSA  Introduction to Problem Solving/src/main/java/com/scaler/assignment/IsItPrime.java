package com.scaler.assignment;

import java.util.Scanner;

public class IsItPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        boolean flag = true;
        int i = 2;
        while (i < A) {
            if (A % i == 0) {
                flag = false;
                break;
            }
            i++;
        }


        if (flag) System.out.print("YES");
        else System.out.print("NO");
    }


//    For Loop

    static class Main1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();

            boolean flag = true;
            for (int i = 2; i < A; i++) {
                if (A % i == 0) {
                    flag = false;
                    break;
                }
            }


            if (flag) System.out.print("YES");
            else System.out.print("NO");
        }

    }
}

/*Q1. Is It Prime?
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given an integer A as input, you have to tell whether it is a prime number or not.

A prime number is a natural number greater than 1 which is divisible only by 1 and itself.


Problem Constraints

1 <= A <= 106



Input Format

First and only line of the input contains a single integer A.



Output Format

Print YES if A is a prime, else print NO.



Example Input

Input 1:

 3
Input 2:

 4


Example Output

Output 1:

 YES
Output 2:

 NO


Example Explanation

Explanation 1:

 3 is a prime number as it is only divisible by 1 and 3.
Explanation 2:

 4 is not a prime number as it is divisible by 2.

*/