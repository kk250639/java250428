package ch15.leetcode.p118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                // 각 행의 첫 번째와 마지막 요소는 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // 이전 행에서 값을 가져와 더함
                    int sum = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(sum);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }
}
