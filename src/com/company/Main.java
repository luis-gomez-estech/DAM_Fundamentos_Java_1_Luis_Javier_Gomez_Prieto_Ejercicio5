package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner escaner = new Scanner (System.in);

        System.out.println("Introduce el primer número");
        int numero1 = escaner.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2 = escaner.nextInt();

        //Por tanto si el numero1 es igual al numero2, imprimirá este mensaje en pantalla
        if (numero1 == numero2) {
            System.out.println("Los números introducidos son iguales");

        }  //En caso contrario, imprimirá este mensaje en pantalla

        else {
            System.out.println("Los numeros introducidos no son iguales");
        }


    }


}

