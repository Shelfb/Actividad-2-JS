package co.edu.sena.opp2902274;

import java.util.Scanner;

public class actividad2 {
    public static void main(String[] args) {
    //Entradas
        System.out.println("2. Sumar dos números");
        System.out.println("Ingrese el primer número: ");

        Scanner src = new Scanner(System.in);
        double a = src.nextDouble();

        System.out.println("Ingrese el segundo número: ");

        double b = src.nextDouble();

        //Proceso
        double result = (a+b);

        //Salida
        System.out.println("El resultado de la suma es: "+result);

        src.close();
    }
}
