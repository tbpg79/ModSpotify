
import jaco.mp3.player.MP3Player;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author usuario
 */
public class CantantesMusica extends javax.swing.JFrame {

    private boolean reproduciendo = false;
    private MP3Player mp3Player;
    private String currentSong = "";
    private String cancionSeleccionada;

    /**
     * Creates new form CantantesMusica
     */
    public CantantesMusica(String cantante) {
        initComponents();
        nombreArtistas.setText(" " + cantante);
        DefaultListModel<String> listModel = new DefaultListModel<>();

// Agregar las canciones del cantante seleccionado a la lista
        ArrayList<String> canciones = obtenerCancionesDelCantante(cantante);
        for (String cancion : canciones) {
            listModel.addElement(cancion);
        }

// Asigna el modelo de lista al JList existente en tu interfaz de usuario
        listaCanciones.setModel(listModel);
    }

    private ArrayList<String> obtenerCancionesDelCantante(String cantante) {
        // Crea una lista de canciones ficticias para el cantante (deberás sustituir esto por tu lógica real)
        ArrayList<String> canciones = new ArrayList<>();
        if (cantante.equals("Wild Project")) {
            canciones.add("musica\\The Wild Project #231 ft Aníbal Bueno _ Comió con caníbales, Casi muere de malaria, Ritos vudu.mp3");
            canciones.add("musica\\The Wild Project #233 ft David Jiménez _ ¿Puede lo de Israel llevarnos a una Guerra Mundial.mp3");
        } else if (cantante.equals("Terrores Nocturnos")) {
            canciones.add("musica\\Terrores Nocturnos 04X46 LOS ATENTADOS DEL 11-S La versión oficial y las conspiraciones.mp3");
            canciones.add("musica\\Terrores Nocturnos 04X47  NIÑOS REENCARNADOS  Las tres olas de voluntarios de Dolores Cannon.mp3");
        } else if (cantante.equals("Myke Towers")) {
            canciones.add("musica\\MI DROGA - Myke Towers.mp3");
            canciones.add("musica\\VOODOO - Myke Towers.mp3");
        } else if (cantante.equals("Eladio Carrion")) {
            canciones.add("musica\\Padre Tiempo - Eladio Carrion.mp3");
            canciones.add("musica\\Coco Chanel - Eladio Carrion.mp3");
        } else if (cantante.equals("Green Day")) {
            canciones.add("musica\\American Idiot - Green Day.mp3");
            canciones.add("musica\\The American Dream Is Killing Me - Green Day.mp3");
        } else if (cantante.equals("U2")) {
            canciones.add("musica\\Atomic City - U2.mp3");
            canciones.add("musica\\With Or Without You - U2.mp3");
        } else if (cantante.equals("Darell")) {
            canciones.add("musica\\Velitas - Darell.mp3");
            canciones.add("musica\\Lollipop - Darell.mp3");
        } else if (cantante.equals("Rauw Alejandro")) {
            canciones.add("musica\\BABY HELLO - Rauw Alejandro.mp3");
            canciones.add("musica\\DILUVIO - Rauw Alejandro.mp3");
        } else if (cantante.equals("Imagine Dragons")) {
            canciones.add("musica\\Enemy (with JID) - from the series Arcane League of Legends - Imagine Dragons.mp3");
            canciones.add("musica\\Demons - Imagine Dragons.mp3");
        } else if (cantante.equals("Bad Bunny")) {
            canciones.add("musica\\MONACO - Bad Bunny.mp3");
            canciones.add("musica\\SEDA - Bad Bunny.mp3");
        } else if (cantante.equals("Arrebato")) {
            canciones.add("musica\\Hoy todo va a salirme bien - El Arrebato.mp3");
            canciones.add("musica\\Mirando pa ti - El Arrebato.mp3");
        } else if (cantante.equals("Luis Fonsi")) {
            canciones.add("musica\\Échame La Culpa Luis Fonsi.mp3");
            canciones.add("musica\\Llegaste Tú - Luis Fonsi.mp3");
        } else if (cantante.equals("Louis Armstrong")) {
            canciones.add("musica\\The Memphis Blues - Live From The Chesterfield Show_1957 - Louis Armstrong.mp3");
            canciones.add("musica\\What A Wonderful World - Louis Armstrong.mp3");
        } else if (cantante.equals("Nina Simone")) {
            canciones.add("musica\\Ain't Got No _ I Got Life - Nina Simone.mp3");
            canciones.add("musica\\Feeling Good - Nina Simone.mp3");
        } else if (cantante.equals("Tom Odell")) {
            canciones.add("musica\\Black Friday - Tom Odell.mp3");
            canciones.add("musica\\Another Love - Tom Odell.mp3");
        } else if (cantante.equals("The Police")) {
            canciones.add("musica\\Every Breath You Take - The Police.mp3");
            canciones.add("musica\\Roxanne - The Police.mp3");
        } else if (cantante.equals("Martin Garrix")) {
            canciones.add("musica\\Real Love - Martin Garrix.mp3");
            canciones.add("musica\\Animals - Martin Garrix.mp3");
        } else if (cantante.equals("Zomboy")) {
            canciones.add("musica\\Lone Wolf - Zomboy.mp3");
            canciones.add("musica\\Nuclear (Hands Up) - Zomboy.mp3");
        } else if (cantante.equals("Pine River")) {
            canciones.add("musica\\Pine River - Cedar A.V..mp3");
            canciones.add("musica\\Downstream - Pine River.mp3");
        } else if (cantante.equals("Sleepy Sine")) {
            canciones.add("musica\\Soundness - Sleepy Sine.mp3");
            canciones.add("musica\\Sleepwaves - Sleepy Sine");
        } else if (cantante.equals("Adelina Somerset")) {
            canciones.add("musica\\Ethereal Forest - Adelina Somerset.mp3");
            canciones.add("musica\\Missing You (Campfire Version) - Adelina Somerset.mp3");
        } else if (cantante.equals("Bed of Flowers")) {
            canciones.add("musica\\Relaxing Water Flow - Bed of Flowers.mp3");
            canciones.add("musica\\The Deep Forest - Bed of Flowers.mp3");
        } else if (cantante.equals("Khai Rap")) {
            canciones.add("musica\\Kirishima Rap - Khai Rap.mp3");
            canciones.add("musica\\Indestructible Rap - Khai Rap.mp3");
        } else if (cantante.equals("MegaR")) {
            canciones.add("musica\\Adán vs Zeus Rap - MegaR.mp3");
            canciones.add("musica\\Baki vs Yujiro Rap - La Última Cena - MegaR.mp3");
        } else if (cantante.equals("Janet Redger")) {
            canciones.add("musica\\Glance Out A Casement Window - Janet Redger.mp3");
            canciones.add("musica\\Under a tree - Janet Redger.mp3");
        } else if (cantante.equals("Allysium")) {
            canciones.add("musica\\Radius - Allysium.mp3");
            canciones.add("musica\\This Tender Appeal - Allysium.mp3");
        } else if (cantante.equals("Marc Anthony")) {
            canciones.add("musica\\Vivir Mi Vida - Marc Anthony.mp3");
            canciones.add("musica\\Yo También (feat. Marc Anthony) - Romeo Santos.mp3");
        } else if (cantante.equals("La-33")) {
            canciones.add("musica\\Soledad - La-33.mp3");
            canciones.add("musica\\La-33 - La-33.mp3");
        }
        return canciones;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonVolver = new javax.swing.JButton();
        nombreArtistas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCanciones = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        botonReproducir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-atrás-24.png"))); // NOI18N
        botonVolver.setBorder(null);
        botonVolver.setBorderPainted(false);
        botonVolver.setContentAreaFilled(false);
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        nombreArtistas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombreArtistas.setForeground(new java.awt.Color(255, 255, 255));
        nombreArtistas.setText("s");

        listaCanciones.setBackground(new java.awt.Color(51, 51, 51));
        listaCanciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listaCanciones.setForeground(new java.awt.Color(255, 255, 255));
        listaCanciones.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaCancionesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaCanciones);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        botonReproducir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos2/pause-icon.png"))); // NOI18N
        botonReproducir.setBorderPainted(false);
        botonReproducir.setContentAreaFilled(false);
        botonReproducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReproducirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(botonReproducir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonReproducir)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nombreArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(botonVolver)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(botonVolver)
                .addGap(31, 31, 31)
                .addComponent(nombreArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        nombreArtistas.getAccessibleContext().setAccessibleName("nombreArtista");
        jScrollPane1.getAccessibleContext().setAccessibleName("listaCanciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reproducirCancionSeleccionada() {
        cancionSeleccionada = listaCanciones.getSelectedValue();
        if (cancionSeleccionada != null && !cancionSeleccionada.equals(currentSong)) {
            if (mp3Player != null) {
                detenerReproduccion(); // Detén la reproducción actual si la hay.
            }
            mp3Player = new MP3Player(getClass().getResource(cancionSeleccionada));
            mp3Player.play(); // Inicia la reproducción
            currentSong = cancionSeleccionada; // Actualiza la canción actual
            reproduciendo = true; // Marca que se está reproduciendo
            botonReproducir.setIcon(new ImageIcon(getClass().getResource("iconos2/pause-icon.png"))); // Cambia el ícono a "Pausar"
        }
    }

    private void detenerReproduccion() {
        if (mp3Player != null) {
            mp3Player.stop(); // Detén la reproducción
            reproduciendo = false; // Marca que no se está reproduciendo
            botonReproducir.setIcon(new ImageIcon(getClass().getResource("iconos2/play-icon.png"))); // Cambia el ícono a "Reproducir"
        }
    }
    private void listaCancionesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaCancionesValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listaCancionesValueChanged

    private void botonReproducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReproducirActionPerformed
        if (reproduciendo) {
            // Si ya se está reproduciendo, detén la reproducción
            detenerReproduccion();
            mp3Player = new MP3Player(getClass().getResource(cancionSeleccionada)); // Crea una nueva instancia
        }
        // Si no se está reproduciendo, inicia la reproducción
        reproducirCancionSeleccionada();

    }//GEN-LAST:event_botonReproducirActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
                    detenerReproduccion();
        new Ventana().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

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
            java.util.logging.Logger.getLogger(CantantesMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CantantesMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CantantesMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CantantesMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CantantesMusica("CantanteEjemplo");
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonReproducir;
    private javax.swing.JButton botonVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaCanciones;
    private javax.swing.JLabel nombreArtistas;
    // End of variables declaration//GEN-END:variables
}
