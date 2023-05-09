import java.util.Date;

public class Vendedor extends Funcionario{

    // atributos exclusivos do Vendedor
    private int totalItensVendidos;
    private float comissaoPorItem;

    // ao herdar Funcionario, precisa alterar o construtor
    public Vendedor(){
    // usar super(); vai poder usar métodos do Funcionario
        // (superior à classe vendedor)
    // ao declarar um objeto Vendedor
        //this.atributo da propria classe
        //super garante coisas do Funcionario
        super();
    }
    public float calcularSalario(){
    return super.getSalario() + (this.comissaoPorItem*comissaoPorItem);
    }
    // métodos acessores


    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
}
