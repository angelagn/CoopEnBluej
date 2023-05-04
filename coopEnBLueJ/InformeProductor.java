import java.util.Hashtable;

public class InformeProductor {
    //Diccionario  
    Hashtable<String, Integer> importeProductor = new Hashtable<String, Integer>();

    //Añade productos clave valor al diccionario cantidadVendida
    public void infoRendimiento() {
        //mportes obtenidos por cada uno de los productores (desglosados por productos)
        importeProductor.put("Juan", 3456);
        importeProductor.put("Maria", 2034);
        importeProductor.put("Rosa", 9435);
        importeProductor.put("Antonio", 2340);
        importeProductor.put("Jose", 2647);
        importeProductor.put("Luis", 2807);
        importeProductor.put("Carmen", 1480);
        
        //Muestra el listado de productos entoneladas vendidos en el último año
        System.out.println("* Importe obtenido segun productor: \n");
        for (java.util.Map.Entry<String, Integer> entry : importeProductor.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " euros.");
          }
    }
    
}