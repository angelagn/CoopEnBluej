
/**
 * Clase GestionProductos que realiza las acciones de calcular los importes a cada tipo de cliente.
 * 
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class GestionProductos 
{
    // variables de instancia
    private double precioRefKg;
    private double precioClienteF;
    private double beneficiosCF;
    private double precioDistribuidor;
    private double beneficiosDistribuidor;
    private double kilos;
    private double totalPagar;
  

    /**
     * Constructor para objetos de la clase GestionProductos
     */
    public GestionProductos()
    {
        // inicializacion de variables de constructor
       
       Producto miProducto = new Producto ("Nombre producto", precioRefKg , 0.0, false);
       this.precioRefKg = miProducto.getPrecioProducto();
       this.kilos = miProducto.getPesoEnKg();
       
        
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
       
        beneficiosDistribuidor = precioRefKg * 5 / 100;
        precioDistribuidor = precioRefKg + beneficiosDistribuidor;
        return precioDistribuidor;
    }
    
    /**Funcion que calcula el pago que recibe cada productor
       */
    // public double PagarAProductor(double precioRefKg, double kilos){
    //     totalPagar = precioRefKg * kilos;
    //     return totalPagar;
    // }
    
    
}
