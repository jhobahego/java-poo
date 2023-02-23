package polimorfismo;

// La clase resta hereda de la clase padre Operaciones
public class Resta extends Operaciones {

    // Sobreescribimos el metodo operar de la clase padre Operaciones pero
    // especificando el comportamiento de acuerdo a la clase hija resta
    @Override
    public void operar() {
        System.out.println("Resta");
        resultado = valor1 - valor2;
    }
}
