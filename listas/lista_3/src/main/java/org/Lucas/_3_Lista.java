package org.Lucas;

import java.util.Scanner;

public class _3_Lista {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String frase = sc.nextLine().trim().toLowerCase();

            int[] frequencia = new int[26];

            for (char c : frase.toCharArray()){
                if (c >= 'a' && c <= 'z'){
                    frequencia[c - 'a']++;
                }
            }
            int maxFrequencia = 0;
            for (int fre : frequencia){
                if (fre > maxFrequencia){
                    maxFrequencia = fre;
                }
            }

            for (int j = 0; j < 26; j++){
                if (frequencia[j] == maxFrequencia){
                    System.out.print((char) (j + 'a'));
                }
            }
            System.out.println();
        }

    }
}
