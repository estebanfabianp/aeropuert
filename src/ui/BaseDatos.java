package ui;

import java.sql.*;
import javax.swing.JOptionPane;

public class BaseDatos {

    public String cc = "";
    public String psw = "";
    public boolean existe = false;
    public boolean proceso = false;
    public boolean eliminar = false;
    public String bd = "aeropuerto";
    public String login = "root";
    public String password = "";
    public String url = "jdbc:mysql://localhost/" + bd;

    public boolean ValidarUsuario(String cc, String psw) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(url, login, password);
         

            if (conn != null) {

                Statement stmt = conn.createStatement();

                ResultSet consultar = stmt.executeQuery("SELECT * FROM usuario");
                while (consultar.next()) {
                    String cedula = consultar.getString(1);
                    String password = consultar.getString(3);
                    System.out.println(cedula +" cc"+ cc);
                    System.out.println(password+ " contrasena "+psw);
                    if (cc.equals(cedula) && psw.equals(password)) {
                        this.cc = cc;
                        this.psw = psw;
                        existe = true;
                        System.out.println("entro");
                        break;
                    } else {
                        System.out.println("salio");
                        existe = false;
                    }
                }
                consultar.close();
                stmt.close();
                conn.close();
            }

        } catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos " + url);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        System.out.println(existe);
        return existe;

    }

    public String Insertar(String cedula, String nombre, String email, String psw) {
        Connection conn = null;
        String msg = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(url, login, password);

            if (conn != null) {

                int rows = 0;

                PreparedStatement stmt = conn.prepareStatement("INSERT INTO usuario (CEDULA, NOMBRE, EMAIL, PASSWORD)"
                        + " VALUES (?,?,?,?)");

                stmt.setString(1, cedula);               // cedula
                stmt.setString(2, nombre);               // nombre
                stmt.setString(3, email);                // email
                stmt.setString(4, psw);                  // password

                rows = stmt.executeUpdate();

                if (rows == 0) {
                    proceso = false;
                    msg = "El Usuario no se ha ingresado satisfactoriamente, "
                            + "\npuede que ya exista en la BD";
                } else {
                    proceso = true;
                    msg = "El usuario se ha ingresado "
                            + "\nsatisfactoriamente en la BD";
                }

                stmt.close();
                conn.close();

            }
        } catch (SQLException ex) {
            proceso = false;
            msg = "Hubo un problema al intentar conectarse con la base de datos " + url + " \no el usuario ya"
                    + " se encuentra registrado en la BD";
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

        return msg;
    }

    public String Eliminar(String cedula) {
        String msg = "";
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(url, login, password);

            if (conn != null) {
                int rows = 0;
                Statement stmt = conn.createStatement();
                rows = stmt.executeUpdate("DELETE FROM usuario WHERE cedula=" + "'" + cedula + "'");
                if (rows == 0) {
                    eliminar = false;
                    msg = "El Usuario " + cedula + " ya habia sido eliminado "
                            + "\no no existe en esta Base de Datos";
                } else {
                    eliminar = true;
                    msg = "El Usuario " + cedula + " "
                            + "\nha sido eliminado satisfactoriamente";
                }
                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
            eliminar = false;
            msg = "Hubo un problema al intentar "
                    + "\nconectarse con la base de datos " + url;
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

        return msg;
    }

    public void Consultar() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(url, login, password);

            if (conn != null) {

                Statement stmt = conn.createStatement();

                ResultSet consultar = stmt.executeQuery("SELECT * FROM usuario");
                System.out.println("\nCEDULA - NOMBRE - EMAIL - PASSWORD\n");

                while (consultar.next()) {
                    String cedula = consultar.getString(1);
                    String nombre = consultar.getString(2);
                    String email = consultar.getString(3);
                    String password = consultar.getString(4);
                    System.out.println(cedula + " - " + nombre + " - " + email + " - " + password);
                }
                consultar.close();
                stmt.close();
                conn.close();
            }

        } catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos " + url);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
