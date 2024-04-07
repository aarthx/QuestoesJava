package introducaoEx.quest4;

public class ProdutoImpares {
    public static void main(String[] args) {
        
        int produto = 1;
        for(int i = 1; i <= 15; i += 2) {
            produto *= i;
        }
        System.out.println("Resultado: " + produto);
    }
}
