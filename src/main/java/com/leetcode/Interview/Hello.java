package com.leetcode.Interview;

import java.util.HashMap;
import java.util.Map;
public class Hello {
    public static void main(String[] args) {
        //System.out.println("Hello");
       /*  int givenInt = 33;
        if (isPrime(givenInt)) {
            System.out.println( givenInt + " is prime" );
        }else {
            System.out.println("Not");
        }*/
        HashMap<String,String> hashMap =  new HashMap<>();
        hashMap.put("k1", "v1");
        hashMap.put("k2", "v2");
        hashMap.put("k3", "v3");

        for (Map.Entry<String,String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue() );
        }


        
    }
 
    public static boolean isPrime (int n) {
            if (n <= 2) return true;
            int sqrt = (int) Math.sqrt(n);
            if (n%2 == 0) return false;
            for (int i = 3; i<= sqrt ; i=i+2) {
                if (n % i == 0) return false;
            }
            return true;
    }
    
}
