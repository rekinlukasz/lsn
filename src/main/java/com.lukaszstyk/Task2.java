package com.lukaszstyk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task2 {

    public static List<List<Integer>> pairsWithSumThirteen(List<Integer> numbers) {
        List<List<Integer>> result = new ArrayList<>();
        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            for(int j = i +1; j < numbers.size(); j++) {
                if(numbers.get(i) + numbers.get(j) == 13) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(numbers.get(i));
                    pair.add(numbers.get(j));
                    result.add(pair);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1, 2, 10, 7, 5, 3, 6, 6, 13, 0);
        List<List<Integer>> pairs = pairsWithSumThirteen(list);
        for (List<Integer> pair :
                pairs) {
            System.out.println(pair.get(0) + " " + pair.get(1));
        }

    }
}
