package ch12.lecture.p04Regex;

import java.util.regex.Pattern;

public class App07 {
    public static void main(String[] args) {
        // [a-zA-Z_0-9] : \w
        // [0~9] : \d
        // [ ] : \s (공백)
        // \ : \\

        // . (모든글자)
        // \. : .

        System.out.println(Pattern.matches("\\w+","a9df_akjdfAKDJF"));
        System.out.println(Pattern.matches("\\d+","982874214"));
        System.out.println(Pattern.matches("\\s","          "));
        System.out.println(Pattern.matches("\\\\","\\"));

        System.out.println(Pattern.matches(".*",""));
        System.out.println(Pattern.matches(".*","ao8"));
        System.out.println(Pattern.matches(".*","한글"));

        System.out.println(Pattern.matches("\\.","."));
        System.out.println(Pattern.matches("\\.","a"));
    }
}
