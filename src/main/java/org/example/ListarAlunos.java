package org.example;

import java.util.ArrayList;

public class ListarAlunos {
        public static void Listar(ArrayList<Aluno> alunos){
        for(Aluno al : alunos){
            System.out.println("-------------------");
            System.out.println(al);
        }
    }
}
