package com.scaler.dsa.homework;


import java.util.ArrayList;

public class SheldonandPairofCities {
    public ArrayList< Integer > solve(int A, int B, int C, ArrayList < Integer > D, ArrayList < Integer > E, ArrayList < Integer > F, ArrayList < Integer > G, ArrayList < Integer > H) {
        int N = A;
        int M = B;
        int Q = C;
        int[] u = D.stream().mapToInt(i -> i).toArray();
        int[] v = E.stream().mapToInt(i -> i).toArray();
        int[] w = F.stream().mapToInt(i -> i).toArray();
        int[] a = G.stream().mapToInt(i -> i).toArray();
        int[] b = H.stream().mapToInt(i -> i).toArray();
        long inf = 1000000000000L;
        long dp[][] = new long[205][205];
        int i, j, k;
        for (i = 0; i < 205; i++) {
            dp[i][i] = 0;
            for (j = 0; j < 205; j++) {
                if (i != j) dp[i][j] = inf;
            }
        }
        for (i = 0; i < M; i++) {
            int uu = u[i] - 1;
            int vv = v[i] - 1;
            dp[uu][vv] = Math.min(dp[uu][vv], (long) w[i]);
            dp[vv][uu] = Math.min(dp[vv][uu], (long) w[i]);
        }
        for (k = 0; k < N; k++) {
            for (i = 0; i < N; i++) {
                for (j = 0; j < N; j++) {
                    if (dp[i][k] + dp[k][j] < dp[i][j])
                        dp[i][j] = dp[i][k] + dp[k][j];
                }
            }
        }
        ArrayList < Integer > answer = new ArrayList < Integer > ();
        for (i = 0; i < Q; i++) {
            int aa = a[i] - 1;
            int bb = b[i] - 1;
            if (dp[aa][bb] == inf) {
                answer.add(-1);
            } else {
                answer.add((int) dp[aa][bb]);
            }
        }
        return answer;
    }
}
/*Q2. Sheldon and Pair of Cities
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Sheldon lives in a country with A cities (numbered from 1 to A) and B bidirectional roads.

Roads are denoted by integer array D, E and F of size M, where D[i] and E[i] denotes the cities and F[i] denotes the distance between the cities.

Now he has many lectures to give in the city and is running short of time, so he asked you C queries, for each query i, find the shortest distance between city G[i] and H[i].

If the two cities are not connected then the distance between them is assumed to be -1.



Problem Constraints
1 <= A <= 200

1 <= B <= 200000

1 <= C <= 100000

1 <= F[i] <= 1000000

1 <= D[i], E[i], G[i], H[i] <= A



Input Format
First argument is an integer A.
Seocnd argument is an integer B.
Third argument is an integer C.
Fourth argument is an integer array D.
Fifth argument is an integer array E.
Sixth argument is an integer array F.
Seventh argument is an integer array G.
Eight argument is an integer array H.



Output Format
Return an integer array of size C, for each query denoting the shortest distance between the given two vertices.
If the two vertices are not connected then output -1.



Example Input
Input 1:

 A = 4
 B = 6
 C = 2
 D = [1, 2, 3, 2, 4, 3]
 E = [2, 3, 4, 4, 1, 1]
 F = [4, 1, 1, 1, 1, 1]
 G = [1, 1]
 H = [2, 3]
Input 2:

 A = 3
 B = 3
 C = 2
 D = [1, 2, 1]
 E = [2, 3, 3]
 F = [3, 1, 1]
 G = [2, 1]
 H = [3, 2]


Example Output
Output 1:

 [2, 1]
Output 2:

 [1, 2]


Example Explanation
Explanation 1:

 Distance between (1,2) will 2 if we take path 1->4->2.
 Distance between (1,3) will 1 if we take path 1->3.
Explanation 2:

 Distance between (2,3) will 1 if we take path 1->3.
 Distance between (1,2) will 2 if we take path 1->3->2.

*/

/*The problem involves using dynamic programming to calculate the shortest distance between each and every vertex using the famous Floyd Warshall algorithm.
The Floyd Warshall algorithm works by iterating over each and every vertex and trying to reduce the distance between every two vertices by going through this selected vertex in between, if the distance decrease by going through this vertex we update the distance.

Now we can answer the query in O(1) by retrieving the distance from the precomputed 2 D array.*/