package com.leetcode.exp.Leetcode_exp.on17Jan2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventCount {
    public static void main(String[] argv) {
        String[][] ratings = {
            {"CONNECT", "Alice","Bob"},
            {"DISCONNECT" , "Bob", "Alice"},
            {"CONNECT", "Alice","Charlie"},
            {"CONNECT", "Dennis","Bob"},
            {"CONNECT", "Pam","Dennis"},
            {"DISCONNECT" , "Pam", "Dennis"},
            {"CONNECT", "Pam","Dennis"},
            {"CONNECT", "Edward","Bob"},
            {"CONNECT", "Dennis","Charlie"},
            {"CONNECT", "Alice","Nicole"},
            {"CONNECT", "Pam","Edward"},
            {"DISCONNECT" , "Dennis", "Charlie"},
            {"CONNECT", "Dennis","Edward"},
            {"CONNECT", "Charlie","Bob"}
         };
         int n = 3;
         List<List<String>> userList = getUserList(ratings, n);
         System.out.println(userList);
    }
     public static List<List<String>> getUserList(String[][] events, int n) {
    List<String> user_n_connection_or_more = new ArrayList<>();
    List<String> user_less_n_connection =new ArrayList<>();
    List<List<String>> finalList = new ArrayList<>();
    HashMap <String ,Integer> hashmap_user_connect = new HashMap<>();
        String user1, user2;
        //for (int i = 0; i < events.length; i++) {
          for (int j= 0 ; j < events.length;j++) {
            System.out.println(events[j][0] + " --> " + events[j][1] + " --> " + events[j][2]);
            
            if (events[j][0].equalsIgnoreCase("CONNECT")) {
              user1 = events[j][1];
              user2= events[j][2];
              if (!hashmap_user_connect.containsKey(user1)) {
                hashmap_user_connect.put(user1,1);
              }else {
                hashmap_user_connect.replace(user1,hashmap_user_connect.get(user1)+1 );
              }
              if (!hashmap_user_connect.containsKey(user2)) {
                hashmap_user_connect.put(user2,1);
              }else {
                hashmap_user_connect.replace(user2,hashmap_user_connect.get(user2)+1 );
              }
            }
            if (events[j][0].equalsIgnoreCase("DISCONNECT")) {
              user1 = events[j][1];
              user2= events[j][2];
              if (hashmap_user_connect.containsKey(user1)) {
                hashmap_user_connect.replace(user1,hashmap_user_connect.get(user1)-1 );
              }
              if (hashmap_user_connect.containsKey(user2)) {
                hashmap_user_connect.replace(user2,hashmap_user_connect.get(user2)-1 );
              }
            }
          }
          
        //}
        
        for (Map.Entry<String,Integer> hashEntry : hashmap_user_connect.entrySet()) {
          if (hashEntry.getValue() < n) {
              user_less_n_connection.add(hashEntry.getKey());
          } else {
            user_n_connection_or_more.add(hashEntry.getKey());
          }
          //System.out.println (hashEntry.getKey() + " --- >  " + hashEntry.getValue()  );
        } 
        finalList.add(user_less_n_connection);
        finalList.add(user_n_connection_or_more);
        return finalList;
  }
    
}
