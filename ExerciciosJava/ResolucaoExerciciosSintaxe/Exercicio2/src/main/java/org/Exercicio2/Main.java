package org.Exercicio2;

import java.util.Scanner;

public class Main {
    static float somar(float a, float b){
        return a + b;
    }

    static float subtrair(float a, float b){
        return a - b;
    }

    static float dividir(float a, float b){
        Scanner leitor1 = new Scanner(System.in);
        while (b == 0){
            System.out.println("Digite um denominador diferente de zero");
            b = leitor1.nextFloat();
        }
        leitor1.close();
        return a / b;
    }

    static float multiplicar(float a, float b){
        return a * b;
    }

    public static void main(String[] args) {
        float b;
        float a;
        // receba dois números e exiba soma, multiplicação, divisão, subtração
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite os números:");
        a = leitor.nextFloat();
        b = leitor.nextFloat();

        System.out.println("Soma " +somar(a, b));
        System.out.println("Subtração "+subtrair(a, b));
        System.out.println("Divisão " + dividir(a, b));
        System.out.println("Multiplicação "+ multiplicar(a, b));


        leitor.close();

    }
}