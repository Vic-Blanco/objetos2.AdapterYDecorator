package ejercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Usando motor común ==");
        Motor motor1 = new Comun();
        motor1.arrancar();
        motor1.acelerar();
        motor1.apagar();

        System.out.println("\n== Usando motor eléctrico con adapter ==");
        Motor motor2 = new ElectricoAdapter();
        motor2.arrancar();
        motor2.acelerar();
        motor2.apagar();
    }
}
