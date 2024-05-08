package medium;

import java.util.PriorityQueue;

public class Solution1642 {
    public int furthestBuilding(int[] heights, int bricks, int ladders) throws NullPointerException {
        int n = heights.length;
//        int[] sortedHeights = new int[n - 1];
//        for (int i = 0; i < n - 1; i++) {
//            sortedHeights[i] = i;
//        }
//        Arrays.sort(sortedHeights);

        PriorityQueue<Integer> jumps = new PriorityQueue<>();
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                jumps.offer(diff);
                if (jumps.size() > ladders) {
                    try {
                        sum += jumps.poll();
                    } catch (NullPointerException ex) {
                        System.err.println(ex.getMessage());
                    }
                }
                if (sum > bricks) {
                    return i;
                }
            }
        }
        return n - 1;

//        while (numberOfBuildings < n - 1) {
//            int j = sortedHeights[numberOfBuildings];
//            int diff = heights[j + 1] - heights[j];
//            if (diff <= 0) {
//                numberOfBuildings++;
//            } else if (ladders > 0) {
//                ladders--;
//                numberOfBuildings++;
//            } else if (bricks >= diff) {
//                bricks -= diff;
//                numberOfBuildings++;
//            } else {
//                break;
//            }
//        }
//        return numberOfBuildings;

//            var currentBuilding = heights[numberOfBuildings];
//            var nextBuilding = heights[numberOfBuildings + 1];
//            if (currentBuilding >= nextBuilding && ladders > 0 && bricks > 0) {
//                //do not a ladder or bricks
//                numberOfBuildings++;
//            } else {
//                if (bricks > 0) {
//                    bricks -= nextBuilding - heights[numberOfBuildings];
//                    numberOfBuildings++;
//                } else if (ladders > 0) {
//                    ladders--;
//                    numberOfBuildings++;
//                } else {
//                    // not enough
//                    break;
//                }
//            }
//        }

    }

}
