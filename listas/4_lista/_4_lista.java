import java.util.Scanner;

public class _4_lista {
    public static void main(String[] args) {

        int[] n = new int[1000];
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int valor = 0;

        for (int i = 0; i < 1000; i++){
            n[i] = valor;
            valor++;

            System.out.println("N["+i+"] = " + n[i]);

            if(valor == t){
                valor = 0;
            }
        }


    }
}
