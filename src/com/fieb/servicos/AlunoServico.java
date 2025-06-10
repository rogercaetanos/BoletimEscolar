package com.fieb.servicos;

import com.fieb.classes.Aluno;
import com.fieb.util.RecursosUteis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoServico {



    public static void cadastrarAluno(List<Aluno> alunos) {

        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Digite o id do aluno: ");
        aluno.setId(scanner.nextLong());
        scanner.nextLine();
        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(scanner.nextLine());
        System.out.println("Digite o cpf do aluno: ");
        aluno.setCpf(scanner.nextLine());
        System.out.println("Digite a data de nascimento do aluno: dd/MM/yyyy");
        String dataString = scanner.nextLine();
        aluno.setDataNascimento(RecursosUteis.transformStringToLocalDate(dataString, "dd/MM/yyyy"));
        System.out.println("Digite o email do aluno: ");
        aluno.setEmail(scanner.nextLine());
        System.out.println("Digite o telefone do aluno: ");
        aluno.setTelefone(scanner.nextLine());
        System.out.println("Digite o logradouro do aluno: ");
        aluno.setLogradouro(scanner.nextLine());
        System.out.println("Digite o bairro do aluno: ");
        aluno.setBairro(scanner.nextLine());
        System.out.println("Digite o cidade do aluno: ");
        aluno.setCidade(scanner.nextLine());
        System.out.println("Digite o estado do aluno: Ex: SP");
        aluno.setUf(scanner.nextLine());
        alunos.add(aluno);

    }

    public static void listarAlunos(List<Aluno> alunos) {
        for(Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Cpf: " + aluno.getCpf());
            System.out.println("Dt Nas:" + aluno.getDataNascimento());
            System.out.println("Email: " + aluno.getEmail());
            System.out.println("-----------------------------");
        }
    }


}
