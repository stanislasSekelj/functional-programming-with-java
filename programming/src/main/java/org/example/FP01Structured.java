package org.example;

import java.util.ArrayList;
import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,3,14,21,45,1,2,12);
        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","Azure", "Docker", "Kubernetes");
        //printAllNumbersInListStructured(numbers);
        //printEvenNumbersInListFunctional(numbers);
        //printOddNumbersInListFunctional(numbers);
        //printCoursesInListFunctional(courses);
        //printSumOfAllNumbersInListFunctional(numbers);
        System.out.println(printSumOfAllSquaredNumbersInListFunctional(numbers));
    }

    public static void printAllNumbersInListStructured(List<Integer> list){
        for (Integer number : list) { System.out.println(number); }
    }

    public static void printEvenNumbersInListFunctional(List<Integer> list){
        list.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }

    public static void printCoursesInListFunctional(List<String> list){
        list.stream().map(course -> course.length()).forEach(System.out::println);
    }

    public static void printOddNumbersInListFunctional(List<Integer> list){
        list.stream().filter(number -> !(number % 2 == 0)).map(number -> number * number).forEach(System.out::println);
    }

    public static void printAllNumbersInListFunctional(List<Integer> list){
        list.stream().forEach(System.out::println);
    }

    public static void printSumOfAllNumbersInListFunctional(List<Integer> list){
        list.stream().reduce((a, b) -> a + b).ifPresent(System.out::println);
    }

    public static Integer printSumOfAllSquaredNumbersInListFunctional(List<Integer> list){
        //return list.stream().reduce(0, (a, b) -> a + (b*b));
        //return list.stream().map(number -> number * number).reduce((a, b) -> a + b);
        return list.stream().mapToInt(number -> number * number).sum();
    }
}
