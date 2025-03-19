package fundamentos;

import java.util.Scanner;

public class ImportaScanner {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in); // entrada
			System.out.println("Digite o seu nome: ");
			String nome = entrada.nextLine();  // espera o usuário digitar no terminal
			System.out.println("nome: " + nome);	
			
			entrada.close(); // para encerrar o programa

	}
}

// nextLine para string
// nextInt para inteiro
// nextLong para long
// nextFloat para float
// e outras opções conforme o tipo

// out é a saída, exemplo é a tela
// in é a entrada, exemplo é o teclado

// sempre encerre e salve o programa que usa Scanner
