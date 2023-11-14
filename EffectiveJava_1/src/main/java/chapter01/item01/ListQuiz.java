package chapter01.item01;

import java.util.ArrayList;
import java.util.Comparator;

public class ListQuiz {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(44);
        numbers.add(20);
        numbers.add(100);
        numbers.add(3);

        System.out.println("numbers = " + numbers);

        Comparator<Integer> desc = (first, second) -> second - first;
        numbers.sort(desc);
        System.out.println(numbers);

        numbers.sort(desc.reversed());
        System.out.println(numbers);

    }
}
