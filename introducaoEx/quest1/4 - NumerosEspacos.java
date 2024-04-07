package introducaoEx.quest1;

import java.util.Scanner;

public class NumerosEspacos {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num, numAux, numImpresso;

        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        if(num <= 9999 || num > 99999) {
            System.out.println("Digite um número de 5 dígitos");
        } else {
            numAux = num;

            numImpresso = numAux / 10000;
            numAux %= 10000;
            System.out.printf("%d   ", numImpresso);

            numImpresso = numAux / 1000;
            numAux %= 1000;
            System.out.printf("%d   ", numImpresso);

            numImpresso = numAux / 100;
            numAux %= 100;
            System.out.printf("%d   ", numImpresso);

            numImpresso = numAux / 10;
            numAux %= 10;
            System.out.printf("%d   ", numImpresso);

            numImpresso = numAux;
            System.out.printf("%d   ", numImpresso);
            }
        

        entrada.close();
    }
}
