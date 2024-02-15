package com.leetcode.exp.Leetcode_exp.on9thFeb2024.FactoryPattern.factories;

import java.util.Map;

public class WindowOperatingSystem extends OperatingSystem{
   

    public WindowOperatingSystem(String version, String architecture) {
        super(version,architecture);
    }


    @Override
    public Map<String, String> getDirectoryList() {
        System.out.println("window get directory");
        return null;
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'getDirectoryList'");
    }

    @Override
    public void changeDirectory(String dir) {
        System.out.println("window change directory");
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'changeDirectory'");
    }
    
}
