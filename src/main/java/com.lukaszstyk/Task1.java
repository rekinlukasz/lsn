package com.lukaszstyk;

import java.util.*;
import java.util.stream.Collectors;

public class Task1 {


    public static void analyzeList(List<Integer> numbers) {

        Set<Integer> distinctNumbers = new HashSet<>(numbers);

        List<Integer> sortedDistinctNumbers = new ArrayList<>(distinctNumbers);
        Collections.sort(sortedDistinctNumbers);

        String list = sortedDistinctNumbers.stream().map(Object::toString).collect(Collectors.joining(" "));

        System.out.println(list);
        System.out.println("count: " + numbers.size());
        System.out.println("distinct: " + distinctNumbers.size());
        System.out.println("min: " + Collections.min(numbers));
        System.out.println("max: " + Collections.max(numbers));
    }

    public static void main(String[] args) {

        List<Integer> inputList = Arrays.asList(1, 10, 20, 20, 2, 5);
        analyzeList(inputList);
    }

}
