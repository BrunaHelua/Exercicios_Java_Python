public class Pessoa {
    //Atributos privados à classe que pertencem
    private float peso;
    private float altura;

    // Metodo construtor tem mesmo nome da classe
    // pode receber parâmetros, vão agir como default
    // ao definir um objeto Pessoa novo, precisa passar os parametros


    //Pode definir o construtor sem parametros ou com
    // importante definir
    public Pessoa(float peso, float altura){
        //System.out.println("Executando método construtor");
        //this.Atributo/variavel recebe o valor do parametro
        // que o construtor recebe
        this.peso = peso;
        this.altura = altura;
    }

    public float calcularIMC(){

        float imc = (float) (peso / Math.pow(altura, 2));
        float imc2 = peso / (altura*altura);
        System.out.println(imc2);
        return imc;
    }
                            /*Métodos acessores - validação de dados*/
    // método para permitir manipular dados usando o atributo peso
    public void setPeso(float peso){
        this.peso = peso;
    // retorna o atributo peso quando solicitado
    }
    public float getPeso() {
        return peso;
    }

    // método para permitir manipular dados usando o atributo altura
    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

}
