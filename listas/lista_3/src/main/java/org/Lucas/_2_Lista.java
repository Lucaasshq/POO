package org.Lucas;

import java.util.Scanner;

public class _2_Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] ledsPorDigito = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        for (int i = 0; i < n; i++) {
            String a = sc.nextLine().trim();
            int qtdLeds = 0;

            char[] arrNumeros = a.toCharArray();
            for (char d : arrNumeros) {
                int digito = Character.getNumericValue(d);
                qtdLeds += ledsPorDigito[digito];
            }
            System.out.println(qtdLeds + " leds");
        }

    }
}
