package com.leetcode.exp.Leetcode_exp.on29thJan2024;

public class LemonadeChange {
    public static void main(String[] args) {
        int bills[] = {5,5,5,10,20};
        int bills2[] = {5,5,10,5,10,20};
        if (lemonadeChange(bills2)) {
            System.out.println("successful with all customers");
        }else {
            System.out.println("Not successful to sell to all customers");
        }
    }
    public static boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        for (int bill : bills){
            if (bill == 5) fives++;
            else if (bill == 10) {
                tens++;
                fives--;
            }else {
                if (tens > 0) {
                    tens --;
                    fives --;
                }else {
                    fives -=3;
                }
            }
            if (fives < 0) return false;
        }

        return true;
        
    }
    
}
