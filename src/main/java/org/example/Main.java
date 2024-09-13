package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Integer> list = List.of(1,8,3,2,7,9,5,12,4,10,6);

        System.out.println("Operations: ");
        List<Integer> processedNumbers = list.stream()
                .filter(element -> element % 2 == 0)
                .map(element -> element * 2)
                .sorted()
                .toList();
        System.out.println(processedNumbers);

        System.out.println("\nReduce operation: ");
        int reducedList = list.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(reducedList);

        System.out.println("\nforEach operation: ");
        processedNumbers.forEach(System.out::println);

        //File processing
        Path pathToFile = Path.of("students.csv");
        System.out.println("\nPrinting out the file:");
        Files.lines(pathToFile).forEach(System.out::println);

        Stream<String> lines = Files.lines(pathToFile)
                        .skip(1);

        System.out.println("\nConverting to Student class:");
        List<Student> students = lines.map(line -> convertToStudent(line)).collect(Collectors.toList());
        students.forEach(System.out::println);

        System.out.println("\nThe list of Students is processed:");
        List<Student> beautifiedListOfStudents = students.stream()
                .filter(student -> student != null)
                .distinct()
                .toList();
        beautifiedListOfStudents.stream().forEach(System.out::println);
    }

    public static Student convertToStudent (String line){
        String[] parts = line.split(",");
        if (parts.length != 4) return null;
        int id = Integer.parseInt(parts[0].trim());
        String name = parts[1].trim();
        String postalCode = parts[2].trim();
        int age = Integer.parseInt(parts[3].trim());
        return new Student(id, name, postalCode, age);
    }
}
