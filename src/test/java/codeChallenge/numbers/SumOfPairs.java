package codeChallenge.numbers;

/*Problem: Print out the pairs of numbers that equal to the sum "X"
Example: (123456789: 4) =>1,3   (123456789: 6) =>1,5; 2,4*/


import java.util.Scanner;

public class SumOfPairs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String pairs = input.nextLine();
        System.out.println("Enter the sum: ");
        int sum = input.nextInt();
        input.close();

        StringBuilder number = new StringBuilder();
        String[] values = pairs.split("");

        for (int i = 0; i < values.length - 1; ++i) {
            for (int j = i + 1; j < values.length; ++j) {
                if (sum == Integer.parseInt(values[i]) + Integer.parseInt(values[j])) {
                    number.append(values[i]).append(",").append(values[j]).append("; ");
                }
            }
        }
        //1,1;

        if (number.length() > 1) {
            number.deleteCharAt(number.length() - 2);  // Удаляем "; " в конце строки
            System.out.println(number);
        } else {
            System.out.println("null");
        }
    }
}
