package ch03.exercise;

public class Exercise03 {
    public static void main(String[] args) {
        // 원하는 곳에 커서를 두고 shift + f6을 사용하면 한번에 전부 적용(제목까지도)
        int pencils = 534;
        int students = 30;

        // 학생 한 명이 가지는 연필 수
        int pencilsPerStudent = pencils / students;
        System.out.println(pencilsPerStudent);

        // 남은 연필 수
        int pencilsLeft = pencils % students;
        System.out.println(pencilsLeft);
    }
}
