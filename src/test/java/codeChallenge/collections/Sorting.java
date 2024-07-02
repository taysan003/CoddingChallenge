package codeChallenge.collections;

/*Defenition: Counting sort is a sorting technique based on keys between a specific range.
It works by counting the number of objects having distinct kay values.
Problem: Write a program which accepts a number and sort them in ascending order.  */

//Определение: Сортировка подсчетом - это метод сортировки, основанный на ключах в определенном диапазоне.
//Она работает путем подсчета количества объектов с уникальными значениями ключей.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers (non-integer to stop):");
        String inputString = input.nextLine();
        input.close();

        // Convert the input string to individual digits
        for (char c : inputString.toCharArray()) {
            if (Character.isDigit(c)) {
                list.add(Character.getNumericValue(c));
            }
        }

        Integer[] listAsArray = list.toArray(new Integer[0]);
        List<Integer> listOut = Arrays.asList(countingSort(listAsArray));

        System.out.println("Sorted list: " + listOut);
    }

    private static Integer[] countingSort(Integer[] input) {
        if (input.length == 0) {
            return input;
        }

        // Find the smallest and the largest value
        int min = input[0];
        int max = input[0];

        for (int i = 1; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
            } else if (input[i] > max) {
                max = input[i];
            }
        }

        // Array of frequencies
        int[] counts = new int[max - min + 1];

        // Frequency initialization
        for (int i = 0; i < input.length; i++) {
            counts[input[i] - min]++;
        }

        // Create output array
        Integer[] output = new Integer[input.length];
        int index = 0;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                output[index++] = i + min;
                counts[i]--;
            }
        }

        return output;
    }
}
