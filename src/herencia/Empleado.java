package herencia;

public class Empleado extends Persona {

    double sueldo;
    String telefono;
    String direccion;

    public Empleado(String nombre, int edad, double sueldo, String telefono, String direccion) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    @Override
    public void verDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Telefono: " + telefono);
        System.out.println("Direccion: " + direccion);
    }

}
