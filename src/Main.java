import com.fieb.classes.*;
import com.fieb.servicos.AlunoServico;
import com.fieb.servicos.CursoServico;
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
           System.out.println("Digite 4 para listar os cursos");
           System.out.println("Digite 0 para sair do programa");
           opcao = scanner.nextInt();
           switch (opcao) {
               case 1:
                   System.out.println(" ### Cadastrando aluno ### ");
                   try{
                       AlunoServico.cadastrarAluno(alunos);
                   }catch (Exception e){
                       System.out.println(e.getMessage());
                   }
                   break;
               case 2:
                   System.out.println(" ### Cadastrando curso ### ");
                   try {
                       CursoServico.cadastrarCurso(cursos);
                   }catch (Exception e){
                       System.out.println(e.getMessage());
                   }
                   break;
               case 3:
                   System.out.println(" ### Lista do alunos cadastrados ### ");
                   AlunoServico.listarAlunos(alunos);
               break;
               case 4:
                   System.out.println(" ### Lista do cursos cadastrados ### ");
                   CursoServico.listarCursos(cursos);
                   break;
               case 0:
               System.out.println("Saindo... ");
           }
       } while(opcao != 0);

    }
}