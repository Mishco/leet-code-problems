package arrays;

import java.util.List;
import java.util.Stack;

public class BeautifulTowersI {

    public long maximumSumOfHeights(List<Integer> maxHeights) {
        int n = maxHeights.size();
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < n; ++i) {
            while (!stk.isEmpty() && maxHeights.get(i) < maxHeights.get(stk.peek())) {
                stk.pop();
            }
            left[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        stk.clear();
        for (int i = n - 1; i >= 0; --i) {
            while (!stk.isEmpty() && maxHeights.get(i) < maxHeights.get(stk.peek())) {
                stk.pop();
            }
            right[i] = stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }
        long[] ll = new long[n];
        long[] rr = new long[n];
        ll[0] = maxHeights.getFirst();
        for (int i = 1; i < n; ++i) {
            if (maxHeights.get(i) >= maxHeights.get(i - 1)) {
                ll[i] = ll[i - 1] + maxHeights.get(i);
            } else {
                int idx = left[i];
                ll[i] += (long) (i - idx) * maxHeights.get(i);
                if (idx >= 0) ll[i] += ll[idx];
            }
        }
        rr[n - 1] = maxHeights.get(n - 1);
        for (int i = n - 2; i >= 0; --i) {
            if (maxHeights.get(i) >= maxHeights.get(i + 1)) {
                rr[i] = rr[i + 1] + maxHeights.get(i);
            } else {
                int idx = right[i];
                rr[i] += (long) (idx - i) * maxHeights.get(i);
                if (idx < n) {
                    rr[i] += rr[idx];
                }
            }
        }
        long ret = 0;
        for (int i = 0; i < n; ++i) {
            ret = Math.max(ret, ll[i] + rr[i] - maxHeights.get(i));
        }
        return ret;
    }
}
//        // You are tasked with building n towers in the coordinate line.
//        // The ith tower is built at coordinate i and has a height of heights[i].
//        // Convert list to array
//        int n = maxHeights.size();
//        int[] heights = new int[n];
//        for (int i = 0; i < n; i++) {
//            heights[i] = i + 1;
//        }
//
//        // Find peak indices of mountain array
//        List<Integer> peakIndices = new ArrayList<>();
//        for (int i = 1; i < n - 1; i++) {
//            if (heights[i] > heights[i - 1] && heights[i] > heights[i + 1]) {
//                peakIndices.add(i);
//            }
//        }
//
//
//        // Find maximum possible heights for each peak index
//        long maxSum = 0;
//        for (int peakIndex : peakIndices) {
//            int maxLeft = heights[peakIndex];
//            int maxRight = heights[peakIndex];
//            int leftIndex = peakIndex - 1;
//            int rightIndex = peakIndex + 1;
//            while (leftIndex >= 0 || rightIndex < heights.length) {
//                if (leftIndex >= 0) {
//                    maxLeft = Math.min(maxLeft, maxHeights.get(leftIndex));
//                    if (heights[leftIndex] <= maxLeft) {
//                        maxSum += heights[leftIndex];
//                        leftIndex--;
//                    } else {
//                        break;
//                    }
//                }
//                if (rightIndex < heights.length) {
//                    maxRight = Math.min(maxRight, maxHeights.get(rightIndex));
//                    if (heights[rightIndex] <= maxRight) {
//                        maxSum += heights[rightIndex];
//                        rightIndex++;
//                    } else {
//                        break;
//                    }
//                }
//            }
//        }
//
//        return maxSum;
//
////        int peakIndex = 0;
//        List<Integer> peakIndices = new ArrayList<>();
//        for (int i = 1; i < maxHeights.size() - 1; i++) {
//            if (maxHeights.get(i) > maxHeights.get(i-1) && maxHeights.get(i) > maxHeights.get(i+1)) {
//                peakIndices.add(i);
//            }
//        }
//
////        System.out.println(peakIndex);
//        long maxSum =0;
//        for (int peakIndex : peakIndices) {
//            int maxLeft = maxHeights.get(peakIndex);//[peakIndex];
//            int maxRight = maxHeights.get(peakIndex);
//            int leftIndex = peakIndex - 1;
//            int rightIndex = peakIndex + 1;
//            while (leftIndex >= 0 || rightIndex < maxHeights.size()) {
//                if (leftIndex >= 0) {
//                    maxLeft = Math.min(maxLeft, maxHeights.get(leftIndex));
//                    if (maxHeights.get(leftIndex) <= maxLeft) {
//                        maxSum += maxHeights.get(leftIndex);
//                        leftIndex--;
//                    } else {
//                        break;
//                    }
//                }
//                if (rightIndex < maxHeights.size()) {
//                    maxRight = Math.min(maxRight, maxHeights.get(rightIndex));
//                    if (maxHeights.get(rightIndex) <= maxRight) {
//                        maxSum += maxHeights.get(rightIndex);
//                        rightIndex++;
//                    } else {
//                        break;
//                    }
//                }
//            }
//        }
//
//        return maxSum;

//        int total = 0;
//        List<Integer> height = new ArrayList<Integer>();
//        for (int i = 0; i < maxHeights.size() - 1; i++) {
//            height.add(maxHeights.get(i));
//            for (int j = 0; j < i; j++) {
//                height.set(j, Math.max(maxHeights.get(j), height.get(j + 1)));
//            }
//
//
//        }
//        for (int i = 0; i < height.size(); i++) {
//            total += height.get(i);
//        }
//
//        return total;
//    }


//}
