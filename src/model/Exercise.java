package model;

import java.util.List;

/**
 * A tesztfeladatsor tárolására szolgáló osztály
 * @author Márta Krisztián
 * @since 2022-07-01
 * @version 1.0
 */
public class Exercise {
    private int wordsNumber;
    private List<Word> wordsList;

    public Exercise(int wordsNumber, List<Word> wordsList) {
        this.wordsNumber = wordsNumber;
        this.wordsList = wordsList;
    }

    public int getWordsNumber() {
        return wordsNumber;
    }

    public List<Word> getWordsList() {
        return wordsList;
    }

    public void setWordsList(List<Word> wordsList) {
        this.wordsList = wordsList;
    }
}
