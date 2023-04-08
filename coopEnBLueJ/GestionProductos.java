
/**
 * Clase Producto que contiene las caracteristicas necesarias de cada producto para que pueda ser gestionado en la cooperativa.
 * 
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class GestionProductos 
{
    // instance variables - replace the example below with your own
    private double precioRefKg;
    private double precioClienteF;
    private double beneficiosCF;
    private double precioDis;
    private double beneficiosDis;
    private double kilos;
    private double totalPagar;
  

    /**
     * Constructor for objects of class GestionProductos
     */
    public GestionProductos()
    {
        // initialise instance variables
       
       Producto miProducto = new Producto ("Nombre producto", precioRefKg , 0.0, false);
       this.precioRefKg = miProducto.getPrecioProducto();
       this.kilos = miProducto.getTotalKg();
       
        
    }

    /** Funcion que aumenta el 15% al precio del cliente final segun el precio de referencia por kilogramo del producto
     */
    public double CobrarACliente(double precioRefKg)
    {
        // put your code here
        beneficiosCF = precioRefKg * 15 / 100;
        precioClienteF = precioRefKg + beneficiosCF;
        return precioClienteF;
    }
    
    /** Funcion que aumenta el 5% al precio del distribuidor segun el precio de referencia del producto
     */
    public double CobrarDistribuidor(double precioRefKg)
    {
        // put your code here
        beneficiosDis = precioRefKg * 5 / 100;
        precioDis = precioRefKg + beneficiosDis;
        return precioDis;
    }
    
    /**Funcion que calcula el pago que recibe cada productor
       */
    public double PagarAProductor(double precioRefKg, double kilos){
        totalPagar = precioRefKg * kilos;
        return totalPagar;
    }
    
    
}
