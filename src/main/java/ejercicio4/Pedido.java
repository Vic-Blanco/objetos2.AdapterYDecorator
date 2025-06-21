package ejercicio4;

import java.util.List;

public class Pedido {
    private List<Combo> combos;

    public Pedido(){    }

    public void agregarCombo(Combo combo) {
        this.combos.add(combo);
    }
}
