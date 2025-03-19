# String 🦋

--------------------------------------------------------------------------------------------------------

    String nome = 'Renata';

    nome.toUpperCase();

    System.out.println(nome);

### Assim não dará certo porque a String é imutável, logo, o que está acontecendo é que está sendo criada uma nova String e essa deve ser atribuída a uma nova variável.


    String nome = 'Renata';

    String nome2 = nome.toUpperCase();

    //System.out.println(nome);

    System.out.println(nome2);

### Assim dará certo porque está sendo criada uma nova String e essa deve ser atribuída a uma nova variável.


----------------------------------------------------------------------------------------------------------

    String nome = 'Renata';

    String nome2 = 'Renata';  //não está criando nova String e sim puxando por referência da String já criada.

    System.out.println(nome == nome2);

🦋  Retorno: true

### Comparação de referência dos objetos, endereços de memória, se trata de um pull (puxar) de Strings.


    String nome = 'Renata';

    String nome2 = 'Renata';

    System.out.println(nome.equals(nome2));

🦋  Retorno: true

### Comparação de conteúdo (valor atribuído) dos objetos.


--------------------------------------------------------------------------------------------------------


### Criando dois objetos diferentes

Atenção: String(x) === new String(x) // false pois String é tipo primitivo e new String cria um objeto.


    String nome3 = new String ('Renata');  //objeto 1 - um endereço de memória

    String nome4 = new String ('Renata');  //objeto 2 - outro endereço de memória

    System.out.println(nome3 == nome4);

🦋  Retorno: false


### Comparação dos objetos em endereços de memória diferentes, não é aqui um pull (puxar) de Strings que trabalha com referência e sim criações de objetos diferentes, logo é false.


    String nome3 = new String ('Renata');

    String nome4 = new String ('Renata');

    System.out.println(nome3.equals(nome4));

🦋  Retorno: true


### equals continua sendo comparação de conteúdo (valor atribuído) dos objetos.

-------------------------------------------------------------------------------------------------------

# Métodos da String

Observação: lembre que uma String é um array, antes era de char, agora é de byte, mas o importante é que é um array e por isso dá para manipular.

### .charAt()

    public satatic void main (String params []) {

     String nome = 'Renata';
  
    System.out.println(nome.charAt(0));
  
    }

  🦋 retorno: R
  

  ### Acesso a uma posição do array.

-------------------------------------------------------------------------------------------------------

  ### .substring()

    public satatic void main (String params []) {
 
    String nome = 'Renata';
  
    System.out.println(nome.substring(0, 4));
  
    }

  🦋 retorno: Rena
  

### Acesso a posição inicial e final desejada do array. A posição final é exclusivo, logo, vai de 0 até 3.

-------------------------------------------------------------------------------------------------------

# Construtor StringBuilder

Observação: String é imutável, mas uma StringBuilder é mutável.

    StringBuilder a = new StringBuilder ('Renata');

    a.append ('Bezerra');

    System.out.println(a);

🦋 Retorno: RenataBezerra


### O StringBuilder é usado para tornar possível a concatenação de várias Strings.


🦋 Fonte para consultas: https://www.baeldung.com/java-strings-concatenation


-------------------------------------------------------------------------------------------------------

# Concatenação de String

Observação: A  própria classe String  fornece uma série de métodos para concatenar Strings.

### .concat()

    String mensagem = "Estou".concat(" fazendo")

    .concat(" uma")
  
    .concat(" concatenação")
  
    .concat(" de")
  
    .concat(" String.");
  

    System.out.println(mensagem);


-------------------------------------------------------------------------------------------------------


## concatenação simples

    String nome = "renata";
    String sobrenome = "bezerra";

    System.out.println (" Seu nome é " + nome + " e seu sobrenome é " + sobrenome);


## interpolação

    String nome = "renata";
    String sobrenome = "bezerra";

    System.out.printf (" Seu nome é %s e seu sobrenome é %s" , nome, sobrenome);

-------------------------------------------------------------------------------------------------------








































