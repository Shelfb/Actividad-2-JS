package co.edu.sena.opp2902274;

import java.util.Scanner;

public class actividad8 {
    public static void main(String[] args) {
        //Entradas
        System.out.println("Introduzca el primer número: ");
        
        Scanner promedio = new Scanner(System.in);
        double a = promedio.nextDouble();

        System.out.println("Introduzca el segundo número: ");
        double b = promedio.nextDouble();

        
        System.out.println("Introduzca el tercer número: ");
        double c = promedio.nextDouble();

        //Proceso
        double prom = (a+b+c)/3;

        //Salida
        System.out.println("El promedio de los tres números es: "+prom);

        promedio.close();
    }
}
