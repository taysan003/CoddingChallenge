package codeChallenge.collections;

import java.util.*;

public class CollectionMatch
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements for c1 (type 'stop' to end):");
        Collection<String> c1 = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if ("stop".equalsIgnoreCase(input)) break;
            c1.add(input);
        }

        System.out.println("Enter elements for c2 (type 'stop' to end):");
        Collection<String> c2 = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if ("stop".equalsIgnoreCase(input)) break;
            c2.add(input);
        }

        Collection<String> c3 = collectionMatch(c1, c2);
        System.out.println("Matching elements: " + c3);
    }


        public static Collection<String> collectionMatch(Collection<String> c1, Collection<String> c2) {
            Collection<String> c3 = new ArrayList<>();

            Iterator<String> it1 = c1.iterator();
            while (it1.hasNext()) {
                String element = it1.next();
                if (c2.contains(element)) {
                    c3.add(element);
                }
            }

            return c3;
        }


}
