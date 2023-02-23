package clasesYobjetos.dowhile;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        int i = 1;
        do {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i < numero);
    }
}