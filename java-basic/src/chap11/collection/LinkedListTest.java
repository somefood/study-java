package chap11.collection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<String> myList = new LinkedList<>();

        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println(myList); // [A, B, C] 출력
        myList.add(1, "D");
        System.out.println(myList);
        myList.removeLast();
        System.out.println(myList);

        for(int i=0; i<myList.size(); i++) {
            String s = myList.get(i);
            System.out.println(s);
        }
    }
}