package com.dickjustice;

import java.util.Scanner;

/**
 * Created by Dima on 29.10.2017.
 */
public class Controller {
    // The Constants
    public static final String HELLO = "Hello";
    public static final String WORLD = "world!";

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setSentence(readSpecifiedWord(sc, HELLO));
        model.addWord(readSpecifiedWord(sc, WORLD));
        view.printMessage(model.getSentence());
    }

    // The Utility methods
    private String readSpecifiedWord(Scanner sc, String word) {
        view.printMessage(view.INPUT_WORD + "\"" + word + "\"");
        String inputWord;
        while(!(inputWord = sc.next()).equals(word)) {
            view.printMessage(view.WRONG_INPUT + view.INPUT_WORD + word);
        }
        return inputWord;
    }
}
