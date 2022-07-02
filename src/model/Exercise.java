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
    private String termLanguage;

    public Exercise(int wordsNumber, List<Word> wordsList, String termLanguage) {
        this.wordsNumber = wordsNumber;
        this.wordsList = wordsList;
        this.termLanguage = termLanguage;
    }

    public int getWordsNumber() {
        return wordsNumber;
    }

    public List<Word> getWordsList() {
        return wordsList;
    }

    public String getTermLanguage() {
        return termLanguage;
    }

    public void setWordsList(List<Word> wordsList) {
        this.wordsList = wordsList;
    }
}
