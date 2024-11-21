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

}
