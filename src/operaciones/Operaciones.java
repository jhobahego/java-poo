package operaciones;

import java.util.*;

public class Operaciones {
    Scanner sc = new Scanner(System.in);

    public void sumar(){
        System.out.println("Digita el primer sumando");
        int n1 = sc.nextInt();
        System.out.println("Digita el segundo sumando");
        int n2 = sc.nextInt();

        System.out.println("El resultado de la suma es: "+(n1 + n2));
    }

    public void restar(){
        System.out.println("Digita un numero para restar");
        int n1 = sc.nextInt();
        System.out.println("Digita otro numero para restar");
        int n2 = sc.nextInt();

        System.out.println("El resultado de la resta es: "+(n1 - n2));
    }

    public void multiplicar(){
        System.out.println("Digita un numero para multiplicar");
        int n1 = sc.nextInt();
        System.out.println("Digita otro numero para multiplicar");
        int n2 = sc.nextInt();

        System.out.println("El resultado de la multiplicacion es: "+(n1 * n2));
    }

    public void dividir(){
        System.out.println("Digita el dividendo");
        int n1 = sc.nextInt();
        System.out.println("Digita el divisor");
        int n2 = sc.nextInt();

        System.out.println("El resultado de la division es: "+(n1 / n2));
    }
}
