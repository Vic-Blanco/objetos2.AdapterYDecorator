package ejercicio3;

import java.io.File;

class Report implements Exportable {
    private String reporte;

    public Report(String reporte) {
        this.reporte = reporte;
    }

    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        // Aquí se implementaría la lógica para exportar el reporte al archivo
        System.out.println("Exportando reporte a: " + file.getPath());
    }
}
