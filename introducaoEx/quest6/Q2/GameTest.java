package quest6.Q2;

import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        TicTacToe jogo = new TicTacToe();
        int linha, coluna;
        
        while (!jogo.acabou) {  
            System.out.println("Vez do " + jogo.jogador + "° jogador");
            System.out.println("Escolha a linha que você quer jogar: ");
            linha = entrada.nextInt();
            System.out.println("Escolha a coluna que você quer jogar: ");
            coluna = entrada.nextInt();
            if(jogo.fazerJogada(linha - 1, coluna - 1)) {
                System.out.println(jogo.printaJogo());
            } else {
                System.out.println("Espaço já jogado tente outro");
            }
        }
        if(jogo.vencedor != 0) {
            System.out.println("Parabéns jogador n° " + jogo.vencedor + " você venceu!!!");
        }

    }
}
