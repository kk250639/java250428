package ch15.leetcode.p119;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // 첫 번째 값은 항상 1

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1); // 마지막은 항상 1
        }

        return row;
    }

    // ✅ IntelliJ에서 실행할 수 있는 main 메서드
    public static void main(String[] args) {
        Solution sol = new Solution();

        int rowIndex = 4;  // 출력하고 싶은 행 인덱스
        List<Integer> result = sol.getRow(rowIndex);

        // 결과 출력
        System.out.println("rowIndex = " + rowIndex + " ➝ " + result);
    }
}
