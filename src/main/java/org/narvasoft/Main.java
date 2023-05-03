package org.narvasoft;

import segundageneracion.Dracula;

public class Main {
    public static void main(String[] args) {
        Dracula objDracula = new Dracula("Vladimir", 500, 195);

        objDracula.morder();//poder heredado de la clase Vampiro
        objDracula.chuparSangre();//poder heredado de la clase Vampiro
        objDracula.aguantarSol();//poder propio de la clase Dracula



    }
}