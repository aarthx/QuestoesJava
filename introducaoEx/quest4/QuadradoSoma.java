package introducaoEx.quest4;

import java.util.Scanner;

public class QuadradoSoma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, numInicial;
        int imparAux = 1;
        int quadrado = 0;

        System.out.println("Digite um número inteiro: ");
        num = entrada.nextInt();
        numInicial = num;
        if(num < 0) {
            num *= -1;
        }

        for(int i = 1; i <= num; i++) {
            quadrado += imparAux;
            imparAux += 2;
        }

        System.out.println("O quadrado de " + numInicial + " é: " + quadrado);
        entrada.close();
    }
}
