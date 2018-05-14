package principal;

import controlador.controladorItinerario;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;
import servicios.ConectarServicio;
import servicios.Conexion;
import ui.Menu;
import ui.ProveedorConsola;

public class Main {

    public static void main(String[] args) throws SQLException {

        try {
            FileInputStream propFile = new FileInputStream("src\\principal\\configurardb.txt");
            Properties p = new Properties(System.getProperties());
            p.load(propFile);
            System.setProperties(p);
            if (System.getProperty("mostrarpropierties").compareTo("si") == 0) {
                System.getProperties().list(System.out);
            }
        } catch (java.io.FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo de configuracion" + e);
            System.exit(-1);
        } catch (java.io.IOException w) {
            JOptionPane.showMessageDialog(null, "Ocurrio algun error de I/O");
            System.exit(-1);
        }

        try {
            Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
        } catch (java.lang.ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio la excepcion" + e.toString());
            JOptionPane.showMessageDialog(null, "es probable que no se puede encontrar la clase del conector jdbc" + System.getProperty("driver")
                    + "Agregela en su classpath con la opcion -cp");
            System.exit(-1);
        } catch (java.lang.InstantiationException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error de instanciamiento" + e.toString());
            System.exit(-1);

        } catch (java.lang.IllegalAccessException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error de acceso ilegal" + e.toString());
            System.exit(-1);
        }

        try {
            Menu fr= new Menu ();
            fr.setVisible(true);
            controladorItinerario ct = new controladorItinerario();
            ProveedorConsola pc = new ProveedorConsola(ct);
            pc.accionar();
//            

        } catch (ClassNotFoundException e) {
            System.out.println("Ocurrio la excepcion" + e.toString());
        } catch (InstantiationException e) {
            System.out.println("Ocurrio una excepcion SQL" + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Ocurrio la excepcion de acceso ilegal" + e.toString());
        } catch (SQLException e) {
            System.out.println("Ocurrio una excepcion SQL" + e.getMessage());
        } catch (Error e) {
            System.out.println("Ocurrio el error" + e.getMessage());
        } /* 

         /*
         try {
         FileInputStream propFile = new FileInputStream("src\\sistemasjym\\principal\\configurardb.txt");
         Properties p = new Properties(System.getProperties());
         p.load(propFile);
         System.setProperties(p);
         if (System.getProperty("mostrarpropierties").compareTo("si") == 0) {
         System.getProperties().list(System.out);
         }
         } catch (java.io.FileNotFoundException e) {
         JOptionPane.showMessageDialog(null, "No se encuentra el archivo de configuracion" + e);
         System.exit(-1);
         } catch (java.io.IOException w) {
         JOptionPane.showMessageDialog(null, "Ocurrio algun error de I/O");
         System.exit(-1);
         }

         try {
         Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
         } catch (java.lang.ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "Ocurrio la excepcion" + e.toString());
         JOptionPane.showMessageDialog(null, "es probable que no se puede encontrar la clase del conector jdbc" + System.getProperty("driver")
         + "Agregela en su classpath con la opcion -cp");
         System.exit(-1);
         } catch (java.lang.InstantiationException e) {
         JOptionPane.showMessageDialog(null, "Ocurrio un error de instanciamiento" + e.toString());
         System.exit(-1);

         } catch (java.lang.IllegalAccessException e) {
         JOptionPane.showMessageDialog(null, "Ocurrio un error de acceso ilegal" + e.toString());
         System.exit(-1);
         }

         try {
         Frm_Proveedores fr= new Frm_Proveedores();
         fr.setVisible(true);*/
//            ControladorProveedor ct = new ControladorProveedor();
//            ProveedorConsola pc = new ProveedorConsola(ct);
//            pc.accionar();

//        } catch (ClassNotFoundException e) {
//            System.out.println("Ocurrio la excepcion" + e.toString());
//        } catch (InstantiationException e) {
//            System.out.println("Ocurrio una excepcion SQL" + e.getMessage());
//        } catch (IllegalAccessException e) {
//            System.out.println("Ocurrio la excepcion de acceso ilegal" + e.toString());
//        } catch (SQLException e) {
//            System.out.println("Ocurrio una excepcion SQL" + e.getMessage());
      /*  } catch (Error e) {
         System.out.println("Ocurrio el error" + e.getMessage());
         } 
         }*/
    }
}
