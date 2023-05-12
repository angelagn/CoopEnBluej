import java.util.Scanner;
import java.util.ArrayList;


/**
 * Clase Cooperativa que contiene el metodo main y las acciones que realiza el usuario al interactuar con la aplicacion.
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class Cooperativa
{
    public static void main(String[] args){
        //Declara variables
        boolean quiereSalir = false;
        double pesoArticulo = 0.5;
        double precioArticulo = 1.5; // Precio del articulo 
    
        do{
        ImprimirMenu menu = new ImprimirMenu();
        menu.MenuBienvenido();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir numero: ");
        int opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                menu.MenuVender();
                
                Pedido pedido1 = new Pedido(new ArrayList<Producto>()); // crea objeto de tipo Pedido
                pedido1.ListaProductosAdd(); //añade objetos a la lista
                System.out.println("* Lista de productos agregados:\n");
                pedido1.ListaPedido(); //Imprime la list
                Coste costePedido = new Coste(); //Objeto tipo coste, parametro kilometros
                
                
                String resultadoPago = costePedido.PagarProveedor(precioArticulo, pesoArticulo);
                System.out.println("--------------------------------------");
                System.out.println(resultadoPago); //Imprime el total en euros a pagar al proveedor

                Coste pagar1 = new Coste();
               
                pagar1.PagarProveedor(precioArticulo, pesoArticulo);
                break;
            case 2:
                menu.MenuComprar();
                sc.nextLine();
                System.out.println("* Lista de productos disponibles:\n");
                GestionPedidos pedido2 = new GestionPedidos(); //crea objeto de tipo GestionPedidos
                pedido2.ListaProductos();
                pedido2.Cesta();
                
                //Envia los productos 
                //Pide por consola la ciudad y distancia en kilometros
                System.out.println("A que ciudad desea enviar sus productos?");
                String ciudad = sc.nextLine();
                System.out.println("Ingrese distancia en kilometros para su envio.");
                int km = sc.nextInt();
                double costeProducto = 1.50;
                PequenaLogistica pLogistica1 = new PequenaLogistica(km);//Crea objeto pequeña logistica
                GranLogistica gLogistica1 = new GranLogistica(ciudad, km); //Crea objeto gran logistica
                //Elige el tipo de logistica según numero de kilometros
                if(km <= 100){
                    System.out.println(pLogistica1.Transportar());
                    System.out.println(pLogistica1.calcularCosteLogistica());
                }else{
                    System.out.println(gLogistica1.Transportar());
                    System.out.println(gLogistica1.calcularCosteLogistica(pesoArticulo, km, costeProducto));
                }   
                break;
            case 3:
                // informes
                menu.MenuInformes();
                System.out.println("Introducir numero: ");
                int opc = sc.nextInt();
                switch(opc){
                    case 1:
                        //INFORME DE PRODUCTOS
                        System.out.println("------------------------------------------------");
                        System.out.println("INFORME DE PRODUCTOS \n     ");
                        //objeto tipo pequeño productor
                        PequenoProductor pProductor1 = new PequenoProductor("Pedro", "Platano", 3, 1);
                        //Enlista y muestra pequeños productores
                        pProductor1.MostrarPequeProductores();
                        //crea objeto para mostrar el informe de productos
                        InformeProductos informep = new InformeProductos();
                        informep.infoRendimiento();
                        break;
                    case 2:
                        //INFORME DE VENTAS
                        System.out.println("------------------------------------------------");
                        System.out.println("INFORME DE VENTAS \n     ");
                        InformeVentas informes = new InformeVentas();
                        informes.informeCantidadVendida();
                        break;
                        
                    case 3:
                        //INFORME DE RENDIMIENTO3
                        System.out.println("------------------------------------------------");
                        System.out.println("INFORME DE RENDIMIENTO ");
                        //crea un objeto y llama a sus metodos
                        InformeProductor informeR = new InformeProductor();
                        System.out.println("Importe de productores\n");
                        informeR.infoRendimiento();
                        InformeEmpresa informeE = new InformeEmpresa();
                        System.out.println("Importe de empresas\n");
                        informeE.infoEmpresas();
                        //Objeto tipo pequeña logistica
                        PequenaLogistica l1 = new PequenaLogistica(500);
                        l1.TotalLogistica();
                        break;
                }
                break;
            case 4:
                quiereSalir = true;
                System.out.println("Hasta Pronto");
                break;
            default:
                menu.MenuBienvenido();
                break;
            }
    }while(quiereSalir != true);  
    }
}
