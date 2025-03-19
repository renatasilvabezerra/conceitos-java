

# Hierarquia de Veículos 🚗

Criando uma superclasse Veiculo e uma subclasse Carro que herda dela.

    // Classe pai (superclasse)
    class Veiculo {
        String marca;   // Atributo da marca do veículo

        // Construtor
        public Veiculo(String marca) {
            this.marca = marca;
        }

        // Método para exibir informações
        public void buzinar() {
            System.out.println("Biiip! Biiip!");
        }
    }
    

    // Classe Carro (filha) herda de Veiculo
    // extends indica a herança.
    class Carro extends Veiculo {
        int portas; // Adiciona um novo atributo portas
        
        // Construtor da subclasse
        public Carro(String marca, int portas) {
            super(marca); // Chama o construtor da classe pai (Veiculo)
            this.portas = portas;
        }

        // Método adicional
        public void exibirDetalhes() {
            System.out.println("Marca: " + marca + ", Portas: " + portas);
        }
    }


    public class Main {
        public static void main(String[] args) {
            // Criando um objeto da classe Carro
            Carro meuCarro = new Carro("Toyota", 4);

            // Chamando métodos herdados da superclasse
            meuCarro.buzinar();  // Saída: Biiip! Biiip!
        
            // Chamando método da classe Carro
            meuCarro.exibirDetalhes(); // Saída: Marca: Toyota, Portas: 4
        }
    }


### Observação sobre herança em java: herança múltipla NÃO é permitida.
