//package ch17.leetcode.p1431;
//
//import ch17.exercise.p06.Arrays;
//import java.util.*;
//
//public class SolutionT {
//    public static void main(String[] args) {
//
//
//        int max = Arrays.stream(candies)
//                .max()
//                .orElse(0);
//
//        return Arrays.stream(candies)
//                .map(s -> s + extraCandies)
//                .mapToObj(s -> s > max)
//                .toList();
//    }
//}