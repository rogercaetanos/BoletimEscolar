import com.fieb.classes.Escola;

public class TesteEscola {

    public static void main(String[] args) {

        Escola escola = new Escola("Itb Brasílio Flores de Azevedo", "itb_belval@gmail.com", "1195641-9854");
        Escola escola2 = new Escola();
        escola2.setNome("Maria Sylvia Challupe Mello");
        escola2.setEmail("maria_sylvia@gmail.com");
        escola2.setLogradouro("Rua duque de caxias, 236");
        escola2.setBairro("Engenho Novo");
        escola2.setCidade("Barueri");
        escola2.setUf("SP");
        escola2.setTelefone("1195874-4516");

        // Mostrando as informações

        System.out.println("Escola 1 Nome: " + escola.getNome());
        System.out.println("Escola 1 Email: " + escola.getEmail());
        System.out.println("Escola 1 Telefone: " + escola.getTelefone());

        // Como foi utilizado o construtor padrão p/ criar o objeto vazio, pode ser que algumas informações a seguir
        //  não tenham sido "setadas"

        System.out.println("Escola 2 Nome: " + escola2.getNome());
        System.out.println("Escola 2 Email: " + escola2.getEmail());
        System.out.println("Escola 2 Telefone: " + escola2.getTelefone());
        System.out.println("Escola 2 Logradouro: " + escola2.getLogradouro());
        System.out.println("Escola 2 Cidade: " + escola2.getCidade());
        System.out.println("Escola 2 Estado: " + escola2.getUf());
    }
}
