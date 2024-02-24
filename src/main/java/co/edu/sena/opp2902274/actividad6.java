package co.edu.sena.opp2902274;

import java.util.Scanner;

public class actividad6 {
    public static void main(String[] args) {
        //Entradas
        System.out.println("6. Área y volumen de un cilindro:");
        System.out.println("Ingrese la altura de un cilindro: ");
        
        Scanner src = new Scanner(System.in);
        double h = src.nextDouble();

        System.out.println("Ingrese el radio del cilindro: ");

        double r = src.nextDouble();


        //Proceso
        double area = (2*3.1416*r*(h+r));
        double volumen = (3.1416*r*r*h);
        //Salida
        System.out.println("El área del cilindro es: "+area);
        System.out.println("El volumen del cilindro es: "+volumen);

        src.close();
    }
}
