package com.letscode.eighthexercise;

import static utils.Printer.printLine;
import static utils.Printer.printString;
import static utils.Reader.scan;

// Escreva um programa que lê nome, altura e peso de 5 pessoas, calcula o IMC de cada um e
// ao final informa se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25).
public class EighthExercise {
    public static void main(String[] args){
        float[] heights = new float[5];
        float[] weights = new float[5];
        String[] names = new String[5];
        float[] peopleIMC = new float[5];
        for(int i = 0; i < 5; i++) {
            printString("Digite um nome: ");
            names[i] = scan.next();
            printString("Qual a altura dessa pessoa em metros? ");
            heights[i] = scan.nextFloat();
            printString(" Qual o peso dessa pessoa em quilogramas? ");
            weights[i] = scan.nextFloat();
        }
        calculateIMC(weights, heights, peopleIMC);
        seePeopleAboveIMC(peopleIMC, names);
    }
    private static void calculateIMC(float[] weights, float[] heights, float[] peopleIMC) {
        for(int i = 0; i < 5; i++){
           peopleIMC[i] = weights[i] / (heights[i] * heights[i]);
        }
    }
    private static void seePeopleAboveIMC(float[] peopleIMC, String[] names) {
        for (int i = 0; i < 5; i++) {
            if (peopleIMC[i] < 18.50f) {
                System.out.printf( names[i] + " está com o IMC abaixo do ideal(%.2f kg/m²) %n", peopleIMC[i]);
            } else if (peopleIMC[i] > 25) {
                System.out.printf( names[i] + " está com o IMC acima do ideal(%.2f kg/m²) %n", peopleIMC[i]);
            }

        }
    }
}
