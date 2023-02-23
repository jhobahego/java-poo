package polimorfismo;

import java.util.Scanner;

// Creamos la clase padre Operaciones abstracta para poder aplicar polimorfismo
public abstract class Operaciones {

    Scanner sc = new Scanner(System.in);

    // Le asignamos valor protegido porque no queremos que se pueda modificar
    protected int valor1;
    protected int valor2;
    protected int resultado;

    // Creamos un metodo para solicitar los datos al usuario
    public void pedirDatos() {
        System.out.println("Ingrese el primer numero: ");
        valor1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        valor2 = sc.nextInt();
    }

    // Creamos un metodo para mostrar el resultado
    public void mostrarResultado() {
        System.out.println("El resultado es: " + resultado+"\n");
    }

    // Creamos un metodo abstracto para que sea implementado en las clases hijas
    public abstract void operar();

}
