package com.scaler.dsa.assignment;


public class ColoringaCycleGraph {
    public int solve(int A) {
        return Color(A);
    }
    public static int Color(int vertices) {
        int result = 0;
        // Check if number of vertices
        // is odd or even.
        // If number of vertices is even
        // then color require is 2 otherwise 3
        if (vertices % 2 == 0)
            result = 2;
        else
            result = 3;
        return result;
    }
}

/*Q2. Coloring a Cycle Graph
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given the number of vertices A in a Cyclic Graph.

Your task is to determine the minimum number of colors required to color the graph so that no two Adjacent vertices have the same color.



Problem Constraints
3 <= A <= 109



Input Format
First argument is an integer A denoting the number of vertices in the Cyclic Graph.



Output Format
Return an single integer denoting the minimum number of colors required to color the graph so that no two Adjacent vertices have the same color.



Example Input
Input 1:

 5
Input 2:

 4


Example Output
Output 1:

 3
Output 2:

 2


Example Explanation
Explanation 1:


 Color required = 3
Explanation 2:


 Color required = 2

*/

/*Cycle:- cycle is a path of edges and vertices wherein a vertex is reachable from itself. or in other words, it is a Closed walk.

Even Cycle:- In which Even number of vertices is present is known as Even Cycle.

Odd Cycle:- In which Odd number of Vertices is present is known as Odd Cycle.

Approach:

If the no. of vertices is Even then it is Even Cycle and to color such graph we require 2 colors.
If the no. of vertices is Odd then it is Odd Cycle and to color such graph we require 3 colors.*/