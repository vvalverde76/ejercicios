package app.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int numero = sc.nextInt();

        int par = numero%2;
        if (par==0){
            System.out.println(numero+ " es divisible de 2");
        }else {
            System.out.println(numero+ " no es divisible de 2");
        }
    }
}
