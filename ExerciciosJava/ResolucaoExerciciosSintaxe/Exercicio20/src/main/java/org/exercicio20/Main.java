package org.exercicio20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalCarros = 0;
        float totalGeral = 0.0F;
        Scanner leitor = new Scanner(System.in);

        char resposta = 's';

        do {
            System.out.println("Digite o ano do carro");
            int anoVeiculo = leitor.nextInt();
            System.out.println("Digite o preço do carro");
            float precoNormal = leitor.nextFloat();
            float valorDesconto;
            if (anoVeiculo <= 2000) {
                totalGeral += 0.88F * precoNormal;
                valorDesconto = 0.12F * precoNormal;
                ++totalCarros;
                System.out.println("Valor do desconto: " + valorDesconto);
            } else {
                totalGeral += 0.93F * precoNormal;
                valorDesconto = 0.07F * precoNormal;
                System.out.println("Valor do desconto" + valorDesconto);
            }

            //try{
                System.out.println("Deseja continuar calculando descontos? S - Sim / N - Não");
                resposta = leitor.next().charAt(0);
            //}//catch ();
        } while(resposta == 's' || resposta == 'S');

        System.out.println("Total de carros até 2000 : " + totalCarros);
        System.out.println(" Valor total de todos os carros calculados é de " + totalGeral);
    }
}