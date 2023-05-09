package org.Exercicio1;

import java.util.Scanner;

public class Main {
    static float soma(float a, float b) {
        return a + b;
    }


    public static void main(String[] args) {

        //Exercicio 1 - receba dois numeros e exiba soma

        float a, b;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite os numeros");
        a = leitor.nextFloat();
        b = leitor.nextFloat();
        System.out.println(soma(a,b));
        leitor.close();



    }
}
