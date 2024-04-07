package introducaoEx.quest4;

public class Printing {
    //respondi antes de colocar o codigo logo abaixo
    //Resposta: ele printara 10 linhas completas de 5 "@" seguidos
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 5; j++) 
                System.out.print('@');
            System.out.println();
        }
    } 
}
