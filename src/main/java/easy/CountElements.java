package easy;

public class CountElements {

    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maximum = 0;
        for (int num : nums) {
            freq[num]++;
            maximum = Math.max(maximum, freq[num]);
        }
        int result = 0;

        for (int inFreq : freq) {
            if (inFreq == maximum) {
                result += maximum;
            }
        }
        return result;
    }
}
