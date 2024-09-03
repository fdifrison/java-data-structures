package com.fdifrison.array.exercise;

import java.util.List;
import java.util.Map;

public class Palindrome {

    public static void main(String[] args) {
        var tests = List.of("civic", "radar", "level", "rotor", "kayak", "madam");
        var isPalindrome = tests.stream()
                .map(t -> Map.entry(t, solvePalindromeBrutal(t)))
                .toList();
        System.out.println(isPalindrome);
    }

    private static boolean solveWithAPI(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    private static boolean solvePalindromeBrutal(String str) {
        var chars = str.toCharArray();
        var j = 0;
        var i = str.length() - 1;
        while (j < i) {
            if (chars[j] != chars[i]) return false;
            j++;
            i--;
        }
        ;
        return true;
    }
}
