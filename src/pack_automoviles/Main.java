package pack_automoviles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creacion de un objeto de la clase Automovil
        // con el constructor por defecto
        Automovil auto = new Automovil();

        // Asignacion de valores usando setters
        auto.setMarca("Toyota");
        auto.setSerie("BIN63");
        auto.setModelo(2016);
        auto.setPlaca("ABC123");

        System.out.println("Datos del primer automovil usando los getters:");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Serie: " + auto.getSerie());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Placa: " + auto.getPlaca());

        // Creacion de un objeto de la clase Automovil utilizando el constructor
        // con argumentos
        Automovil a2 = new Automovil("Ford", "Fiesta", 2018, "ABC123");

        // Muestra los datos del objeto usando toString
        System.out.println("Datos del segundo automovil usando toString: ");
        System.out.println(a2.toString());

        // Creacion de un objeto de la clase Automovil usando el constructor copia
        Automovil a3 = new Automovil(a2);

        // Asignacion de valores usando setters
        a3.setPlaca("ABC456");
        a3.setModelo(2014);

        // Muestra los datos del objeto usando toString
        System.out.println("Datos del tercer automovil usando toString:");
        System.out.println(a3.toString());

        Automovil a4 = new Automovil();
        String marca, serie, placa;
        int modelo;

        System.out.println();

        // Captura de datos por consola
        System.out.println("Solicitando datos por consola");
        System.out.println("Ingrese la marca del automovil: ");
        marca = sc.nextLine();

        System.out.println("Ingrese la serie del automovil: ");
        serie = sc.nextLine();

        System.out.println("Ingrese la placa del automovil: ");
        placa = sc.nextLine();

        System.out.println("Ingrese el modelo del automovil: ");
        modelo = sc.nextInt();

        // Asignacion de valores usando setters
        a4.setMarca(marca);
        a4.setSerie(serie);
        a4.setModelo(modelo);
        a4.setPlaca(placa);

        System.out.println("Datos del cuarto automovil usando los getters:");
        System.out.println("Marca: " + a4.getMarca());
        System.out.println("Serie: " + a4.getSerie());
        System.out.println("Modelo: " + a4.getModelo());
        System.out.println("Placa: " + a4.getPlaca());

    }
}
