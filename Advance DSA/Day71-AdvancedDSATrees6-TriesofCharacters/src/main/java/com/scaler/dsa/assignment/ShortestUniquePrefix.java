package com.scaler.dsa.assignment;

import java.util.ArrayList;

public class ShortestUniquePrefix {
    private Node root;
    public ArrayList < String > prefix(ArrayList < String > A) {
        ArrayList < String > res = new ArrayList < > ();
        for (String str: A) {
            put(str);
        }
        for (String str: A) {
            String prefix = getPrefix(str);
            res.add(prefix);
        }
        return res;
    }

    public String getPrefix(String str) {
        StringBuilder strB = new StringBuilder();
        return get(root, str, 0, strB);
    }

    public String get(Node node, String str, int index, StringBuilder strB) {
        char c = str.charAt(index);
        if (c < node.c) {
            return get(node.left, str, index, strB);
        } else if (c > node.c) {
            return get(node.right, str, index, strB);
        } else if (node.val == 1) {
            strB.append(node.c);
            return strB.toString();
        } else {
            strB.append(node.c);
            return get(node.mid, str, index + 1, strB);
        }
    }

    public void put(String str) {
        root = put(root, str, 0);
    }

    public Node put(Node node, String str, int index) {
        if (index == str.length())
            return node;
        if (node == null)
            node = new Node(str.charAt(index));
        char c = str.charAt(index);
        if (c < node.c) {
            node.left = put(node.left, str, index);
        } else if (c > node.c) {
            node.right = put(node.right, str, index);
        } else {
            node.mid = put(node.mid, str, index + 1);
            node.val += 1;
        }
        return node;
    }

    class Node {
        char c;
        int val;
        Node left, mid, right;
        public Node() {}
        public Node(char c) {
            this.c = c;
            this.val = 0;
        }
    }
}


/*Q3. Shortest Unique Prefix
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a list of N words, find the shortest unique prefix to represent each word in the list.

NOTE: Assume that no word is the prefix of another. In other words, the representation is always possible



Problem Constraints
1 <= Sum of length of all words <= 106



Input Format
First and only argument is a string array of size N.



Output Format
Return a string array B where B[i] denotes the shortest unique prefix to represent the ith word.



Example Input
Input 1:

 A = ["zebra", "dog", "duck", "dove"]
Input 2:

A = ["apple", "ball", "cat"]


Example Output
Output 1:

 ["z", "dog", "du", "dov"]
Output 2:

 ["a", "b", "c"]


Example Explanation
Explanation 1:

 Shortest unique prefix of each word is:
 For word "zebra", we can only use "z" as "z" is not any prefix of any other word given.
 For word "dog", we have to use "dog" as "d" and "do" are prefixes of "dov".
 For word "du", we have to use "du" as "d" is prefix of "dov" and "dog".
 For word "dov", we have to use "dov" as "d" and do" are prefixes of "dog".

Explanation 2:

 "a", "b" and c" are not prefixes of any other word. So, we can use of first letter of each to represent.

*/


/*Lets take an example:

input: ["zebra", "dog", "duck", "dot"]

Now we will build prefix tree and we will also store count of characters

                root
                /|
         (d, 3)/ |(z, 1)
              /  |
          Node1  Node2
           /|        \
     (o,2)/ |(u,1)    \(e,1)
         /  |          \
   Node1.1  Node1.2     Node2.1
      | \         \            \
(g,1) |  \ (t,1)   \(c,1)       \(b,1)
      |   \         \            \
    Leaf Leaf       Node1.2.1     Node2.1.1
    (dog)  (dot)        \                  \
                         \(k, 1)            \(r, 1)
                          \                  \
                          Leaf               Node2.1.1.1
                          (duck)                       \
                                                        \(a,1)
                                                         \
                                                         Leaf
                                                         (zebra)

Now, for every leaf / word , we find the character nearest to the root with frequency as 1.
The prefix that the path from root to this character corresponds to, is the representation of the word.

*/