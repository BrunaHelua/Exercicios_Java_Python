import java.util.Date;


public class Main {
    public static void main(String[] args) {

        Vendedor v = new Vendedor();
        v.setNome("Bruna");
        v.setSalario(1000.0f);
        v.setCpf("123465789");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);

        Motorista m = new Motorista();
        m.setNome("Matheus");
        m.setSalario(2000.0f);
        m.setCpf("987654321");
        m.setDataNascimento(new Date());
        System.out.println(m.getNome());
        }
}