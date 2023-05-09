import java.util.Hashtable;

/**
 * Clase InformeEmpresa que contiene un método que muestra al usuario
 * administrador información sobre las empresas de tranporte.
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class InformeEmpresa{
    //Importes obtenidos por cada una de las empresas de logística.
    public void infoEmpresas(){
        //Diccionario  
        Hashtable<String, Integer> importeEmpresas= new Hashtable<String, Integer>(); 
        
        importeEmpresas.put("Logis S.A", 4556);
        importeEmpresas.put("Transportes TM", 8034);
        importeEmpresas.put("DHL", 4435);
        
        
        //Muestra el listado de productos entoneladas vendidos en el último año
        System.out.println("* Importe obtenido segun empresa: \n");
        for (java.util.Map.Entry<String, Integer> entry : importeEmpresas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " euros.");
          }
    }
}
