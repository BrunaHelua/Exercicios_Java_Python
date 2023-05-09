package org.Exercicio3;

import java.util.Scanner;

public class Main {
    static float consumoMedio(float totalCombustivel, float distanciaPercorrida){
        Scanner leitor1 = new Scanner(System.in);
        while (totalCombustivel == 0){
            System.out.println("Digite total de combustível diferente de zero");
            totalCombustivel = leitor1.nextFloat();
        }
        leitor1.close();
        return distanciaPercorrida/totalCombustivel;
    }

    public static void main(String[] args) {
        //Exercicio 3 -  consumo médio de um automóvel dada distância
        //total percorrida pelo automóvel e o total de combustível gasto;

        float totalCombustivel;
        float distanciaPercorrida;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o total de combustivel consumido");
        totalCombustivel = leitor.nextFloat();

        System.out.println("Digite a distancia percorrida");
        distanciaPercorrida = leitor.nextFloat();

        System.out.println("O consumo médio é " + consumoMedio(totalCombustivel, distanciaPercorrida) + " km / L");

        leitor.close();
    }
}