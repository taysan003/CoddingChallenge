package codeChallenge.numbers;

/*
Greatest Common Divisor of 2 or more integers, is the largest divisor common to the integers.
Example: 7, 42 =>7
Problem: Write a program which calculates GCD of two given numbers by using Euclids algorithm.
*/

/*
Наибольший общий делитель (НОД) двух или более целых чисел — это наибольшее число, на которое делятся эти числа.
Пример: 7, 42 => 7
Задача: Напишите программу, которая вычисляет НОД двух заданных чисел, используя алгоритм Евклида.
*/


import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int first = input.nextInt();
        System.out.println("Enter the second number ");
        int second = input.nextInt();
        System.out.println("GCD of "+ first +" and "+ second+ " = " + gcd(first, second));



    }                        //10 5
    public  static  int gcd(int first, int second){
        while (second!=0){
            int temp = second;
            second = first%second;
            first = temp;
        }
        return first;
    }
}
