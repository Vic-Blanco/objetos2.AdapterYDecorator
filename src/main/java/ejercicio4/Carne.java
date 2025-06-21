package ejercicio4;

public class Carne extends Adicional {

    public Carne(Combo combo) {
        super(combo);
    }

    public String getDescripcion() {
        return super.getDescripcion() + " + Carne extra";
    }

    public double getPrecio() {
        return super.getPrecio() + 500;
    }
}
