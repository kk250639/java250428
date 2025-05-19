package ch15.leetcode.p1200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solutin01 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<Integer> input = new ArrayList<>();
        for (int n : arr) {
            input.add(n);
        }

        List<List<Integer>> result = new ArrayList<>();

        Collections.sort(input);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < input.size() - 1; i++) {
            int diff = input.get(i + 1) - input.get(i);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        for (int i = 0; i < input.size() - 1; i++) {
            int a = input.get(i);
            int b = input.get(i + 1);
            if (b - a == minDiff) {
                List<Integer> pair = new ArrayList<>();
                pair.add(a);
                pair.add(b);
                result.add(pair);
            }
        }
        return result;
    }
}
