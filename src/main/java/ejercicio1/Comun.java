package ejercicio1;

public class Comun implements Motor{
    public void arrancar() {
        System.out.println("Motor común arrancando...");
    }

    public void acelerar() {
        System.out.println("Motor común acelerando...");
    }

    public void apagar() {
        System.out.println("Motor común apagando...");
    }
}
