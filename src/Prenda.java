import java.util.HashMap;
import java.util.Map;

public class Prenda {

    private String modelo;
    private double precio;
    private Map<String, Integer> stockPorTalle;

    public Prenda(String modelo, double precio) {
        this.modelo = modelo;
        this.precio = precio;
        this.stockPorTalle = new HashMap<>();

        stockPorTalle.put("S", 0);
        stockPorTalle.put("M", 0);
        stockPorTalle.put("L", 0);
        stockPorTalle.put("XL", 0);
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    // Devuelve -1 si el talle no existe

    public int consultarStock(String talle) {

        if (!stockPorTalle.containsKey(talle)) {
            System.out.println("Talle \"" + talle + "\" inexistente.");
            return -1;
        }

        return stockPorTalle.get(talle);
    }

    public boolean agregarStock(String talle, int cantidad) {

        if (!stockPorTalle.containsKey(talle)) {
            System.out.println("Ingreso rechazado: el talle \"" + talle + "\" no existe.");
            return false;
        }

        if (cantidad <= 0) {
            System.out.println("Ingreso rechazado: la cantidad debe ser mayor a cero (" + cantidad + ").");
            return false;
        }

        stockPorTalle.put(talle, stockPorTalle.get(talle) + cantidad);
        System.out.println("Ingreso de " + cantidad + " unidades talle " + talle + ".");
        return true;
    }

    public boolean vender(String talle, int cantidad) {

        if (!stockPorTalle.containsKey(talle)) {
            System.out.println("Venta rechazada: el talle \"" + talle + "\" no existe.");
            return false;
        }

        if (cantidad <= 0) {
            System.out.println("Venta rechazada: la cantidad debe ser mayor a cero (" + cantidad + ").");
            return false;
        }

        int disponible = stockPorTalle.get(talle);

        if (cantidad > disponible) {
            System.out.println("Venta rechazada: se piden " + cantidad + " del talle " + talle
                    + " pero solo hay " + disponible + ".");
            return false;
        }

        stockPorTalle.put(talle, disponible - cantidad);
        System.out.println("Venta de " + cantidad + " unidades talle " + talle + ".");
        return true;
    }

    public void mostrarInventario() {
        System.out.println("Inventario de " + modelo + " ($" + precio + "):");

        String[] talles = {"S", "M", "L", "XL"};
        for (String t : talles) {
            System.out.println("   Talle " + t + ": " + stockPorTalle.get(t));
        }
    }
}