package rocks.zipcode.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {

    private String[] strings;

    public WordCounter(String... strings) {
        this.strings = strings;

    }


    public Map<String, Integer> getWordCountMap() {

        int count = 0;
        Map<String, Integer> wordList = new HashMap<>();
        for ( String string : strings ) {
            count++;
            wordList.put(string, count);

        }

        return wordList;
    }
}
