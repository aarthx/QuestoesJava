
// Resposta antes de executar o codigo: 
// Todos os quadrados dos numeros de 1 até 10 e
// Total is 385
// Correto!

package introducaoEx.quest3;

public class Mystery {
    
    public static void main(String[] args) {
        
        int x = 1;
        int total = 0;

        while (x <= 10) {
            int y = x * x;
            System.out.println(y);
            total += y;
            ++x;
        }

        System.out.printf("Total is %d%n", total);

    }

}
