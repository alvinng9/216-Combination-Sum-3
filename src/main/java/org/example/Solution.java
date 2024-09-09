package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        //initialize List of List of Integers
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combination(k, n, 1, result, temp);
        return result;
    }

    //backtracking function
    public void combination(int k, int n, int start, List<List<Integer>> result,
                            List<Integer> temp) {
        //if the number of integers exceed k or if n is less than 0, return void
        if (temp.size() > k || n < 0) {
            return;
        }

        //if the number of integers equals to k and n equals to 0, add the
        //current list of integer to the result
        if (temp.size() == k && n == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        //add every number from 1 to 9 to see which combinations would
        //satisfy all the requirements
        for(int i = start; i <= 9 ; i++) {
            temp.add(i);
            combination(k, n - i, i + 1, result, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
