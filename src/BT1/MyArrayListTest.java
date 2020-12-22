package BT1;

import TH1.MyList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(5);
        System.out.println(myList.get(1));

    }
}
