package ch17.leetcode.p2206;

import java.util.Arrays;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

class Solution {
    public void divideArray(int[] nums) {
        //stream 사용
        Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting()))
                .values()
                .stream()
                .allMatch(e->e%2==0);
    }
}