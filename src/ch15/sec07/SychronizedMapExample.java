package ch15.sec07;

import java.util.*;
public class SychronizedMapExample {
    public static void main(String[] args) {
        //Map 컬렉션 생성
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };

        //작업 스레드 객체 생성
        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    map.put(i, "내용" + i);

                }
            }
        };

        //작업 스레드 실행
        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {
        }
        //저장된 총 객체 수 얻기
        int size = map.size();
        System.out.println("size = " + size);
        System.out.println();
    }
}
