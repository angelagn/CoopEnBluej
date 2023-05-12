import java.security.KeyStore.Entry;
import java.util.Hashtable;

/**
 * Clase    Informes que contiene el método informe de cantidad vendida para mostrarle al usuario administrador
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class InformeVentas {
    //Diccionario  
    Hashtable<String, Integer> cantidadVendida = new Hashtable<String, Integer>();

    //Añade productos clave valor al diccionario cantidadVendida
    public void informeCantidadVendida() {
        cantidadVendida.put("Manzana", 220);
        cantidadVendida.put("Pera", 20);
        cantidadVendida.put("Algodon", 120);
        cantidadVendida.put("Pimiento", 250);
        cantidadVendida.put("Arroz", 267);
        cantidadVendida.put("Cebolla", 280);
        cantidadVendida.put("Brocoli", 180);
        

        //Muestra el listado de productos entoneladas vendidos en el último año
        System.out.println("Cantidad de productos en toneladas vendidas el ultimo año: \n");
        for (java.util.Map.Entry<String, Integer> entry : cantidadVendida.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " toneladas.");
          }
    }
}

