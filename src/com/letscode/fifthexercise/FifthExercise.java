package com.letscode.fifthexercise;

import static utils.Printer.printLine;
import static utils.Printer.printString;
import static utils.Reader.scan;

// Escreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados.
// Ao final, informe qual o nome mais longo presente na lista.
public class FifthExercise {
    public static char[] biggestWord;

    public static void main(String[] args) {
        String[] guestList = new String[5];
        for (int i = 0; i <= 4; i++) {
            printString("Insira o nome do convidado: ");
            guestList[i] = scan.next();
        }
        findBiggestWord(guestList);
    }

    private static void findBiggestWord(String[] array) {
        biggestWord = array[0].toCharArray();
        for(int i = 1; i < array.length; i++) {
            if(array[i].toCharArray().length > biggestWord.length) {
                biggestWord = array[i].toCharArray();
            }
        }
        printLine("O nome mais longo da lista é: " + String.valueOf(biggestWord));
    }

}
