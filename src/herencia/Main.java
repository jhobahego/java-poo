package herencia;

public class Main {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 30, 1000, "123456789", "Calle real C3");
        Empleado empleado2 = new Empleado("Jhon", 21, 3000, "343456789", "Calle wallabi av 2 sidney");
        Empleado empleado3 = new Empleado("Heydi", 53, 1500, "987654321", "Calle 2b-123");

        empleado.verDatos();
        empleado2.verDatos();
        empleado3.verDatos();

    }

}
