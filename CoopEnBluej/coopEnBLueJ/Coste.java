
/**
 * Clase Coste que hereda de la clase Producto y calcula el coste a pagar al proveedor y 
 * el coste de la logistica.
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class Coste extends Producto {

    // variables de instancia
    private static int distanciaKm;
    private double pesoPedido;
    private double precioArticulo;
    private boolean esPerecedero;
  
    public Coste() {
        super("Arroz", distanciaKm, 0, true); // String double, double, boolean
        this.precioArticulo = precioArticulo;
        this.esPerecedero = esPerecedero;
        this.distanciaKm = distanciaKm;
        this.pesoPedido = pesoPedido;
    }
   

    public int getDistanciaKm() {
        return this.distanciaKm;
    }

    public String PagarProveedor(double precioArticulo, double pesoArticulo) {

        double tonelada = 1000;
        pesoPedido = (pesoArticulo * tonelada);
        double pagar = (precioArticulo * pesoPedido);
        String pagarString = Double.toString(pagar);

        return "Pagar al proveedor: " + pagarString + " €.";
    }

    public String calcularCosteLogistica() {

        return "Coste Logistica clase coste:";
    }

}
