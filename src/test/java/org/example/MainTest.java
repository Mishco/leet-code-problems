package org.example;


import arrays.TwoSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @org.junit.jupiter.api.Test
    void testTwoSum() {
        int[] nums = {2, 7, 11, 15};

        TwoSum tw = new TwoSum();
        int[] result = tw.twoSum(nums, 9);
        int[] expectedArray = {0, 1};

        assertEquals(0, Arrays.compare(expectedArray, result));
    }

    @Test
    void secondTest() {
        //        Input: nums = [3,2,4], target = 6
        //        Output: [1,2]
        int[] nums = {3, 2, 4};
        int[] expected = {1, 2};

        TwoSum tw = new TwoSum();
        var res = tw.twoSum(nums, 6);

        assertEquals(0, Arrays.compare(expected, res));
    }


    @Test
    void thirdTest() {
        int[] nums = {3, 3};
        int[] expected = {0, 1};

        TwoSum tw = new TwoSum();
        var res = tw.twoSum(nums, 6);

        assertEquals(0, Arrays.compare(expected, res));
    }

    @Test
    void failingTest() {
//        [3,2,3]
//        6
        int[] nums = {3, 2, 3};
        int[] expected = {0, 2};

        TwoSum tw = new TwoSum();
        var res = tw.twoSum(nums, 6);

        assertEquals(0, Arrays.compare(expected, res));
    }

    @Test
    void negativeTarget() {
//        ?[0,3,-3,4,-1]
//        -1
        int[] nums = {0, 3, -3, 4, -1};
        int[] expected = {0, 4};

        TwoSum tw = new TwoSum();
        var res = tw.twoSum(nums, -1);

        assertEquals(0, Arrays.compare(expected, res));

    }

    @Test
    void longerArray(){
//
        int[] nums= {6,5,7,8,9,3};
        int[] expected= {2,5};

        TwoSum tw = new TwoSum();
        var res = tw.twoSum(nums, 10);

        assertEquals(0, Arrays.compare(expected, res));
    }
}
