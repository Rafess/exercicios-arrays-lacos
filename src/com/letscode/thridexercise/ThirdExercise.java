package com.letscode.thridexercise;

import static utils.Printer.*;
import static utils.Reader.scan;

// Escreva um programa que lê 5 números. Ao final, escreva primeiros todos os ímpares, depois todos os pares.
public class ThirdExercise {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i <= 4; i++) {
            printString("Insira um número: ");
            numbers[i] = scan.nextInt();
        }
        printOddNumbers(numbers);
        printEvenNumbers(numbers);
    }
    private static void printOddNumbers(int[] array) {
        for (int item : array){
            if(item % 2 != 0) {
                printNumber(item);
            }
        }
    }
    private static void printEvenNumbers(int[] array) {
        for(int item : array) {
            if(item % 2 == 0) {
                printNumber(item);
            }
        }
    }
}
