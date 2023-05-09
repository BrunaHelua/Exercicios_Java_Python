package org.example;

public class ContaCorrente {
    // Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
    // número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
    // saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios
    int numeroConta;
    String nome;
    float saldo = 0f;

    public ContaCorrente(int numeroConta, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String alterarNome(String nome){

    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if(numeroConta < 0){

        }else{

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
