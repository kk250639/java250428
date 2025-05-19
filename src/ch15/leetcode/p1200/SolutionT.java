package ch15.leetcode.p1200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionT {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<Integer> input = new ArrayList<>();
        for (int n : arr) {
            input.add(n);
        }
        List<List<Integer>> result = new ArrayList<>();

        int min = Integer.MAX_VALUE;

        Collections.sort(input);

        for (int i = 0; i < input.size() - 1; i++) {
            Integer n1 = input.get(i);
            Integer n2 = input.get(i + 1);

            int diff = n2 - n1;

            min = Math.min(min, diff);
        }
        for (int i = 0; i < input.size(); i++) {
            Integer n1 = input.get(i);
            Integer n2 = input.get(i + 1);
            int diff = n2 - n1;
            if (diff == min) {
                List<Integer> row = new ArrayList<>();
                row.add(n1);
                row.add(n2);

                result.add(row);
            }
        }
        return result;
    }
}
