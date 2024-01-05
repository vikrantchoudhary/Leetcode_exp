package com.leetcode.exp.Leetcode_exp.on5thJan2024;

import java.util.HashSet;

/*
 * https://leetcode.com/problems/unique-email-addresses/
 */
public class UniqueEmailAddress {
    public static void main(String[] args) {
        String[] emails = {
            "test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"
        };
        int uniqueEmails = numUniqueEmails(emails);
        System.out.println("Unique emails : " + uniqueEmails);
    }

    public static int numUniqueEmails(String[] emails) {
        HashSet<String> unqiue_emails = new HashSet<>();
        String local;
        String domain;
        for (String email: emails) {
            String [] localDomain = email.split("@");
            local = localDomain[0];
            domain = localDomain[1];
            local = local.replace(".","");
            local = local.split("\\+")[0];
            unqiue_emails.add(local+"@"+domain);

        }
        System.out.println(unqiue_emails);
        return unqiue_emails.size();
    }
    
}
