package org.example;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
        //printAllNumbersInListStructured(List.of(12,3,14,21,45,1,2,12));
        printAllNumbersInListFunctional(List.of(12,3,14,21,45,1,2,12));
    }

    public static void printAllNumbersInListStructured(List<Integer> list){
        for (Integer number : list) {
            System.out.println(number);
        }
    }

    public static boolean isEven (int number) {
        return number % 2 == 0;
    }

    public static void printEvenNumbersInListFunctional(List<Integer> list){
        list.stream().filter(FP01Structured::isEven).forEach(System.out::println);
    }

    public static void printAllNumbersInListFunctional(List<Integer> list){
        list.stream().forEach(System.out::println);
    }
}
