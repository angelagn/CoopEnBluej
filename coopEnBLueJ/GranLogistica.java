public class GranLogistica extends Logistica
{
    // instance variables - replace the example below with your own
       private int distanciaKm;
       private boolean esPerecedero;
    private int tramos;
       private double costeProducto;
       private String tramosString;
       private String ciudad;
       private int restoKm;
       private double coste;
      private double pesoPedido;
       private Producto[] productosPedido; //Inicializa el array de productos pedido
       
       
    /** Constructor
     */
    public GranLogistica(String ciudad, int distanciaKm)
    {
        // initialise instance variables
       super(distanciaKm);
       this.distanciaKm = distanciaKm;
       this.esPerecedero = getPerecedero();
       this.costeProducto = getPrecioProducto();
       this.ciudad = ciudad;
       tramos = getTramos();
       this.pesoPedido = pesoPedido; //ASOCIAR CON EL PESO EN LA CLASE PEDIDO
       
    }
  
    
    /**Se sobrescribe el metodo transportar 
     * para ajustar a Gran Logistica
     */
       @Override
    public String Transportar(){
        tramos = distanciaKm / 50;
        restoKm = distanciaKm%50;
        String tramosString = String.valueOf(tramos);
        Producto producto = new Producto("nombre", 0.0, 0.0, esPerecedero);
        if(esPerecedero == true && distanciaKm > 100 ){
            System.out.println("***********************************\n");    
            System.out.println("Enviando producto a " + ciudad + ".\n");
            System.out.println("Distancia a recorrer gran logistica:  " + distanciaKm+ "Km, en " + tramos + " tramos de 50Km.");
            System.out.println("Distancia a recorrer pequeña logistica:  " + restoKm + "Km.");
    }
        
        return "Distancia " + distanciaKm + "Km, en " + tramos + " tramos de 50Km y " + restoKm + "Km en pequeña logistica";
    }
    
    @Override
    public String calcularCosteLogistica(){
        pesoPedido = 10; // TRAER EL PESO TOTAL DEL PEDIDO
        for(int i= 0 ; i <= getTramos(); i++){ 
            coste = 0.5 * costeProducto * pesoPedido;
        }
        coste = Math.round(coste);
        String costeString = Double.toString(coste); 
        return "El coste de la  Gran logistica es de: " + costeString + " Euros.";
        
    }
    
    
    
}