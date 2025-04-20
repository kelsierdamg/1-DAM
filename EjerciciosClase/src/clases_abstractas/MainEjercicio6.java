package clases_abstractas;

public class MainEjercicio6 {
	public static void main(String[] args) {
        Monitor monitor = new Monitor(125.50, "Monitor gaming", 27);
        DiscoDuro disco = new DiscoDuro(80.50, "Disco SSD", 1);

        Pedido pedido = new Pedido();

        pedido.agregarLinea(monitor, 1);
        pedido.agregarLinea(disco, 3);

        System.out.println(pedido.imprimir());
	}
}
