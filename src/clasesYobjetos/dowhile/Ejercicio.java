package clasesYobjetos.dowhile;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero mayor o igual 2000: ");
        int numero = sc.nextInt();
        if(numero >= 2000){
            do {
                System.out.print(numero + " ");
                numero -= 100;
            } while (numero > 0);
        }else{
            System.out.println("El numero "+ numero + " no es mayor o igual a 2000");
        }

        sc.close();
    }
}
