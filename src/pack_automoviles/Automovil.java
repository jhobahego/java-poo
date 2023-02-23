package pack_automoviles;

public class Automovil {

    private String marca;
    private String serie;
    private int modelo;
    private String placa;

    // Constructor por defecto o sin argumentos
    public Automovil() {
        this.marca = "";
        this.serie = "";
        this.modelo = 0;
        this.placa = "";

    }

    // Constructor con argumentos
    public Automovil(String marca, String serie, int modelo, String placa) {
        this.marca = marca;
        this.serie = serie;
        this.modelo = modelo;
        this.placa = placa;
    }

    // Constructor copia
    public Automovil(Automovil a){
        this.marca = a.marca;
        this.serie = a.serie;
        this.modelo = a.modelo;
        this.placa = a.placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca
                + ", serie=" + serie + ", modelo=" + modelo
                + ", placa=" + placa + '}';
    }
}
