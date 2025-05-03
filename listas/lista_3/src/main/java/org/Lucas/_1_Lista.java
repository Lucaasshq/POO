package org.Lucas;

import java.util.Arrays;
import java.util.Scanner;

public class _1_Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            String entrada = sc.nextLine().trim().toLowerCase();

            if (entrada.equals("*")) {
                return;
            }

            String[] lista = entrada.split(" ");
            char primeiraletra = entrada.charAt(0);
            boolean ehTautograma = true;


            for (String s : lista) {
                if (s.charAt(0) != primeiraletra) {
                    ehTautograma = false;
                    break;
                }
            }

            if (ehTautograma) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
