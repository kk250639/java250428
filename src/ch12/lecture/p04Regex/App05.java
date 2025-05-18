package ch12.lecture.p04Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "[가-힣]{3,}";

        while (true) {
            System.out.println("입력>");
            String input = scanner.nextLine();

            if (Pattern.matches(pattern, input)) {
                System.out.println(" 패턴에 일치합니다.");
            } else {
                System.out.println(" 패턴에 일치하지 않습니다.");
            }

            System.out.println();
        }
    }
}
