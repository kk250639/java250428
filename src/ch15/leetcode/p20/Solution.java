package ch15.leetcode.p20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // 여는 괄호는 스택에 추가
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // 닫는 괄호 처리
            else {
                if (stack.isEmpty()) {
                    return false; // 짝 맞는 여는 괄호 없음
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false; // 괄호 종류 불일치
                }
            }
        }

        // 모두 짝이 맞아야 스택이 비어 있어야 함
        return stack.isEmpty();
    }
}