package ejercicio1;

public class ElectricoAdapter implements Motor{

    private Electrico motorElectrico = new Electrico();
    private boolean conectado = false;

    public void arrancar() {
        System.out.println("Adaptador: arrancando motor eléctrico...");
        motorElectrico.conectar();
        motorElectrico.activar();
        conectado = true;
    }

    public void acelerar() {
        if (conectado) {
            System.out.println("Adaptador: acelerando motor eléctrico...");
            motorElectrico.moverMasRapido();
        } else {
            System.out.println("Motor eléctrico no arrancado aún.");
        }
    }

    public void apagar() {
        if (conectado) {
            System.out.println("Adaptador: apagando motor eléctrico...");
            motorElectrico.detener();
            motorElectrico.desconectar();
            conectado = false;
        } else {
            System.out.println("Motor eléctrico ya está apagado.");
        }
    }
}
