package org.example;

//Step 1: Filter a list of numbers and only output the even numbers.
//Step 2: Use 'map' and double each number in the list.
//Step 3: Sort the list in ascending order.
//Step 4: Perform a 'reduce' operation to calculate the sum of all numbers in the list.
//Step 5: Use 'forEach' and output each processed number.
//Step 6: Collect the processed numbers into a new list using 'collect'.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(4);

        System.out.println("Filter a list of numbers and only output the even numbers.");
        list.stream()
                .filter(element -> element % 2 == 0)
                .forEach(System.out::println);

        System.out.println("Use 'map' and double each number in the list.");
        list.stream()
                .map(element -> element * 2)
                .forEach(System.out::println);

        System.out.println("Sort the list in ascending order.");
        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}