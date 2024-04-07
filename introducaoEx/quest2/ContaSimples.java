package introducaoEx.quest2;

import java.util.Scanner;

public class ContaSimples {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double conta = 0;
        int continuar = 1;
        int opcao;

        do {

            System.out.println("Bem vindo ao menu do banco");
            System.out.println("Selecione a operação que deseja:");
            System.out.println("1 - Mostrar Saldo");
            System.out.println("2 - Depositar em sua conta");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("A sua conta possui: R$ %.2f \n", conta);
                    break;
                case 2:
                    System.out.println("Quanto deseja depositar?");
                    conta += entrada.nextDouble();
                    System.out.println("Deposito realizado com sucesso");
                    break;
                case 0:
                default:
                    System.out.println("Saindo...");
                    continuar = 0;
                    break;
            }

        } while(continuar == 1);
        
        entrada.close();
    }

}
