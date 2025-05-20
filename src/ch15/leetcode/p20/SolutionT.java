//package ch15.leetcode.p20;
//
//import java.util.Stack;
//
//public class SolutionT {
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (char c : s.toCharArray()) {
//            // 열린 괄호면 stack 에 push
//            // 닫힌 괄호면
//            // stack 에서 pop 한 것
//            // 매치가 되면 계속 진행, 아니면 return false
//            switch (c) {
//                case ']' -> {
//                    char c = stack.pop();
//                    if (open != '{') {
//                        return false;
//                    }
//                }
//                case '}' -> {}
//                case ')' -> {}
//            }
//
//        }
//        if (stack.isEmpty()) {
//            return true;
//        } else {
//        return true;
//        }
//    }
//}
