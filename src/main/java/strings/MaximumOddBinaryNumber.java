package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        int count = (int) s.chars()
                .filter(c -> c == '1')
                .count();
        return "1".repeat(count - 1) + "0".repeat(s.length() - count) + "1";

//        StringBuilder sb = new StringBuilder();
//        int count = 0;
//        for (char c : s.toCharArray()){
//            if (c == '1') {
//                count++;
//            }
//        }
//        sb.append("1".repeat(count - 1));
//        sb.append("0".repeat(s.length() - count)).append("1");
//        return sb.toString();
    }

}
