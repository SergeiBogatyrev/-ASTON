package org.example;

public class App {

    public static void main(String[] args) {
        FactorialJunit5 a = new FactorialJunit5();
        int n = 5;
        long i = a.getFactorial(n);
        System.out.println("Факториал " + n + " равняется " + i);
    }

}
