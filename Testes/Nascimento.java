
import java.time.Year;

public class Nascimento {
    public static void main(String[] args) {
        String nome = "João";
        int idade = 25;
        int anoAtual = Year.now().getValue();
        int anoDeNascimento = anoAtual - idade;
        
        System.out.println(nome + ", você nasceu em " + anoDeNascimento + ".");
    }
}