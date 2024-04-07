package introducaoEx.quest3;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int continuar = 1;
        int quantidadeViagens = 0;
        String resultado = "";
        int kmTotal = 0;
        int litrosTotal = 0;
        Double razaoTotal = 0.0;

        do {
            int quilometros;
            int litros;
            double razao;
            String razaoFixo;
            quantidadeViagens++;

            System.out.println("Quantos quilometros você andou?");
            quilometros = entrada.nextInt();
            kmTotal += quilometros;
            System.out.println("Quantos litros foram gastos?");
            litros = entrada.nextInt();
            litrosTotal += litros;

            razao = (double) quilometros/litros;
            razaoTotal += razao;
            razaoFixo = String.format("%.2f",razao);
            

            resultado += quantidadeViagens + "° Viagem: " + razaoFixo + " km/l\n";

            System.out.println("Deseja adicionar mais uma viagem? 1 para sim e 0 para não!");
            continuar = entrada.nextInt();

        } while(continuar == 1);
            entrada.close();
            resultado += "Quilometros totais: " + kmTotal + " km\nLitros gastos total: " + litrosTotal + " l";
            System.out.println(resultado);
            System.out.printf("Média de km/l: %.2f km/l", razaoTotal/quantidadeViagens );
    }

}