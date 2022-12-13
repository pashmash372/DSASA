package com.scaler.homework;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int m = i;
            int sum = 0;
            while (m > 0) {
                int dig = m % 10;
                sum += (dig * dig * dig);
                m /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
            i++;
        }
    }
}
/*Q1. Armstrong Numbers!
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given an integer N you need to print all the Armstrong Numbers between 1 to N. (N inclusive).

An Armstrong number is a number such that when each individual digit of the number is raised to the power three in the number and then added up, they are equal to the original number itself.

For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).

Note: All the integers N given as input in this problem are limited to three digits.


Problem Constraints
1 <= N <= 500



Input Format
First and only line of input contains an integer N.



Output Format
Output all the Armstrong numbers in range [1,N] each in a new line.



Example Input
Input 1:

 5
Input 2:

 200


Example Output
Output 1:

1
Output 2:

1
153


Example Explanation
Explanation 1:

1 is an armstrong number.
Explanation 2:

1 and 153 are armstrong number under 200.

*/

/*Iterate over the range of the number taken as input.
For each number in that range check if it is an Armstrong number or not.
To check if a number is an Armstrong number or not, for each digit in that number, check if the cube of those digits sums up to that number.*/

/*Iterate from i = 1 to i = 10 and print A*i as output in each iteration.*/