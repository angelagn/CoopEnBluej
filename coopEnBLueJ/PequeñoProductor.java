import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Write a description of class PequeñoProductor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PequeñoProductor extends Productor
{
    // instance variables - replace the example below with your own
    private int anio;
    private int ultimoDigitoAnio;
   

    /** Se llama al constructor de la super clase Productor a traves de la palabra reservada super
     */
    public PequeñoProductor(String nombreProd, String nombreArticulo, double hectareas, int cantidadArticulos)
    {
        // initialise instance variables
        super(nombreProd, nombreArticulo, hectareas, cantidadArticulos);
      
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
}
