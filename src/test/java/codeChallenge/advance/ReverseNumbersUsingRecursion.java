package codeChallenge.advance;

/*Problem: Write a program which will print reverse of given numbers using recursion.
Example: 123456789=> 987654321*/

import java.util.Scanner;



    public class ReverseNumbersUsingRecursion {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int number = input.nextInt();  // Используем int вместо long
            input.close();
            int length = String.valueOf(number).length();
            int[] numbers = new int[length];

            // Используем for-loop для разбиения числа на цифры
            for (int i = length - 1; number > 0; i--) {
                numbers[i] = number % 10;
                number /= 10;
            }

            // Печать массива цифр
            for (int t : numbers) {
                System.out.print(t);
            }
            System.out.println();

            reverse(numbers, 0);
        }

        // Метод reverse для печати цифр в обратном порядке
        private static void reverse(int[] numbers, int index) {
            if (index < numbers.length) {
                reverse(numbers, index + 1);
                System.out.print(numbers[index]);
            }
        }
    }


