package com.leetcode.exp.Leetcode_exp.on9thFeb2024.FactoryPattern.factories;

import java.util.Map;

public class LinuxOperatingSystem extends OperatingSystem{
   

    public LinuxOperatingSystem(String version, String architecture) {
        super(version,architecture);
    }


    @Override
    public Map<String, String> getDirectoryList() {
        // TODO Auto-generated method stub
        System.out.println("Linux get directory");
        return null;
        //throw new UnsupportedOperationException("Unimplemented method 'getDirectoryList'");
    }

    @Override
    public void changeDirectory(String dir) {
        // TODO Auto-generated method stub
        System.out.println("Linux change directory");
        
        //throw new UnsupportedOperationException("Unimplemented method 'changeDirectory'");
    }
    
}
