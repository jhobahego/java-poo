package operaciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Operaciones op = new Operaciones();

        System.out.println("¿Que quieres hacer?");
        System.out.print("1. sumar\n 2. restar\n 3. multiplicar\n 4. dividir\n");
        int res = sc.nextInt();
        switch (res){
            case 1:
                op.sumar();
                break;
            case 2:
                op.restar();
                break;
            case 3:
                op.multiplicar();
                break;
            case 4:
                op.dividir();
                break;
            default:
                System.out.println("Esa opcion no existe");
                break;
        }
    }
}
