import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // declaração de objeto pessoa
        // declaracao é diferente de variável primitiva
        // TipoObjeto nomeVariavel = new TipoObjeto();
        // método construtor executado quando o objeto é chamado
        Pessoa objetoPessoa = new Pessoa(70.0f, 1.70f);
        float peso, altura;

        Scanner leitor = new Scanner(System.in);
        // pelo princípio do encapsulamento, a classe Pessoa gerencia seus atributos
        // portanto é preciso definir métodos de acesso para seus atributos
        // getters and setters
        //setters para a classe receber um valor diferente
        System.out.println("Digite o peso da pessoa");
        objetoPessoa.setPeso(leitor.nextFloat());

        System.out.println("Digite a altura da pessoa");
        objetoPessoa.setAltura(leitor.nextFloat());


        System.out.println("IMC é: " + objetoPessoa.calcularIMC());
        leitor.close();

    }
}