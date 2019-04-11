/*
list size is 10
2019/4/10 started

 */

import java.util.ArrayList;
import java.util.Collections;

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
        Collections.addAll(list);
        int ad = getAd();
        int max = getMax();
        int min = getMin();
    }

    public static int getListSize() {
        return list.size();
    }

    public static int getMax() {
        return Collections.max(list);
    }

    public static int getMin() {
        return Collections.min(list);
    }

    public static int getAd() {
        return Collections.min(list);
    }
}
