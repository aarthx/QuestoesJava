// 7. Assim como no exercício anterior, crie uma comparação entre ArrayList e
// LinkedList a fim de verificar qual é a mais rápida para se adicionar
// elementos na primeira posição ( list.add(0, elemento) ). Seguindo o mesmo
// raciocínio, você pode ver qual é a mais rápida para se percorrer usando o
// get(indice) (sabemos que o correto seria utilizar o for aprimorado ou o
// Iterator ). Para isso, insira 30 mil elementos e depois percorra-os usando
// cada implementação de List .

package quest5;

import java.util.ArrayList;
import java.util.LinkedList;

public class testePerformance2 {
    
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        LinkedList<Integer> nums2 = new LinkedList<>();

        long tempoInsercaoArray;
        long tempoInsercaoLinked;
        long tempoBuscaArray;
        long tempoBuscaLinked;
        long tempoInicial;
        long tempoFinal;
        int qtdElementos = 30000;
        
        for(int i = 1; i <= qtdElementos; i++) {
            nums.add( (int) (Math.random() * 5000));
        }

        //Teste tempo Inserção ArrayList
        tempoInicial = System.currentTimeMillis();
        nums.add(0, 88888);
        tempoFinal = System.currentTimeMillis();
        tempoInsercaoArray = tempoFinal - tempoInicial;

        //Teste tempo Busca ArrayList
        tempoInicial = System.currentTimeMillis();
        for(int i = 1; i <= qtdElementos; i++) {
            nums.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        tempoBuscaArray = tempoFinal - tempoInicial;

        for(int i = 1; i <= qtdElementos; i++) {
            nums2.add( (int) (Math.random() * 5000));
        }

        //Teste tempo Inserção LinkedList
        tempoInicial = System.currentTimeMillis();
        nums2.add(0, 88888);
        tempoFinal = System.currentTimeMillis();
        tempoInsercaoLinked = tempoFinal - tempoInicial;

        //Teste tempo Busca LinkedList
        tempoInicial = System.currentTimeMillis();
        for(int i = 1; i <= qtdElementos; i++) {
            nums2.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        tempoBuscaLinked = tempoFinal - tempoInicial;

        System.out.println("--ARRAY LIST--");
        System.out.println("Inserção: " + tempoInsercaoArray + "ms");
        System.out.println("Busca: " + tempoBuscaArray + "ms");
        System.out.println();
        System.out.println("--LINKED LIST--");
        System.out.println("Inserção: " + tempoInsercaoLinked + "ms");
        System.out.println("Busca: " + tempoBuscaLinked + "ms");

        //LinkedList é melhor na inserção e ArrayList melhor na Busca
    }
}
