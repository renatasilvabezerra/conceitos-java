



public class Solucao {
    public int solucao(String S) {
        // Dividir a string em palavras
        String[] palavras = S.split(" ");
        
        // Variável para armazenar o comprimento da maior palavra válida
        int maiorComprimento = -1;


/*Você gostaria de definir uma senha para uma conta bancária. No entanto, há três restrições quanto ao formato da senha:

deve conter apenas caracteres alfanuméricos ( a − z , A − Z , 0 − 9 );
deve haver um número par de letras;
deve haver um número ímpar de dígitos.
*/
// Fazendo um laço de repetição através do FOR      
// Percorrer as palavras ---> for (TIPO VARIÁVEL : (é utilizado para indicar que estamos iterando sobre o array) COLEÇÃO) ---> A cada iteração, a variável palavra assumirá o valor de um dos elementos da coleção palavras.
        for (String palavra : palavras) {
// função auxiliar isAlfanumerica, que verifica se a palavra contém apenas caracteres alfanuméricos (letras e números). Caso a palavra seja alfanumérica, a condição é verdadeira, e o bloco dentro do if é executado.
            if (isAlfanumerica(palavra)) {
                // Contar o número de letras e dígitos na palavra
                int numLetras = 0;
                int numDigitos = 0;
                // Inicia outro laço de repetição, mas agora percorre cada caractere da palavra
                for (char c : palavra.toCharArray()) {   // variável do tipo char, que irá armazenar cada caractere individualmente dentro da palavra. | função toCharArray() converte a string palavra em um array de caracteres.
                    if (Character.isLetter(c)) {  // Character.isLetter(c): Essa função verifica se o caractere c é uma letra (de A-Z ou a-z).
                        numLetras++;   // a cada vez que um caractere for uma letra a variável numLetras será aumentada.
                    } else if (Character.isDigit(c)) {  //  Character.isDigit(c): Essa função verifica se o caractere c é um dígito (0-9). | Se o caractere for um dígito, o código dentro desse else if será executado.
                        numDigitos++;
                    }
                }
                
                // Verificar as condições:
                // 1. O número de letras deve ser par
                // 2. O número de dígitos deve ser ímpar
                if (numLetras % 2 == 0 && numDigitos % 2 == 1) {
                    // Atualizar o maior comprimento se necessário
                    maiorComprimento = Math.max(maiorComprimento, palavra.length());
                }
            }
        }
        
        // Retornar o comprimento da maior palavra válida ou -1 se não houver
        return maiorComprimento;
    }
    
    // Função auxiliar para verificar se a palavra contém apenas caracteres alfanuméricos
    private boolean isAlfanumerica(String palavra) {
        for (char c : palavra.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Solucao solucao = new Solucao();
        String S = "test 5 a0A pass007 ?xy1";
        System.out.println(solucao.solucao(S));  // Saída esperada: 7
    }
}


/* Linguagem de programação: 
Java 11
Você gostaria de definir uma senha para uma conta bancária. No entanto, há três restrições quanto ao formato da senha:

deve conter apenas caracteres alfanuméricos ( a − z , A − Z , 0 − 9 );
deve haver um número par de letras;
deve haver um número ímpar de dígitos.
Você recebe uma string S consistindo de N caracteres. A string S pode ser dividida em palavras dividindo-a em, e removendo, os espaços. O objetivo é escolher a palavra mais longa que seja uma senha válida. Você pode assumir que se houver K espaços na string S, então há exatamente K + 1 palavras.

Por exemplo, dado " test 5 a0A pass007 ?xy1 ", há cinco palavras e três delas são senhas válidas: " 5 ", " a0A " e " pass007 ". Portanto, a senha mais longa é " pass007 " e seu comprimento é 7. Observe que nem " test " nem " ?xy1 " são senhas válidas, porque " ? " não é um caractere alfanumérico e " test " contém um número par de dígitos (zero).

Escreva uma função:

classe Solução { public int solução(String S); }

que, dada uma string não vazia S consistindo de N caracteres, retorna o comprimento da palavra mais longa da string que é uma senha válida. Se não houver tal palavra, sua função deve retornar −1.

Por exemplo, dado S = " test 5 a0A pass007 ?xy1 ", sua função deve retornar 7, conforme explicado acima.

Suponha que:

N é um inteiro dentro do intervalo [ 1 .. 200 ];
A string S consiste apenas em caracteres ASCII imprimíveis e espaços.
*/
