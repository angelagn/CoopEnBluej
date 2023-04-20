
/**
 * Write a description of class Coste here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coste extends Producto {
    // instance variables - replace the example below with your own
    private double coste;
    private static int distanciaKm;

    private double costeFijoKm;
    private int tramos;
    private double pesoPedido;
    private double precioArticulo;
    private boolean esPerecedero;
    // public double pagar;

    /**
     * Constructor for objects of class Coste
     */
    // String nombreArticulo, double precioArticulo, double pesoArticulo, boolean
    // esPerecederoArticulo
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
