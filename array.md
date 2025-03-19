
# Array  🎰

    public static void main(String params [ ]) {
       int [ ] idades = new int [10];
       int [ ] idades2 = 10;
    }

Para percorrer esse array pode ser usado um Java forEach: "for" remete às estruturas de controle de fluxo repetitivo, enquanto "each" enfatiza a iteração individual.

    int [ ] idades = new int [10];
    int [ 0 ] idades = 10;
    for (int numero: idades) {
        System.out.println(numero);
    }

🦋 Retorno: 10  0  0  0  0  0  0  0  0  0  0

Também posso percorrer de maneira tradicional através do tamanho do array.

    int [ ] idades = new int [10];
    int [ 0 ] idades = 10;
    for (int i; i < idades.length; i++) {
        System.out.println(idades[i]);
    }

🦋 Retorno: 10  0  0  0  0  0  0  0  0  0  0

