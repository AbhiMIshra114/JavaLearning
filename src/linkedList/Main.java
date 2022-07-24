package linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(12);
        list.insertFirst(45);
        list.insertFirst(23);
        list.insertFirst(18);
        list.insertFirst(10);

        list.insertLast(99);
        list.display();


    }
}
