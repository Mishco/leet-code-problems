package easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// todo: refactor to parametrized test

class SumsTest {
    @org.junit.jupiter.api.Test
    void testTwoSum() {
        int[] nums = {2, 7, 11, 15};

        Sums tw = new Sums();
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

        Sums tw = new Sums();
        var res = tw.twoSum(nums, 6);

        assertEquals(0, Arrays.compare(expected, res));
    }


    @Test
    void thirdTest() {
        int[] nums = {3, 3};
        int[] expected = {0, 1};

        Sums tw = new Sums();
        var res = tw.twoSum(nums, 6);

        assertEquals(0, Arrays.compare(expected, res));
    }

    @Test
    void failingTest() {
//        [3,2,3]
//        6
        int[] nums = {3, 2, 3};
        int[] expected = {0, 2};

        Sums tw = new Sums();
        var res = tw.twoSum(nums, 6);

        assertEquals(0, Arrays.compare(expected, res));
    }

    @Test
    void negativeTarget() {
//        ?[0,3,-3,4,-1]
//        -1
        int[] nums = {0, 3, -3, 4, -1};
        int[] expected = {0, 4};

        Sums tw = new Sums();
        var res = tw.twoSum(nums, -1);

        assertEquals(0, Arrays.compare(expected, res));

    }

    @Test
    void longerArray() {
        int[] expected = {2, 5};
        int target= 10;
        int[] nums = {6, 5, 7, 8, 9, 3};

        var res = new Sums().twoSum(nums, target);

        assertEquals(0, Arrays.compare(expected, res));
    }


    @Test
    void threeSum() {
/*
        Input: nums = [-1,0,1,2,-1,-4]
        Output: [[-1,-1,2],[-1,0,1]]
        Explanation:
        nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
        nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
        nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
        The distinct triplets are [-1,0,1] and [-1,-1,2].
        Notice that the order of the output and the order of the triplets does not matter.
 */
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = List.of(
                List.of(-1, -1, 2),
                List.of(-1, 0, 1)
        );

        List<List<Integer>> actual = new Sums().threeSum(nums);

        assertEquals(expected, actual);
    }
}