package ejercicio4;

public class Main {

    public static void main(String[] args) {

        Combo pedido1 = new ComboBuilder()
                .basico()
                .agregarQueso()
                .agregarTomate()
                .build();

        Combo pedido2 = new ComboBuilder()
                .especial()
                .agregarCarne()
                .agregarPapas()
                .build();

        // Mostrar detalles del pedido
        System.out.println("Pedido Combo Básico:");
        System.out.println(pedido1.getDescripcion() + " - Precio: $" + pedido1.getPrecio());

        // Mostrar detalles del pedido
        System.out.println("Pedido Combo especial:");
        System.out.println(pedido2.getDescripcion() + " - Precio: $" + pedido2.getPrecio());

    }
}
