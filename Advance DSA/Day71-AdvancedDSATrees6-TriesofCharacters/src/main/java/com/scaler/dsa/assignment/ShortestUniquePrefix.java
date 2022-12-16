package com.scaler.dsa.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ShortestUniquePrefix {

    Node root = new Node('*');

    public String[] prefix(String[] A) {

        for (String word : A) {
            insertInTries(word);
        }

        List<String> list = new ArrayList<>();
        for (String word : A) {
            list.add(getShortestUniquePrefix(word));
        }

        String[] arr = list.toArray(new String[0]);
        return arr;
    }


    private String getShortestUniquePrefix(String word) {

        StringBuilder sb = new StringBuilder();
        Node temp = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            Node currentNode = temp.children.get(ch);

            if (currentNode.count == 1) {
                sb.append(currentNode.data);
                return sb.toString();
            }

            //Adding the current Character in the  unique prefix string
            sb.append(currentNode.data);

            //Uodating the current temp with the next node.
            temp = temp.children.get(ch);
        }

        return word;
    }


    private void insertInTries(String word) {

        Node temp = root;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (!temp.children.containsKey(ch)) {
                temp.children.put(ch, new Node(ch));
            }

            // Keep tracking of the count of words going throug this Character
            temp.count = temp.count + 1;

            //Uodating the current temp with the next node.
            temp = temp.children.get(ch);
        }

        temp.isEnd = true;
    }


    class Node {
        char data;
        Map<Character, Node> children = new HashMap<>();
        int count = 0;
        boolean isEnd = false;

        public Node(char data) {
            this.data = data;
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