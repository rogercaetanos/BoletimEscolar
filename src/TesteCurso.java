import com.fieb.classes.Curso;

public class TesteCurso {

    public static void main(String[] args) {
        // Trabalhando com construtores

        //  Curso curso = new Curso(); Erro: a classe não tem mais o construtor padrão

        Curso curso = new Curso("Html 5", "Curso de Html 5 básico");

        // Após a recriação do construtor padrão....
        Curso curso2 = new Curso();
    }
}
