package quest6.Q1;

public class Aguia extends Ave implements Voador {

    public Aguia(String nome, int idade, double tamanhoAsa) {
        super(nome, idade, tamanhoAsa);
    }

    @Override
    public void voando() {
        System.out.println("Voando alto...");
    }

    @Override
    public void emitirSom() {
        System.out.println("cuáaaaaaa");
    }
    
}
