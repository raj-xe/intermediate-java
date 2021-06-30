package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(2);
        ArrayList l2 = new ArrayList();
        l2.add(4);
        l2.add(5);
        l1.addAll(l2);
        System.out.println(l1+"-"+l2);
        System.out.println(l1.subList(1, 3));
    }
}
