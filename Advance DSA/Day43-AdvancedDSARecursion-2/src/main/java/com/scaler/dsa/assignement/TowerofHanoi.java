package com.scaler.dsa.assignement;


class TowerofHanoi {
    int curr;
    int[][] ans;

    public int[][] towerOfHanoi(int A) {
        curr = 0;
        int m = (1 << A) - 1; // (2^A)-1
        ans = new int[m][3];
        rec(A, 1, 3); // 1=> source , 2=> intermeditate , 3=> destination
        return ans;
    }

    public void rec(int disk, int start, int end) {
        if (disk == 1) {
            ans[curr++] = new int[]{disk, start, end};
            return;
        }
        // move top (disk - 1) disks from start to buffer, using end as a buffer
        rec(disk - 1, start, 6 - start - end);
        // move top from start to end
        ans[curr++] = new int[]{disk, start, end};
        // move top (disk - 1) disks from buffer to end, using start as a buffer
        rec(disk - 1, 6 - start - end, end);
    }
}
/*Tower of Hanoi <Java(Array)>*/

class TowerofHanoi1 {
    int ind = 0;
    int[][] ans;

    public int[][] towerOfHanoi(int A) {
        int M = (1 << A) - 1;
        ans = new int[M][3];
        toh(A, 1, 2, 3);
        return ans;
    }

    public void toh(int A, int S, int T, int D) {
        if (A == 0) return;
        toh(A - 1, S, D, T);
        ans[ind][0] = A;
        ans[ind][1] = S;
        ans[ind][2] = D;
        ind++;
        toh(A - 1, T, S, D);
    }
}


/*
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
In the classic problem of the Towers of Hanoi, you have 3 towers numbered from 1 to 3 (left to right) and A disks numbered from 1 to A (top to bottom) of different sizes which can slide onto any tower.
The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one).
You have the following constraints:
Only one disk can be moved at a time.
A disk is slid off the top of one tower onto another tower.
A disk cannot be placed on top of a smaller disk.
You have to find the solution to the Tower of Hanoi problem.
You have to return a 2D array of dimensions M x 3, where M is the minimum number of moves needed to solve the problem.
In each row, there should be 3 integers (disk, start, end), where:

disk - number of disk being moved
start - number of the tower from which the disk is being moved
stop - number of the tower to which the disk is being moved


Problem Constraints
1 <= A <= 18


Input Format
The first argument is the integer A.


Output Format
Return a 2D array with dimensions M x 3 as mentioned above in the description.


Example Input
Input 1:
A = 2
Input 2:

A = 3


Example Output
Output 1:
[1 1 2 ] [2 1 3 ] [1 2 3 ]
Output 2:

[1 1 3 ] [2 1 2 ] [1 3 2 ] [3 1 3 ] [1 2 1 ] [2 2 3 ] [1 1 3 ]


Example Explanation
Explanation 1:
We shift the first disk to the middle tower.
We shift the second disk to the last tower.
We, finally, shift the first disk from the middle tower to the last tower.
Explanation 2:

We can see that this the only unique path with minimal moves to move all disks from the first to the third tower.

*/

/*The minimum number of moves to solve the problem with A disks is 2A - 1.
We can find the optimal solution using recursion easily.

We derive the solution intuitevly from 2 disks.
For 2 disks, the move sequence is:
[1, 1, 2]
[2, 1, 3]
[1, 2, 3]

We generate the solution consider the whole stack of A disks into 2 parts: 1, A - 1.
And derive the recursive solution from there.

Pseudocode:

moveDisks(int n, Tower origin, Tower destination, Tower buffer) {

    // Base case
    if (n <= 0) return;

    // move top n - 1 disks from origin to buffer, using destination as a buffer.
    moveDisks(n - 1, origin, buffer, destination);

    // move top from origin to destination
    moveTop(origin, destination);

    // move top n - 1 disks from buffer to destination, using origin as a buffer.
    moveDisks(n - 1, buffer, destination, origin);
}

Refer to the complete solution for more details.*/