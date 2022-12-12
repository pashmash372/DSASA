package com.scaler.dsa.homework;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class KnightOnChessBoard {
    private static final int dx[] = new int[] {-2, -2, 1, -1, 2, 2, 1, -1};
    private static final int dy[] = new int[] {1, -1, 2, 2, 1, -1, -2, -2};
    public int knight(int N, int M, int x1, int y1, int x2, int y2) {

        Queue< Node > queue = new LinkedList< >();
        Node node = new Node(x1, y1);
        HashSet < Node > marked = new HashSet< >();

        queue.add(node);
        queue.add(null);
        int level = 0;
        marked.add(node);

        while (!queue.isEmpty()) {
            Node n = queue.remove();

            if (n == null) {
                level++;
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
                continue;
            }

            if (n.x == x2 && n.y == y2)
                return level;

            for (int k = 0; k < 8; k++) {
                int x = n.x + dx[k];
                int y = n.y + dy[k];

                if (isValid(x, y, N, M)) {
                    Node nn = new Node(x, y);
                    if (!marked.contains(nn)) {
                        marked.add(nn);
                        queue.add(nn);
                    }
                }
            }

        }

        return -1;
    }

    public boolean isValid(int x, int y, int N, int M) {
        if (x < 1 || x > N || y < 1 || y > M)
            return false;

        return true;
    }

    class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null)
                return false;
            if (obj.getClass() != getClass())
                return false;
            if (this == obj)
                return true;
            Node node = (Node) obj;
            if (this.x == node.x && this.y == node.y)
                return true;
            return false;
        }

        @Override
        public int hashCode() {
            return (int)((31 * x + y) & 0x7fffffff);
        }
    }
}

/*Q2. Knight On Chess Board
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given any source point, (C, D) and destination point, (E, F) on a chess board of size A x B, we need to find whether Knight can move to the destination or not.


The above figure details the movements for a knight ( 8 possibilities ).

If yes, then what would be the minimum number of steps for the knight to move to the said point. If knight can not move from the source point to the destination point, then return -1.

NOTE: A knight cannot go out of the board.



Problem Constraints
1 <= A, B <= 500



Input Format
The first argument of input contains an integer A.
The second argument of input contains an integer B.
The third argument of input contains an integer C.
The fourth argument of input contains an integer D.
The fifth argument of input contains an integer E.
The sixth argument of input contains an integer F.



Output Format
If it is possible to reach the destination point, return the minimum number of moves.
Else return -1.



Example Input
Input 1:

 A = 8
 B = 8
 C = 1
 D = 1
 E = 8
 F = 8
Input 2:

 A = 2
 B = 4
 C = 2
 D = 1
 E = 4
 F = 4


Example Output
Output 1:

 6
Output 2:

 -1


Example Explanation
Explanation 1:

 The size of the chessboard is 8x8, the knight is initially at (1, 1) and the knight wants to reach position (8, 8).
 The minimum number of moves required for this is 6.
Explanation 2:

 It is not possible to move knight to position (4, 4) from (2, 1)*/


/*A knight can move to 8 positions from (x,y).

(x, y) ->
    (x + 2, y + 1)
    (x + 2, y - 1)
    (x - 2, y + 1)
    (x - 2, y - 1)
    (x + 1, y + 2)
    (x + 1, y - 2)
    (x - 1, y + 2)
    (x - 1, y - 2)

Corresponding to the knight's move, we can define edges.
(x,y) will have an edge to the 8 neighbors defined above.

To find the shortest path, we just run a plain BFS. */