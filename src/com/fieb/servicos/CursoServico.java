package com.fieb.servicos;
import com.fieb.classes.Curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CursoServico {



    public static void cadastrarCurso(List<Curso> cursos) {

        Scanner scanner = new Scanner(System.in);
        Curso curso = new Curso();
        System.out.println("Digite o nome do curso: ");
        curso.setNome(scanner.nextLine());
        System.out.println("Digite a descrição do curso");
        curso.setDescricao(scanner.nextLine());
        System.out.println("Digite a duração do curso: ");
        curso.setDuracao(scanner.nextLine());
        cursos.add(curso);

    }

    public static void listarCursos(List<Curso> cursos) {
        for(Curso curso : cursos) {
            System.out.println("Nome: " + curso.getNome());
            System.out.println("Descricão: " + curso.getDescricao());
            System.out.println("Duração:" + curso.getDuracao());
            System.out.println("-----------------------------");
        }
    }


}
