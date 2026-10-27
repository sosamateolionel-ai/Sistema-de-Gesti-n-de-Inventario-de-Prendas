//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Prenda remera = new Prenda("Remera básica", 12000.0);

    System.out.println("--- Carga de stock ---");
    remera.agregarStock("S", 10);
    remera.agregarStock("M", 15);
    remera.agregarStock("L", 8);
    remera.agregarStock("XXL", 5);    // talle inexistente
    remera.agregarStock("XL", -3);    // cantidad inválida

    System.out.println("\n--- Ventas ---");
    remera.vender("M", 5);            // exitosa
    remera.vender("L", 8);            // exitosa, deja el stock en 0
    remera.vender("L", 1);            // rechazada: sin stock
    remera.vender("S", 20);           // rechazada: más de lo disponible
    remera.vender("XL", 1);           // rechazada: nunca se cargó stock

    System.out.println("\n--- Consultas ---");
    System.out.println("Stock talle M: " + remera.consultarStock("M"));
    System.out.println("Stock talle XXL: " + remera.consultarStock("XXL"));

    System.out.println();
    remera.mostrarInventario();

}
