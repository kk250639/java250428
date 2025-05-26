package ch15.lecture.p06etc;

import java.util.Arrays;

public class App06 {
    public static void main(String[] args) {
        // 배열
        Integer[] arr1 = {10, 5, 30, -1, 0, 20};
        // 정렬 전
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        // 정렬 후
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1, (a, b) -> a - b);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1, (a, b) -> -(a - b));

        String[] arr2 = {"java", "css", "spring"};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2, (a, b) -> a.compareTo(b));
        System.out.println(Arrays.toString(arr2));
    }
}
