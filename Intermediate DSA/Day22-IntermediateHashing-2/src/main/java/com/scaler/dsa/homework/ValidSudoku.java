package com.scaler.dsa.homework;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoku {
    public int isValidSudoku(final List<String> A) {

        if (A == null) return 0;

        int n = A.size();

        if (n != 9 || A.get(0).length() != 9) return 0;

        HashSet<Character> hashSet = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            hashSet.clear();
            for (int j = 0; j < 9; j++) {
                char c = A.get(i).charAt(j);
                if (c == '.') continue;
                if (hashSet.contains(c)) return 0;
                hashSet.add(c);
            }
        }

        for (int i = 0; i < 9; i++) {
            hashSet.clear();
            for (int j = 0; j < 9; j++) {
                char c = A.get(j).charAt(i);
                if (c == '.') continue;
                if (hashSet.contains(c)) return 0;
                hashSet.add(c);
            }
        }


        for (int k = 0; k < 9; k++) {
            int x = k / 3;
            int y = k % 3;
            hashSet.clear();
            for (int i = 3 * x; i < 3 * x + 3; i++) {
                for (int j = y * 3; j < y * 3 + 3; j++) {
                    char c = A.get(j).charAt(i);
                    if (c == '.') continue;
                    if (hashSet.contains(c)) return 0;
                    hashSet.add(c);
                }
            }

        }


        return 1;

    }
}

/*Java Solution with HashSet*/

class ValidSudoku1 {
    public int isValidSudoku(final String[] A) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentChar = A[i].charAt(j);
                if (currentChar != '.') {
                    if (!(set.add(currentChar + "in the row " + i)) || !(set.add(currentChar + "in the column " + j)) || !(set.add(currentChar + "in the grid " + i / 3 + "-" + j / 3))) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }

}



/*Q3. Valid Sudoku
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Determine if a Sudoku is valid, according to: http://sudoku.com.au/TheRules.aspx

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.



The input corresponding to the above configuration :

["53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"]
A partially filled sudoku which is valid.

Note:

A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
Return 0 / 1 ( 0 for false, 1 for true ) for this problem*/


/*character backgroundcharacter
Solution Approach
Very simple simulation problem. Just need to keep track of the digits seen in every row, every column and every block as defined in the rules.
Whenever you encounter a digit already seen, you know the sudoku is not valid.

Note that this problem will get very complicated if you were to determine if the sudoku was solvable.*/