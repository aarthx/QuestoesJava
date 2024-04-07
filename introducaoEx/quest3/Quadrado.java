package introducaoEx.quest3;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanho;
        String topoBase = "";
        String lados = "";

        System.out.println("Qual será o tamanho do lado do quadrado entre 1 e 20?");
        tamanho = entrada.nextInt();

        if(tamanho < 1 || tamanho > 20) {
            System.out.println("Tamanho inválido");
        } else {
            for(int i = 0; i < tamanho; i++) {
                topoBase += "*";
                if(i == 0) {
                    lados += "*";
                } else if(i == tamanho - 1) {
                    lados += "*";
                } else {
                    lados += " ";
                }
            }

            for(int i = 0; i < tamanho; i++) {
                if(i == 0 || i == tamanho - 1) {
                    System.out.println(topoBase);
                } else {
                    System.out.println(lados);
                }
            }
        }
        entrada.close();
    }
}
