/* se comunica entre la base de dato y la interface */
package controlador;

//import java.sql.SQLException;
import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Itinerario;
//import sistemasjym.negocio.Proveedor;
//

public class controladorItinerario {
    /*Metodo para buscar un proveedor indicando el campo y el valor */

    public ArrayList buscarItinerario(String filtro, String campo) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Itinerario itin = new Itinerario();
        return itin.LeerEspecifico(filtro, campo);
    }
    /*Metodo para agregar un nuevo proveedor*/

    public void agregarProveedor(String Id_Itinerario, String Id_Usuario, String Nombre_vuelo, String CuidadLlegada, String CuidadSalida, String Hora_fecha, String Id_Boleto, String estado, String Tarifa_itinerario, String Aerolinea)
            throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Itinerario prov = new Itinerario(Id_Itinerario, Id_Usuario, Nombre_vuelo, CuidadLlegada, CuidadSalida, Hora_fecha, Id_Boleto, estado, Tarifa_itinerario, Aerolinea);
       System.out.println("llegaaaaaaaaaaaaaaaa");
        prov.grabar();
        System.out.println("llega");
    }
    /*Metodo para modificar un proveedor*/

    public void modificarProveedor(String Id_Itinerario, String Id_Usuario, String Nombre_vuelo, String CuidadLlegada, String CuidadSalida, String Hora_fecha, String Id_Boleto, String estado, String Tarifa_itinerario, String Aerolinea)
            throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Itinerario prov = new Itinerario(Id_Itinerario, Id_Usuario, Nombre_vuelo, CuidadLlegada, CuidadSalida, Hora_fecha, Id_Boleto, estado, Tarifa_itinerario, Aerolinea);
        prov.actualizar();
    }
    /*Metodo para borrar un proveedor*/

    public void eliminarProveedor(String itinerario)
            throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Itinerario prov;
        prov = new Itinerario(itinerario);
        prov.borrar();
    }
    /*Metodo para recargar proveedores*/

    public ArrayList<Itinerario> recargarProveedores()
            throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Itinerario prov;
        prov = new Itinerario();
        return prov.LeerDatos();
    }
}
//
//public class ControladorVuelo {
//
//    /*Metodo para buscar un proveedor indicando el campo y el valor */
//    public ArrayList buscarProveedor(String filtro,
//                                    String campo) throws 
//                                        ClassNotFoundException, 
//                                        InstantiationException, 
//                                        IllegalAccessException, 
//                                        SQLException
//    {      
//        Proveedor prov;
//        prov= new Proveedor();
//        return prov.LeerEspecifico(filtro, campo);
//
//    }
//      /*Metodo para agregar un nuevo proveedor*/
//    public void agregarProveedor(String ruc,
//                                 String razon_social,
//                                 String direccion,
//                                 String tel) 
//                                 throws
//                                 ClassNotFoundException, 
//                                 InstantiationException,
//                                 IllegalAccessException, 
//                                 SQLException
//    {      
//        Proveedor prov = new Proveedor(ruc,razon_social,direccion,tel);
//        prov.grabar();        
//    }
//     /*Metodo para modificar un proveedor*/
//    public void modificarProveedor(String ruc,
//                                 String razon_social,                              
//                                 String direccion,
//                                 String tel) 
//                                 throws
//                                 ClassNotFoundException, 
//                                 InstantiationException,
//                                 IllegalAccessException, 
//                                 SQLException
//    {      
//        Proveedor prov = new Proveedor(ruc,razon_social,direccion,tel);    
//        prov.actualizar();
//    }
//
//     /*Metodo para borrar un proveedor*/   
//    public void eliminarProveedor(String ruc)
//                                 throws
//                                 ClassNotFoundException, 
//                                 InstantiationException,
//                                 IllegalAccessException, 
//                                 SQLException
//    {
//        Proveedor prov;
//        prov= new Proveedor(ruc); 
//        prov.borrar();
//    }
//
//    /*Metodo para recargar proveedores*/      
//    public ArrayList<Proveedor> recargarProveedores()
//                                throws 
//                                ClassNotFoundException, 
//                                InstantiationException, 
//                                IllegalAccessException,
//                                SQLException
//    {
//        Proveedor prov = new Proveedor(); 
//        return prov.LeerDatos();
//    }
//}
