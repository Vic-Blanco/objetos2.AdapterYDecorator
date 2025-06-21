package ejercicio4;
public class ComboBuilder {
    private Combo combo;

    public ComboBuilder basico() {
        this.combo = new ComboBasico();
        return this;
    }

    public ComboBuilder especial() {
        this.combo = new ComboEspecial();
        return this;
    }
    public ComboBuilder familiar() {
        this.combo = new ComboFamiliar();
        return this;
    }


    public ComboBuilder agregarQueso() {
        this.combo = new Queso(combo);
        return this;
    }

    public ComboBuilder agregarTomate() {
        this.combo = new Tomate(combo);
        return this;
    }

    public ComboBuilder agregarCarne() {
        this.combo = new Carne(combo);
        return this;
    }

    public ComboBuilder agregarPapas() {
        this.combo = new Papas(combo);
        return this;
    }

    public Combo build() {
        return combo;
    }
}
