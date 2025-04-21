package org.Lucas;
import java.util.Scanner;

public class _5x {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Leitura das posições das portinhas P e R
            int P = scanner.nextInt();
            int R = scanner.nextInt();

            // Verificação do caminho da bolinha
            if (P == 1) {
                if (R == 1) {
                    System.out.println("A"); // Bolinha cai no caminho A
                } else {
                    System.out.println("B"); // Bolinha cai no caminho B
                }
            } else {
                System.out.println("C"); // Bolinha cai no caminho C
            }

            scanner.close();
        }
    }
