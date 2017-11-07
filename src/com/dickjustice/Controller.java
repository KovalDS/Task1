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

        model.setSentence(readFirstWord(sc));
        model.addWord(readSecondWord(sc));
        view.printMessage(model.getSentence());
    }

    // The Utility methods
    private String readFirstWord(Scanner sc) {
        view.printMessage(view.INPUT_FIRST_WORD);
        String word;
        while(!(word = sc.next()).equals(HELLO)) {
            view.printMessage(view.WRONG_INPUT + view.INPUT_FIRST_WORD);
        }
        return word;
    }

    private String readSecondWord(Scanner sc) {
        view.printMessage(view.INPUT_SECOND_WORD);
        String word;
        while(!(word = sc.next()).equals(WORLD)) {
            view.printMessage(view.WRONG_INPUT + view.INPUT_SECOND_WORD);
        }
        return word;
    }
}
