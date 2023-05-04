import java.util.Hashtable;

public class InformeProductos {
    //Diccionario  
    Hashtable<String, Integer> beneficiosProducto = new Hashtable<String, Integer>();

    //Añade productos clave valor al diccionario 
    public void infoRendimiento() {
        //mportes obtenidos por cada uno de los productores (desglosados por productos)
        beneficiosProducto.put("Manzana", 56);
        beneficiosProducto.put("Pera", 34);
        beneficiosProducto.put("Algodon", 95);
        beneficiosProducto.put("Pimiento", 20);
        beneficiosProducto.put("Arroz", 27);
        beneficiosProducto.put("Cebolla", 07);
        beneficiosProducto.put("Brocoli", 10);
        
    
        
        //Muestra el listado 
        System.out.println("* Beneficios por producto: \n");
        for (java.util.Map.Entry<String, Integer> entry : beneficiosProducto.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " euros.");
          }
    }
}
