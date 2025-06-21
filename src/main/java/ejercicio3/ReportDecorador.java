package ejercicio3;

public abstract class ReportDecorador implements Exportable {
    protected Exportable exportable;

    public ReportDecorador(Exportable exportable) {
        this.exportable = exportable;
    }

    @Override
    public void export(java.io.File file) {
        exportable.export(file);
    }
}
