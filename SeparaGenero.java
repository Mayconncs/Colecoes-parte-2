import java.util.*;

public class SeparaGenero {

    public static void main(String args[]) {
        exemploListaSimplesIterandoValores();
    }

    private static void exemploListaSimplesIterandoValores() {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo;
        Map<String, String> lista = new HashMap<>();
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        System.out.println("Digite 'fim' para encerrar");

        while (true) {
            System.out.println("Digite sexo:");
            sexo = scanner.nextLine();
            if (sexo.equalsIgnoreCase("fim")) {
                break;
            }
            System.out.println("Digite o nome:");
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            if (sexo.equalsIgnoreCase("Masculino") || sexo.equalsIgnoreCase("asculino")) {
                masculino.add(nome);
            } else if (sexo.equalsIgnoreCase("Feminino") || sexo.equalsIgnoreCase("feminino")) {
                feminino.add(nome);
            }
        }

        System.out.println("Nomes do sexo masculino:");
        for (String nomeMasc : masculino) {
            System.out.println(nomeMasc);
        }

        System.out.println("Nomes do sexo feminino:");
        for (String nomeFem : feminino) {
            System.out.println(nomeFem);
        }
    }
}
