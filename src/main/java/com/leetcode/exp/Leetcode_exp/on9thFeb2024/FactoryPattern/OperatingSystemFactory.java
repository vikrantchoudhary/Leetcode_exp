package com.leetcode.exp.Leetcode_exp.on9thFeb2024.FactoryPattern;

import com.leetcode.exp.Leetcode_exp.on9thFeb2024.FactoryPattern.factories.LinuxOperatingSystem;
import com.leetcode.exp.Leetcode_exp.on9thFeb2024.FactoryPattern.factories.OperatingSystem;
import com.leetcode.exp.Leetcode_exp.on9thFeb2024.FactoryPattern.factories.WindowOperatingSystem;

public class OperatingSystemFactory {
    
    public static OperatingSystem getInstance(String type,String version,String architecture) {
        switch (type) {
            case "Window":
                return new WindowOperatingSystem(version, architecture);
            case "Linux":
                return new LinuxOperatingSystem(version, architecture);
        
            default:
                throw new IllegalArgumentException("Unknown OS");
        }
    }
    
}
