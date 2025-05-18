package ch12.lecture.p04Regex;

import java.util.regex.Pattern;

public class App02 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("a","a"));
        System.out.println(Pattern.matches("a","b"));

        // [] " character class
        System.out.println(Pattern.matches("[ab]","a"));
        System.out.println(Pattern.matches("[ab]","b"));
        System.out.println(Pattern.matches("[ab]","ab"));
        System.out.println(Pattern.matches("[ab][ab]","ab"));
        System.out.println(Pattern.matches("[ab][ab]","aa"));
        System.out.println(Pattern.matches("[ab][ab]","bb"));
        System.out.println(Pattern.matches("[ab][ab]","ba"));

        // [] 안의 - : 범위
        System.out.println(Pattern.matches("[a-e]", "a"));
        System.out.println(Pattern.matches("[a-e]", "b"));
        System.out.println(Pattern.matches("[a-e]", "c"));
        System.out.println(Pattern.matches("[a-e]", "e"));
        System.out.println(Pattern.matches("[a-z]", "o"));
        System.out.println(Pattern.matches("[A-Z]", "G"));
        System.out.println(Pattern.matches("[A-Z]", "g"));
        System.out.println(Pattern.matches("[0-9]", "3"));
        System.out.println(Pattern.matches("[0-9A-Za-z]", "7"));
        System.out.println(Pattern.matches("[0-9A-Za-z]", "t"));
        System.out.println(Pattern.matches("[0-9A-Za-z]", "v"));
        System.out.println(Pattern.matches("[가-힣]", "손"));
        System.out.println(Pattern.matches("[가-힣]", "발"));
        System.out.println(Pattern.matches("[가-힣0-9a-zA-Z]", "발"));


    }
}
