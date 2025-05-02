package ch05.exercise;

public class exercise07 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max =" + max);

        System.out.println("sort--------");
        System.out.println(array);
        System.out.println("array[array.length-1=" + array[array.length]);
        
    }
}
