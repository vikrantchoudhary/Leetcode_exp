package com.leetcode.exp.Leetcode_exp.FeatureCheckJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalProgrammingWithJava implements MyLambdaFunctionalInterface{

    @Override
    public int sum(int i, int j) {
        System.out.println("sum of two number " + i  + " & " + j);
        return i + j;
    }
    public static void main(String[] args) {
        /*MyLambdaFunctionalInterface fl = (i,j) -> { System.out.println("sum lambda ...");return i + j;};
        System.out.println(fl.sum(4, 4));
        System.out.println(fl.addDefault(4, 1));
        System.out.println(MyLambdaFunctionalInterface.add(3, 3));
        // lambda to sort only number > 6
        */
       /*  List<Integer> list = Arrays.asList(10,12,1,23,6,232,2,34,6,65,3, 1, 0 ,344);
        System.out.println(list);
        list.stream().filter(n -> n > 6).sorted().forEach(System.out::println);
        */
        List<User> userList = Stream.of(
            new User(1,"test1",Arrays.asList("test1@gmail.com","test1@test.com"),77),
            new User(2,"test2",Arrays.asList("test2@gmail.com","test2@test.com","test2@test2.com"),73),
            new User(3,"test3",Arrays.asList("test3@gmail.com","test3@test.com"),73)
        ).collect(Collectors.toList());
        System.out.println("###### ");
        System.out.println(userList);
       //map
       List<List<String>> emails =  userList.stream().map(User::getEmail).collect(Collectors.toList());
       System.out.println(emails);

       //flatmap
       List<String> mails = userList.stream().flatMap(u->u.getEmail().stream()).collect(Collectors.toList());
       System.out.println(mails);
    
    }



   
    
}
