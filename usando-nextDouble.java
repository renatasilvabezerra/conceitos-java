
//Esse programa Java calcula a área de um terreno retangular e o preço total com base no valor do metro quadrado.

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//separador
				Locale.setDefault(Locale.US);
		//entrada de dados
				Scanner entrada = new Scanner (System.in);
						
		//variáveis
				double largura = entrada.nextDouble();
				double comprimento = entrada.nextDouble();
				double metroQuadrado = entrada.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.1f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		entrada.close();		
	}

}

// Exemplos de entradas (Largura = 10.0, Comprimento = 20.0, Preço do metro quadrado = 15.00)
//Retorno: (Área = 10.0 × 20.0 = 200.0, Preço = 200.0 × 15.00 = 3000.00) o preço do terreno vai ser 3000 reais.
