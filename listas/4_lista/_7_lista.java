import java.util.Scanner;

public class _7_lista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] entrada = new int[2];
        for (int i = 0; i < 2; i++) {
            entrada[i] = sc.nextInt();
        }

        int p = entrada[0];
        int n = entrada[1];
        int[] canos = new int[n];
        boolean passou = true;
        for (int i = 0; i < canos.length; i++) {
            canos[i] = sc.nextInt();
        }

        for (int i = 0; i < n -1; i++) {
            if (canos[i] - canos[i + 1] > p || canos[i+1] - canos[i] > p) {
                passou = false;
                break;
            }
        }
        if (passou){
            System.out.println("YOU WIN");
        } else {
            System.out.println("GAME OVER");
        }

    }
}
