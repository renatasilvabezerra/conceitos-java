
//Pgm pra calcular conta telefônica

import java.util.Scanner;
import java.util.Locale;


public class Cobranca {
        
public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); //mudando o separador
        Scanner sc = new Scanner (System.in); //entrada de dado
        
        int minutos = sc.nextInt();
        
        double conta = 50.0;
        if (minutos > 100){
            conta = conta + (minutos - 100) * 2.0; 
        }  //Aqui poderia ser conta += (minutos - 100) * 2.0;
        System.out.printf("Valor é R$ %.2f%n ", conta); 
        sc.close();
        
    }
}



//Importa a classe Locale para configurar o uso do separador decimal como ponto (.) em vez de vírgula (,), que é o padrão no Brasil.
//Configura a localização padrão como Locale.US, garantindo que números decimais sejam exibidos com . (ponto) em vez de , (vírgula).
//Cria um objeto Scanner chamado sc para ler dados do teclado.

//int minutos = sc.nextInt(); ---> Lê um número inteiro fornecido pelo usuário e armazena na variável minutos.

// aqui na condicional if o que eu fiz foi que se os minutos ultrapassarem 100, o programa calcula o custo adicional (minutos - 100) * 2.0 → multiplica os minutos excedentes por R$ 2,00.
//Retorno: Exemplo de uma conta em que os minutos foram de 120 minutos utilizados vai ficar (50.0 (valor da conta) + (20 (minutos que ultrapassaram 100) × 2.0) = 90.0 (valor cobrado nessa conta) e se a conta fosse menos de 100 minutos, aí a conta vem cobrando 50 reais.
