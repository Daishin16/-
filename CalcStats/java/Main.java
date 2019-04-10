/*
list size is 10
2019/4/10 started

 */

import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> list = new ArrayList<Integer>();

    /*
    add 10 elements
    */
    public static void initialize() {
        list.add(1);
        list.add(3);
        list.add(-36);
        list.add(0);
        list.add(10);
        list.add(-3);
        list.add(5);
        list.add(100);
        list.add(-56);
        list.add(7);
    }

    public static void main(String[] args) {
        initialize();
        int listSize = getListSize();
    }

    public static int getListSize() {
        return list.size();
    }
}
