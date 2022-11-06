package com.scaler.assignment;


//    While Loop

import java.util.Scanner;

public class IsItPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int n = 1;
        while (n <= N) {
            int A = sc.nextInt();

            int sum = 0;
            int i = 1;

            while (i < A) {
                if (A % i == 0) {
                    sum += i;
                }
                i++;
            }

            if (sum == A) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            n++;
        }
    }


//    For Loop


    static class Main1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            for (int n = 1; n <= N; n++) {
                int A = sc.nextInt();

                int sum = 0;
                for (int i = 1; i < A; i++) {
                    if (A % i == 0) {
                        sum += i;
                    }
                }
                if (sum == A) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}

/*Q2. Is It Perfect?
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are given N positive integers.

For each given integer A, you have to tell whether it is a perfect number or not.

A perfect number is a positive integer which is equal to the sum of its proper positive divisors (excluding the number itself). A positive proper divisor divides a number without leaving any remainder.



Problem Constraints

1 <= N <= 10

1 <= A <= 106



Input Format

The first line of the input contains a single integer N.

Each of the next N lines contains a single integer A.



Output Format

In a separate line, print YES if a given integer is perfect, else print NO.



Example Input

Input 1:

 2
 4
 6
Input 2:

 1
 3


Example Output

Output 1:

 NO
 YES
Output 2:

 NO


Example Explanation

Explanation 1:

 For A = 4, the answer is "NO" as sum of its proper divisors = 1 + 2 = 3, is not equal to 4.
 For A = 6, the answer is "YES" as sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.
Explanation 2:

 For A = 3, the answer is "NO" as sum of its proper divisors = 1, is not equal to 3.

*/