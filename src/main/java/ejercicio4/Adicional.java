package ejercicio4;

public abstract class Adicional implements Combo{
    private Combo combo;

    public Adicional(Combo combo) {
        this.combo = combo;
    }
    public String getDescripcion() {
        return combo.getDescripcion();
    }

    public double getPrecio() {
        return combo.getPrecio();
    }

}
