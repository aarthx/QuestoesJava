package introducaoEx.quest4;

import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtdNums, num, menor = 0;

        System.out.println("Quantos números serão inseridos?");
        qtdNums = entrada.nextInt();

        for(int i = 0; i < qtdNums; i++){
            System.out.println("Digite um número:");
            num = entrada.nextInt();
            if(i == 0) {
                menor = num;
            } else {
                if(num < menor) {
                    menor = num;
                }
            }
        }
        System.out.println("O menor número digitado foi: " + menor);
        entrada.close();
    }
}
