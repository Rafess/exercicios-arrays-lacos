package com.letscode.sixtheercise;

import static utils.Printer.printString;
import static utils.Reader.scan;

// Escreva um programa que lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo.
public class SixthExercise {
    public static void main(String[] args) {
        printString("Digite seu nome: ");
        String name = scan.next();
        char[] charsName = name.toCharArray();
        String styledWord = "";

        for (int i = 0; i < charsName.length; i++) {
            if (i % 2 == 0) {
               charsName[i] = Character.toUpperCase(charsName[i]);
            }
        }
        styledWord = String.valueOf(charsName);
        System.out.println(styledWord);
    }
}
