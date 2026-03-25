package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner sc1 = new Scanner(System.in);
            ArrayList<Aluno> alunos = new ArrayList<>();

            while(true){
            System.out.println("""
                    1 - Cadastrar Aluno
                    2 - Listar Alunos
                    3 - Sair
                    """);
            int opcao = sc1.nextInt();

            switch (opcao) {
                case 1:
                    alunos.add(CadastrarAluno.cadastrarAluno());
                    break;
                case 2:
                    ListarAlunos.Listar(alunos);
                    break;
                case 3:
                    System.out.println("Saindo... ");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        // chamando cadastro de aluno
//    Aluno aluno = CadastrarAluno.cadastrarAluno();
//    System.out.println("Aluno cadastrado com sucesso: ");
//    System.out.println(aluno);


    }

}