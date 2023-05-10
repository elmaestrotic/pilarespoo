package org.narvasoft;

import segundageneracion.Dracula;
import segundageneracion.Murcielago;

public class Main {
    public static void main(String[] args) {
        Dracula objDracula = new Dracula("Vladimir", 500, 195);

        objDracula.morder();//poder heredado de la clase Vampiro
        objDracula.chuparSangre();//poder heredado de la clase Vampiro
        objDracula.aguantarSol();//poder propio de la clase Dracula

        objDracula.volar();//poder heredado de la interfaz Murcielago

        objDracula.comerFrutas();//poder opcional(no obligatorio) heredado de la interfaz Murcielago

        Murcielago.dormirColgado();//poder estático heredado de la interfaz Murcielago

        objDracula.amamantar();//poder obligatorio heredado de la interfaz abuela Mamifero
    }
}