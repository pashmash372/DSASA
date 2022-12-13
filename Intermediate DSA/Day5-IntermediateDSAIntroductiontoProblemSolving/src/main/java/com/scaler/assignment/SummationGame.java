package com.scaler.assignment;

import java.util.Scanner;

public class SummationGame {


//    While Loop

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int sum = 0;
        int i = 1;
        // starting from 1 and adding i each time to the answer upto n
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

//    For Loop

    static class Main {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            int n = scn.nextInt();
            int sum = 0;
            // starting from 1 and adding i each time to the answer upto n
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }

}


/*Q3. Summation Game
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user


Problem Constraints

1 <= N <= 1000



Input Format

A single line representing N



Output Format

A single integer showing sum of all Natural numbers from 1 to N



Example Input

Input 1:

5
Input 2:

10


Example Output

Output 1:

15
Output 2:

55

*/

/*Run for a loop for i=1 to i=N and keep adding i in answer variable.*/