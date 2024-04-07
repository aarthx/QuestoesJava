package introducaoEx.quest4;

import java.util.Scanner;

public class Barras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = -1;
        String resultado = "";

        for(int i = 0; i < 5; i++) {
            do {
                System.out.println("Digite um número entre 1 e 30: ");
                num = entrada.nextInt();
                if(num < 1 || num > 30) {
                    System.out.println("Digite um número válido!");
                }
            } while(num < 1 || num > 30);
            
            for(int j = 0; j < num; j++) {
                resultado += '*';
            }
            resultado += '\n';
        }
        System.out.println(resultado);
        entrada.close();
    }
}
