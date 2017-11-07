package com.dickjustice;

/**
 * Created by Dima on 29.10.2017.
 */
public class Model {
    private String sentence;

    public void addWord(String word) {
        this.sentence +=" " + word;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }
}
