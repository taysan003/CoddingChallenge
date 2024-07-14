package codeChallenge.numbers;

/*Factorial function (symbol:!) means to multiply a series of descending natural numbers.
Example: 5!=120(5*4*3*2*1)
Problem: Write a Java program for factorial of a given number: 6*/

/* Функция факториала (символ:!) означает умножение ряда убывающих натуральных чисел.
Пример: 5! = 120 (5 * 4 * 3 * 2 * 1)
Задача: Напишите Java-программу для вычисления факториала заданного числа: 6 */

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        for (int i = number-1; i > 0 ; i--) {
            number = number*i;
        }

        System.out.println(number);
    }
}
