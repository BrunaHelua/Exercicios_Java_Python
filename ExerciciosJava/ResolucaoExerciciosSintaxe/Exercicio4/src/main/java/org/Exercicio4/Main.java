package org.Exercicio4;

import java.util.Scanner;

public class Main {
    static float calcularSalarioFinal(float totalVendas, float salarioFixo){
        return totalVendas * 0.15f + salarioFixo;
    }
    public static void main(String[] args) {
        //Exercicio 4 — Escreva o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
        //por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre as suas vendas
        //efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
        String nome;
        float salarioFixo;
        float totalVendas;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor");
        nome = leitor.nextLine();

        System.out.println("Digite o salario fixo do vendedor");
        salarioFixo = leitor.nextFloat();

        System.out.println("Digite o total em vendas do vendedor");
        totalVendas = leitor.nextFloat();

        System.out.println("Funcionario " + nome + " recebe o salario fixo de " +
                salarioFixo+ " e o salario final de " + calcularSalarioFinal(totalVendas, salarioFixo));







    }
}