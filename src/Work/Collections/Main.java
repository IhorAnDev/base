package Work.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i <= 1000; i++) {
            integers.add(i);
        }
        System.out.println(integers.size());

        for (Integer el : integers) {
            if (el % 15 == 0) {
                System.out.println(el);
            }
        }

        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.add("Lori");
        customLinkedList.add("ABC");
        customLinkedList.add("DEF");

        System.out.println(customLinkedList.get(0));

    }
}
