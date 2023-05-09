package org.exerciciosintaxe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem juros. Faça um
        //algoritmo que receba um valor de uma compra e mostre o valor das prestações;

        float valorCompra;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor total da compra a ser parcelada");
        valorCompra = leitor.nextFloat();

        System.out.println("O valor de cada parcela será de " +(valorCompra/5f));



    }
}