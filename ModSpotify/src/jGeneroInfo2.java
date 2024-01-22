
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author usuario
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class jGeneroInfo2 extends JFrame {

    private JLabel titleLabel;
    private JTextArea descripcionTextArea; // Componente para la descripción
    private JTextArea cantantesTextArea;    // Componente para los cantantes
    private JList<String> jList;

    public jGeneroInfo2() {
        setTitle("Información del Género Musical");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 900);
        setLayout(new BorderLayout());

        // Panel superior con título
        JPanel topPanel = new JPanel();
        titleLabel = new JLabel("Título del Género");
        topPanel.add(titleLabel);

        // Panel central con descripción y cantantes
        JPanel centerPanel = new JPanel(new BorderLayout());
        descripcionTextArea = new JTextArea();
        descripcionTextArea.setWrapStyleWord(true);
        descripcionTextArea.setLineWrap(true);
        descripcionTextArea.setOpaque(false);
        descripcionTextArea.setEditable(false);
        JScrollPane descripcionScrollPane = new JScrollPane(descripcionTextArea);
        descripcionScrollPane.setSize(200, 100);
        cantantesTextArea = new JTextArea();
        cantantesTextArea.setWrapStyleWord(true);
        cantantesTextArea.setLineWrap(true);
        cantantesTextArea.setOpaque(false);
        cantantesTextArea.setEditable(false);
        JScrollPane cantantesScrollPane = new JScrollPane(cantantesTextArea);
        centerPanel.add(descripcionScrollPane, BorderLayout.CENTER);
        centerPanel.add(cantantesScrollPane, BorderLayout.SOUTH);

        // Panel inferior con lista de elementos relacionados
        JPanel bottomPanel = new JPanel(new BorderLayout());
        DefaultListModel<String> listModel = new DefaultListModel<>();
        jList = new JList<>(listModel);
        JScrollPane listScrollPane = new JScrollPane(jList);
        bottomPanel.add(listScrollPane, BorderLayout.CENTER);

        // Agregar los paneles al JFrame
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        jList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String cantanteSeleccionado = jList.getSelectedValue();
                if (cantanteSeleccionado != null) {
                    abrirVentanaCantantesMusica(cantanteSeleccionado);
                    dispose();
                }
            }
        });
    }

    private void abrirVentanaCantantesMusica(String cantanteSeleccionado) {
        CantantesMusica ventanaCantantes = new CantantesMusica(cantanteSeleccionado);
        ventanaCantantes.setVisible(true);
    }

    public void actualizarDatos(String titulo, String descripcion, String cantantes, ArrayList<String> elementos) {
        titleLabel.setText(titulo);
        descripcionTextArea.setText(descripcion);
        cantantesTextArea.setText("Cantantes: " + cantantes);

        DefaultListModel<String> listModel = (DefaultListModel<String>) jList.getModel();
        listModel.removeAllElements();

        // Agregar elementos a la lista
        for (String elemento : elementos) {
            listModel.addElement(elemento);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            jGeneroInfo2 ventana = new jGeneroInfo2();

        });
    }
}
