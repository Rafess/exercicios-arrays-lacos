package com.letscode.seventhexercise;

import static utils.Printer.*;
import static utils.Reader.scan;

// Escreva um programa que lê nome e idade de 5 pessoas e
// ao final informa quem é o mais novo, o mais velho e qual a média de idade.
public class SeventhExercise {
    static  int youngest;
    static String youngestName;
    static int oldest;
    static String oldestName;
    public static void main(String[] args) {
        String[] names = new String[5];
        int[] ages = new int[5];
        for (int i = 0; i <= 4; i++) {
            printString("Adicione uma pessoa: ");
            names[i] = scan.next();
            printString("Qual a idade dela? ");
            ages[i] = scan.nextInt();
        }
        findOldestPerson(ages, names);
        findYoungestPerson(ages, names);

        numberAverage(ages);

    }
    private static void findOldestPerson(int[] ageArray, String[] nameList) {
        oldest = ageArray[0];
        oldestName = nameList[0];
        for(int i = 1; i < ageArray.length; i++) {
            if (ageArray[i] > oldest) {
                oldest = ageArray[i];
                oldestName = nameList[i];
            }
        }
        printLine("A pessoa mais velha da lista é: ");
        printLine(oldestName);

    }
    private static void findYoungestPerson(int[] ageArray, String[] nameList) {
        youngest = ageArray[0];
        youngestName = nameList[0];
        for(int i = 1; i < ageArray.length; i++) {
            if (ageArray[i] < youngest) {
                youngest = ageArray[i];
                youngestName = nameList[i];
            }
        }
        printLine("A pessoa mais nova da lista é: ");
        printLine(youngestName);
    }
    private static void numberAverage(int[] ages) {
        int total = 0;
        for (int age : ages) {
            total += age;
        }
        int average = (total) / ages.length;
        printLine("A média de idade é: ");
        printNumber(average);
    }
}
