public class Main {
    public static void main(String[] args) {

        // criando objeto inv, usando Invoice, que recebe quatro parametros
        Invoice inv = new Invoice(1,"Caneta",-10,3.20f);
        System.out.println("Valor da fatura é " + inv.getInvoiceAmount());
    }
}