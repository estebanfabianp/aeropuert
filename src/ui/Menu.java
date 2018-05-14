package ui;

import controlador.controladorItinerario;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import servicios.ConectarServicio;
import servicios.Conexion;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        cargarprobedores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jpreserva = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcedulaR = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        btnvertarifas = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btnquitar = new javax.swing.JButton();
        btnatrasR = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        fh7 = new javax.swing.JLabel();
        cbdia7 = new javax.swing.JComboBox();
        l13 = new javax.swing.JLabel();
        cbmes7 = new javax.swing.JComboBox();
        l14 = new javax.swing.JLabel();
        cbaño7 = new javax.swing.JComboBox();
        cbhora2 = new javax.swing.JComboBox();
        p7 = new javax.swing.JLabel();
        cbmin7 = new javax.swing.JComboBox();
        ca7 = new javax.swing.JLabel();
        cbcategoria7 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        cbareolinea7 = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        cbnasiento7 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        fh8 = new javax.swing.JLabel();
        cbdia8 = new javax.swing.JComboBox();
        l15 = new javax.swing.JLabel();
        cbmes8 = new javax.swing.JComboBox();
        l16 = new javax.swing.JLabel();
        cbaño8 = new javax.swing.JComboBox();
        cbhora3 = new javax.swing.JComboBox();
        p8 = new javax.swing.JLabel();
        cbmin8 = new javax.swing.JComboBox();
        ca8 = new javax.swing.JLabel();
        cbcategoria8 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        cbareolinea8 = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        cbnasiento8 = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        fh9 = new javax.swing.JLabel();
        cbdia9 = new javax.swing.JComboBox();
        l17 = new javax.swing.JLabel();
        cbmes9 = new javax.swing.JComboBox();
        l18 = new javax.swing.JLabel();
        cbaño9 = new javax.swing.JComboBox();
        cbhora6 = new javax.swing.JComboBox();
        p9 = new javax.swing.JLabel();
        cbmin9 = new javax.swing.JComboBox();
        ca9 = new javax.swing.JLabel();
        cbcategoria9 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        cbareolinea9 = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        cbnasiento9 = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        btnverregistro = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        txtcedulaR2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcedulaR3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnvertodareservas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jptarifa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtItinerario = new javax.swing.JTable();
        txtbvuelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnregistar = new javax.swing.JButton();
        btnactualizar1 = new javax.swing.JButton();
        btnbuscar1 = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        txtitinerario = new javax.swing.JTextField();
        txtcc = new javax.swing.JTextField();
        txtnombre_vuelo = new javax.swing.JTextField();
        txtcuidad_llegada = new javax.swing.JTextField();
        txtcuidad_salida = new javax.swing.JTextField();
        txt_id_boleto = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        txttarifa_itinerario = new javax.swing.JTextField();
        txtaerolinea = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpreserva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("valor Total");
        jpreserva.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));
        jpreserva.add(txtcedulaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 12, 183, -1));

        jLabel20.setText("numero de vuelos que desea reservar");
        jpreserva.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Eliga el numero de vuelos", "1", "2", "3" }));
        jpreserva.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 171, -1));

        btnvertarifas.setText("Ver listado de tarifas");
        btnvertarifas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvertarifasActionPerformed(evt);
            }
        });
        jpreserva.add(btnvertarifas, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 11, -1, -1));

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        jpreserva.add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        btnquitar.setText("Quitar");
        btnquitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitarActionPerformed(evt);
            }
        });
        jpreserva.add(btnquitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        btnatrasR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/regresar.png"))); // NOI18N
        btnatrasR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasRActionPerformed(evt);
            }
        });
        jpreserva.add(btnatrasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 7, 60, 60));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fh7.setText("Fecha y  hora ");
        jPanel1.add(fh7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        cbdia7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(cbdia7, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 11, -1, -1));

        l13.setText("/");
        jPanel1.add(l13, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 14, -1, -1));

        cbmes7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Octubre", "Noviembre", "Diciembre" }));
        jPanel1.add(cbmes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 11, -1, -1));

        l14.setText("/");
        jPanel1.add(l14, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 14, -1, -1));

        cbaño7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064" }));
        jPanel1.add(cbaño7, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 11, -1, -1));

        cbhora2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "hora", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cbhora2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbhora2ActionPerformed(evt);
            }
        });
        jPanel1.add(cbhora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 11, -1, -1));

        p7.setText(":");
        jPanel1.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 14, -1, -1));

        cbmin7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "minutos", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "59" }));
        jPanel1.add(cbmin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 11, -1, -1));

        ca7.setText("Categoria de asiento");
        jPanel1.add(ca7, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 14, -1, -1));

        cbcategoria7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primera clase", "Clase turista ", "Clase economica" }));
        jPanel1.add(cbcategoria7, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 11, 116, -1));

        jLabel14.setText("Aerolinea");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        cbareolinea7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija la aerolina de su preferencia", " " }));
        jPanel1.add(cbareolinea7, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 42, -1, -1));

        jLabel28.setText("Numero de asientos");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 45, -1, -1));

        cbnasiento7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "numero de asientos", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "59", "60 ", "61 ", "62 ", "63 ", "64 ", "65 ", "66 ", "67 ", "68 ", "69 ", "70 ", "71 ", "72 ", "73 ", "74 ", "75 ", "76 ", "77 ", "78 ", "79 ", "80 ", "81 ", "82 ", "83 ", "84 ", "85 ", "86 ", "87 ", "88 ", "89 ", "90 ", "91 ", "92 ", "93 ", "94 ", "95 ", "96 ", "97 ", "98 ", "99 ", "100 " }));
        cbnasiento7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnasiento7ActionPerformed(evt);
            }
        });
        jPanel1.add(cbnasiento7, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 42, 183, -1));

        jpreserva.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fh8.setText("Fecha y  hora ");
        jPanel3.add(fh8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cbdia8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel3.add(cbdia8, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 11, -1, -1));

        l15.setText("/");
        jPanel3.add(l15, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 14, -1, -1));

        cbmes8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Octubre", "Noviembre", "Diciembre" }));
        jPanel3.add(cbmes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 11, -1, -1));

        l16.setText("/");
        jPanel3.add(l16, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 14, -1, -1));

        cbaño8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064" }));
        jPanel3.add(cbaño8, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 11, -1, -1));

        cbhora3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "hora", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cbhora3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbhora3ActionPerformed(evt);
            }
        });
        jPanel3.add(cbhora3, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 11, -1, -1));

        p8.setText(":");
        jPanel3.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 14, -1, -1));

        cbmin8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "minutos", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "59" }));
        jPanel3.add(cbmin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 11, -1, -1));

        ca8.setText("Categoria de asiento");
        jPanel3.add(ca8, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 14, -1, -1));

        cbcategoria8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primera clase", "Clase turista ", "Clase economica" }));
        jPanel3.add(cbcategoria8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 11, 116, -1));

        jLabel15.setText("Aerolinea");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        cbareolinea8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija la aerolina de su preferencia", " " }));
        jPanel3.add(cbareolinea8, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 42, -1, -1));

        jLabel29.setText("Numero de asientos");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 45, -1, -1));

        cbnasiento8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "numero de asientos", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "59", "60 ", "61 ", "62 ", "63 ", "64 ", "65 ", "66 ", "67 ", "68 ", "69 ", "70 ", "71 ", "72 ", "73 ", "74 ", "75 ", "76 ", "77 ", "78 ", "79 ", "80 ", "81 ", "82 ", "83 ", "84 ", "85 ", "86 ", "87 ", "88 ", "89 ", "90 ", "91 ", "92 ", "93 ", "94 ", "95 ", "96 ", "97 ", "98 ", "99 ", "100 " }));
        cbnasiento8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnasiento8ActionPerformed(evt);
            }
        });
        jPanel3.add(cbnasiento8, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 42, 183, -1));

        jpreserva.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 803, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fh9.setText("Fecha y  hora ");
        jPanel4.add(fh9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        cbdia9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel4.add(cbdia9, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 11, -1, -1));

        l17.setText("/");
        jPanel4.add(l17, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 14, -1, -1));

        cbmes9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Octubre", "Noviembre", "Diciembre" }));
        jPanel4.add(cbmes9, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 11, -1, -1));

        l18.setText("/");
        jPanel4.add(l18, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 14, -1, -1));

        cbaño9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064" }));
        jPanel4.add(cbaño9, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 11, -1, -1));

        cbhora6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "hora", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cbhora6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbhora6ActionPerformed(evt);
            }
        });
        jPanel4.add(cbhora6, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 11, -1, -1));

        p9.setText(":");
        jPanel4.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 14, -1, -1));

        cbmin9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "minutos", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "59" }));
        jPanel4.add(cbmin9, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 11, -1, -1));

        ca9.setText("Categoria de asiento");
        jPanel4.add(ca9, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 14, -1, -1));

        cbcategoria9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primera clase", "Clase turista ", "Clase economica" }));
        jPanel4.add(cbcategoria9, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 11, 116, -1));

        jLabel16.setText("Aerolinea");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        cbareolinea9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija la aerolina de su preferencia", " " }));
        jPanel4.add(cbareolinea9, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 42, -1, -1));

        jLabel30.setText("Numero de asientos");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 45, -1, -1));

        cbnasiento9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "numero de asientos", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "59", "60 ", "61 ", "62 ", "63 ", "64 ", "65 ", "66 ", "67 ", "68 ", "69 ", "70 ", "71 ", "72 ", "73 ", "74 ", "75 ", "76 ", "77 ", "78 ", "79 ", "80 ", "81 ", "82 ", "83 ", "84 ", "85 ", "86 ", "87 ", "88 ", "89 ", "90 ", "91 ", "92 ", "93 ", "94 ", "95 ", "96 ", "97 ", "98 ", "99 ", "100 " }));
        cbnasiento9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnasiento9ActionPerformed(evt);
            }
        });
        jPanel4.add(cbnasiento9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 42, 183, -1));

        jpreserva.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 293, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Reservas"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnverregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/guardar.png"))); // NOI18N
        btnverregistro.setText("Guardar");
        btnverregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverregistroActionPerformed(evt);
            }
        });
        jPanel5.add(btnverregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/actualizar.png"))); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jPanel5.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/BuscaEmpleado.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel5.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/eliminar.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel5.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jpreserva.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 371, 280, 180));
        jpreserva.add(txtcedulaR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 183, -1));

        jLabel3.setText("Cedula");
        jpreserva.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 15, -1, -1));

        jLabel2.setText("N° de boleto");
        jpreserva.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));
        jpreserva.add(txtcedulaR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 183, -1));

        jRadioButton1.setText("Vuelo");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jpreserva.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, -1, -1));

        jRadioButton2.setText("Reserva");
        jpreserva.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, -1, -1));

        btnvertodareservas.setText("Ver todo las Reservas");
        jpreserva.add(btnvertodareservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/fondo2.jpg"))); // NOI18N
        jpreserva.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 560));

        jTabbedPane3.addTab("Reservas", jpreserva);

        jptarifa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtItinerario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtItinerario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtItinerarioMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtItinerario);

        jptarifa.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 41, 890, 520));

        txtbvuelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbvueloKeyTyped(evt);
            }
        });
        jptarifa.add(txtbvuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Buscar");
        jptarifa.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        jTabbedPane3.addTab("tabla de tarifas", jptarifa);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 40, -1, -1));

        jLabel6.setText("reservas esteban jejje");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 20));

        jLabel7.setText("n itinerario");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel8.setText("cc");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel9.setText("nombre del vuelo");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel10.setText("cuidad de llegada");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel11.setText("cuidad de salida");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel12.setText("fecha y hora");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 20));

        estado.setText("estado");
        jPanel2.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 20));

        jLabel17.setText("tarifa del itinerario");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, 20));

        jLabel18.setText("aerolinea");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, 20));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Reservas"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnregistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/guardar.png"))); // NOI18N
        btnregistar.setText("Guardar");
        btnregistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistarActionPerformed(evt);
            }
        });
        jPanel7.add(btnregistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnactualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/actualizar.png"))); // NOI18N
        btnactualizar1.setText("Actualizar");
        btnactualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizar1ActionPerformed(evt);
            }
        });
        jPanel7.add(btnactualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnbuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/BuscaEmpleado.png"))); // NOI18N
        btnbuscar1.setText("Buscar");
        btnbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar1ActionPerformed(evt);
            }
        });
        jPanel7.add(btnbuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/eliminar.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel7.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 280, 180));
        jPanel2.add(txtitinerario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 80, -1));
        jPanel2.add(txtcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 80, -1));
        jPanel2.add(txtnombre_vuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 80, -1));
        jPanel2.add(txtcuidad_llegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 80, -1));
        jPanel2.add(txtcuidad_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 80, -1));
        jPanel2.add(txt_id_boleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 80, -1));
        jPanel2.add(txtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 80, -1));
        jPanel2.add(txttarifa_itinerario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 80, -1));
        jPanel2.add(txtaerolinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 80, -1));
        jPanel2.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 80, -1));

        jLabel13.setText("id del boleto");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jTabbedPane3.addTab("Reservas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/* metodo cargar los itinerarios   jtable*/

    public void cargarprobedores() {
        DefaultTableModel m;
        try {
            String titulo[] = {"id_itinerario", "id_usuario", "nombre_vuelo", "cuidad_llegada", "cuidad_salida", "fecha_hora", "id_boleto", "estado", "tarifa_itinerario", "aerolinea"};
            m = new DefaultTableModel(null, titulo);
            JTable p = new JTable(m);
            String fila[] = new String[20];
            Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
            cdb.un_sql = "SELECT * FROM `itinerario`";/// modifacar esto   
            cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);
            int index = 1;

            while (cdb.resultado.next()) {
                fila[0] = String.valueOf(index);
                fila[1] = cdb.resultado.getString(1);
                fila[2] = cdb.resultado.getString(2);
                fila[3] = cdb.resultado.getString(3);
                fila[4] = cdb.resultado.getString(4);
                fila[5] = cdb.resultado.getString(5);
                fila[6] = cdb.resultado.getString(6);
                fila[7] = cdb.resultado.getString(7);
                fila[8] = cdb.resultado.getString(8);
                fila[9] = cdb.resultado.getString(9);
                fila[10] = cdb.resultado.getString(10);

                m.addRow(fila);
                index++;

            }

            jtItinerario.setModel(m);
            TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(m);
            jtItinerario.setRowSorter(ordenar);
            this.jtItinerario.setModel(m);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al extraer los datos de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void cbnasiento9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnasiento9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnasiento9ActionPerformed

    private void cbhora6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbhora6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbhora6ActionPerformed

    private void cbnasiento8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnasiento8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnasiento8ActionPerformed

    private void cbhora3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbhora3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbhora3ActionPerformed

    private void cbnasiento7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnasiento7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnasiento7ActionPerformed

    private void cbhora2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbhora2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbhora2ActionPerformed

    private void btnatrasRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasRActionPerformed

    }//GEN-LAST:event_btnatrasRActionPerformed

    private void btnquitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnquitarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnvertarifasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvertarifasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvertarifasActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        try {// debo mandar los datos como lo valla a ingresar 
            String id_it = txtitinerario.getText();
            String id_us = txtcc.getText();
            String no_vu = txtnombre_vuelo.getText();
            String cu_ll = txtcuidad_llegada.getText();
            String cu_sa = txtcuidad_salida.getText();
            String ho_fe = txtfecha.getText();
            String id_bo = txt_id_boleto.getText();
            String es = txtestado.getText();
            String ta_it = txttarifa_itinerario.getText();
            String ae = txtaerolinea.getText();

            controladorItinerario cp = new controladorItinerario();
            cp.agregarProveedor(id_it, id_us, no_vu, cu_ll, cu_sa, ho_fe, id_bo, es, ta_it, ae);
            //LimpiarCajasTexto();
            //cargarProveedores();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "El itinerario" + txtitinerario.getText() + " ya existe, ingrese un itinerario distinto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnverregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverregistroActionPerformed
        try {// debo mandar los datos como lo valla a ingresar 
            String id_it = txtitinerario.getText();
            String id_us = txtcc.getText();
            String no_vu = txtnombre_vuelo.getText();
            String cu_ll = txtcuidad_llegada.getText();
            String cu_sa = txtcuidad_salida.getText();
            String ho_fe = txtfecha.getText();
            String id_bo = txt_id_boleto.getText();
            String es = txtestado.getText();
            String ta_it = txttarifa_itinerario.getText();
            String ae = txtaerolinea.getText();

            controladorItinerario cp = new controladorItinerario();
            cp.modificarProveedor(id_it, id_us, no_vu, cu_ll, cu_sa, ho_fe, id_bo, es, ta_it, ae);
            //LimpiarCajasTexto();
            //cargarProveedores();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "El itinerario" + txtitinerario.getText() + " ya existe, ingrese un itinerario distinto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnverregistroActionPerformed

    private void jtItinerarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtItinerarioMousePressed
        int clie = this.jtItinerario.getSelectedRow();
        txtitinerario.setEditable(false);
        btnregistar.setEnabled(false);
        eliminar.setEnabled(true);
        try {
            this.txtitinerario.setText(jtItinerario.getValueAt(clie, 1).toString());
            this.txtcc.setText(jtItinerario.getValueAt(clie, 2).toString());
            this.txtnombre_vuelo.setText(jtItinerario.getValueAt(clie, 3).toString());
            this.txtcuidad_llegada.setText(jtItinerario.getValueAt(clie, 4).toString());
            this.txtcuidad_salida.setText(jtItinerario.getValueAt(clie, 5).toString());
            this.txtfecha.setText(jtItinerario.getValueAt(clie, 6).toString());
            this.txt_id_boleto.setText(jtItinerario.getValueAt(clie, 7).toString());
            this.txtestado.setText(jtItinerario.getValueAt(clie, 8).toString());
            this.txttarifa_itinerario.setText(jtItinerario.getValueAt(clie, 9).toString());
            this.txtaerolinea.setText(jtItinerario.getValueAt(clie, 10).toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos de el proveedor", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtItinerarioMousePressed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        cargarprobedores();
        try {
            String id_it = txtitinerario.getText();

            controladorItinerario cp = new controladorItinerario();
            cp.eliminarProveedor(id_it);
            // LimpiarCajasTexto();
            cargarprobedores();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en la eliminacion del registro", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtbvueloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbvueloKeyTyped
        buscarVuelo();
    }//GEN-LAST:event_txtbvueloKeyTyped

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btnregistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistarActionPerformed
        try {// debo mandar los datos como lo valla a ingresar 
            String id_it = txtitinerario.getText();
            String id_us = txtcc.getText();
            String no_vu = txtnombre_vuelo.getText();
            String cu_ll = txtcuidad_llegada.getText();
            String cu_sa = txtcuidad_salida.getText();
            String ho_fe = txtfecha.getText();
            String id_bo = txt_id_boleto.getText();
            String es = txtestado.getText();
            String ta_it = txttarifa_itinerario.getText();
            String ae = txtaerolinea.getText();

            controladorItinerario cp = new controladorItinerario();
              cp.agregarProveedor(id_it, id_us, no_vu, cu_ll, cu_sa, ho_fe, id_bo, es, ta_it, ae);
            //LimpiarCajasTexto();
            //cargarProveedores();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "El itinerariossss" + txtitinerario.getText() + " ya existe, ingrese un itinerario distinto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnregistarActionPerformed

    private void btnactualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizar1ActionPerformed
        try {// debo mandar los datos como lo valla a ingresar 
            String id_it = txtitinerario.getText();
            String id_us = txtcc.getText();
            String no_vu = txtnombre_vuelo.getText();
            String cu_ll = txtcuidad_llegada.getText();
            String cu_sa = txtcuidad_salida.getText();
            String ho_fe = txtfecha.getText();
            String id_bo = txt_id_boleto.getText();
            String es = txtestado.getText();
            String ta_it = txttarifa_itinerario.getText();
            String ae = txtaerolinea.getText();

            controladorItinerario cp = new controladorItinerario();
            cp.modificarProveedor(id_it, id_us, no_vu, cu_ll, cu_sa, ho_fe, id_bo, es, ta_it, ae);
            //LimpiarCajasTexto();
            //cargarProveedores();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "El itinerario" + txtitinerario.getText() + " ya existe, ingrese un itinerario distinto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnactualizar1ActionPerformed

    private void btnbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscar1ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        try {// debo mandar los datos como lo valla a ingresar 
            String id_it = txtitinerario.getText();
            String id_us = txtcc.getText();
            String no_vu = txtnombre_vuelo.getText();
            String cu_ll = txtcuidad_llegada.getText();
            String cu_sa = txtcuidad_salida.getText();
            String ho_fe = txtfecha.getText();
            String id_bo = txt_id_boleto.getText();
            String es = txtestado.getText();
            String ta_it = txttarifa_itinerario.getText();
            String ae = txtaerolinea.getText();

            controladorItinerario cp = new controladorItinerario();
            cp.eliminarProveedor(ta_it);
            //LimpiarCajasTexto();
            //cargarProveedores();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "El itinerario" + txtitinerario.getText() + " ya existe, ingrese un itinerario distinto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarActionPerformed
    public void buscarVuelo() {
        DefaultTableModel m;
        try {
            String titulo[] = {"Nro", "Ruc", "Razon Social", "Direccion", "Telefono"};
            m = new DefaultTableModel(null, titulo);
            JTable p = new JTable(m);
            String fila[] = new String[6];
            Conexion cdb = ConectarServicio.getInstancia().getConexionDb();
            cdb.un_sql = "Ver empleado '" + txtbvuelo.getText().trim();// metodo
            cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);
            int index = 1;

            while (cdb.resultado.next()) {
                fila[0] = String.valueOf(index);
                fila[1] = cdb.resultado.getString(1);
                fila[2] = cdb.resultado.getString(2);
                fila[3] = cdb.resultado.getString(3);
                fila[4] = cdb.resultado.getString(4);
                m.addRow(fila);
                index++;
            }

            jtItinerario.setModel(m);
            TableRowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(m);
            jtItinerario.setRowSorter(ordenar);
            this.jtItinerario.setModel(m);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al extraer los datos de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnactualizar1;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnatrasR;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnbuscar1;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnquitar;
    private javax.swing.JButton btnregistar;
    private javax.swing.JButton btnverregistro;
    private javax.swing.JButton btnvertarifas;
    private javax.swing.JButton btnvertodareservas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JLabel ca7;
    private javax.swing.JLabel ca8;
    private javax.swing.JLabel ca9;
    private javax.swing.JComboBox cbareolinea7;
    private javax.swing.JComboBox cbareolinea8;
    private javax.swing.JComboBox cbareolinea9;
    private javax.swing.JComboBox cbaño7;
    private javax.swing.JComboBox cbaño8;
    private javax.swing.JComboBox cbaño9;
    private javax.swing.JComboBox cbcategoria7;
    private javax.swing.JComboBox cbcategoria8;
    private javax.swing.JComboBox cbcategoria9;
    private javax.swing.JComboBox cbdia7;
    private javax.swing.JComboBox cbdia8;
    private javax.swing.JComboBox cbdia9;
    private javax.swing.JComboBox cbhora2;
    private javax.swing.JComboBox cbhora3;
    private javax.swing.JComboBox cbhora6;
    private javax.swing.JComboBox cbmes7;
    private javax.swing.JComboBox cbmes8;
    private javax.swing.JComboBox cbmes9;
    private javax.swing.JComboBox cbmin7;
    private javax.swing.JComboBox cbmin8;
    private javax.swing.JComboBox cbmin9;
    private javax.swing.JComboBox cbnasiento7;
    private javax.swing.JComboBox cbnasiento8;
    private javax.swing.JComboBox cbnasiento9;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel fh7;
    private javax.swing.JLabel fh8;
    private javax.swing.JLabel fh9;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JPanel jpreserva;
    private javax.swing.JPanel jptarifa;
    private javax.swing.JTable jtItinerario;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l18;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel p9;
    private javax.swing.JTextField txt_id_boleto;
    private javax.swing.JTextField txtaerolinea;
    private javax.swing.JTextField txtbvuelo;
    private javax.swing.JTextField txtcc;
    private javax.swing.JTextField txtcedulaR;
    private javax.swing.JTextField txtcedulaR2;
    private javax.swing.JTextField txtcedulaR3;
    private javax.swing.JTextField txtcuidad_llegada;
    private javax.swing.JTextField txtcuidad_salida;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtitinerario;
    private javax.swing.JTextField txtnombre_vuelo;
    private javax.swing.JTextField txttarifa_itinerario;
    // End of variables declaration//GEN-END:variables
}
