package org.example.strings;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        // default delimeters: space, \t , \n
        String s1 = "He,llo!How Are You.\nWelcome to the learn\ting\tcenter";
        StringTokenizer tokenizer = new StringTokenizer(s1);
        System.out.println(tokenizer.countTokens());

        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
        System.out.println(" custom delimeter ");
        String s2 = "Hello How Are You?I am fine!. What about you?Do let me know";
        tokenizer = new StringTokenizer(s2, "?!");
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
    }
}
