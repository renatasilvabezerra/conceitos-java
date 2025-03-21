import java.util.Scanner;

public class PalindromoChecker {

    // Função que verifica se uma palavra é um palíndromo
    public static boolean palindromo(String palavra) {
        String invertida = new StringBuilder(palavra).reverse().toString();
        return palavra.equalsIgnoreCase(invertida);       
    }
    //equalsIgnoreCase() → Compara duas strings ignorando maiúsculas e minúsculas.
    //public → Torna a função acessível a outras partes do código.
    //static → Permite chamar o método sem precisar criar um objeto da classe.
    //boolean → Indica que a função retorna true (se for um palíndromo) ou false (se não for).
    //palindromo(String palavra) → Recebe uma string como argumento, que representa a palavra digitada pelo usuário.
    //new StringBuilder(palavra) → Constrói um objeto StringBuilder com a palavra original.
    //.reverse() → Inverte a string.
    //.toString() → Converte o StringBuilder de volta para String e armazena na variável invertida.



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");   // Solicita a palavra do usuário
        String palavra = entrada.nextLine().replaceAll("\\s+", ""); // Remove espaços extras

        // Verifica e exibe o resultado
        if (palindromo(palavra)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        entrada.close();
    }
}

//palindromo(palavra) → Chama a função que verifica se a palavra/frase é um palíndromo e o retorno é boleano.
