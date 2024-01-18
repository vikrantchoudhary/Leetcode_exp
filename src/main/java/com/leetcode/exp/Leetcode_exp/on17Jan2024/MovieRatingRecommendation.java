package com.leetcode.exp.Leetcode_exp.on17Jan2024;

import java.util.ArrayList;
import java.util.List;

public class MovieRatingRecommendation {
    public static void main(String[] args) {
        String[][] ratings = {
            {"Alice", "Frozen", "5"},
            {"Bob", "Mad Max", "5"},
            {"Charlie", "Lost In Translation", "4"},
            {"Charlie", "Inception", "4"},
            {"Bob", "All About Eve", "3"},
            {"Bob", "Lost In Translation", "5"},
            {"Dennis", "All About Eve", "5"},
            {"Dennis", "Mad Max", "4"},
            {"Charlie", "Topsy-Turvy", "2"},
            {"Dennis", "Topsy-Turvy", "4"},
            {"Alice", "Lost In Translation", "1"},
            {"Franz", "Lost In Translation", "5"},
            {"Franz", "Mad Max", "5"}
          };
          String user = "Charlie";
          List<String> recommendedMovie = moveRecommendedList(ratings, user);
          System.out.println(recommendedMovie);
    }
    public static List<String> moveRecommendedList (String [][] rating, String user) {
        List<String> movieList = new ArrayList<>();
        return movieList;
    }
    
}
