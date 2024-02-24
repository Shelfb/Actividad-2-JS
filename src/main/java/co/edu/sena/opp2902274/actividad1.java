package co.edu.sena.opp2902274;

import java.util.Scanner;

public class actividad1 
{
    public static void main( String[] args )
    {
    //Entradas
        System.out.println("1. Calcular el área de un triángulo");
        System.out.println("Ingrese la base del tríángulo: ");


        Scanner dir = new Scanner(System.in);
        double base = dir.nextDouble();


        System.out.println("Ingrese la altura del triángulo: ");


        double height = dir.nextDouble();


        //Proceso
        double result = (base*height/2);


        //Salida
        System.out.println("El área del triángulo es: "+result);

        dir.close();
    }
}
