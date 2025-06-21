package ejercicio3;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Exportable reporteSimple = new Report("Este es un reporte confidencial.");


        Exportable sinSobreescribir = new ReportSinSobreescribir(reporteSimple);


        Exportable sobreescrito = new ReportSinVerificarExistencia(reporteSimple);

        File archivo1 = new File("reporte1.txt");
        File archivo2 = new File("reporte2.txt");

        try {
            sinSobreescribir.export(archivo1);
            sinSobreescribir.export(archivo1); // lanza excepción si ya existe
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            sobreescrito.export(archivo2); // siempre exporta
            sobreescrito.export(archivo2); // sobrescribe
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

