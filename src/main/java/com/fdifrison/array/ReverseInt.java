package com.fdifrison.array;

public class ReverseInt {

    public static void main(String[] args) {
        var x = 1234;
        System.out.println(x + " - " + reverse(x));
    }

    private static int reverseAPI(int x) {
        return Integer.reverse(x);
    }

    private static int reverse(int x) {
        var reversed = 0;
        while (x > 0) {
            x = x / 10;
            reversed = reversed * 10 + x % 10;
        }
        return reversed;
    }
}
