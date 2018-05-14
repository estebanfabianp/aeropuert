package db;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Itinerario;
import servicios.ConectarServicio;
import servicios.Conexion;

public class ItinerarioBD {

    private Itinerario it;

    public ItinerarioBD(Itinerario it) {
        this.it = it;
    }
    /*Metodo Grabar*/

    public void Grabar() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
        cdb.un_sql = "SELECT id_itinerario FROM `itinerario` WHERE `id_itinerario`= " + it.getId_Itinerario() + ";";

        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);
     
        if (cdb.resultado != null) {
            System.out.println("entra");
            cdb.un_sql = "INSERT INTO `itinerario` (`id_itinerario`, `id_usuario`, `nombre_vuelo`, `cuidad_llegada`, `cuidad_salida`, `fecha_hora`, `id_boleto`, `estado`, `tarifa_itinerario`, `aerolinea`)  VALUES ('" + it.getId_Itinerario() + "', '" + it.getId_Usuario() + "', '" + it.getNombre_vuelo() + "', '" + it.getCuidadLlegada() + ", '" + it.getCuidadSalida() + "', '" + it.getHora_fecha() + "', '" + it.getId_Boleto() + "', '" + it.getEstado() + "', '" + it.getTarifa_itinerario() + "', '" + it.getAerolinea() + "')"; /// insertar lo valores de todas las tablas
            cdb.us_st.executeQuery(cdb.un_sql);
            //cdb.us_st.executeUpdate(cdb.un_sql);
            System.out.println(cdb.us_st);
        } else {
            System.out.println("no entra");
            JOptionPane.showMessageDialog(null, "Error al registrar un nuevo proveedor", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /*Metodo Leer*/

    public Itinerario Leer() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, Error {
        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
        cdb.un_sql = "SELECT * FROM `itinerario` WHERE`id_usuario`=" + it.getId_Usuario() + ";";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);
        if (cdb.resultado != null) {
            if (cdb.resultado.next()) {

                it.setId_Usuario(cdb.resultado.getString("Id_Usuario"));
                // it.setNombre(cdb.resultado.getString("Nombre"));
                // it.setContraseña(cdb.resultado.getString("contraseña"));
                it.setId_Itinerario(cdb.resultado.getString("Id_itinerario"));
                it.setNombre_vuelo(cdb.resultado.getString("Nombre_vuelo"));
                it.setCuidadLlegada(cdb.resultado.getString("cuidad_llegada"));
                it.setCuidadSalida(cdb.resultado.getString("cuidad_salida"));
                it.setHora_fecha(cdb.resultado.getString("fecha_hora"));
                it.setId_Boleto(cdb.resultado.getString("id_boleto"));
                it.setEstado(cdb.resultado.getString("estado"));
                it.setTarifa_itinerario(cdb.resultado.getString("tarifa_itinerario"));
                it.setAerolinea(cdb.resultado.getString("aerolinea"));;

//                p.setRuc(cdb.resultado.getString("ruc"));
//                p.setRazon_social(cdb.resultado.getString("razon"));
//                p.setDireccion(cdb.resultado.getString("direccion"));
//                p.setTel(cdb.resultado.getString("tel")); //es con la base de datos y toca set para tenerlo en nuestra clase itineario
            } else {
                /*Generamos nuestro propio error, luego este se activa por el catch quien lo lanza nuevamente*/
                throw new Error("Registro " + it.getId_Usuario() + " No se encuentra en la tabla proveedor Ubicacion'" + this.getClass().getName());
            }
        } else {
            /*Generamos nuestro propio error, luego este se activa por el catch quien lo lanza nuevamente*/
            throw new Error("Consulta a registro" + it.getId_Usuario() + "Ha devuelto un recordSet null Ubicacion=" + this.getClass().getName());
        }

        return it;
    }
    /*Metodo Borrar*/

    public void Borrar() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
        cdb.un_sql = "DELETE FROM `itinerario` WHERE `id_itinerario`='" + it.getId_Itinerario() + "'";
        cdb.us_st.executeUpdate(cdb.un_sql);
    }
    /*Creando el metodo leer y ordenar por proveedor*/

    public ArrayList<Itinerario> leerTodos() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException, Error {

        ArrayList<Itinerario> r = new ArrayList<>();
        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
        cdb.un_sql = "SELECT * FROM `itinerario` ";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);
        if (cdb.resultado != null) {
            while (cdb.resultado.next()) {
                it = new Itinerario();
                it.setId_Usuario(cdb.resultado.getString("Id_Usuario"));
                // it.setNombre(cdb.resultado.getString("Nombre"));
                // it.setContraseña(cdb.resultado.getString("contraseña"));
                it.setId_Itinerario(cdb.resultado.getString("Id_itinerario"));
                it.setNombre_vuelo(cdb.resultado.getString("Nombre_vuelo"));
                it.setCuidadLlegada(cdb.resultado.getString("cuidad_llegada"));
                it.setCuidadSalida(cdb.resultado.getString("cuidad_salida"));
                it.setHora_fecha(cdb.resultado.getString("fecha_hora"));
                it.setId_Boleto(cdb.resultado.getString("id_boleto"));
                it.setEstado(cdb.resultado.getString("estado"));
                it.setTarifa_itinerario(cdb.resultado.getString("tarifa_itinerario"));
                it.setAerolinea(cdb.resultado.getString("aerolinea"));
                r.add(it);
//                p=new Proveedor();
//                p.setRuc(cdb.resultado.getString("ruc"));
//                p.setRazon_social(cdb.resultado.getString("razon"));
//                p.setDireccion(cdb.resultado.getString("direccion"));
//                p.setTel(cdb.resultado.getString("tel"));   
//                r.add(p);
            }
        }
        return r;
    }

    public ArrayList leer(String filtro, String campo) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        ArrayList r;
        Itinerario it;

        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
        cdb.un_sql = "SELECT * FROM `itinerario` WHERE " + campo + "LIKE '%" + filtro + "%' ORDER BY Id_Vuelo"; // areglar consulta
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);

        return null;
    }
    /*Metodo Modificar*/
// toca areglar esta metodo

    public void Modificar() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
        cdb.un_sql = "SELECT `id_itinerario` FROM `itinerario` WHERE `id_itinerario`=" + it.getId_Itinerario() + ";";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);

        if (cdb.resultado != null) {
            if (cdb.resultado.next()) {
                cdb.un_sql = "UPDATE `itinerario` SET `id_usuario`='" + it.getId_Usuario() + "',`nombre_vuelo`='" + it.getNombre_vuelo() + "',tel=" + it.getCuidadLlegada() + ",cuidad_salida'" + it.getCuidadSalida() + "',fecha_hora'" + it.getHora_fecha() + "',id_boleto '" + it.getId_Boleto() + "',estado '" + it.getEstado() + "', tarifa_itinerario` '" + it.getTarifa_itinerario() + "',Aerolinea '" + it.getAerolinea() + "'WHERE ruc=" + it.getId_Itinerario() + ";";
                cdb.us_st.executeUpdate(cdb.un_sql);
            } else {
                /*Generamos nuestro propio error, luego este se activa por el catch quien lo lanza nuevamente*/
                throw new Error("Registro" + it.getId_Itinerario() + "No se encuentra en la tabla proveedor Ubicacion'" + this.getClass().getName());
            }
        } else {
            /*Generamos nuestro propio error, luego este se activa por el catch quien lo lanza nuevamente*/
            throw new Error("Modificacion a registro" + it.getId_Itinerario() + "Ha devuelto un recordSet null Ubicacion =" + this.getClass().getName());
        }
    }
}
//public class ProveedorBD {
//
//    private Proveedor p;
//
//    public ProveedorBD(Proveedor p) {
//        this.p = p;
//    }
//
//    /*Metodo Grabar*/
//    public void Grabar() throws ClassNotFoundException,
//            InstantiationException,
//            IllegalAccessException,
//            SQLException {
//        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
//    }
//
//    /*Metodo Modificar*/
//    public void Modificar() throws ClassNotFoundException,
//            InstantiationException,
//            IllegalAccessException,
//            SQLException {
//       
//
//        cdb.un_sql = "SELECT ruc FROM proveedor WHERE ruc=" + p.getRuc() + ";";
//        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);
//
//        if (cdb.resultado != null) {
//            if (cdb.resultado.next()) {
//                 cdb.un_sql = "UPDATE proveedor SET razon='" + p.getRazon_social() + "',direccion='" + p.getDireccion() + "',tel=" + p.getTel()+ " WHERE ruc=" + p.getRuc() + ";";
//                cdb.us_st.executeUpdate(cdb.un_sql);
//            } else {
//                /*Generamos nuestro propio error, luego este se activa por el catch quien lo lanza nuevamente*/
//                throw new Error("Registro" + p.getRuc() + "No se encuentra en la tabla proveedor Ubicacion'" + this.getClass().getName());
//            }
//        } else {
//            /*Generamos nuestro propio error, luego este se activa por el catch quien lo lanza nuevamente*/
//            throw new Error("Modificacion a registro" + p.getRuc() + "Ha devuelto un recordSet null Ubicacion =" + this.getClass().getName());
//        }
//    }
//
//    /*Metodo Leer*/
//    public Proveedor Leer() throws ClassNotFoundException,
//            InstantiationException,
//            IllegalAccessException,
//            SQLException,
//            Error {
//        Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
//        cdb.un_sql = "SELECT * FROM proveedor WHERE ruc='" + p.getRuc() + "'";
//        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);
//        if (cdb.resultado != null) {
//            if (cdb.resultado.next()) {
//                p.setRuc(cdb.resultado.getString("ruc"));
//                p.setRazon_social(cdb.resultado.getString("razon"));
//                p.setDireccion(cdb.resultado.getString("direccion"));
//                p.setTel(cdb.resultado.getString("tel"));
//            } else {
//                /*Generamos nuestro propio error, luego este se activa por el catch quien lo lanza nuevamente*/
//                throw new Error("Registro " + p.getRuc() + " No se encuentra en la tabla proveedor Ubicacion'" + this.getClass().getName());
//            }
//        } else {
//            /*Generamos nuestro propio error, luego este se activa por el catch quien lo lanza nuevamente*/
//            throw new Error("Consulta a registro" + p.getRuc() + "Ha devuelto un recordSet null Ubicacion=" + this.getClass().getName());
//        }
//        return p;
//    }
//
//    
//
//   
//
//    
//}
