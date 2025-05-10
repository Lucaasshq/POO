import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class _8_lista {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n = sc.nextInt();
        sc.nextLine();

        int totalS = 0, totalB = 0, totalA = 0;
        int totalS1 = 0, totalB1 = 0, totalA1 = 0;

        for (int i = 0; i < n; i++) {
            String nome = sc.next();

            int s = sc.nextInt();
            int b = sc.nextInt();
            int a = sc.nextInt();

            int s1 = sc.nextInt();
            int b1 = sc.nextInt();
            int a1 = sc.nextInt();

            totalS +=s;
            totalB +=b;
            totalA +=a;

            totalS1 += s1;
            totalB1 += b1;
            totalA1 += a1;
        }
        // pontos de saque:
        double pontosSaque = ((double)totalS1 /totalS) * 100;
        double pontosBloqueio = ((double) totalB1 / totalB) * 100;
        double pontosAtaque = ((double) totalA1 / totalA) * 100;
        System.out.printf("Pontos de Saque: %.2f %%.\n", pontosSaque);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n",pontosBloqueio);
        System.out.printf("Pontos de Ataque: %.2f %%.\n",pontosAtaque);


    }
}

// s = saques
// b = bloqueios
// a = ataques