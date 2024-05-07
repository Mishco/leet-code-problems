package medium;

public class Solution201 {
    public int rangeBitwiseAnd(int left, int right) {
        // Given two integers left and right that represent the range [left, right],
        // return the bitwise AND of all numbers in this range, inclusive.

        // if m !==n that means one of the bits is 0 so keep right shifting
        // until all the bits in both are same  and when they are same number of
        // shift will be equal to number of bits not same just right shift it then

        int s = 0;
        while (left != right) {
            left = left >> 1;
            right = right >> 1;
            s++;
        }
        return (left << s);
    }
}
