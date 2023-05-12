import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase GestionPedidos gestiona los productos 
 * disponibles en la cooperativa para comprar.
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class GestionPedidos
{
        /**El metodo ListaProductos, crea elementos tipo Producto y luego los 
         * añade a una lista, para finalmente mostrar la lista al usuario.
         */
        String agregarMas = "";
        String prodIngresado = "";
        //Declara una lista de productos
        List<Producto> listaProductos = new ArrayList<>();
        //Crea nueva lista de productos ingresados por el usuario.
        List<String> listCesta = new ArrayList<>();
        
    public void ListaProductos(){
        //Crea elementos tipo Producto
        Producto manzana = new Producto("Manzana", 3.4, 2, true);
        Producto pera = new Producto("Pera", 2.1, 1.5, true);
        Producto algodon = new Producto("Algodon", 4.3, 6, false);
        Producto pimiento = new Producto("Pimiento", 2.2, 3, true);
        Producto arroz = new Producto("Arroz", 1.4, 2.2, true);
        Producto cebolla = new Producto("Cebolla", 2.4, 2.6, true);
        Producto brocoli = new Producto("Brocoli", 1.4, 2.5, true);

        //Añade elementos a la lista
        listaProductos.add(manzana);
        listaProductos.add(pera);
        listaProductos.add(algodon);
        listaProductos.add(pimiento);
        listaProductos.add(arroz);
        listaProductos.add(cebolla);
        listaProductos.add(brocoli);
        
        //Imprime la lista de productos disponibles
        for(Producto producto : listaProductos){
            System.out.println(producto.toString());
        }   
    }   
    public void Cesta(){
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Indique el nombre del producto a comprar");
            //Lee el producto añadido por consola a la cesta
            String prodIngresado = sc.nextLine();
            //Añade el producto a la cesta
            System.out.println("Desea agregar otro producto? si/no");
            agregarMas = sc.nextLine();
            //Verifica que la respuesta sea correcta
            while(!agregarMas.equals("si") && !agregarMas.equals("no")){
                System.out.println("Valor no valido, intente nuevamente: ");
                agregarMas = sc.nextLine();
            }
            
            listCesta.add(prodIngresado);
            //Recorre la lista y verifica que el producto ingresado este en la lista para luego removerlo
            for (int i= 0; i < listaProductos.size(); i++){
                if(listaProductos.get(i).getNombreProducto().equalsIgnoreCase(prodIngresado)){
                    listaProductos.remove(i);
                    break;
                }
            }
        }while(!agregarMas.equals("no")) ;
        //Imprime los productos de la cesta
        System.out.println("--------------------------------------");
        System.out.println("Productos en la cesta.");
        System.out.println("--------------------------------------");
        for(String producto : listCesta){
            System.out.println(producto);
        } 
        //Imprime de nuevo los productos disponibles 
        System.out.println("--------------------------------------");
        System.out.println("Productos disponibles.");
        System.out.println("--------------------------------------");
        for(int i = 0; i < listaProductos.size(); i++){
            System.out.println(listaProductos.get(i).getNombreProducto());
        }
    }
}

