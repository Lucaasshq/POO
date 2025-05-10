import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _9_lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        int comportado = 0;
        int naoComportado = 0;
        for (int i = 0; i < n; i++) {
            String linha = sc.nextLine();
            char comportamento = linha.charAt(0);
            String nome = linha.substring(2);

            nomes[i] = nome;

            if (comportamento == '+'){
                comportado++;
            } else {
                naoComportado++;
            }
        }
        Arrays.sort(nomes);

        for (String i: nomes) {
            System.out.println(i);
        }
        System.out.println("Se comportaram: "+comportado+" | Nao se comportaram: "+naoComportado);
    }
}
