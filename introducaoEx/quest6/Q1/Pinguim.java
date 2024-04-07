package quest6.Q1;

public class Pinguim extends Ave implements Nadador {
    
    public Pinguim(String nome, int idade, double tamanhoAsa) {
        super(nome, idade, tamanhoAsa);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de pinguim!");
    }
    
    @Override
    public void nadando() {
        System.out.println("Nadando!");
    }

    
}
