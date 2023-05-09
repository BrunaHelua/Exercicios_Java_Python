package Exercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
        //dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares
        //disponíveis com o usuário;


        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a cotacao do dolar para real: ");
        float cotacaoDolarParaReal = leitor.nextFloat();


        System.out.println("Digite o valor em dolares (US$) a ser convertido ");
        float dolar = leitor.nextFloat();

        System.out.println("O valor convertido é igual a R$" + (dolar * cotacaoDolarParaReal));



    }
}