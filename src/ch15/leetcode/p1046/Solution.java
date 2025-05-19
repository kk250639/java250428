package ch15.leetcode.p1046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int s : stones) {
            list.add(s);
        }

        // 1. 정렬
        // 2. 마지막 index의 요소와, 마지막-1 index의 요소를 꺼내고(지우고)
        // 3. 차이를 구해서 list에 다시 넣고(이 때 차이가 0이면 넣지않음)
        // 1번부터 다시 시작
        // 하나만 남을 때까지 반복해서, 하나남은 값을 리턴
        while (list.size() > 1) {
            Collections.sort(list); // 1. 정렬
            int y = list.remove(list.size() - 1); // 가장 큰 값
            int x = list.remove(list.size() - 1); // 두 번째로 큰 값
            int z = y - x; // 차이 계산
            if (z != 0) {
                list.add(z); // 차이가 0이 아니면 다시 넣기
            }
        }

        return list.get(0);
    }
}