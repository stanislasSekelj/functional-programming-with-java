package org.example;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
        //printAllNumbersInListStructured(List.of(12,3,14,21,45,1,2,12));
        printAllNumbersInListFunctional(List.of(12,3,14,21,45,1,2,12));
    }

    public static void printAllNumbersInListStructured(List<Integer> list){
        list.stream().forEach(System.out::println);
    }

    public static void printAllNumbersInListFunctional(List<Integer> list){
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}
