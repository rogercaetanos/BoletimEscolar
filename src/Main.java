import com.fieb.classes.*;

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



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;
       do {
           System.out.println("Digite 1 para cadastro de aluno");
           System.out.println("Digite 2 para cadastro de curso");
           System.out.println("Digite 0 para sair do programa");
           opcao = scanner.nextInt();
           switch (opcao) {
               case 1:
                   System.out.println(" ### Cadastrando aluno ### ");
                   cadastrarAluno();
                   break;
                   case 2:
                       System.out.println(" ### Cadastrando curso ### ");
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
        alunos.add(aluno);
    }

}