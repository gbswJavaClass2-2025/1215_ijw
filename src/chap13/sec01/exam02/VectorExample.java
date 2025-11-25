package chap13.sec01.exam02;

import java.util.*;

public class VectorExample {
    static void main() {
        List<Board> list = new Vector<Board>();

        list.add(new Board("title1", "content1", "writer1"));
        list.add(new Board("title2", "content2", "writer2"));
        list.add(new Board("title3", "content3", "writer3"));
        list.add(new Board("title4", "content4", "writer4"));
        list.add(new Board("title5", "content5", "writer5"));

        list.remove(2);
        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            Board bd = list.get(i);
            System.out.println(bd.sub + "\t" +
                    bd.cnt + "\t" +
                    bd.wri);
        }
    }
}
