package pilares;

public class Encap2 {

    public static void main(String[] args) {
        Encap1 e1 = new Encap1();
        e1.setEdad(21);
        e1.setNombre("Jhon");
        e1.setCelular(30342789);
        e1.apellido = "Hernández";

        //System.out.println("Su nombre es: " + e1.getNombre());
        System.out.println("Su apellido es: " + e1.apellido);
        //System.out.println("Su edad es: " +e1.getEdad());

    }

}
