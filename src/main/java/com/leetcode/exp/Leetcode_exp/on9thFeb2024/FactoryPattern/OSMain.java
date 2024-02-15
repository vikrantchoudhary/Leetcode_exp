package com.leetcode.exp.Leetcode_exp.on9thFeb2024.FactoryPattern;

import com.leetcode.exp.Leetcode_exp.on9thFeb2024.FactoryPattern.factories.OperatingSystem;

public class OSMain {
    public static void main(String[] args) {
        OperatingSystem os = OperatingSystemFactory.getInstance("Window", "11.0", "x86");
        os.getDirectoryList();
    }
    
}
