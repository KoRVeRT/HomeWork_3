package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        Collections.reverse(firstNumber);
        Collections.reverse(secondNumber);
        int reverseFirstNumber = 0;
        int reverseSecondNumber = 0;
        for (Integer integer : firstNumber) {
            reverseFirstNumber = reverseFirstNumber * 10 + integer;
        }
        for (Integer integer : secondNumber) {
            reverseSecondNumber = reverseSecondNumber * 10 + integer;
        }
        return reverseFirstNumber + reverseSecondNumber;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List<T> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        if (list.size() == 0 || list.size() == 1) {
            return list;
        }
        return Arrays.asList(list.get(0), list.get(list.size() - 1));
    }
}