package ui;

import controlador.controladorItinerario;
import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Itinerario;

public class ProveedorConsola {

    private controladorItinerario cp;

    public ProveedorConsola(controladorItinerario cp) {
        this.cp = cp ;
    }
    private  void recargarlistaItinerario () throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList<Itinerario> r = new ArrayList<>();
        r = cp.recargarProveedores();
        for (Itinerario k:r) {
            System.out.println(k);
        }        
    }
    public void  accionar () throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    this.recargarlistaItinerario();
    }
}
