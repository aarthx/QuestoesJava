// 3. Abaixo está o código que produzimos em sala para o Jogo da Forca.
// Precisamos melhorá-lo. Por exemplo, se eu chutar a letra 'B' , ele não vai
// considerar um chute certo, pois comparará com 'b’ . Estão faltando
// também algumas funcionalidades, como desenhar um bonequinho sendo
// enforcado. Seu trabalho é melhorar o código.


package quest5;

import java.util.Scanner;
import java.util.ArrayList;

public class ForcaAprimorada {

    public static void main(String[] args) {

        String[] palavras = {"BANANA", "MELANCIA", "PITAYA", "FEIJAO", "ARROZ"};
        char[] palavraSorteada = palavras[(int) (Math.random() * (palavras.length + 1))].toCharArray();
        ArrayList<Character> palavra_reservada = new ArrayList<>();
        ArrayList<Character> array_palavra = new ArrayList<>();

        for(char letra:palavraSorteada) {
            palavra_reservada.add(letra);
            array_palavra.add('_');
        }

        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        boolean enforcou = false;
        int erros = 0;

        while(!acertou && !enforcou) {
            System.out.println("Qual é a letra? ");
            char chute = Character.toUpperCase(entrada.next().charAt(0));

            if(palavra_reservada.contains(chute)) {
                for(int i=0; i < palavra_reservada.size(); i++) {
                    if(chute == palavra_reservada.get(i))
                    array_palavra.set(i, chute);
                }
            } else {
                ++erros;
                if(erros != 6) {
                    System.out.println("Letra errada, você ainda tem " + (6 - erros) + " chances!");
                } else {
                    System.out.println("Morreu enforcado coitado");
                }
            }
            switch (erros) {
                case 1:
                    System.out.println("____");
                    System.out.println("|   O");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 2:
                    System.out.println("____");
                    System.out.println("|   O");
                    System.out.println("|   |");
                    System.out.println("|");
                    break;
                case 3:
                    System.out.println("____");
                    System.out.println("|   O");
                    System.out.println("|  /|");
                    System.out.println("|");
                    break;
                case 4:
                    System.out.println("____");
                    System.out.println("|   O");
                    System.out.println("|  /|\\");
                    System.out.println("|");
                    break;
                case 5:
                    System.out.println("____");
                    System.out.println("|   O");
                    System.out.println("|  /|\\");
                    System.out.println("|  /");
                    break;
                case 6:
                    System.out.println("____");
                    System.out.println("|   O");
                    System.out.println("|  /|\\");
                    System.out.println("|  / \\");
                    break;
                default:
                    break;
            }
            
            System.out.println(array_palavra);
            acertou = !array_palavra.contains('_');
            enforcou = erros == 6;
        }

        if(array_palavra.contains('_')){
            System.out.println("Você perdeu!");
        } else {
            System.out.println("Você acertou a palavra!");
        }
        entrada.close();
    }
    
}
