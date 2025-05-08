
import java.util.Scanner;

public class _2_lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];
        int valor = sc.nextInt();
        N[0] = valor;

        for (int i = 1; i < 10; i++) {
            N[i] = N[i - 1] *2;
        }

        for (int i = 0; i < N.length; i++) {
            System.out.println("N"+"["+ i + "] " + "= " + N[i]);
        }

    }
}
