package com.letscode.secondexercise;

import static utils.Printer.printLine;
import static utils.Printer.printString;
import static utils.Reader.scan;

// Escreva um programa que lê uma palavra e a escreve de volta ao contrário.
public class secondExercise {
    public static void main(String[] args) {
        printString("Digite uma palavra: ");
        String word = scan.next();
        char[] charWord = word.toCharArray();
        String invertedWord = "";
        for (int i = charWord.length - 1; i >= 0; i--) {
            invertedWord += charWord[i];
        }
        printLine("A sua palavra ao contrario é:");
        printLine(invertedWord);
    }
}
