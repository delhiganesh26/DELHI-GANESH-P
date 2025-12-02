// Problem-4.java
// Given a list of integers, count how many numbers are multiples of each k in 1..9.
// Output is printed as {1:count1, 2:count2, ..., 9:count9}

import java.util.*;

class Problem4 {
    public static Map<Integer, Integer> countMultiples(List<Integer> nums) {
        Map<Integer, Integer> result = new LinkedHashMap<>();
        for (int k = 1; k <= 9; k++) {
            int cnt = 0;
            for (int n : nums) {
                if (n % k == 0) cnt++;
            }
            result.put(k, cnt);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> sample = Arrays.asList(1,2,8,9,12,46,76,82,15,20,30);
        System.out.println("input: " + sample);
        Map<Integer, Integer> out = countMultiples(sample);
        System.out.println("output: " + out);
    }
}
