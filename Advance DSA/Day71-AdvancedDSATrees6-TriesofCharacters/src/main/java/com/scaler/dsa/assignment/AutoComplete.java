package com.scaler.dsa.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class AutoComplete {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        inp.nextLine();
        while (t-- > 0) {
            int n, m;
            n = inp.nextInt();
            m = inp.nextInt();
            inp.nextLine();
            String[] s = inp.nextLine().split(" ");
            String[] temp = inp.nextLine().split(" ");
            int[] wt = new int[n];
            for (int i = 0; i < temp.length; i++)
                wt[i] = Integer.parseInt(temp[i]);
            String[] q = inp.nextLine().split(" ");
            solve(s, wt, q);
        }
        inp.close();
    }

    public static void solve(String[] A, int[] W, String[] B) {
        TrieNode root = new TrieNode();
        ArrayList<pair> v = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            v.add(new pair(W[i], i));
        }
        Collections.sort(v);
        for (int i = v.size() - 1; i >= 0; i--) {
            insert(root, A[v.get(i).second], v.get(i).second, W);
        }
        for (int i = 0; i < B.length; i++) {
            ArrayList<pair> ans = new ArrayList<pair>(query(root, B[i], W));
            if (ans.size() == 0) {
                System.out.println(-1 + " ");
            } else {
                for (int j = 0; j < ans.size(); j++) {
                    System.out.print(A[ans.get(j).second] + " ");
                }
                System.out.println();
            }
        }
    }

    public static ArrayList<pair> query(TrieNode root, String prefix, int[] W) {
        TrieNode temp = root;
        ArrayList<pair> ans = new ArrayList<pair>();
        for (int i = 0; i < prefix.length(); i++) {
            int chr_val = prefix.charAt(i) - 'a';
            if (temp.child[chr_val] == null) {
                temp = temp.child[chr_val];
                break;
            }
            temp = temp.child[chr_val];
        }
        if (temp == null) {
            return ans;
        }
        return temp.idx_ans;
    }

    public static void insert(TrieNode root, String word, int idx, int[] W) {
        TrieNode temp = root;
        for (int i = 0; i < word.length(); i++) {
            int chr_val = word.charAt(i) - 'a';
            if (temp.child[chr_val] == null) {
                temp.child[chr_val] = new TrieNode();
            }
            temp = temp.child[chr_val];
            if (temp.idx_ans.size() < 5) {
                temp.idx_ans.add(new pair(W[idx], idx));
            }
        }
        temp.isend = true;
    }
}

class TrieNode {
    TrieNode[] child;
    ArrayList<pair> idx_ans;
    boolean isend;

    public TrieNode() {
        child = new TrieNode[26];
        for (int i = 0; i < 26; i++) child[i] = null;
        idx_ans = new ArrayList<pair>();
        isend = false;
    }
}
/*descending order */
/* Pair class using Comparable interface so, use compareTo(a) method */
/* in case of Comparator usage , use compare(a,b) method */
class pair implements Comparable<pair> {
    int first;
    int second;

    public pair(int a, int b) {
        this.first = a;
        this.second = b;
    }

    @Override
    public int compareTo(pair a) {
        return this.first - a.first;
    }
}

/*Q2. Auto Complete
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
There is a dictionary A of N words, and ith word has a unique weight Wi.

Another string array B of size M contains the prefixes. For every prefix B[i], output atmost 5 words from the dictionary A that start with the same prefix.

Output the words in decreasing order of their weight.

NOTE: If there is no word that starts with the given prefix output -1.



Problem Constraints
1 <= T <= 5

1 <= N <= 20000
1 <= M <= 10000

1 <= Wi <= 106

1 <= length of any string either in A or B <= 30



Input Format
First line is an integer T denoting the number of test cases.
For each test case,

First line denotes two space seperated integer N and M.
Second line denotes N space seperated strings denoting the words in dictionary.
Third line denotes N space seperated integers denoting the weight of each word in the dictionary.
Fourth line denotes M space seperated integers denoting the prefixes.


Output Format
For every prefix B[i], print the space seperated output on a new line.

NOTE: After every output there should be a space.



Example Input
Input 1:

 1
 6 3
 abcd aecd abaa abef acdcc acbcc
 2 1 3 4 6 5
 ab abc a
Input 2:

 1
 5 3
 aaaa aacd abaa abaa aadcc
 3 4 1 2 6
 aa aba abc


Example Output
Output 1:

 abef abaa abcd
 abcd
 acdcc acbcc abef abaa abcd
Output 2:

 aadcc aacd aaaa
 abaa abaa
 -1


Example Explanation
Explanation 1:

 For the prefix "ab" 3 words in the dictionary have same prefix: ("abcd" : 2, "abaa" : 3, "abef" : 4). Ouput them in decreasing order of weight.
 For the prefix "abc" only 1 word in the dictionary have same prefix: ("abcd" : 2).
 For the prefix "a" all 6 words in the dictionary have same prefix: ("abcd" : 2, "aecd" : 1, "abaa" : 3, "abef" : 4, "acdcc" : 6, "acbcc" : 5).
 Since we can output atmost 5 words. Output top 5 weighted words in decreasing order of weight.
Explanation 2:

 For the prefix "aa" 3 words in the dictionary have same prefix: ("aaaa" : 3, "aacd" : 4, "aadcc" : 6). Ouput them in decreasing order of weight.
 For the prefix "aba" 2 words in the dictionary have same prefix: ("abaa" : 1, "abaa" : 2).
 For the prefix "abc" there is no word in the dictionary which have same prefix. So print -1.

*/


/*Create a prefix Trie, but the Node of a Trie will also contain an array that will denote the answer for each prefix B[i].

How?

Sort the given dictionary in decreasing order of its weight. Now insert the word in the Trie and update the answer array if its size is less than 5 (Since we need to output at most 5 words).

For each query, search for the prefix if no word exists in the trie with the given prefix output -1.

Else, the answer array at the end of the prefix will be the answer.

Print the answer in the given format.

*/