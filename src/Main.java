/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author gsilva
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws IOException
     * @throws NumberFormatException
     */
    public static void main(String[] args) throws NumberFormatException, IOException {

        /*
         * Prueba de tostring clases
         */
        Pasajero p1 = new Pasajero("asd", 186616510, 123456789, true);
        Asiento a1 = new Asiento(p1, false);

        Avion v1 = new Avion();
        v1.poblarAvion();
        System.out.println(v1.toString());

        int opcion;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
         * Menu
         * 
         */
        do {
            System.out.println("Menu");
            System.out.println("1. Ver Asientos disponibles");
            System.out.println("2. Comprar Asiento");
            System.out.println("3. Anular Vuelo");
            System.out.println("4. Salir");
            System.out.println("- Seleccione una opcion:");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    System.out.println("Asientos disponibles");
                    break;
                case 2:
                    System.out.println("Compra de asiento");

                    v1.mostrarAsientos();
                    /*
                     * - Asientos
                     * - Condicion para avisar que el asiento este disponible
                     * - Pedir datos del pasajero
                     * - Revisar si es VIP
                     * - Publicar valor de pasaje y descuento si aplica
                     */
                    break;
                case 3:
                    int vueloAnulado;
                    System.out.println("Anulación de vuelo");
                    System.out.print("Ingrese el vuelo a anular: ");
                    vueloAnulado = Integer.parseInt(br.readLine());
                    v1.anularVuelo(vueloAnulado);
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion Invalida !");
                    break;
            }
        } while (opcion != 4);

        /*
         * Generar menu con
         * 
         * 1. Ver asientos disponibles
         * 2. Comprar asiento
         * 3. Anular vuelo
         * 4. Salir
         */
        /*
         * Generar clase pasajero con parametros
         * • nombrePasajero
         * • rutPasajero
         * • telefonoPasajero
         * Reglas de negocio para pasajero
         * - Si el pasajero es VIP hacer un descuento de un 15%
         */
        /*
         * Formato de Array de asientos
         * | 1 2 3 4 5 6 |
         * | 7 8 9 10 11 12 |
         * | 13 14 15 16 17 18 |
         * | 19 20 21 22 23 24 |
         * | 25 26 27 28 29 30 |
         * |_____________ _____________|
         * |_____________ _____________|
         * | 31 32 33 34 35 36 |
         * | 37 38 39 40 41 42 |
         */
    }

}
