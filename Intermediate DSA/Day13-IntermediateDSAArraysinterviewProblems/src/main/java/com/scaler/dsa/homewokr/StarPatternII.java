package com.scaler.dsa.homewokr;

public class StarPatternII {

    /*
#include <bits/stdc++.h>
using namespace std;

int main(){
	int n;
	cin >> n;
	for(int count = 1; count <= n; count++){
		for (int i = count; i <= n; ++i){
			if(count == 1 || count == i || i == n)cout << '*';
			else cout << ' ';
		}
		cout << endl;
	}
}*/

}
/*Q3. Star Pattern II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Write a program to input an integer N from user and print hollow inverted right triangle star pattern of N lines using '*'.

See example for clarifications.



Problem Constraints

1 <= N <= 1000



Input Format

First line is an integer N



Output Format

N lines conatining only char '*' as per the question.



Example Input

Input 1:

7
Input 2:

4


Example Output

Output 1:

*******
*    *
*   *
*  *
* *
**
*
Output 2:

****
* *
**
**/

/*Run a outer loop from i=1 to i=N and a inner loop from j=i to j=n
and print char '*' if(i==1 || j==i || j==n)
else print ' '*/