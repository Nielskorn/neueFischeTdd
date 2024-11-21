package org.neuefische;

public class Fizzbuzz {
    public static String fizzing(int n) {
        return (n % 3 == 0) ? "Fizz" : null;
    }
    public static String buzzing(int n) {
        return (n % 5 == 0) ? "Buzz" : null;
    }
    public static String fizzingAddBuzzing(int n) {
        return (n % 15 == 0) ? "FizzBuzz" : null;
    }
    public static String fizbus(int n) {
        if (n % 15 == 0) return "FizzBuzz";
        else if (n % 5 == 0) return "Buzz";
        else if (n % 3 == 0) return "Fizz";
        else return String.valueOf(n);

    }

}
