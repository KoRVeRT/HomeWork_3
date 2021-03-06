package ru.dataart.academy.java;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Calculator works: " + calculator.getSum(Arrays.asList(1, 2, 3), Arrays.asList(1, 2)));
        System.out.println("Odd elements: " + calculator.getOddElements(Arrays.asList(1, 2, 3)));
        System.out.println("Odd elements: " + calculator.getOddElements(Collections.emptyList()));
        System.out.println("Odd elements: " + calculator.getOddElements(Arrays.asList("Task", "Other Task", "Task4", "Task6", "Task8")));
        System.out.println("Bounds: " + calculator.getBounds(Arrays.asList(1, 2, 3)));
        System.out.println("Bounds: " + calculator.getBounds(Collections.emptyList()));
    }
}