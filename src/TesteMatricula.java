import com.fieb.classes.Matricula;

public class TesteMatricula {

    public static void main(String[] args) {

        // Criando uma matricula
        try {
            Matricula matricula = new Matricula();
            matricula.setNumeroMatricula("m9999");
            System.out.println("Número da matrícula: " + matricula.getNumeroMatricula());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
