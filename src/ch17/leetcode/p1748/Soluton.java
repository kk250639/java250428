package ch17.leetcode.p1748;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // 1. 숫자별로 등장 횟수 저장
        Arrays.stream(nums).forEach(num -> countMap.put(num, countMap.getOrDefault(num, 0) + 1));

        // 2. 등장 횟수가 1인 것만 합산
        int sum = countMap
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .mapToInt(Map.Entry::getKey)
                .sum();
        return sum;
    }
}
//        return Arrays.stream(nums)
//                .collect(Collectors.toMap(
//                        num -> num,
//                        num -> 1,
//                        Integer::sum
//                ))
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() == 1)
//                .mapToInt(Map.Entry::getKey)
//                .sum();
//    }
//}
