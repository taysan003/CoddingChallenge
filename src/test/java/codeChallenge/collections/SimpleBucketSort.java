package codeChallenge.collections;

/*Defenition: Bucket sort is a comparsion sort algorithm that operates on elements by dividing them
into different buckets and then sorting these buckets individually.
Each bucket is sorted individually using a separate sorting algorithm.
Problem: Write a program which acceptes a numbers and sort them in ascending order. */
/* Определение: Сортировка с помощью корзин (Bucket sort) — это алгоритм сортировки сравнениями, который работает с элементами,
 разделяя их на разные корзины, а затем сортируя каждую корзину отдельно.
Каждая корзина сортируется отдельно с использованием отдельного алгоритма сортировки.
Задача: Написать программу, которая принимает числа и сортирует их в порядке возрастания. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SimpleBucketSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers (non-integer to stop):");
        while (input.hasNextInt()) {
            list.add(input.nextInt());
        }
        input.close();

        int index = 0;
        Integer[] array = list.toArray(new Integer[list.size()]); // size 5 and max value 10
        int max = maxValue(array);
        int[] bucket = new int[max + 1]; //10+1=11

        // Initialize the bucket array to 0
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }

        // Count the occurrences of each number
        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }

        // Populate the sorted array based on the bucket counts
        for (int i = 0; i < bucket.length; i++) {
            while (bucket[i] > 0) {
                array[index++] = i;
                bucket[i]--;
            }
        }

        // Convert the array back to a list
        list = Arrays.asList(array);
        System.out.println("Sorted numbers: " + list);
    }

    private static int maxValue(Integer[] a) {
        int maxValue = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }
        }
        return maxValue;
    }


}
