package com.leetcode.exp.Leetcode_exp.FeatureCheckJava;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
public class MaxSalaryByDept {
    public static void main(String[] args) {
        List<Employee> employeeList = Stream.of(
            new Employee(1, "aa1","dev", 2000),
            new Employee(9, "bb1","dev", 6000),
            new Employee(2, "cc1","dev", 4500),
            new Employee(3, "aa2","qa", 2000),
            new Employee(4, "bb2","qa", 1000),
            new Employee(5, "aa3","devops", 2000),
            new Employee(6, "bb3","devops", 2000),
            new Employee(8, "cc1","manager", 90000)
            ).collect(Collectors.toList());

        System.out.println("###### " );
        Comparator<Employee> compareSalary = Comparator.comparing(Employee::getSalary);
        Map <String,Optional<Employee>> empMap = employeeList.stream().
            collect(
                groupingBy(Employee::getDept,
                Collectors.reducing(BinaryOperator.minBy(compareSalary))));
        empMap.entrySet().stream().forEach(System.out::println);

        // approach2
        System.out.println("##### *** ");
        Map <String,Employee> empMap2 = employeeList.stream().
            collect(
                Collectors.groupingBy(Employee::getDept,
                Collectors.collectingAndThen(maxBy(Comparator.comparingInt(Employee::getSalary)), Optional::get)
                ));
        System.out.println(empMap2);

    }
    
    
}
