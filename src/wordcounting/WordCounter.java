package wordcounting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class WordCounter {
    boolean considerCase;

    public WordCounter(boolean considerCase) {
        this.considerCase = considerCase;
    }

    public HashSet<String> words(ArrayList<String> phrase) {
        HashSet<String> uniqueWords = new HashSet<String>();
        HashSet<String> uniqueWordsTmp = new HashSet<String>(); // Store lowerCsed words incase of not considerCase
        for (int i = 0; i < phrase.size(); i++) {
            String word = phrase.get(i);
            if (this.considerCase == false) {
                // Not considering Case
                if (!uniqueWordsTmp.contains(word.toLowerCase())) {
                    uniqueWords.add(word);
                    uniqueWordsTmp.add(word.toLowerCase());
                }
            } else {
                // Considering Case
                if (!uniqueWords.contains(word)) {
                    uniqueWords.add(word);
                }
            }
        }
        return uniqueWords;
    }

    public HashMap<String, Integer> count(ArrayList<String> phrase) {
        HashMap<String, Integer> uniqueWords = new HashMap<String, Integer>();
        HashSet<String> uniqueWordsTmp = new HashSet<String>(); // Store lowerCased words incase of not considerCase

        for (int i = 0; i < phrase.size(); i++) {
            String word = phrase.get(i);
            if (this.considerCase = false) {
                // Not Considering Case
                if (uniqueWordsTmp.contains(word.toLowerCase())) {
                    uniqueWords.put(word, uniqueWords.get(word) == null ? 0 : uniqueWords.get(word) + 1);
                    uniqueWordsTmp.add(word.toLowerCase());
                }
            } else {
                if (uniqueWords.containsKey(word)) {
                    uniqueWords.put(word, uniqueWords.get(word) == null ? 0 : uniqueWords.get(word) + 1);
                }
            }

        }
        return uniqueWords;
    }

}
