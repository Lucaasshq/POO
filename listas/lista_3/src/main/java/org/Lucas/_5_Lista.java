package org.Lucas;

import java.util.Scanner;

public class _5_Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String maiorPalavra = "";
        int maiorTamanho = 0;
        while (true) {
            String frase = sc.nextLine().trim();

            if (frase.equals("0")) {
                System.out.println();
                break;
            }


            String[] arrayFrases = frase.split(" ");


            String resultador = "";

            for (int j = 0; j < arrayFrases.length; j++) {
                int tamanho = arrayFrases[j].length();
                resultador += tamanho;

                if (j < arrayFrases.length - 1) {
                    resultador += "-";
                }

                if (tamanho >= maiorTamanho) {
                    maiorTamanho = tamanho;
                    maiorPalavra = arrayFrases[j];
                }
            }
            System.out.println(resultador);
        }
        System.out.println("The biggest word: " + maiorPalavra);
    }
}
