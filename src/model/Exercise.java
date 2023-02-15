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
    private List<String> termsList;
    private List<String> definitionsList;

    public Exercise(int wordsNumber, List<String> termsList, List<String> definitionsList) {
        this.wordsNumber = wordsNumber;
        this.termsList = termsList;
        this.definitionsList = definitionsList;
    }

    public int getWordsNumber() {
        return wordsNumber;
    }

    public List<String> getTermsList() {
        return termsList;
    }

    public List<String> getDefinitionsList() {
        return definitionsList;
    }
}
