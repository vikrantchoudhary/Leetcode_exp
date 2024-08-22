package com.leetcode.exp.Leetcode_exp.HackerRank;

public class ValidUserName {
    public static final String regularExpression = "^[A-z]+[0-9]*";
    public static void main(String[] args) {
        String user1[] = {"Julia","_Samantha","Samantha_21","1Samantha","Samatha?10_2A"};
        for(String user:user1) {
           if(validUser(user)) {
            System.out.println(user + " ===> valid");
           }else {
                System.out.println(user + "===> Invalid");
           }
           
        } 
    }
    
    private static boolean validUser(String user2) {
        if (user2.length() < 8 )return false;
        if (user2.matches(regularExpression)) return true;
        return false;
    }
    
}
