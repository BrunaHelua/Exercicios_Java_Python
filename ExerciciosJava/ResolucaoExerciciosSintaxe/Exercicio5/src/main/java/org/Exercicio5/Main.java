package org.Exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
        //No finalinformar o nome do aluno e a sua média (aritmética);

        float nota1, nota2, nota3;
        String nome;
        Scanner leitor = new Scanner(System.in);

        //Leitura do nome do aluno
        System.out.println("Digite o nome de um aluno: ");
        nome = leitor.nextLine();

        //Leitura das notas do aluno
        System.out.println("Digite as notas do aluno " + nome + ": ");
        nota1 = leitor.nextFloat();
        nota2 = leitor.nextFloat();
        nota3 = leitor.nextFloat();

        //Informa o nome do aluno e a média das provas
        System.out.println("O aluno " + nome + " tem média de " + (nota2 + nota1 + nota3)/3);

        leitor.close();

    }
}