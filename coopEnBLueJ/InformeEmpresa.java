import java.util.Hashtable;

/**
 * Write a description of class InformeEmpresa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
