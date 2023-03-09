package view;

import control.FiltroNumero;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;
import model.Moneda;
import model.Temperatura;
import model.Tiempo;

/**
 *
 * @author miguel
 */
public class JFConversor extends javax.swing.JFrame {


    public JFConversor() {
        initComponents();
        DocumentFilter filtro = new FiltroNumero();
        AbstractDocument moneda = (AbstractDocument) jTextMonto.getDocument();
        moneda.setDocumentFilter(filtro);
        AbstractDocument temperatura = (AbstractDocument) jTextCantidadInicial.getDocument();
        temperatura.setDocumentFilter(filtro);
        AbstractDocument tiempo = (AbstractDocument) jTTiempoInicial.getDocument();
        tiempo.setDocumentFilter(filtro);
    }
    private String convertidoDe;
    private String convertidoA;
    double cantidadInicial;

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jTabbedPaneMoneda = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDe = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxA = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextResultado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextMonto = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextCantidadInicial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboDe = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboA = new javax.swing.JComboBox<>();
        jBConvertir = new javax.swing.JButton();
        jTextResultadoTemp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTTiempoInicial = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jCDeTiempo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jCATiempo = new javax.swing.JComboBox<>();
        jBConvertirTiempo = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTResultadoTiempo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setText("De:");

        jComboBoxDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sol", "Dolar USD", "Euro", "Libras Esterlinas", "Yen Japones", "Won surcoreano" }));

        jLabel3.setText("A:");

        jComboBoxA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar USD", "Euro", "Libras Esterlinas", "Yen Japones", "Won surcoreano", "Sol" }));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 0, 20)); // NOI18N
        jLabel4.setText("Resultado:");

        jTextResultado.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 0, 20)); // NOI18N
        jLabel5.setText("Monto:");

        jButtonCalcular.setText("Convertir");
        jButtonCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCalcularMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jTextMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCalcular)
                        .addGap(201, 201, 201))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButtonCalcular)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPaneMoneda.addTab("Moneda", jPanel1);

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 0, 20)); // NOI18N
        jLabel1.setText("Temperatura:");

        jLabel6.setText("De:");

        jComboDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Kelvin" }));

        jLabel7.setText("A:");

        jComboA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelvin", "Fahrenheit", "Celcius" }));

        jBConvertir.setText("Convertir");
        jBConvertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBConvertirMouseClicked(evt);
            }
        });

        jTextResultadoTemp.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Myanmar Text", 0, 20)); // NOI18N
        jLabel8.setText("Resultado:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextCantidadInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jBConvertir)
                        .addGap(201, 201, 201))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jComboDe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addComponent(jComboA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextResultadoTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextCantidadInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jBConvertir)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextResultadoTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jTabbedPaneMoneda.addTab("Temperatura", jPanel2);

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 0, 20)); // NOI18N
        jLabel9.setText("Tiempo:");

        jLabel10.setText("De:");

        jCDeTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "segundos", "minutos", "horas", "dias", "semanas", "meses", "años" }));

        jLabel11.setText("A:");

        jCATiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "minutos", "horas", "dias", "semanas", "meses", "años", "segundos" }));

        jBConvertirTiempo.setText("Convertir");
        jBConvertirTiempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBConvertirTiempoMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Myanmar Text", 0, 20)); // NOI18N
        jLabel12.setText("Resultado:");

        jTResultadoTiempo.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTTiempoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jBConvertirTiempo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jCDeTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jCATiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jTResultadoTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTTiempoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jCDeTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jCATiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jBConvertirTiempo)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTResultadoTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPaneMoneda.addTab("Tiempo", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMoneda)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMoneda, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }

    private void jButtonCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCalcularMouseClicked
        if (this.jTextMonto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el monto", "Faltan datos", JOptionPane.WARNING_MESSAGE);
        }
        cambioMoneda();
    }

    private void jBConvertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConvertirMouseClicked
        if (this.jTextCantidadInicial.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la temperatura", "Faltan datos", JOptionPane.WARNING_MESSAGE);
        }
        cambioTemperatura();
    }

    private void jBConvertirTiempoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConvertirTiempoMouseClicked
        if (this.jTTiempoInicial.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el tiempo", "Faltan datos", JOptionPane.WARNING_MESSAGE);
        }
        cambioTiempo();
    }

    private void cambioMoneda() {
        cantidadInicial = Double.parseDouble(this.jTextMonto.getText().toLowerCase().trim());
        convertidoDe = this.jComboBoxDe.getSelectedItem().toString();
        convertidoA = this.jComboBoxA.getSelectedItem().toString();
        Moneda moneda = new Moneda(convertidoDe, convertidoA, cantidadInicial);
        moneda.cambioDeMoneda();
        this.jTextResultado.setText(String.valueOf(moneda.getResultado()));

    }

    private void cambioTemperatura() {
        cantidadInicial = Double.parseDouble(this.jTextCantidadInicial.getText());
        convertidoDe = this.jComboDe.getSelectedItem().toString();
        convertidoA = this.jComboA.getSelectedItem().toString();
        Temperatura t = new Temperatura(convertidoDe, convertidoA, cantidadInicial);
        t.temperaturaResultado();
        this.jTextResultadoTemp.setText(String.valueOf(t.getResultado()));
    }

    private void cambioTiempo() {
        cantidadInicial = Double.parseDouble(this.jTTiempoInicial.getText());
        convertidoDe = this.jCDeTiempo.getSelectedItem().toString();
        convertidoA = this.jCATiempo.getSelectedItem().toString();
        Tiempo tiempo = new Tiempo(convertidoDe, convertidoA, cantidadInicial);
        tiempo.tiempoResultado();
        this.jTResultadoTiempo.setText(String.valueOf(tiempo.getResultado()));
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFConversor().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jBConvertir;
    private javax.swing.JButton jBConvertirTiempo;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JComboBox<String> jCATiempo;
    private javax.swing.JComboBox<String> jCDeTiempo;
    private javax.swing.JComboBox<String> jComboA;
    private javax.swing.JComboBox<String> jComboBoxA;
    private javax.swing.JComboBox<String> jComboBoxDe;
    private javax.swing.JComboBox<String> jComboDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTResultadoTiempo;
    private javax.swing.JTextField jTTiempoInicial;
    private javax.swing.JTabbedPane jTabbedPaneMoneda;
    private javax.swing.JTextField jTextCantidadInicial;
    private javax.swing.JTextField jTextMonto;
    private javax.swing.JTextField jTextResultado;
    private javax.swing.JTextField jTextResultadoTemp;

}
