package org.example;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PessoaInfo {
    //Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
    //altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir
    //todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
    //LocalDate Represents a date (year, month, day (yyyy-MM-dd))
    //LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
    //LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
    //DateTimeFormatter	Formatter for displaying and parsing date-time objects
    //LocalDate myObj = LocalDate.now(); // Create a date object
    //    System.out.println(myObj); // Display the current date
    //LocalDateTime myDateObj = LocalDateTime.now();
    //    System.out.println("Before formatting: " + myDateObj);
    //    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    //
    //    String formattedDate = myDateObj.format(myFormatObj);
    //    System.out.println("After formatting: " + formattedDate);
    //The "T" in the example above is used to separate the date from the time. You can use the DateTimeFormatter class
    // with the ofPattern() method in the same package to format or parse date-time objects. The following example will
    // remove both the "T" and nanoseconds from the date-time:

    private String nome;
    private float altura;
    private Date dataNascimento;

    public PessoaInfo(String nome, float altura, Date dataNascimento) {
        this.nome = nome;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
    }

    public int calcularIdade(Date dataNascimento){
        int idade = 0;
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
