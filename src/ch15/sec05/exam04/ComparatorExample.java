package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {

        //비교자를 제공한 treeSet 컬렉션 생성
        TreeSet<Fruit> set = new TreeSet<>((o1,o2) -> o1.price - o2.price);

        //객체 저장
        set.add(new Fruit("포도",3000));
        set.add(new Fruit("수박",10000));
        set.add(new Fruit("딸기",6000));

        //객체를 하나씩 가져오기
        for(Fruit ff : set) {
            System.out.println(ff);
        }

    }
}
