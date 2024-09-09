package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void combinationSum3Test() {
        Solution solution = new Solution();
        List<List<Integer>> outputOne = new ArrayList<>();
        outputOne.add(new ArrayList<>(Arrays.asList(1,2,4)));
        assertEquals(outputOne, solution.combinationSum3(3, 7));
        List<List<Integer>> outputTwo = new ArrayList<>();
        outputTwo.add(new ArrayList<>(Arrays.asList(1,2,6)));
        outputTwo.add(new ArrayList<>(Arrays.asList(1,3,5)));
        outputTwo.add(new ArrayList<>(Arrays.asList(2,3,4)));
        assertEquals(outputTwo, solution.combinationSum3(3, 9));
        List<List<Integer>> outputThree = new ArrayList<>();
        assertEquals(outputThree, solution.combinationSum3(4, 1));
    }

}