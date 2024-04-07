package introducaoEx.quest1;
import java.util.Scanner;
public class ParImpar {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int num1;
        System.out.print("Digite um número: ");
        num1 = entrada.nextInt();

        if(num1 % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é impar!");
        }
        entrada.close();

    }

}
