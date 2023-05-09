package org.Exercicio8;

import java.util.Scanner;

public class Main {

    //Função para calcular a conversao de Celsius para Fahrenheit
    static float converterTemperaturaCparaF(float c){
        return ( 9f * c + 160f) / 5f;

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
        //conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;

        System.out.println("Digite a temperatura em graus Celsius: ");
        Scanner leitor = new Scanner(System.in);

        //Leitura do valor digitado pelo usuário em Celsius
        float c = leitor.nextFloat();

        System.out.println("A temperatura de " + c + "°C é de " + converterTemperaturaCparaF(c) + "°F.");

        leitor.close();
    }
}