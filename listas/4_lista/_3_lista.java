
import java.util.Scanner;

public class _3_lista {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int[] n = new int[20];

        for (int i = 0; i < 20; i++) {
            n[i] = valor;
        }

        int t = n.length;
        n[0] = n[t];
        n[1] = n[t-1];

        for (int i : n) {
            System.out.println(i);
        }


    }
    
}
