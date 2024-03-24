package com.leetcode.exp.Leetcode_exp.FeatureCheckJava;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReadAndProcessFile {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/Users/vikrant/SourceCode/leetCode/Leetcode_exp/src/main/java/com/leetcode/exp/Leetcode_exp/FeatureCheckJava/students.csv");
        if (Files.exists(path)) {
            List <Student> students = Files.lines(path)
                .skip(1)
                .map(fileData -> {
                    String csvData[] = fileData.split(",");
                    return new Student(Integer.parseInt(csvData[0]), csvData[1], 
                    csvData[2], csvData[3].charAt(0), Integer.parseInt(csvData[4]));
                }).collect(Collectors.toList());

            //System.out.println(students);
            
            Map <Integer, List<Student>> stds =  students.stream()
                .collect(
                    Collectors.groupingBy(Student::getAge,
                    Collectors.toList()
                    
                ));
            
            System.out.println(stds);

        }else {
            System.out.println("File not found ");
        }
        
    }
    
}
