package introducaoEx.quest4;

public class Erros {
    
    public static void main(String[] args) {
        //Tentei resolver todos antes de digitar o código e ver o erro pelo compilador

        //--------------------------------------------

        //a) colocou , no lugar de ; na iniciliação esqueceu o tipo da variavel  e colocou for com letra maiuscula e no incremento somou i++ o que criaria um loop infinito

        //ERRADO
        // For (i = 100, i >= 1, i++)
        //     System.out.println(i);
        //CORRETO
        for(int i = 10; i >= 1; i--) 
            System.out.println(i);
        
        //--------------------------------------------

        //b) faltou o uso do break em cada caso
        //ERRADO
        // switch (value % 2) {
        //     case 0:
        //         System.out.println("Even integer");
        //     case 1:
        //         System.out.println("Odd integer");
        // }
        //CORRETO
        int value = 10;
        switch(value % 2) {
            case 0:
                System.out.println("Even integer");
                break;
            case 1:
                System.out.println("Odd integer");
                break;            
        }

        //--------------------------------------------

        //c) o codigo em seu incremento está aumentando em vez de diminuir e faltou inicializar a variavel com seu tipo
        //ERRADO
        // for(i =19; i >=1; i +=2)
        //     System.out.println(i);
        //CORRETO
        for(int i = 19; i >= 1; i -= 2) 
            System.out.println(i);
    
        //--------------------------------------------

        //d)a instrução esta correto mas a semantica de while é com minuscula e a condição deveria ser <= 100 e faltou inicializar tipo da variavel counter
        //ERRADO
        // counter = 2;
        // do {
        //     System.out.println(counter); counter += 2;
        // } While (counter < 100);
        //CORRETO
         int counter = 2;
         do {
            System.out.println(counter);
            counter += 2;
         }  while (counter <= 100);

    } 
}
