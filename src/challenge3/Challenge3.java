package challenge3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge3 {

  public  static int anagrams(String phrase) {

        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < phrase.length(); i++) {
            for (int j = i; j < phrase.length(); j++) {
                char[] substrings = phrase.substring(i, j + 1).toCharArray();
                Arrays.sort(substrings);
                String newPhrase = new String(substrings);

                if (hashMap.containsKey(newPhrase)) {
                    hashMap.put(newPhrase, hashMap.get(newPhrase) + 1);
                } else {
                    hashMap.put(newPhrase, 1);
                }
            }
        }
        int anagramPairs = 0;
        for (String newPhrase : hashMap.keySet()) {
            int i = hashMap.get(newPhrase);
            anagramPairs += (i * (i - 1)) / 2;
        }
        return anagramPairs;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a sentence: ");
        String phrase = scanner.next();

        System.out.print(anagrams(phrase) + " possible anagrams");

    }
}
