import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "good", "home", "java",
                "good", "dog", "cat",
                "dog", "good", "java",
                "home", "cake", "cake",
                "dog", "cat", "good"

        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        TelephoneBook telephoneBook = new TelephoneBook();

        telephoneBook.add("antonova", "646589");
        telephoneBook.add("antonova", "6258846");
        telephoneBook.add("dunaf", "681526");
        telephoneBook.add("dunaf", "672594");
        telephoneBook.add("dunaf", "627596");
        telephoneBook.add("popov", "635871");
        telephoneBook.add("popovich", "682562");

        System.out.println(telephoneBook.get("antonova"));
        System.out.println(telephoneBook.get("dunaf"));
        System.out.println(telephoneBook.get("popov"));
        System.out.println(telephoneBook.get("popovich"));
    }
}

