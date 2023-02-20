//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class LinkedListReverse {
    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        LinkedList<Integer> reversed = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original list: " + list);

        LinkedList<Integer> reversed = reverse(list);

        System.out.println("Reversed list: " + reversed);
    }
}
