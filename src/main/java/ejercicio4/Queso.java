package ejercicio4;

public class Queso extends Adicional{
    public Queso(Combo combo) {
        super(combo);
    }

    public String getDescripcion() {
        return super.getDescripcion() + " + Queso";
    }

    public double getPrecio() {
        return super.getPrecio() + 250;
    }
}
