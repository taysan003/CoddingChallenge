package codeChallenge.numbers;

public class Swap
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        a = a + b; // a becomes 30
        b = a - b; // b becomes 10 (original value of a)
        a = a - b; // a becomes 20 (original value of b)

        System.out.println(a);
        System.out.println(b);
    }
}
