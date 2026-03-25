package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//criamos a class Aluno para definirmos como queremos que ela fique estruturada

public class Aluno {

//definir variaveis que serão usadas
    private String nome;
    private LocalDate dataNsc;
    private String email;

//definir construtor ( aqui definimos como queremos que *Aluno* fique estruturado
    public Aluno(String nome, LocalDate dataNsc, String email) {
        this.nome = nome;
        this.dataNsc = dataNsc;
        this.email = email;
    }
//metodos getters
    public String getNome() {
        return nome;
    }

    public LocalDate getDataNsc() {
        return dataNsc;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "nome: "+nome +
                "\nData de Nascimento: "+dataNsc +
                "\nEmail do Aluno: "+email;
    }
}
