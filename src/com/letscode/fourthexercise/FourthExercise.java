package com.letscode.fourthexercise;

import static utils.Printer.*;
import static utils.Reader.scan;

// Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.
public class FourthExercise {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i <= 4; i++) {
            printString("Insira um número: ");
            numbers[i] = scan.nextInt();
        }
        findHigherNumber(numbers);
        findLessNumber(numbers);

        numberAverage(numbers);

    }

    private static void findHigherNumber(int[] array) {
        int higherNumber = 0;
        for (int item : array) {
            if (item > higherNumber) {
                higherNumber = item;
            }
        }
        printLine("O maior valor da lista é: ");
        printNumber(higherNumber);

    }
    private static void findLessNumber(int[] array) {
        int lessNumber = array[0];
        for(int item : array) {
            if (item < lessNumber) {
                lessNumber = item;
            }
        }
        printLine("O menor valor da lista é: ");
        printNumber(lessNumber);
    }
    private static void numberAverage(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        int average = (total) / numbers.length;
        printLine("A média de valores é: ");
        printNumber(average);
    }
    }


