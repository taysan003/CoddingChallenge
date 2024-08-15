package codeChallenge.numbers;


import java.util.*;

//Prime FActors of a positive integer are the prime numbers that divide that integer exactly
//Example: 99=>3*3*11
//12345
public class TestClass
{

    public static void main(String[] args)
    {
        List<Integer> array = Arrays.asList(1, 7, 3, 6, 9, 4, 8, 2);
       int sum = 10;

        for (int i = 0; i < array.size() ; i++)
        {
            for (int j = i+1; j < array.size() ; j++)
            {
                if (array.get(i) + array.get(j) == sum) {

                    System.out.println(array.get(i) +" : "+ array.get(j));
                }

            }

        }


    }


}







