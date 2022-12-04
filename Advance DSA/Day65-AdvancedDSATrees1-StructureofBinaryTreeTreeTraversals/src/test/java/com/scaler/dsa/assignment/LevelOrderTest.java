package com.scaler.dsa.assignment;

import com.scaler.dsa.TreeNode;
import com.scaler.dsa.TreeUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LevelOrderTest {

    @Test
    public void levelOrder() {
        List<Integer> input = Arrays.asList(3, 9, 20, null, null, 15, 7, null, null, null, null);
        TreeNode node = TreeUtils.constructBinaryTree(input);
        LevelOrder lo = new LevelOrder();
        ArrayList<ArrayList<Integer>> ans = lo.levelOrder(node);

        /* [
   [3],
   [9, 20],
   [15, 7]
 ]*/

        List<List<Integer>> lists1 = List.of(List.of(3), List.of(9, 20), List.of(15, 7));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        lists1.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            expected.add(temp);
        });

    }

    @Test
    public void levelOrder1() {
        List<Integer> input = Arrays.asList(1, 6, 2, null, null, 3, null, null, null);
        TreeNode node = TreeUtils.constructBinaryTree(input);
        LevelOrder lo = new LevelOrder();
        ArrayList<ArrayList<Integer>> ans = lo.levelOrder(node);

/*[
   [1]
   [6, 2]
   [3]
 ]*/

        List<List<Integer>> lists1 = List.of(List.of(1), List.of(6, 2), List.of(3));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        lists1.forEach(list -> {
            ArrayList<Integer> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            expected.add(temp);
        });

    }
}