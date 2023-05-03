package segundageneracion;

import primerageneracion.Vampiro;

public class Dracula extends Vampiro {
    private int estatura;
    public Dracula(String nombre, int edad, int estatura) {
        super(nombre, edad);//llamada al constructor de la clase padre
    }//Dracula hereda los poderes de la Clase Vampiro

   public void aguantarSol() {
        System.out.println("Dracula Aguantando Sol...");
    }

}
