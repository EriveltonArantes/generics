import java.util.ArrayList;
import java.util.List;

// Classe base para veículos
class Veiculo {
    String nome;
    String marca;
    String cor;

    public Veiculo(String nome, String marca, String cor) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
    }

    public void listarDados() {
        System.out.println("Nome do veículo: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
    }
}

// Classe específica para carros
class Carro extends Veiculo {
    public Carro(String nome, String marca, String cor) {
        super(nome, marca, cor);
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando uma lista genérica de veículos
        List<Veiculo> listaVeiculos = new ArrayList<>();

        // Adicionando carros à lista
        listaVeiculos.add(new Carro("Fiat Uno", "Fiat", "Vermelho"));
        listaVeiculos.add(new Carro("Volkswagen Gol", "VW", "Azul"));
        listaVeiculos.add(new Carro("Ford Fiesta", "Ford", "Prata"));

        // Listando os dados de cada veículo
        for (Veiculo veiculo : listaVeiculos) {
            veiculo.listarDados();
            System.out.println(); // Linha em branco para separar os dados
        }
    }
}
