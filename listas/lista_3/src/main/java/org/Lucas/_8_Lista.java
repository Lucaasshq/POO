package org.Lucas;


import java.util.Scanner;

public class _8_Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String[] pokemon = new String[N];
        int diferentes = 0;
        int quantidade_pokemons = 151;

        for (int i = 0; i < N; i++) {
            String a = sc.nextLine();
            boolean repetido = false;

            for (int j = 0; j < diferentes; j++) {
                if (pokemon[j].equals(a)) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                pokemon[diferentes] = a;
                diferentes++;
            }
        }





        System.out.println("Falta(m) " + (quantidade_pokemons - diferentes) + " pomekon(s).");
    }
}
