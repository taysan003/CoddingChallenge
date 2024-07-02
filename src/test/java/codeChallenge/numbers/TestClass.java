package codeChallenge.numbers;


import java.util.Scanner;

//Prime FActors of a positive integer are the prime numbers that divide that integer exactly
//Example: 99=>3*3*11
//12345
public class TestClass
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int length = String.valueOf(number).length();

        int[] array = new int [length];

        for (int i = length-1; i >=0 ; i--)
        {
            array[i] = number%10;
            number/=10;
        }

        for (int i: array)
        {
            System.out.print(i);

        }

        getReverse(array, 0);
    }

    private static void getReverse(int[] array, int index)
    {
        if (index<array.length) {
            getReverse(array, index+1);
            System.out.print(array[index]);
        }

    }
}


