package org.example;

public class Calc {
    public int summ(int a, int b){
        int result;
        result = a + b;
        System.out.println("Сумма " + a + " и " + b + " равно " + result);
        System.out.printf("Сумма %d и %d равна %d" , a, b, result);
        System.out.println();
        return result;
    }
    public int subtraction(int a, int b){
        int result;
        result = a - b;
        System.out.println("Разность " + a + " и " + b + " равно " + result);
        return result;
    }
}
