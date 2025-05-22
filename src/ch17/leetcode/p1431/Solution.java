package ch17.leetcode.p1431;

import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        // Step 1: 현재 아이들 중 가장 많은 사탕 수 찾기
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        // Step 2: 각 아이에게 extraCandies를 줬을 때 최고인지 판단
        for (int i = 0; i < candies.length; i++) {
            // 최고 사탕 개수 이상이면 true, 아니면 false 추가
            result.add(candies[i] + extraCandies >= max);
        }

        return result;
    }
}