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
        String str = scanner.nextLine();
        scanner.close();
        System.out.println(commperss(str));

    }

    private static String commperss(String input)
    {
        if(input==null || input.isEmpty()) {
            return input;
        }


        StringBuilder result = new StringBuilder();
        int count = 1;

        char currentChar = input.charAt(0);

        for (int i = 1; i <input.length() ; i++)
        {
            if (input.charAt(i) == currentChar) {
                count++;
            } else if (count>1) {
                result.append(count);

            }
            currentChar = input.charAt(i);
            count=1;

            if (count>1) {
                result.append(count);
            }
            result.append(currentChar);

        }

        return  result.toString();
    }
}


