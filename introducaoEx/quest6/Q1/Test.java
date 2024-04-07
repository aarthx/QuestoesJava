package quest6.Q1;

public class Test {
    public static void main(String[] args) {
        Elefante elefante = new Elefante("Otavio", 2, "Cinza");
        Tigre tigre = new Tigre("Mogli", 3, "laranja");
        Pinguim pinguim = new Pinguim("Juliano", 1, 30.5);
        Aguia aguia = new Aguia("Gusto", 1, 50.6);

        elefante.emitirSom();
        tigre.emitirSom();
        pinguim.emitirSom();
        aguia.emitirSom();
    }
}
