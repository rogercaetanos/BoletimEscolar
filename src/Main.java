import com.fieb.classes.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    // List e ArrayList: suporte a coleção de dados - usadas para armazenar
    // e manipular grupos de elementos especialmente quando a quantidade de itens pode
    // variar dinamicamente.
    // List -> Interface
    // ArrayList -> Classe, implementação concreta da interface List, baseada em um array redimensionável (flexível)
    // static -> Definição de atributo de Classe, ou seja, acessamos o seu valor sem a necessidade de criar objeto.

    static List<Aluno> alunos = new ArrayList<Aluno>();
    static List<Curso> cursos = new ArrayList<Curso>();


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;
       do {
           System.out.println("Digite 1 para cadastro de aluno");
           System.out.println("Digite 2 para cadastro de curso");
           System.out.println("Digite 3 para listar os alunos");
           System.out.println("Digite 0 para sair do programa");
           opcao = scanner.nextInt();
           switch (opcao) {
               case 1:
                   System.out.println(" ### Cadastrando aluno ### ");
                   cadastrarAluno();
                   break;
               case 2:
                   System.out.println(" ### Cadastrando curso ### ");
                   cadastrarCurso();
                   break;
               case 3:
                   System.out.println(" ### Lista do alunos cadastrados ### ");
                   listarAlunos();
               break;
               case 0:
               System.out.println("Saindo... ");
           }
       } while(opcao != 0);

    }

    private static void cadastrarAluno() {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(scanner.nextLine());
        System.out.println("Digite o cpf do aluno: ");
        aluno.setCpf(scanner.nextLine());
        System.out.println("Digite a data de nascimento do aluno: dd/MM/yyyy");
        String dataString = scanner.nextLine();
        aluno.setDataNascimento(transformStringToLocalDate(dataString, "dd/MM/yyyy"));
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


    private static void cadastrarCurso() {

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

    private static void listarAlunos() {
        for(Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Cpf: " + aluno.getCpf());
            System.out.println("Dt Nas:" + aluno.getDataNascimento());
            System.out.println("Email: " + aluno.getEmail());
            System.out.println("-----------------------------");
        }
    }



    private static LocalDate  transformStringToLocalDate(String dataString, String formato) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        LocalDate data = null;
        try {
             data = LocalDate.parse(dataString, formatter);
            return data;
         } catch (Exception e) {
            System.out.println("Formato inválido. Tente novamente com dd/MM/yyyy");
        }
        return data;
    }



}