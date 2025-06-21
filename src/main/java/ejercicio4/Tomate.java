package ejercicio4;

public class Tomate extends Adicional{
    public Tomate(Combo combo) {
        super(combo);
    }

    public String getDescripcion() {
        return super.getDescripcion() + " + Tomate";
    }

    public double getPrecio() {
        return super.getPrecio() + 200;
    }
}
