package com.lukaszstyk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task3 {

    public static void main(String[] args) {

        String input = "3\r\n1 2\r\n2 3\r\n4 5";
        String[] rows = input.split("\r\n");
        int n = Integer.parseInt(rows[0]);

        int i = task3(rows);
        System.out.println(i);
    }

    public static int task3(String[] rows) {
        ArrayList<List<Integer>> vertexes = new ArrayList<>();
        ArrayList<Integer> points = new ArrayList<>();

        for (int i = 1; i < rows.length ; i++) {
            String[] pair = rows[i].split(" ");
            int first = Integer.parseInt(pair[0]);
            int second = Integer.parseInt(pair[1]);
            points.add(first);
            points.add(second);
            vertexes.add(List.of(first, second));
        }
        List<Integer> repeatingPoints = removeNonRepeating(points);

        //not completed
        


        return 0;

    }
    public static List<Integer> removeNonRepeating(List<Integer> nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (frequencyMap.get(num) > 1) {
                result.add(num);
            }
        }

        return result;
    }

}
