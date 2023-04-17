
/**
 * Clase ImprimirMenu que contiene los diferentes menus que se le presentan
 * al ususario al momento de ejecutar la aplicacion.
 */
public class ImprimirMenu
{
    public void MenuBienvenido(){
        System.out.println("_______________________________________");
        System.out.println("Bienvenido a la coooperativa.\n");
        System.out.println("---------------------------------------");
        System.out.println("----------MENU PRINCIPAL---------------");
        System.out.println("Elija la opcion que desee...");
        System.out.println("1. Soy proveedor, vender mis productos ");
        System.out.println("2. Soy cliente, comprar productos");
        System.out.println("3. Soy administrador, generar informes");
        System.out.println("4. Salir");
        System.out.println("---------------------------------------");
        
    }
    public void MenuVender()
    {
        // put your code here
        System.out.println("_______________________________________");
        System.out.println("Bienvenido asociado \n");
        System.out.println("---------------------------------------");
        
    }
    public void MenuComprar()
    {
        // put your code here
        System.out.println("A continuacion se muestra una lista de productos disponibles \n");
        
    }
    public void MenuInformes()
    {
        // put your code here
        System.out.println("_______________________________________");
        System.out.println("Bienvenido administrador\n");
        System.out.println("_______________________________________");
        System.out.println("Elija la opcion que desee...");
        System.out.println("1. Generar informe de productos ");
        System.out.println("2. Generar informe de ventas");
        System.out.println("3. Generar informe de rendimiento");
        System.out.println("---------------------------------------");
        
    }
    
}
