package ch15.leetcode.p1200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<Integer> input = new ArrayList<>();
        for ( int n : arr) {
            input.add(n);
        }

        List<List<Integer>> result = new ArrayList<>();

        // 1. input 정렬
        // 2. 인접한 두 값의 차가 가장 적은 차이를 구해서 저장
        // 3. 인접한 두 값의 차가 (2)에서 구한 값과 같으면
        // 두 값을 원소로 갖는 List를 만들어서
        // 결과 list에 추가 하기
        Collections.sort(input);

// 2. 인접한 두 값의 차가 가장 적은 차이를 구해서 저장
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < input.size() - 1; i++) {
            int diff = input.get(i + 1) - input.get(i);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        // 3. 인접한 두 값의 차가 (2)에서 구한 값과 같으면
        // 두 값을 원소로 갖는 List를 만들어서 결과 list에 추가하기
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
