package polimorfismo;

// La clase suma hereda de la clase padre Operaciones
public class Suma extends Operaciones {

    // Sobreescribimos el metodo operar de la clase padre Operaciones pero
    // especificando el comportamiento de acuerdo a la clase hija suma
    @Override
    public void operar() {
        System.out.println("Suma");
        resultado = valor1 + valor2;
    }
}
