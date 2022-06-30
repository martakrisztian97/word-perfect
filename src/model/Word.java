package model;

/**
 * Alkalmazás kezdő képernyője
 * @author Márta Krisztián
 * @since 2022-06-30
 * @version 1.0
 */
public class Word {
    private String english;
    private String hungarian;

    public Word(String english, String hungarian) {
        this.english = english;
        this.hungarian = hungarian;
    }

    public String getEnglish() {
        return english;
    }

    public String getHungarian() {
        return hungarian;
    }    
}
