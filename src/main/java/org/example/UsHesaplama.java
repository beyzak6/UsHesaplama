package org.example;

import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban değeri giriniz : ");
        int base = scanner.nextInt();

        System.out.println("Üs değeri giriniz : ");
        int power = scanner.nextInt();

        int result = power(base,power) ;

        System.out.println(base + " ^ " + power + " = " + result);
    }
    private static int power(int base,int power){
        if(power == 0) return 1;
        return base * power(base,power-1);

    }
}
