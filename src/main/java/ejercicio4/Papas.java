package ejercicio4;

public class Papas extends Adicional {
    public Papas(Combo combo) {
        super(combo);
    }

    public String getDescripcion() {
        return super.getDescripcion() + " + Papas extra";
    }

    public double getPrecio() {
        return super.getPrecio() + 300;
    }
}
