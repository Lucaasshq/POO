import java.util.Scanner;

public class _6_lista {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];



        for (int i = 0; i < n; i++){
            t[i] = sc.nextInt();
        }
        int menor = t[0];
        int posicao = 0;
        for (int i = 1; i < t.length; i++) {
            if (t[i] < menor ){
                menor = t[i];
                posicao = i;
            }
        }

        System.out.println(posicao+1);

    }
}
