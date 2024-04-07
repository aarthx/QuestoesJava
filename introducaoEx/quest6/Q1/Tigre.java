package quest6.Q1;

public class Tigre extends Mamifero implements Nadador {
    public Tigre(String nome, int idade, String corPelo) {
        super(nome, idade, corPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println("GRRRR");
    }

    @Override
    public void nadando() {
        System.out.println("Nadando...");
    }
}
