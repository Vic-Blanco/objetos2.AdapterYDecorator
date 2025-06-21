package ejercicio3;

import java.io.File;

public class ReportSinVerificarExistencia extends ReportDecorador {

    public ReportSinVerificarExistencia(Exportable exportable) {
        super(exportable);
    }

    @Override
    public void export(File file) {
        // Si existe, se informa pero se continúa
        if (file.exists()) {
            System.out.println("Sobrescribiendo archivo existente: " + file.getPath());
        }
        exportable.export(file);
    }
}
