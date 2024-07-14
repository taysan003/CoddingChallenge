package codeChallenge.strings;

import java.util.Arrays;
import java.util.Scanner;

/*Defenition: 2 strings are called anagrams if they contain same set of charecters but in different order.
Example: Debit Card => Bad Credit*/
public class AnagramsOrNot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String first = input.nextLine();
        System.out.println("Enter the second string: ");
        String second = input.nextLine();
        input.close();

        System.out.println("The strings are "+ (anagram(first, second) ? "anogram": "not anogram"));
    }
//    public static  boolean anagram(String first, String second){
//        if(first.replaceAll("\\s", "").length()!=second.replaceAll("\\s", "").length()){
//            return false;
//        }
//        int count =0;
//        for (int i = 0; i <first.replaceAll("\\s", "").length() ; i++) {
//            count+= Math.pow(first.replaceAll("\\s", "").toLowerCase().charAt(i), 2);
//            count-= Math.pow(second.replaceAll("\\s", "").toLowerCase().charAt(i), 2);
//        }
//        return count ==0;
//    }

    public static boolean anagram(String first, String second) {
        // Убираем пробелы и приводим строки к нижнему регистру
        String cleanedFirst = first.replaceAll("\\s", "").toLowerCase();
        String cleanedSecond = second.replaceAll("\\s", "").toLowerCase();

        // Если длины строк не равны, то они не могут быть анаграммами
        if (cleanedFirst.length() != cleanedSecond.length()) {
            return false;
        }

        // Превращаем строки в массивы символов
        char[] firstArray = cleanedFirst.toCharArray();
        char[] secondArray = cleanedSecond.toCharArray();

        // Сортируем массивы
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        // Сравниваем отсортированные массивы
        return Arrays.equals(firstArray, secondArray);
    }
}
