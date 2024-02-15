package com.leetcode.exp.Leetcode_exp.on9thFeb2024.AbstractFactoryPattern;

import com.leetcode.exp.Leetcode_exp.on9thFeb2024.AbstractFactoryPattern.UIFactory.MacUIFactory;
import com.leetcode.exp.Leetcode_exp.on9thFeb2024.AbstractFactoryPattern.UIFactory.WindowUIFactory;

public class MainClass {
    public static void main(String[] args) {
        ApplicationFactory applicationFactory = 
        new ApplicationFactory(new WindowUIFactory());
        applicationFactory.paint();
    }
    
}
