package chap13.sec01.exam01;

import java.sql.SQLOutput;
import java.util.*;

public class ArrayListExample {
    static void main() {
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "Database");
        list.add("iBATIS");

        int size = list.size();
        System.out.println("Num of objects: " + size);
        System.out.println();

        String skill = list.get(2); // idx: 2
        System.out.printf("list[2] : %s", skill);
        System.out.println();

        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            System.out.println("list[" + i + "] : " + str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("iBATS"); // "iBATS" < String, so it executes " delete the String object with this value!! "

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println("list[" + i + "] : " + str);
        }


    }
}
