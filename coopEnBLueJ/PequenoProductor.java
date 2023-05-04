import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.w3c.dom.html.HTMLTableCaptionElement;

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
    public String[] arrayPProductores;
    
    //private ArrayList<String> pequeñosProductores;
    //private String nombreProductor;
   // private String nombreArticulo;
    //private double hectareas;
    //private int cantidadArticulos;
    
    /** Se llama al constructor de la super clase Productor a traves de la palabra reservada super
     */
    public PequenoProductor(String nombre, String producto, int hectareas, int toneladas) {
        super(nombre, producto, hectareas, toneladas);
        
    }

    /** metodo que calcula el ultimo digito del año 
       */
     public Integer getYear() {
        Calendar fecha = new GregorianCalendar();
        anio = fecha.get(Calendar.YEAR);
        // Calcula el último digito del año
        ultimoDigitoAnio = anio % 10;
        return ultimoDigitoAnio;
    }
    
    public void MostrarPequeProductores(){
        ArrayList<Productor> listaPProductores = new ArrayList<Productor>();
        listaPProductores.add(new Productor("Maria", "Café", 10, 100));
        listaPProductores.add(new Productor("Juana", "Cacao", 15, 200));
        listaPProductores.add(new Productor("Antonia", "Plátano", 20, 300));
        listaPProductores.add(new Productor("Laura", "Papa", 25, 400));
        listaPProductores.add(new Productor("Sofia", "Frijol", 30, 500));
    
        // Agregar más elementos a la lista
        listaPProductores.add(new Productor("Pedro", "Café", 12, 120));
        listaPProductores.add(new Productor("Manuel", "Cacao", 17, 220));
        listaPProductores.add(new Productor("Lucía", "Plátano", 22, 320));
    
        // Acceder a un elemento de la lista
        Productor primerProductor = listaPProductores.get(0);
        String nombrePrimerProductor = primerProductor.getNombre();
        String productoPrimerProductor = primerProductor.getProducto();
        int hectareasPrimerProductor = primerProductor.getHectareas();
        int toneladasPrimerProductor = primerProductor.getToneladas();
        
      
    }
    
}
