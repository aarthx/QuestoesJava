package quest6.Q1;

abstract class Mamifero extends Animal {
    protected String corPelo;

    public Mamifero(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }
    
}
