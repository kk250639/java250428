//package ch18.lecture.p06file;
//
//import java.io.*;
//
//public class App01 {
//    public static void main(String[] args) throws IOException {
//        // File : file 정보를 담고 있는 객체
//        File f1 = new File("C:/Temp/noting.txt");
//        File f2 = new File("C:/Temp/bear.jpg");
//
//
//        // isExists
//        boolean r1 = f1.exists();
//        System.out.println("r1 = " + r1);
//        boolean r2 = f2.exists();
//        System.out.println("r2 = " + r2);
//
//        // getName
//        String n1 = f2.getName();
//        System.out.println("n1 = " + n1);
//
//        // length
//        String p1 = f2.getPath();
//        System.out.println("p1 = " + p1);
//
//        long l2 = f2.length();
//        System.out.println("l2 = " + l2);
//        // isDirectory
//boolaen d2 = f2.isDirectory();
//        System.out.println("d2 = " + d2);
//
//        // isFile
//    boolean 12 = f2.isFile();
//        System.out.println("d2 = " + d2);
//
//    }
//}
