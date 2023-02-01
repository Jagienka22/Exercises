package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BalancedWordsCounter {
    private static boolean isBalanced(String s){
        Set<Character> letters = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            letters.add(s.charAt(i));
        }

        int firstCount = 0;
        for(char c : letters){
            int count = 0;
            for(int j = 0; j < s.length(); j++){
                if(c == s.charAt(j)){
                    count++;
                }
            }
            if(firstCount == 0){
                firstCount = count;
            }
            if(firstCount != count){
                return false;
            }
        }
        return true;
    }

    private static List<String> getSubstrings(String s){
        List<String> myStrings = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j < s.length() + 1; j++){
                myStrings.add(s.substring(i, j));
            }
        }
        return myStrings;
    }

    private static boolean isAllLetters(String s){
        for(int i = 0; i < s.length(); i++){
            if(!Character.isLetter(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static int count(String input) {
        int allBalancedWords = 0;

        if(input == null || !isAllLetters(input)){
            throw new RuntimeException();
        }

        for(String s: getSubstrings(input)){
            if(isBalanced(s)){
                allBalancedWords++;
            }
        }
        return allBalancedWords;
    }
}
