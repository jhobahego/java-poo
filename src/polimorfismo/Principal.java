package polimorfismo;

public class Principal {

    public static void main(String[] args) {

        // Creamos un objeto de la clase operaciones pero con una instancia de la clase suma
        Operaciones operacion = new Resta();
        operacion.pedirDatos();

        // El comportamiento del metodo depende de la clase con que se instancie el objeto
        operacion.operar(); // En este caso fue intanciado con la clase Resta

        operacion.mostrarResultado();

        // Al objeto operacion le asignamos una instancia de la clase resta con lo cual
        // lo hace "cambiar su forma" a un objeto de la clase resta
        operacion = new Suma();
        operacion.pedirDatos();

        // Al momento de que fue cambiada la instancia del objeto operacion cambia el comportamiento
        operacion.operar(); // En este caso se cambio la instancia a la clase Suma
        operacion.mostrarResultado();

    }
}
