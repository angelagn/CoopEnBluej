/**
 * Clase GranLogistica que contiene los metodos Transportar y
 * calcularCosteLogistica
 * sobreescritos con polimorfismo para ajustar a las caracteristicas
 * particulares
 * de la gran logistica
 * 
 * @author (Angela Alexandra Guzman Garcia)
 * @version (001)
 */
public class GranLogistica extends Logistica // Hereda de la clase Logistica
{
    // variables de instancia
    private int distanciaKm;
    private boolean esPerecedero;
    private int tramos;
    private double costeProducto;
    // private String tramosString;
    private String ciudad;
    private int restoKm;
    // private double coste;
    private double pesoPedido;
    // private Producto[] productosPedido; // Inicializa el array de productos pedido

    /**
     * Constructor inicializa las variables
     */
    public GranLogistica(String ciudad, int distanciaKm) {
        // initialise instance variables
        super(distanciaKm);
        this.distanciaKm = distanciaKm;
        this.esPerecedero = getPerecedero();
        this.costeProducto = getPrecioProducto();
        this.ciudad = ciudad;
        this.pesoPedido = pesoPedido; // ASOCIAR CON EL PESO EN LA CLASE PEDIDO

    }

    /**
     * Se sobrescribe el metodo transportar para ajustar a Gran Logistica
     */
    @Override
    public String Transportar() {
        tramos = distanciaKm / 50;
        restoKm = distanciaKm % 50;
        // String tramosString = String.valueOf(tramos);
        // Producto producto = new Producto("nombre", 0.0, 0.0, esPerecedero);
        if (esPerecedero == true && distanciaKm > 100) {
            System.out.println("------------------------------------------------");
            System.out.println("Enviando producto a " + ciudad + ".\n");
            System.out.println("------------------------------------------------");
            System.out.println(
                    "Distancia a recorrer gran logistica:  " + distanciaKm + "Km, en " + tramos + " tramos de 50Km.");
            System.out.println("Distancia a recorrer pequeña logistica:  " + restoKm + "Km.");
        }
        return "Envio a "+ ciudad + " a " + distanciaKm + " Km, en " + tramos + " tramos de 50Km y " + restoKm
                + "Km en pequeña logistica";
    }

    /**
     * Se sobrescribe el metodo calcularCosteLogistica para ajustar a Gran Logistica
     */
    // @Override
    public String calcularCosteLogistica(double pesoArticulo, int distanciaKm, double costeProducto) {
        int tramos = (distanciaKm / 50);
        double costeTotal = 0;
        for (int i = 0; i < tramos; i++) {
            double costeTramo = 0.5 * costeProducto * pesoArticulo;
            costeTotal += costeTramo;
        }
        //costeTotal = Math.round(costeTotal);
        String costeString = Double.toString(costeTotal);
        return "El coste de la Gran logistica es de: " + costeString + " Euros.";
    }
    
}