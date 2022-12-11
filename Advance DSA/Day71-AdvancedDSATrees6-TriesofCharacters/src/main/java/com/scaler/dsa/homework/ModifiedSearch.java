package com.scaler.dsa.homework;


public class ModifiedSearch {
    static final int ALPHABET_SIZE = 26;
    static TrieNode root;

    static void insert(String key) {
        int level;
        int length = key.length();
        int index;
        TrieNode pCrawl = root;
        for (level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null) pCrawl.children[index] = new TrieNode();
            pCrawl = pCrawl.children[index];
        }
        pCrawl.isEndOfWord = true;
    }

    static boolean query(TrieNode cur, int i, String s, int flag, boolean last) {
        boolean ans = false;
        int n = s.length();
        if (i == n) {
            return flag == 1 && last;
        }
        int c = s.charAt(i) - 97;
        if (flag == 0) {
            for (int x = 0; x < 26; x++) {
                if (cur.children[x] == null) continue;
                if (x == c) {
                    ans = ans || query(cur.children[x], i + 1, s, flag, cur.children[x].isEndOfWord);
                } else ans = ans || query(cur.children[x], i + 1, s, 1 - flag, cur.children[x].isEndOfWord);
            }
        } else {
            if (cur.children[c] != null)
                ans = ans || query(cur.children[c], i + 1, s, flag, cur.children[c].isEndOfWord);
        }
        return ans;
    }

    public String solve(String[] A, String[] B) {
        root = new TrieNode();
        for (String a : A)
            insert(a);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < B.length; i++) {
            if (query(root, 0, B[i], 0, false)) res.append('1');
            else res.append('0');
        }
        return res.toString();
    }

    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    }
}


/*Q1. Modified Search
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given two arrays of strings A of size N and B of size M.

Return a binary string C where C[i] = '1' if B[i] can be found in dictionary A using exactly one modification in B[i], Else C[i] = '0'.

NOTE: modification is defined as converting a character into another character.



Problem Constraints

1 <= N <= 30000

1 <= M <= 2500

1 <= length of any string either in A or B <= 20

strings contains only lowercase alphabets



Input Format

First argument is the string arrray A.

Second argument is the string array B.



Output Format

Return a binary string C where C[i] = '1' if B[i] can be found in dictionary A using one modification in B[i], Else C[i] = '0'.



Example Input

Input 1:

 A = [data, circle, cricket]
 B = [date, circel, crikket, data, circl]
Input 2:

 A = [hello, world]
 B = [hella, pello, pella]


Example Output

Output 1:

 "10100"
Output 2:

 "110"


Example Explanation

Explanation 1:

 1. date = dat*(can be found in A)
 2. circel =(cannot be found in A using exactly one modification)
 3. crikket = cri*ket(can be found in A)
 4. data = (cannot be found in A using exactly one modification)
 5. circl = (cannot be found in A using exactly one modification)
Explanation 2:

 Only pella cannot be found in A using only one modification.
*/

/*Naive solution will be to run over all the strings of A for each query B[i]. This will not an efficient way as it takes O(N * M * length of string).

An efficient approach is to use Trie.

First insert all the strings of array A in the Trie.

Now, For each query we need to check if there is any string in the dictionary such that we need to change only a single character in B[i].

Think of running a DFS(Depth First search) on Trie. Will it be efficient?

Take a flag variable, make flag = 1 if we have to change the character. Now we cannot do any further change so we will not traverse the part of trie which required more than 1 changes.

Return True if there exist any string such that we need to change a single character.

Try to Implement.

*/