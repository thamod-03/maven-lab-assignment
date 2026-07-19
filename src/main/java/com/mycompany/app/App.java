package com.mycompany.app;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println(colorize("Green Text", GREEN_TEXT()));
        System.out.println(colorize("Red on white", RED_TEXT(), WHITE_BACK()));
        System.out.println("Hello World!");
    }
}
