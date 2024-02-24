package co.edu.sena.opp2902274;

import java.util.Scanner;

public class actividad3 {
    public static void main(String[] args) {
        //Entradas
        System.out.println("3. Elevar un número al cuadrado");
        System.out.println("Ingrese un número: ");


        Scanner src = new Scanner(System.in);
        double a = src.nextDouble();


        //Proceso
        double result = (a*a*a);


        //Salida
        System.out.println("El resultado del número elevado es: "+result);

        src.close();
    }
}
