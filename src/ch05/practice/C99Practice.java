//package ch05.practice;
//
//public class C99Practice {
//    public static void main(String[] args) {
//        int[][] mat = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        // Solution 클래스의 메서드 사용
//        Solution s = new Solution();
//        int result = s.diagonalSum(mat);
//        System.out.println("최종 결과: " + result);
//    }
//}
//
/// / LeetCode 스타일 그대로 유지
//class Solution {
//    public int diagonalSum(int[][] mat) {
//        int a = 0;
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                if (i == j) {
//                    a += mat[i][j];
//                }
//                System.out.println("a = " + a);
//            }
//        }
//        return a;
//    }
//}
//
//class Solution {
//    public int diagonalSum(int[][] mat) {
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                if (i == j) {
//                    a += mat[i][j];
//                } else if (i + j == 2) {
//                    b += mat[i][j];
//                }{
//                c = a + b;
//                System.out.println("c = " + c);
//            }
//        }
//        return c;
//
//    }
//}
//
//if(i==j){
//int[] a = transpose[j];
/// / ↑ 망한 시도들
/// / 정답
//    class Solution {
//        public int diagonalSum(int[][] mat) {
//            int sum =0;
//            for (int i =0; i<mat.length; i++){
//                for (int j=0; j<mat[i].length;j++)
//                    if(i==j){
//                        sum += mat[i][j];
//                    } else if ((i+j)==mat.length-1){
//                        sum += mat[i][j];
//                    }
//            }return sum;
//        }
//    }
//    class Solution {
//        public int diagonalSum(int[][] mat) {
//            int sum =0;
//
//            int red =0;
//            int blue = mat.length -1;
//
//            for(int i =0; i < mat.length; i++){
//                sum += mat[i][red];
//                sum += mat[i][blue];
//                red++;
//                blue--;
//            }
//            if (mat.length % 2 == 1 ){
//                int d = mat.length/2;
//                sum -= mat[d][d];
//            }
//            return sum;
//        }
//    }