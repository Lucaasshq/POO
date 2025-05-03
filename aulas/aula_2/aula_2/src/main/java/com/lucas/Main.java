package com.lucas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o primeiro numero: ");
            int x = sc.nextInt();
            
            System.out.print("Digite o segundo numero: ");
            int y = sc.nextInt();
            
            int result = Aritimetica.soma(x, y);
            System.out.println("Resultado: " + result);
        } catch (Exception ex){
            System.out.println("Insira um valor inteiro!!!");
        }
    }


    

    
}
