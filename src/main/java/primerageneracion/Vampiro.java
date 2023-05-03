package primerageneracion;

public class Vampiro {
    // Atributos
    private String nombre;
    private int edad;

    public Vampiro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }



    //Métodos
    public void morder() {
        System.out.println("Vampiro Mordiendo...");
    }

    public void chuparSangre() {
        System.out.println("Vampiro Chupando Sangre...");
    }

    private void aguantarSol() {
        System.out.println("Vampiro Aguantando Sol...");
    }

}
