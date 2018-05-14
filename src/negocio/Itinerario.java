//  en esta capa se trata a nuestro itinerario desde el punto de vista de objeto
package negocio;

import db.ItinerarioBD;
import java.sql.SQLException;
import java.util.ArrayList;

public class Itinerario {

    private String Id_Itinerario;
    private String Id_Usuario;
    private String Nombre;
    private String Contraseña;
    private String Nombre_vuelo;
    private String CuidadLlegada;
    private String CuidadSalida;
    private String Hora_fecha;
    private String Id_Boleto;
    private String estado;
    private String Tarifa_itinerario;
    private String Aerolinea;

    public Itinerario(String Id_Itinerario, String Id_Usuario, String Nombre_vuelo, String CuidadLlegada, String CuidadSalida, String Hora_fecha, String Id_Boleto, String estado, String Tarifa_itinerario, String Aerolinea) {
        this.Id_Itinerario = Id_Itinerario;
        this.Id_Usuario = Id_Usuario;
        this.Nombre_vuelo = Nombre_vuelo;
        this.CuidadLlegada = CuidadLlegada;
        this.CuidadSalida = CuidadSalida;
        this.Hora_fecha = Hora_fecha;
        this.Id_Boleto = Id_Boleto;
        this.estado = estado;
        this.Tarifa_itinerario = Tarifa_itinerario;
        this.Aerolinea = Aerolinea;
    }

    public Itinerario() {
    }

    

    public Itinerario(String Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public String getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(String Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getId_Itinerario() {
        return Id_Itinerario;
    }

    public void setId_Itinerario(String Id_Itinerario) {
        this.Id_Itinerario = Id_Itinerario;
    }

    public String getNombre_vuelo() {
        return Nombre_vuelo;
    }

    public void setNombre_vuelo(String Nombre_vuelo) {
        this.Nombre_vuelo = Nombre_vuelo;
    }

    public String getCuidadLlegada() {
        return CuidadLlegada;
    }

    public void setCuidadLlegada(String CuidadLlegada) {
        this.CuidadLlegada = CuidadLlegada;
    }

    public String getCuidadSalida() {
        return CuidadSalida;
    }

    public void setCuidadSalida(String CuidadSalida) {
        this.CuidadSalida = CuidadSalida;
    }

    public String getHora_fecha() {
        return Hora_fecha;
    }

    public void setHora_fecha(String Hora_fecha) {
        this.Hora_fecha = Hora_fecha;
    }

    public String getId_Boleto() {
        return Id_Boleto;
    }

    public void setId_Boleto(String Id_Boleto) {
        this.Id_Boleto = Id_Boleto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTarifa_itinerario() {
        return Tarifa_itinerario;
    }

    public void setTarifa_itinerario(String Tarifa_itinerario) {
        this.Tarifa_itinerario = Tarifa_itinerario;
    }

    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    /*Instanciando nuestro metodos creados en el paquete db*/
    public void grabar() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        ItinerarioBD itdb = new ItinerarioBD(this);
        System.out.println("vamos");
        itdb.Grabar();
         System.out.println("vamosssssssss");
    }

    /*Este metodo me permite instanciar la clase proveedordb y llamar al metodo borrar para hacer uso de el*/
    public void borrar() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        ItinerarioBD itdb = new ItinerarioBD(this);
        itdb.Borrar();
    }
    /*Este metodo retorna un conjunto de datos de la clase proveedor*/

    public Itinerario lee() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        ItinerarioBD itdb = new ItinerarioBD(this);
        return itdb.Leer();
    }
    /*Este metodo lee todos los datos de la tabla proveedor*/

    public ArrayList<Itinerario> LeerDatos() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        ItinerarioBD itdb = new ItinerarioBD(this);
        return itdb.leerTodos();
    }
    /*Este metodo busca un proveedor indicando el ruc y porque campo se va a filtrar*/

    public ArrayList LeerEspecifico(String filtro, String campo) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        ItinerarioBD itdb = new ItinerarioBD(this);
        return itdb.leer(filtro, campo);
    }

    public void actualizar() throws InstantiationException, ClassNotFoundException, IllegalAccessException, SQLException {
        ItinerarioBD itdb = new ItinerarioBD(this);
        itdb.Modificar();
    }
}

//
//public class Proveedor {
//    
//   private String razon_social;
//   private String ruc;
//   private String direccion;
//   private String tel;
//
//    public Proveedor() {
//    }
//
//    public Proveedor(String ruc) {
//        this.ruc = ruc;
//    }
//    
//    public Proveedor( String ruc,String razon_social, String direccion, String tel) {      
//        this.ruc = ruc;
//        this.razon_social = razon_social;
//        this.direccion = direccion;
//        this.tel = tel;
//    }  
//    
//    public String getRazon_social() {
//        return razon_social;
//    }
//
//    public void setRazon_social(String razon_social) {
//        this.razon_social = razon_social;
//    }
//
//    public String getRuc() {
//        return ruc;
//    }
//
//    public void setRuc(String ruc) {
//        this.ruc = ruc;
//    }
//
//    public String getDireccion() {
//        return direccion;
//    }
//
//    public void setDireccion(String direccion) {
//        this.direccion = direccion;
//    }
//
//    public String getTel() {
//        return tel;
//    }
//
//    public void setTel(String tel) {
//        this.tel = tel;
//    }
//    
//     public String toString() {
//        return "[Ruc: "+this.getRuc()+"] [Nombre: "+this.getRazon_social()+"] [Direccion: "+this.getDireccion()+"] [Tel: "+this.getTel()+"]";
//    }
//   
//   
//    
//    /*Este metodo me permite instanciar la clase proveedordb y llamar al metodo grabar para hacer uso de el*/
//    
//    
//    public void actualizar() throws ClassNotFoundException, 
//                                InstantiationException,
//                                IllegalAccessException, 
//                                SQLException
//    {
//        ProveedorBD pdb= new ProveedorBD(this);
//        pdb.Modificar();
//    }
//}
//INSERT INTO `aeropuerto`.`usuario` (`id_usuario`, `nombre`, `contraseña`) VALUES ('1', 'ESTEBAN', 'ESTEBAN'), ('2', 'FABIAN', 'FABIAN');
//INSERT INTO `aeropuerto`.`itinerario` (`id_itinerario`, `id_usuario`, `nombre_vuelo`, `cuidad_llegada`, `cuidad_salida`, `fecha_hora`, `id_boleto`, `estado`, `tarifa_itinerario`, `Aerolinea`) VALUES ('1', '1', 'A1S', 'BOGOTA', 'CALI', '2014-11-24 08:23:40', '1', 'COMPRADO', '100', 'JEJE');
