
/**
 * Write a description of class Coste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coste 
{
    // instance variables - replace the example below with your own
    private double coste;
    private static int distanciaKm;
      
       private double costeFijoKm; 
        private int tramos;
        private double pesoPedido;
        private double precioArticulo;
        private boolean esPerecedero;
        //private double precioLog;
        
        /**
     * Constructor for objects of class Coste
     */
    public Coste(int distanciaKm, double pesoPedido, double precioArticulo)
    {
        // initialise instance variables
        this.precioArticulo = precioArticulo;
        this.esPerecedero = esPerecedero;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    // public  double CalcularCosteLogistica(){
         // return 0;
        
    // }
        
    public String calcularCostePLogistica(){
        costeFijoKm = 0.3 ;
        coste = costeFijoKm * distanciaKm; 
        return "Coste Pequeña Logistica:" + coste;
        
    }
    public int getTramos()
    {
        tramos = distanciaKm / 50;
        return  this.tramos;
    }

    public double calcularCosteGLogistica(){
        for(int i= 0 ; i <= getTramos(); i++){ 
            coste = 0.5 * precioArticulo * pesoPedido;
        }
        System.out.println("El coste de la logistica es de: " + Math.round(coste) + " Euros.");
        return coste;
        
    }
}
