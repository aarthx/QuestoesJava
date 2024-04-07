package quest6.Q2;

import java.util.Arrays;

public class TicTacToe {
    public Game game[][] = new Game[3][3];
    public int jogador = 1;
    public int vencedor = 0;
    public boolean velha;
    boolean acabou = false;

    public TicTacToe() {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                game[i][j] = Game.EMPTY;
            }
        }
    }

    public boolean espacoOcupado(int linha, int coluna) {
        if(game[linha][coluna] != Game.EMPTY) {
            return true;
        } else {
            return false;
        }
    }

    public boolean fazerJogada(int linha, int coluna) {
        if(espacoOcupado(linha, coluna)) {
            return false;
        }
        if(jogador == 1) {
            game[linha][coluna] = Game.X;
            jogador = 2;
        } else {
            game[linha][coluna] = Game.O;
            jogador = 1;
        }
        acabou = verificaAcabou();
        return true;
    }

    public String printaJogo() {
        String jogoAtual = "";
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(game[i][j] == Game.EMPTY) {
                jogoAtual += "_";
                } else {
                jogoAtual += game[i][j];  
                }
                if(j == 0 || j == 1) {
                    jogoAtual += '|';
                }
            }
            jogoAtual += '\n';

        }
       return jogoAtual;
    }

    public boolean verificaAcabou() {
        boolean velha = false;
        Game teste[] = new Game[3];

        //verifica linhas
        for(int i = 0; i < 3; i++) {
            if(Arrays.stream(game[i]).allMatch(esp -> (esp == Game.X))) {
                vencedor = 1;
                return true;
            } else if(Arrays.stream(game[i]).allMatch(esp -> (esp == Game.O))) {
                vencedor = 2;
                return true;
            }
        }

        //verifica colunas
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                teste[j] = game[j][i];
            }
            if(Arrays.stream(teste).allMatch(esp -> (esp == Game.X)) || Arrays.stream(teste).allMatch(esp -> (esp == Game.O))) {
                return true;
            }
        }

        //verifica diagonal principal
        for(int i = 0; i < 3; i++) {
            teste[i] = game[i][i];  
        }
        if(Arrays.stream(teste).allMatch(esp -> (esp == Game.X)) || Arrays.stream(teste).allMatch(esp -> (esp == Game.O))) {
            return true;
        }

        //verifica diagonal secundaria
        for(int i = 0; i < 3; i++) {
            int j = 2;
            switch(i) {
               case 0:
                    j = 2;
                    break;
                case 1:
                    j = 1;
                    break;
                case 2:
                    j = 0;
                    break; 
            }  
            teste[i] = game[i][j];  
        }
        if(Arrays.stream(teste).allMatch(esp -> (esp == Game.X)) || Arrays.stream(teste).allMatch(esp -> (esp == Game.O))) {
            return true;
        }

        //verifica se deu velha
        velha = true;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(game[i][j] == Game.EMPTY) {
                    velha = false;
                }
            }
        }
        if(velha) {
            System.out.println("Deu VELHA!");
            return true;
        }

        return false;
    }

     
}
