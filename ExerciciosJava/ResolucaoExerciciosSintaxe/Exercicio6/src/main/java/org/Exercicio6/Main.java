package org.Exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a
        //possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
        //trocados;

        Scanner leitor = new Scanner(System.in);

        float a = leitor.nextFloat();
        float b = leitor.nextFloat();
        float c;
        System.out.println("O valor original de A: " + a + ". O valor original de B: " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("Valor novo de A: " + a + ". Valor novo de b: " + b);


        leitor.close();
    }
}