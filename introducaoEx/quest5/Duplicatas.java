// 2. Utilize um array unidimensional para resolver o seguinte problema: escreva
// um aplicativo que insere cinco números, cada um entre 10 e 100, inclusive.
// Enquanto cada número é lido, exiba-o somente se ele não tiver uma
// duplicata de um número já lido. Cuide de tratar o “pior caso”, em que todos
// os cinco números são diferentes. Utilize o menor array possível para
// resolver esse problema. Exiba o conjunto completo de valores únicos
// inseridos depois que o usuário inserir cada valor novo.

package quest5;

import java.util.Scanner;

public class Duplicatas {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int[] nums = new int[5];
        int numAtual;
        boolean repetido = false;

        for(int i = 0; i < nums.length; i++) {
            do {
                System.out.println("Digite um numero entre 10 e 100: ");
                numAtual = entrada.nextInt();
                if(numAtual < 10 || numAtual > 100) {
                    System.out.println("Digite um número válido entre 10 e 100!!!");
                } else {
                    nums[i] = numAtual;
                    System.out.printf("Números únicos atuais: ");
                    for(int j = 0; j <= i; j++){
                        if(j == 0) { 
                            System.out.print(nums[j] + " ");
                        } else {
                            for(int k = j - 1; k >= 0; k--) {
                                if(nums[j] == nums[k]) {repetido = true;}
                            }
                            if(!repetido) {
                                System.out.print(nums[j] + " ");
                            }
                            repetido = false;
                        }
                    }
                    System.out.println();
                }
            } while(numAtual < 10 || numAtual > 100);
        }
        entrada.close();
    }
}


