package clasesYobjetos;

//importa joptionpane para poder usarlo
import javax.swing.JOptionPane;

public class Operacion {
    private int numero1;
    private int numero2;
    private int suma;
    private int resta;
    private int multiplicacion;
    private int division;

    public void leerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
    }

    public void sumar() {
        suma = numero1 + numero2;
    }

    public void restar() {
        resta = numero1 - numero2;
    }

    public void multiplicar() {
        multiplicacion = numero1 * numero2;
    }

    public void dividir() {
        division = numero1 / numero2;
    }

    public void mostrarResultados() {
        JOptionPane.showMessageDialog(null, "La suma es: " + suma + "\nLa resta es: " + resta + "\nLa multiplicacion es: " + multiplicacion + "\nLa division es: " + division);
    }

}
