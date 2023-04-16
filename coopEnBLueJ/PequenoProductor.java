import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Stack;

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
    private int cantidadArticulos;
    
    /** Se llama al constructor de la super clase Productor a traves de la palabra reservada super
     */
    public PequenoProductor(String nombreProductor, String nombreArticulo, double hectareas, int cantidadArticulos)
    {
        // initialise instance variables
        super(nombreProductor, nombreArticulo, hectareas, cantidadArticulos);
        this.nombreProductor = nombreProductor;
        this.nombreArticulo = nombreArticulo;
        this.hectareas = hectareas;
        this.cantidadArticulos = cantidadArticulos;
        
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
        //Se agrega el productor ingresado por tecladp
        int personas = 1;
        PequenoProductor[] arrayPP = new PequenoProductor[personas];
        PequenoProductor nuevoProductor = new PequenoProductor (nombreProductor,nombreArticulo, hectareas, cantidadArticulos);
        for (int i = 0; i < arrayPP.length; i++){
            arrayPP[i]= nuevoProductor;
        }
        
        //Array con datos de productores
        PequenoProductor[] arrayPProductores = new PequenoProductor[4];
        arrayPProductores[0] = new PequenoProductor ("Juan","Arroz", 1.3, 15);
        arrayPProductores[1] = new PequenoProductor ("Pepe","Algodon", 2.5, 3);
        arrayPProductores[2] = new PequenoProductor ("Maria","Melocoton", 2, 2);
        arrayPProductores[3] = new PequenoProductor ("Andrea","Pera", 1.2, 3);
        
        System.out.println("Mostrando lista disponible de pequeños productores y hectareas");
        for (int i=0; i< arrayPP.length; i++){
            System.out.println(arrayPP[i].nombreProductor +" "+ arrayPP[i].hectareas);
        }
        for (int i=0; i< arrayPProductores.length; i++){
            
            System.out.println(arrayPProductores[i].nombreProductor +" "+ arrayPProductores[i].hectareas);
        }
    }
}
