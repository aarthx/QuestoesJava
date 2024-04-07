// 1. Dada uma coleção de dados = [12, -2, 4, 8, 29, 45, 78, 36, -17, 2, 12, 8, 3,3,-52] faça um programa que:

package quest5;

public class ArrayTeste {
    public static void main(String[] args) {
        int[] nums =  {12, -2, 4, 8, 29, 45, 78, 36, -17, 2, 12, 8, 3, 3, -52};
        
        // a. imprima o maior elemento;
            int maior = 0;
            for(int i = 0; i < nums.length; i++) {
                if(i == 0) {maior = nums[i];}
                if(nums[i] > maior) {maior = nums[i];}
            }
            System.out.println("Maior elemento: " + maior);
        // b. imprima o menor elemento;
            int menor = 0;
            for(int i = 0; i < nums.length; i++) {
                if(i == 0) {menor = nums[i];}
                if(nums[i] < menor) {menor = nums[i];}
            }
            System.out.println("Menor elemento: " + menor);
        // c. imprima os números pares;
            System.out.printf("Números pares: ");
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] % 2 == 0) {
                    if(i != nums.length - 1) {
                        System.out.print(nums[i] + ", ");
                    } else {
                        System.out.print(nums[i] + ";\n");
                    }
                }
            }
        // d. imprima o número de ocorrências do primeiro elemento da lista;
        int elemento = nums[0];
        int contaEl = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == elemento) {
                contaEl++;
            }
        }
        System.out.println("O número de vezes que \"" + elemento + "\" aparece no conjunto é: " + contaEl + " vezes!");
        // e. imprima a média dos elementos;
        int soma = 0;
        double media;
        for(int i = 0; i < nums.length; i++) {
            soma += nums[i];
        }
        media  = soma/nums.length;
        System.out.println("A média dos elementos: " + media);
        // f. imprima a soma dos elementos de valor negativo.
        System.out.printf("Números negativos: ");
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                if(i != nums.length - 1) {
                    System.out.print(nums[i] + ", ");
                } else {
                    System.out.print(nums[i] + ";\n");
                }
            }
        }
    }
}