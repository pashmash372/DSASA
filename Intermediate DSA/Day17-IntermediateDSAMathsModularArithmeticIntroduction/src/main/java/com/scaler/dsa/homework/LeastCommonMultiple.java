package com.scaler.dsa.homework;

import java.util.Scanner;

public class LeastCommonMultiple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int G = 1;
            // Loop from 1 to minimum of A and B and largest number which divides A and B is HCF
            for (int i = 1; i <= Math.min(A, B); i++) {
                if (A % i == 0 && B % i == 0) {
                    G = i;
                }
            }
            // LCM will be A*B/HCF
            int L = (A * B) / G;
            System.out.println(L);
        }
    }


}
/*Q5. Least Common Multiple
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Write a program to input an integer T and then for each test case input two integers A and B in two different lines and then print T lines containing Least Common Multiple (LCM) of two given 2 numbers A and B.

LCM of two integers is the smallest positive integer divisible by both.


Problem Constraints
1 <= T <= 1000

1 <= A,B <= 1000



Input Format
The first line contains T which means number of test cases.

Next 2T lines contains input A and B for each testcase.
First line of each testcase contain an integer A and second line of the testcase contains input B.



Output Format


T lines each containing an integer representing LCM of A & B.



Example Input
Input 1:
3
2
3
9
6
2
6


Example Output
Output 1:
6
18
6


Example Explanation
Explanation:

 In first testcase 6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 3 (3 * 2 = 6).
 In second testcase 18 is the smallest positive integer which is divisible by both 9 (9 * 2 = 18) and 6 (6 * 3 = 18).
 In third testcase  6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 6 (6 * 1 = 6).*/

/*GCD of two numbers always exists between 1 and minimum among the two numbers.
So we can iterate through all the numbers in range 1 to min(A, B) and find the largest number G such that both A and B are divisible by it.
Then, LCM = (A * B) / G.*/