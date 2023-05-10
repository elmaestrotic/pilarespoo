package segundageneracion;

public interface Murcielago extends Mamifero{
    public void volar();//método obligatorio de implementar porque es abstracto

    default void comerFrutas() {//método opcional
        System.out.println("Comiendo Frutas...");
    }

    static void dormirColgado() {//método estático
        System.out.println("Durmiendo Colgado...");
    }

}
