package Q4;

import java.util.ArrayList;

public class CarbonTest {
    

    public static void main(String[] args) {
        Bicycle bicicleta = new Bicycle(2, 100);
        Car carro = new Car(20, 2016);
        Building construcao = new Building(50, 5, 5);

        ArrayList<CarbonFootprint> gastos = new ArrayList<>();
        gastos.add(bicicleta);
        gastos.add(carro);
        gastos.add(construcao);

        gastos.forEach(consumo -> {
            if (consumo instanceof Bicycle) {
                Bicycle bicicletaEsp = (Bicycle) consumo;
                System.out.println("Bicicleta andou " + bicicletaEsp.getKilometers() + " km(s) com " + bicicletaEsp.getPassengers() + " passageiros");
            } else if (consumo instanceof Car) {
                Car carroEsp = (Car) consumo;
                System.out.println("Carro de " + carroEsp.getYear() + " que faz " + carroEsp.getKmPerLiter() + "km/l");
            } else if (consumo instanceof Building) {
                Building construcaoEsp = (Building) consumo;
                System.out.println("Construção que gastou " + construcaoEsp.getCarbonoConstrucao() + " toneladas de CO2 em sua construção e consome " + construcaoEsp.getUsoAnualCarbono() + " toneladas de CO2 por ano, está em funcionamento há " + construcaoEsp.getAnosFuncionamento() + " anos!");
            }
            System.out.println("Pegada de Carbono: " + consumo.getCarbonFootprint() + "kg de CO2 gastos");
            System.out.println("----------------------------");
        });
    }
}
