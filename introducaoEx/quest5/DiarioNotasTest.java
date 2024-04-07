package quest5;

public class DiarioNotasTest {
    
    public static void main(String[] args) {
        int[] notas = {2, 3};
        DiarioNotas diario = new DiarioNotas("Bases da computação", notas);

        System.out.println("RELATÓRIO DE NOTAS:");
        System.out.println("Maior Nota: " + diario.maiorNota());
        System.out.println("Menor Nota: " + diario.menorNota());
        System.out.println("Média das Notas: " + diario.mediaNotas());
        System.out.println("Gráfico de barras das notas: \n" + diario.criaGrafico());
    }
}
