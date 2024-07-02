package codeChallenge.strings;

public class StringCompresser
{

    /**
     * Given a string of one or more letters a-z,A-Z write a class with a method that will reduce the size of the string by
     * replacing consecutive letters that are the same with count of letters removed and the letter.
     *
     * So given:  `abcfaaafffwwwwAAAAoOoOOO` (24 characters)
     *
     * The result would be: `abcf3a3f4w4AoOo3O` (17 characters)
     *
     * @param input The given String of letters.
     * @return The compressed String of letters.
     */
    public static String compress(final String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        int count = 1;
        char currentChar = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                if (count > 1) {
                    result.append(count);
                }
                result.append(currentChar);
                currentChar = input.charAt(i);
                count = 1;
            }
        }

        if (count > 1) {
            result.append(count);
        }
        result.append(currentChar);

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("abcfaaafffwwwwAAAAoOoOOO")); // Output: abcf3a3f4w4AoOo3O
    }
}
