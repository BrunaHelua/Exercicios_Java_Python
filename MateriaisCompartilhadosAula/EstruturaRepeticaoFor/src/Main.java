import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        Scanner leitor = new Scanner(System.in);
        // variavel i passa a ser de escopo global
        // pode-se usar em outros lugares além do for
        // usado no calculo das medias
        int i = 0;
        for (; i < 3; i++) {
            System.out.println("Digite o nome do produto");
            nomeProduto = leitor.next();

            System.out.println("Digite preco de custo");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite preco de venda");
            precoVenda = leitor.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto == precoVenda){
                System.out.println("Empate de precos");
            }else if (precoCusto > precoVenda) {
                float prejuizo = precoCusto - precoVenda;
                System.out.println("Houve prejuizo de " + prejuizo);
            }else {
                float lucro = precoVenda - precoCusto;
                System.out.println("Houve lucro de " + lucro);
            }
            System.out.println(nomeProduto + " possui custo de " + precoCusto + " e preco de venda de " + precoVenda);

        }
        System.out.println("Media de custo é " + totalCusto/i + " e a media do preço de venda é " + totalVenda/i);
        leitor.close();
    }
}