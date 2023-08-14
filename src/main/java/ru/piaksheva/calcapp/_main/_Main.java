package ru.piaksheva.calcapp._main;

import ru.piaksheva.calcapp.service.ResultWriterService;
import ru.piaksheva.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        int a = 35;
        int b = 28;
        ResultWriterService.printResult(a, b, Calculator.summarize(a, b), "Сумма");
        ResultWriterService.printResult(a, b, Calculator.subtract(a, b), "Разность");
        ResultWriterService.printResult(a, b, Calculator.multiply(a, b), "Произведение");

    }
}
