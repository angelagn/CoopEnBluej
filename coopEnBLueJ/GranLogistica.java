public class GranLogistica extends Logistica
{
    // instance variables - replace the example below with your own
       private int distanciaKm;
       private boolean esPerecedero;
       private int tramos;
       private double costeProducto;
       
    /** Constructor
     */
    public GranLogistica(int distanciaKm,boolean esPerecedero, double precioProducto)
    {
        // initialise instance variables
        super(distanciaKm, esPerecedero);
       this.distanciaKm = getDistancia();
       this.esPerecedero = getPerecedero();
       this.costeProducto = precioProducto;
       
    }
  
    
    /**Se sobreescribe el metodo transportar 
     * para ajustar a Gran Logistica
     */
       @Override
    public int transportar(){
        if (distanciaKm > 100){
            tramos = distanciaKm%50;
        }
        return tramos;
    }
    
       public int getTramos()
    {
        return  this.tramos;
        
    }
    
         @Override
    public int calcularCoste(){
         return 0;
        
    }
    
    
    
}