package org.example;

//Step 1: Filter a list of numbers and only output the even numbers.
//Step 2: Use 'map' and double each number in the list.
//Step 3: Sort the list in ascending order.
//Step 4: Perform a 'reduce' operation to calculate the sum of all numbers in the list.
//Step 5: Use 'forEach' and output each processed number.
//Step 6: Collect the processed numbers into a new list using 'collect'.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(9);
        list.add(5);
        list.add(12);
        list.add(4);
        list.add(10);
        list.add(6);

        System.out.println("operations");
        List<Integer> processedNumbers = list.stream()
                .filter(element -> element % 2 == 0)
                .map(element -> element * 2)
                .sorted()
                .toList();
        System.out.println(processedNumbers);

        System.out.println("Reduce operation");
        int reducedList = list.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(reducedList);

        System.out.println("forEach operation");
        processedNumbers.forEach(System.out::println);

    }
}