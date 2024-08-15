package codeChallenge.strings;
/*
Defenition: Permutation is the action of changing the arrangement of a characters.
Problem: Write a program which will print all permutations of a string.
Example: abc=> abc, acb, bac, bca, cab, cba*/

/*
Определение: Перестановка — это действие по изменению порядка символов.
Задача: Напишите программу, которая будет выводить все перестановки строки.
Пример: abc => abc, acb, bac, bca, cab, cba
*/


import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = input.nextLine();
        input.close();
        char[] chars = string.toCharArray();

        int number = chars.length;
        int[] array = new int[number];
        int item  =0;
        for (int i = 0; i <Math.pow(number, number) ; i++) {
            item =0;
            while (item<number){
                System.out.print(chars[array[item]]+"");
                item++;

            }
            System.out.print(", ");
            item=0;
            while (item<number){
                if(array[item]<number-1){
                    array[item]++;
                    break;
                }else {
                    array[item]=0;
                }
                item++;
            }
            }
        }


//    public class Main {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter the string: ");
//            String string = input.nextLine();
//            input.close();
//
//            generatePermutations(string.toCharArray(), 0, string.length() - 1);
//        }
//
//        private static void generatePermutations(char[] chars, int start, int end) {
//            if (start == end) {
//                System.out.println(new String(chars));
//            } else {
//                for (int i = start; i <= end; i++) {
//                    swap(chars, start, i);
//                    generatePermutations(chars, start + 1, end);
//                    swap(chars, start, i); // backtrack
//                }
//            }
//        }
//
//        private static void swap(char[] chars, int i, int j) {
//            char temp = chars[i];
//            chars[i] = chars[j];
//            chars[j] = temp;
//        }
//    }
    }


