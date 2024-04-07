// 6. Crie um código que insira 30 mil números numa ArrayList e pesquise-os.
// Usemos um método de System para cronometrar o tempo gasto
// ( System.currentTimeMillis(); ). Troque a ArrayList por um HashSet e verifique
// o tempo que irá demorar. O que é lento? A inserção de 30 mil elementos ou
// as 30 mil buscas? Descubra-o computando o tempo gasto em cada for
// separadamente


package quest5;

import java.util.ArrayList;
import java.util.HashSet;

public class testePerformance {
    
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        HashSet<Integer> nums2 = new HashSet<>();

        long tempoInsercaoArray;
        long tempoInsercaoHash;
        long tempoBuscaArray;
        long tempoBuscaHash;
        long tempoInicial;
        long tempoFinal;
        int qtdElementos = 30000;
        int elementoBuscado = 10000;
        
        //Teste tempo Inserção ArrayList
        tempoInicial = System.currentTimeMillis();
        for(int i = 1; i <= qtdElementos; i++) {
            nums.add( (int) (Math.random() * 5000));
        }
        nums.add(elementoBuscado);
        tempoFinal = System.currentTimeMillis();
        tempoInsercaoArray = tempoFinal - tempoInicial;

        //Teste tempo Busca ArrayList
        tempoInicial = System.currentTimeMillis();
        if(nums.contains(elementoBuscado)) {
            System.out.println("Achou");
        }
        tempoFinal = System.currentTimeMillis();
        tempoBuscaArray = tempoFinal - tempoInicial;

        //Teste tempo Inserção HashSet
        tempoInicial = System.currentTimeMillis();
        for(int i = 1; i <= qtdElementos; i++) {
            nums2.add( (int) (Math.random() * 5000));
        }
        nums2.add(elementoBuscado);
        tempoFinal = System.currentTimeMillis();
        tempoInsercaoHash = tempoFinal - tempoInicial;

        //Teste tempo Busca HashSet
        tempoInicial = System.currentTimeMillis();
        if(nums2.contains(elementoBuscado)) {
            System.out.println("Achou");
        }
        tempoFinal = System.currentTimeMillis();
        tempoBuscaHash = tempoFinal - tempoInicial;

        System.out.println("--ARRAY LIST--");
        System.out.println("Inserção: " + tempoInsercaoArray + "ms");
        System.out.println("Busca: " + tempoBuscaArray + "ms");
        System.out.println();
        System.out.println("--HASH SET--");
        System.out.println("Inserção: " + tempoInsercaoHash + "ms");
        System.out.println("Busca: " + tempoBuscaHash + "ms");
        
        //ArrayList é melhor na inserção e HashSet melhor na Busca
    }

}
