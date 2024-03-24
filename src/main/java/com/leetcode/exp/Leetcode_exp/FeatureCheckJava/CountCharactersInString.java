package com.leetcode.exp.Leetcode_exp.FeatureCheckJava;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountCharactersInString {
    public static void main(String[] args) {
        String inputString = "Subscribe to unlock new features and if eligible, receive a share of ads revenue.";
        /*Map<String,Long> map = Arrays.stream(inputString.split(""))
            .collect(
                Collectors.groupingBy(
                    Function.identity(), Collectors.counting()
                )
            );
        System.out.println(map);*/
        Map<String,Long> map = Arrays.stream(inputString.split(""))
            .collect(
                Collectors.groupingBy(
                    Function.identity(),Collectors.counting()
                )
            );
        System.out.println(map);
       // map.entrySet().forEach((k,v) -> System.out.println(k + " : " + v ));
    }
    
}
