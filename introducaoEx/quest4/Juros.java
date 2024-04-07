package introducaoEx.quest4;

public class Juros {
    
    public static void main(String[] args) {
        double investido = 1000;
        double juros = 0.05;
        double quantiaFinal = 0;
        String resultado = "";
        for(int i = 1; i <= 10; i++) {
            quantiaFinal = investido * Math.pow((1 + juros), i) ;
            resultado = i + "° Ano: US$ ";
            System.out.printf("%s %.2f\n", resultado, quantiaFinal);
        }
    }
}
