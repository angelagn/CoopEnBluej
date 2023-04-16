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
      // private double pesoPedido;
       private Producto[] productosPedido; //Inicializa el array de productos pedido
       
       
    /** Constructor
     */
    public GranLogistica(String ciudad)
    {
        // initialise instance variables
    super(distanciaKm, pesoPedido, precioArticulo);
       this.distanciaKm = getDistancia();
       this.esPerecedero = getPerecedero();
       this.costeProducto = precioArticulo;
       this.ciudad = ciudad;
       tramos = getTramos();
       //this.pesoPedido = pesoPedido;
       
    }
  
    
    /**Se sobrescribe el metodo transportar 
     * para ajustar a Gran Logistica
     */
       //@Override
    public String transportar(){
        //tramos = distanciakm / 50;
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
    
       // public int getTramos()
    // {
        // tramos = distanciaKm / 50;
        // return  this.tramos;
    // }
    
         // @Override
    // public double calcularCosteLogistica(){
        // for(int i= 0 ; i <= getTramos(); i++){ 
            // coste = 0.5 * costeProducto * pesoPedido;
        // }
        // System.out.println("El coste de la logistica es de: " + Math.round(coste) + " Euros.");
        // return coste;
        
    // }
    
    
    
}