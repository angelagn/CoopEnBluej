import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;

/**
 * Write a description of class PequeñoProductor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PequenoProductor extends Productor
{
    // instance variables - replace the example below with your own
    private int anio;
    private int ultimoDigitoAnio;
    private ArrayList<String> pequeñosProductores;
    private String nombreProductor;
    private String nombreArticulo;
    private double hectareas;
    
   

    /** Se llama al constructor de la super clase Productor a traves de la palabra reservada super
     */
    public PequenoProductor(String nombreProductor, String nombreArticulo, double hectareas, int cantidadArticulos)
    {
        // initialise instance variables
        super(nombreProductor, nombreArticulo, hectareas, cantidadArticulos);
        this.nombreProductor = nombreProductor;
        this.nombreArticulo = nombreArticulo;
        this.hectareas = hectareas;
        
    }

    /** Funcion que calcula el ultimo digito del año 
       */
     public Integer getYear() {
        Calendar fecha = new GregorianCalendar();
        anio = fecha.get(Calendar.YEAR);
        // Calcula el último digito del año
        ultimoDigitoAnio = anio % 10;
        return ultimoDigitoAnio;
    }
    
    public void tipoProductor(){
        String nombre;
        String producto;
        
        
    }
    public void mostrarPequeProductores(){
        
        PequenoProductor[] arrayPProductores = new PequenoProductor[4];
        arrayPProductores[0] = new PequenoProductor ("Juan","Arroz", 1.3, 15);
        arrayPProductores[1] = new PequenoProductor ("Pepe","Algodon", 2.5, 3);
        arrayPProductores[2] = new PequenoProductor ("Maria","Melocoton", 2, 2);
        arrayPProductores[3] = new PequenoProductor ("Andrea","Pera", 1.2, 3);
        
        PequenoProductor[] productores = new PequenoProductor[10];
        
        productores[0].nombreProductor = "juan";
        productores[0].nombreArticulo  = "Arroz";
        productores[0].hectareas  = 1.3;
        
        
        
        System.out.println("Mostrando lista de pequeños productores");
        for (int i=0; i< productores.length; i++){
            System.out.println(productores[0].nombreArticulo +" "+ productores[0].hectareas);
        }
        
        
    }
}
