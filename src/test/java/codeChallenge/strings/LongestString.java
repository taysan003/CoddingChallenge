package codeChallenge.strings;


import java.util.Scanner;

/*Problem: Write a program which will find the longest string.
Example: abc abcdef ab=> abcdef*/
public class LongestString {

//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the string: ");
//        String string = input.nextLine();
//        input.close();
//
//        System.out.println("The longest string: " + longest(string));
//
//    }
//
//    public static String longest(String str){
//        int maxLenth=0;
//        String longest = "";
//        String [] array = str.split("\\s");
//        for (String st: array) {
//            if(st.length()>maxLenth){
//                maxLenth=st.length();
//                longest=st;
//            }
//        }
//        return longest;
//    }


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();

        System.out.println(theLongest(string));


    }

    public static String theLongest(String str) {
        String longest = "";
        int maxLengh = 0;
        String[] array = str.split("\\s");
        for (String s : array) {
            if (s.length()>maxLengh) {
                longest = s;
                maxLengh = s.length();
            }
        }
        return longest;

    }























}
