package co.edu.sena.opp2902274;

import java.util.Scanner;

public class actividad4 {
    public static void main(String[] args) {
        //Entradas
        System.out.println("4. Pasar euros a dólares");
        System.out.println("Ingrese una cantidad de euros: ");


        Scanner entrada = new Scanner(System.in);
        double euros = entrada.nextDouble();


        //Proceso
        double cambio = (euros*1.08);


        //Salida
        System.out.println("Sus euros en dólares son: "+cambio);

        entrada.close();
    }
}
