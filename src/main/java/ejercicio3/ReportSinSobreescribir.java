package ejercicio3;

import java.io.File;

public class ReportSinSobreescribir extends ReportDecorador {

    public ReportSinSobreescribir(Exportable exportable) {
        super(exportable);
    }

    @Override
    public void export(File file) {
        if (file.exists()) {
            throw new IllegalArgumentException("El archivo ya existe...");
        }
        exportable.export(file);
    }
}
