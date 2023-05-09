public class Invoice {
    // pode fazer validacao dos valores nos metodos acessores também
    // não precisa ser feito no metodo construtor
    // Classe recebe infos sobre compras e calcula valor da fatura
    private int codigoItem;
    private String descricaoItem;
    private int quantidadeComprada;
    private float precoUnitario;

    public Invoice(int codigoItem, String descricaoItem, int quantidadeComprada, float precoUnitario) {
        this.setCodigoItem(codigoItem);
        this.setDescricaoItem(descricaoItem);

        this.setPrecoUnitario(precoUnitario);
        this.setQuantidadeComprada(quantidadeComprada);

    }

    public double getInvoiceAmount(){
        System.out.println("A compra dos produtos de código " + codigoItem);
        return quantidadeComprada * precoUnitario;
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    // quando receber uma quantidade, vai testar para ver se é negativa
    public void setQuantidadeComprada(int quantidadeComprada) {
        if (quantidadeComprada < 0){
            this.quantidadeComprada = 0;
        }else {
            this.quantidadeComprada = quantidadeComprada;
        }
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    // quando receber um preco unitario, vai testar para ver se é negativa
    public void setPrecoUnitario(float precoUnitario) {
        if (precoUnitario < 0){
            this.precoUnitario = 0.0f;
        } else{
            this.precoUnitario = precoUnitario;
        }
    }


}
