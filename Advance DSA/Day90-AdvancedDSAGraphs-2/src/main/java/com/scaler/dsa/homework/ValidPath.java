package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ValidPath {
    static int[] x = {1, 1, 1, -1, -1, -1, 0, 0};
    static int[] y = {-1, 1, 0, -1, 1, 0, 1, -1};

    public String solve(int A, int B, int C, int D, ArrayList<Integer> E, ArrayList<Integer> F) {
        int[][] valid = new int[A + 1][B + 1];
        int n = C;
        int r = D;
        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {
                for (int z = 0; z < n; z++) {
                    if (Math.sqrt(Math.pow(E.get(z) - i, 2) + Math.pow(F.get(z) - j, 2)) <= r) {
                        valid[i][j] = -1;
                        break;
                    }
                }
            }
        }
        if (valid[0][0] == -1 || valid[A][B] == -1) return "NO";
        //System.out.println("startng ending no problem");
        boolean[][] v = new boolean[A + 1][B + 1];
        v[0][0] = true;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        q.add(0);
        while (!q.isEmpty()) {
            int i = q.poll();
            int j = q.poll();
            for (int z = 0; z < 8; z++) {
                int ix = i + x[z];
                int iy = j + y[z];
                //System.out.println(ix+" "+iy);
                if (!(ix < 0 || iy < 0 || ix >= A + 1 || iy >= B + 1) && !v[ix][iy] && valid[ix][iy] != -1) {
                    //System.out.println(ix+"valid"+iy);
                    if (ix == A && iy == B) {
                        return "YES";
                    }
                    q.add(ix);
                    q.add(iy);
                    v[ix][iy] = true;
                }
            }
        }
        return "NO";
    }
}


/*Valid Path || DFS || Commented*/

class ValidPath1 {
    public String solve(int A, int B, int C, int D, int[] E, int[] F) {
        int[][] mat = new int[A + 1][B + 1];
//travese the graph
        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {

//check all the circle points
                int res = 1;//initially marked as 1
                for (int k = 0; k < C; k++) {

//we are checking if the current cell is lying under the circle
//boundary or not
                    int distance = (int) (Math.pow(i - E[k], 2) + Math.pow(j - F[k], 2));
                    if (distance <= D * D) {

                        res = 0;//if distance less than the radius then set the cell to 0
                        break;
                    }
                }
                mat[i][j] = res;
            }
        }

//edge case if the (0,0)/(X,Y) cell is occupied with circle
//boundary then no traversal is possible
//so then and there return no;
        if (mat[0][0] == 0 || mat[A][B] == 0) return "NO";

//take a visited array
        boolean[][] visited = new boolean[A + 1][B + 1];
//as we have to start from(0,0) i.e different components won't matter here as
//there will be only 1 connected component
        dfs(0, 0, visited, mat);

        if (visited[A][B]) return "YES";
        else return "NO";

    }

    public void dfs(int row, int col, boolean[][] vis, int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        vis[row][col] = true;

//lookup to all 8 directions
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                int nrow = row + dx;
                int ncol = col + dy;

                if (nrow < 0 || nrow >= n || ncol < 0 || ncol >= m || vis[nrow][ncol] || mat[nrow][ncol] == 0) continue;

                dfs(nrow, ncol, vis, mat);
            }
        }
    }
}

/*Q1. Valid Path
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
There is a rectangle with left bottom as (0, 0) and right up as (x, y).

There are N circles such that their centers are inside the rectangle.

Radius of each circle is R. Now we need to find out if it is possible that we can move from (0, 0) to (x, y) without touching any circle.

Note : We can move from any cell to any of its 8 adjecent neighbours and we cannot move outside the boundary of the rectangle at any point of time.



Problem Constraints
0 <= x , y, R <= 100

1 <= N <= 1000

Center of each circle would lie within the grid



Input Format
1st argument given is an Integer x , denoted by A in input.

2nd argument given is an Integer y, denoted by B in input.

3rd argument given is an Integer N, number of circles, denoted by C in input.

4th argument given is an Integer R, radius of each circle, denoted by D in input.

5th argument given is an Array A of size N, denoted by E in input, where A[i] = x cordinate of ith circle

6th argument given is an Array B of size N, denoted by F in input, where B[i] = y cordinate of ith circle



Output Format
Return YES or NO depending on weather it is possible to reach cell (x,y) or not starting from (0,0).



Example Input
Input 1:

 x = 2
 y = 3
 N = 1
 R = 1
 A = [2]
 B = [3]
Input 2:

 x = 1
 y = 1
 N = 1
 R = 1
 A = [1]
 B = [1]


Example Output
Output 1:

 NO
Output 2:

 NO


Example Explanation
Explanation 1:

 There is NO valid path in this case
Explanation 2:

 There is NO valid path in this case*/

/*Check if (i,j) is a valid point for all 0<=i<=x, 0<=j<=y. By valid point we mean that none of the circle should contain it.

To do this you can simply check for all points (i,j) where 0<=i<=x, 0<=j<=y if there is a circle on which this point.
If a point lies on a circle it should satisfy that circle’s equation.((i-a)^2+(j-b)^2==r^2 where (a,b) is the centre of the circle and r is its radius)

Now you know all the valid point in rectangle. You need to figure out if you can go from (0,0) to (x,y) through valid points. This can be done with any graph traversal algorithms like BFS/DFS.

DFS ( i , j )
mark (i,j) as visited
for all (i’,j’) positions to where we can travel to from (i,j)
DFS(i’,j’)

Now we just have to check if (x,y) is visited or not. If it is visited then output YES otherwise NO.*/