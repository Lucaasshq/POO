
import java.util.Scanner;

public class _1_lista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];

        for (int i = 0; i < x.length; i++) {
            int valor = sc.nextInt();

            if (valor <= 0 ){
                x[i] = 1;
            } else {
                x[i] = valor;
            }
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println("X"+"["+ i + "] " + "= " + x[i]);
        }
        
    }
}