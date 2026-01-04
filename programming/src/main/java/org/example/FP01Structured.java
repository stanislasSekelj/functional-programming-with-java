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
        printCoursesInListFunctional(courses);
    }

    public static void printAllNumbersInListStructured(List<Integer> list){
        for (Integer number : list) { System.out.println(number); }
    }

    public static void printEvenNumbersInListFunctional(List<Integer> list){
        list.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }

    public static void printCoursesInListFunctional(List<String> list){
        list.stream().map(course -> course + " Expert" ).forEach(System.out::println);
    }

    public static void printOddNumbersInListFunctional(List<Integer> list){
        list.stream().filter(number -> !(number % 2 == 0)).forEach(System.out::println);
    }

    public static void printAllNumbersInListFunctional(List<Integer> list){
        list.stream().forEach(System.out::println);
    }
}
