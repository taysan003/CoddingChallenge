package codeChallenge.numbers;

/*Lucky number is a sum of its digits unil the last digit remains single.
Example: 777=>3(7+7+7=21 then 2 +1 = 3)
Problem: Write a program which will take a number and prints its lucky number.
Enter: 777
Number: 3*/

/*
Счастливое число — это сумма его цифр до тех пор, пока не останется одна цифра.
Пример: 777 => 3 (7 + 7 + 7 = 21, затем 2 + 1 = 3)
Задача: Напишите программу, которая будет принимать число и выводить его счастливое число.
Ввод: 777
Число: 3
*/


import java.util.Scanner;

public class LuckyNumber {

    public static int lucky (int number){
        int sum =0;
        while (number>0) {
           sum+=number%10;
           number/=10;
        }
        sum = (sum < 10) ? sum : lucky(sum); //Base case: Ternary operator =>false
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number  = input.nextInt();
        input.close();
        System.out.println("Lucky number is: " + lucky(number));
    }
}
