package introducaoEx.quest4;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Pi {
    
    public static void main(String[] args) {
        int denominador = 1;
        double resultado = 0.0;
        DecimalFormat padrao = new DecimalFormat("#.#####");
        padrao.setRoundingMode(RoundingMode.DOWN);

        // for(int i = 0; i < 200000; i++) {
        //     resultado += (4.0/denominador);
        //     denominador *= -1;
        //     if(denominador > 0) {
        //         denominador += 2;
        //     } else {
        //         denominador -= 2;
        //     }
        //     System.out.println(resultado);
        // }

        // O resultado para 2000 foi 3.1415876535897618
        
        for(int i = 0; i < 300000; i++) {
            resultado += (4.0/denominador);
            denominador *= -1;
            if(denominador > 0) {
                denominador += 2;
            } else {
                denominador -= 2;
            }
            System.out.println(resultado);
            if(padrao.format(resultado).equals("3,14159")) {
                System.out.println("Resultado: " + resultado);
                System.out.println("Número de iterações: " + i);
                break;
            }
        }

        //Foram necessárias 136120 iterações para alcançar a precisão de 5 casas decimais 3.14159
    }
}
