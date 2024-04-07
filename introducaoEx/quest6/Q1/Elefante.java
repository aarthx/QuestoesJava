package quest6.Q1;

public class Elefante extends Mamifero implements Nadador {
    
    public Elefante(String nome, int idade, String corPelo) {
        super(nome, idade, corPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println("FUUMM UUUUH");
    }

    @Override
    public void nadando() {
        System.out.println("Nadando...");
    }
}
