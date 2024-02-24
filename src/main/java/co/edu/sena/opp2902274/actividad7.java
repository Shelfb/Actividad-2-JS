package co.edu.sena.opp2902274;

import java.util.Scanner;

public class actividad7 {
    public static void main(String[] args) {

        System.out.println("7. Radio y longitud de un circulo:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio de la circunferencia:" );

        double radio = scanner.nextDouble();

        double longitud = 2 * 3.1416 * radio;

        double area = 3.1416 * Math.pow(radio, 2);

        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Área del círculo: " + area);

        scanner.close();
    }
}
