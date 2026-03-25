package org.example;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class CadastrarAluno {

    public static Aluno cadastrarAluno(){

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNsc = null;

        System.out.println("Cadastrando Aluno");

        System.out.println("Digite o nome do Aluno: ");
        String nome = sc.nextLine();

        // add data de nascimento do aluno ja tratando erro de usuario
        while (dataNsc == null) {
            try {
                System.out.println("Digite a data de nascimento do Aluno ( dd/MM/yyyy ): ");
                dataNsc = LocalDate.parse(sc.nextLine(), dtf);
            } catch (Exception e) {
                System.out.println("Data de nascimento inválida! \n Tente novamente");
            }
        }


        System.out.println("Digite o email do Aluno: ");
        String email = sc.nextLine();
        return new Aluno(nome,  dataNsc, email);
    }

}
