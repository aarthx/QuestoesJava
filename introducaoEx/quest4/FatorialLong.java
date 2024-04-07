package introducaoEx.quest4;

public class FatorialLong {
    
    public static void main(String[] args) {
        int num;
        long fatorial;

        for(int i = 1; i <= 20; i++){
            num = i;
            fatorial = 1;
            for(int j = num; j >= 1; j--){
                fatorial *= j;
            }
            System.out.println("Fatorial de " + i + ": " + fatorial);
        }

        // A partir do fatorial de 21 os números estouram o limite de 64 bits do tipo long
    }
}
