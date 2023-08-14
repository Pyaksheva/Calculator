package ru.piaksheva.calcapp.service;

public class ResultWriterService {
    public static void printResult(int a, int b, int result, String nameOperation) {
        System.out.println(nameOperation + " двух чисел " + a + " и " + b + " = " + result);
    }
}
