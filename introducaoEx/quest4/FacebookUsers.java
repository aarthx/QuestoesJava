package introducaoEx.quest4;

public class FacebookUsers {
    
    public static void main(String[] args) {
        int users = 1000000000;
        double taxa = 0.04;
        int contador = 0;
        
        while (users < 1500000000) {
            users *= (1 + taxa);
            contador++;
        }
        System.out.println("levará " + contador + " meses, para que o facebook atinja 1.5 bilhão de usuarios");
        contador = 0;
        while (users < 2000000000) {
            users *= (1 + taxa);
            contador++;
        }
        System.out.println("E levará mais " + contador + " meses, para que o facebook atinja 2 bilhões de usuarios");
    }
}
