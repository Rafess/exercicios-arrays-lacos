package com.letscode.firstexercise;

import static utils.Printer.printLine;
import static utils.Printer.printString;
import static utils.Reader.scan;
// Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras.
// Ao final da entrada dos 5 itens, exiba a lista completa.
public class FirstExercise {
    public static void main(String[] args) {
        String[] fruits = new String[5];
        for (int i = 0; i <= 4; i++) {
            printString("Insira uma fruta: ");
            fruits[i] = scan.next();
        }
        printLine("As frutas no seu carrinho são:");
        for (int i = 0; i <= 4; i++) {
            printLine((i+1) + "-" + fruits[i]);
        }
    }
}

