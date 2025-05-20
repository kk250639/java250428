package ch15.leetcode.p2206;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean divideArray(int[] nums) {
        // 숫자별 등장 횟수를 저장할 Map
        Map<Integer, Integer> map = new HashMap<>();

        // 숫자 카운팅
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // entrySet으로 key-value 쌍 순회
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // 등장 횟수가 홀수인 경우 쌍을 만들 수 없음
            if (entry.getValue() % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}