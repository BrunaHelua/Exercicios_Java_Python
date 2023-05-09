package org.Exercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
        //preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de custo do produto");
        float valorCusto = leitor.nextFloat();

        System.out.println("Informe o percentual de acréscimo ao valor de custo");
        String percentualAcrescimo = leitor.next();

        //string.replaceAll(o que não for número "[^0-9]", substitui com nada"")
        float percentual  = Float.parseFloat(percentualAcrescimo.replaceAll("[^0-9]", ""));

        System.out.println("O valor de venda será de " + (valorCusto + valorCusto * percentual/100f));



    }
}