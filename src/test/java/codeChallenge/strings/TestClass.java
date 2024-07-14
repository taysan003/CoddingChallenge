package codeChallenge.strings;


/*Pefect Numbers is a positive integer  that is equal  to the sum of its proper divisors (6 =>1+2+3)
Example: 6, 28, 496, 8128, 33_550_336

Problem: Print out perfect numbers up to given number: 10000*/


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static codeChallenge.collections.PiToArray.getPi;
import static codeChallenge.collections.PiToArray.setPi;

public class TestClass
{
    public static void main(String[] args)
    {
      List<Integer> list = new ArrayList<>();
      Scanner scanner = new Scanner(System.in);

      while (scanner.hasNextInt()) {
          list.add(scanner.nextInt());
      }
      scanner.close();

        System.out.println(getMax(list));
        System.out.println(getMin(list));
    }

    public  static int getMax(List<Integer> list) {
        Integer max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size() ; i++)
        {
            if (list.get(i)>max) {
                max = list.get(i);
            }

        }

        return max;
    }

    public  static int getMin(List<Integer> list) {
        Integer min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size() ; i++)
        {
            if (list.get(i)<min) {
                min = list.get(i);
            }

        }

        return min;
    }
}





