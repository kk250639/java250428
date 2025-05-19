package ch15.leetcode.p119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // 첫 번째 값은 항상 1

        for (int i = 1; i <= rowIndex; i++) {
            // 뒤에서부터 계산해서 값 업데이트 (오른쪽부터 왼쪽으로)
            for (int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1); // 마지막은 항상 1
        }

        return row;
    }

    // 테스트용 main 함수
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.getRow(3)); // 출력: [1, 3, 3, 1]
    }
}