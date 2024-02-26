
package P1;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import funciones.ErroresList;
import funciones.TokenList;
import java.io.StringReader;
import analizadores.Parser;
import funciones.valor_variable;
import funciones.acumulador;
import analizadores.Parser;

/**
 *
 * @author natalia
 */
public class gui extends javax.swing.JFrame {

    private int pesta_cuenta = 0;
    ArrayList<valor_variable> tabla_simbolosG = analizadores.Parser.tabla_simbolos;
    

    
    public gui() {
        initComponents();
        //ArrayList<valor_variable> tabla_simbolosG = analizadores.Parser.tabla_simbolos;
    //System.out.println("Accumulated Text:");
    //System.out.println(accumulatedText);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        consola = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        entrada = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Archivo_abrir = new javax.swing.JMenuItem();
        Archivo_nuevo = new javax.swing.JMenuItem();
        Archivo_guardar = new javax.swing.JMenuItem();

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("CONSOLA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 240, 209));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Reportes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Ejecutar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("CONSOLA");

        consola.setBackground(new java.awt.Color(0, 0, 0));
        consola.setColumns(20);
        consola.setForeground(new java.awt.Color(255, 255, 255));
        consola.setRows(5);
        jScrollPane2.setViewportView(consola);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 911, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("ENTRADA");

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("GRAFICOS");

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("siguiente");

        jButton4.setBackground(new java.awt.Color(255, 153, 153));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("anterior");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jButton4)))))
                .addGap(21, 21, 21))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));

        Archivo.setText("ARCHIVO");
        Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoActionPerformed(evt);
            }
        });

        Archivo_abrir.setText("Abrir Archivo");
        Archivo_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Archivo_abrirActionPerformed(evt);
            }
        });
        Archivo.add(Archivo_abrir);

        Archivo_nuevo.setText("Nuevo Archivo");
        Archivo_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Archivo_nuevoActionPerformed(evt);
            }
        });
        Archivo.add(Archivo_nuevo);

        Archivo_guardar.setText("Guardar Archivo");
        Archivo.add(Archivo_guardar);

        jMenuBar1.add(Archivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArchivoActionPerformed
    
    //pestañas, infor ->arreglos inf
    private ArrayList<String> ruta_ar = new ArrayList<>();
    private ArrayList<String> nombre_Par = new ArrayList<>();

//////////////////////////////////cerrar pestaña //////////////////////////////////////    
    private void Xboton_pestaña(String title) {
        int tabIndex = entrada.getSelectedIndex();
        int indice = nombre_Par.indexOf(title);
        System.out.print("BOTON CERRAR PESTAÑA PRESIONADO");
        if (tabIndex == -1 || indice == -1) {
            return;
        }

        JTextArea textArea = ((JTextArea) ((JScrollPane) entrada.getComponentAt(tabIndex)).getViewport().getView());
        String text = textArea.getText();
       // guardar el nuevo arreglo si se sale---> X
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "Guardar el archivo antes de cerrar?",
                "Cerrar",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        if (respuesta == JOptionPane.YES_OPTION) {
            String path_actual = ruta_ar.get(indice);
            System.out.println("DESEA GUARDAR");
        //si esta vacio la ruta
            if (path_actual.isEmpty()) {
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter exp = new FileNameExtensionFilter(".df)", ".df");
                fileChooser.addChoosableFileFilter(exp);
                fileChooser.setFileFilter(exp);

                if (fileChooser.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) {
                    return;
                }

                File file = new File(fileChooser.getSelectedFile().getAbsolutePath() + ".df");
                guardar_archivo(file, text);
            } else {
                guardar_archivo(new File(path_actual), text);
            }
        } else if (respuesta == JOptionPane.CANCEL_OPTION) {
            return;
        }
        // borrar la pestaña y  la inf de los arrgelos
        entrada.remove(tabIndex);
        ruta_ar.remove(indice);
        nombre_Par.remove(indice);
    }
//-----------------------------------------------------------------------------------------------    
////////////////////////////////////////////guardar /////////////////////////////
    private void guardar_archivo(File file, String text) {
        try {
            FileWriter nuevo_infArc = new FileWriter(file, false);
            nuevo_infArc.write(text);
            nuevo_infArc.close();
        } catch (IOException e) {
            e.printStackTrace(); //exceocion - >>> que no se caiga
        }
    }
//--------------------------------arr-------------------------------------------- 
    
   public static void analizar (String entrada){
        try {
            analizadores.Lexer lexer = new analizadores.Lexer(new StringReader(entrada));
            //TokenList.printTokenList();    
            analizadores.Parser parser = new analizadores.Parser(lexer);
            parser.parse();
            //System.out.println("DENTRO DE ANALIZAR:");
            //TokenList.printTokenList();
            System.out.println("-----------------------------------");
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        } 
    }
   
   // ------------------------tabla de simbolos ---------------------
    public static void generateHTMLTable(ArrayList<valor_variable> tabla_simbolos) {
        StringBuilder htmlContent = new StringBuilder();

        // HTMÑ
        htmlContent.append("<html><head><style>")
                   .append("table { border-collapse: collapse; width: 100%; }")
                   .append("th, td { text-align: left; padding: 8px; }")
                   .append("th { background-color: #f2f2f2; }")
                   .append("</style></head><body>")
                   .append("<table><tr><th>Count of Items</th><th>ID</th><th>Tipo</th>")
                   .append("<th>Valor Act</th><th>Fila</th><th>Columna</th></tr>");

         int rowCount = 1;
        // LAS FILAS
        for (valor_variable variable : tabla_simbolos) {
            htmlContent.append("<tr>")
                       .append("<td>").append(rowCount++).append("</td>")
                       .append("<td>").append(variable.id).append("</td>")
                       .append("<td>").append(variable.tipo).append("</td>")
                       .append("<td>");

            if (variable.valoract.equals("arreglo")) {
                htmlContent.append(variable.valorArreglo);
            } else {
                htmlContent.append(variable.valoract);
            }

            htmlContent.append("</td>")
                       .append("<td>").append(variable.fila).append("</td>")
                       .append("<td>").append(variable.columna).append("</td>")
                       .append("</tr>");
        }

        // HTML table end
        htmlContent.append("</table></body></html>");

        // Writing to HTML file
        try {
            FileWriter writer = new FileWriter("Tabla_simbolos.html");
            writer.write(htmlContent.toString());
            writer.close();
            System.out.println("HTML file generated successfully.");
        } catch (IOException e) {
            System.err.println("Error writing HTML file: " + e.getMessage());
        }
    }
    
    private void Archivo_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Archivo_nuevoActionPerformed
        
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
//llevar la cuenta y poner nombre --->pestañitas
        pesta_cuenta++;
        System.out.println("NUEVO ARCHIVO DF");
        String title = "pestaña " + pesta_cuenta;

        JPanel tabPanel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel(title);
        //cerrar, X--> funcion de cerrar
        JButton closeButton = new JButton("X");
        closeButton.addActionListener(e -> Xboton_pestaña(title));

        tabPanel.add(titleLabel, BorderLayout.CENTER);
        tabPanel.add(closeButton, BorderLayout.EAST);
        entrada.addTab(title, scrollPane);
        entrada.setTabComponentAt(entrada.getTabCount() - 1, tabPanel);
        entrada.setSelectedIndex(entrada.getTabCount() - 1);
        System.out.println("PESTAÑA CREADA");
        ruta_ar.add("");
        nombre_Par.add(title);         // los valores > ruta y el nombre que se le va a dar 
    }//GEN-LAST:event_Archivo_nuevoActionPerformed

    private void Archivo_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Archivo_abrirActionPerformed
        //elegir eñ archivo --> .df
        JFileChooser elegirArchivo = new JFileChooser();
        System.out.print("ABRIR UN ARCHIVO QUE EXISTE ------> SELECCIONAR ");
        FileNameExtensionFilter exp = new FileNameExtensionFilter("dataforge (*.df)", "df");
        elegirArchivo.addChoosableFileFilter(exp);
        elegirArchivo.setFileFilter(exp);
        if (elegirArchivo.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File archivo_seleccionado = elegirArchivo.getSelectedFile();
        String codigo = leer_Abierto(archivo_seleccionado);

        String nombrePesta =  nombre_archi_pesta(archivo_seleccionado); //funcion agarrar el nombre
        JTextArea textArea = new JTextArea(codigo);         // pegar el texto del archivo
        JScrollPane scrollPane = new JScrollPane(textArea);
        pesta_cuenta++;
        JPanel tabPanel = new JPanel(new BorderLayout());
        String nombrePestaOc = nombrePesta;
        JLabel titleLabel = new JLabel(nombrePestaOc);
        JButton closeButton = new JButton("x");
        closeButton.addActionListener(e -> Xboton_pestaña(nombrePestaOc)); // funcion cerra pestaña
        System.out.println("AGREGAR LA PESTAÑA");
        tabPanel.add(titleLabel, BorderLayout.CENTER);
        tabPanel.add(closeButton, BorderLayout.EAST);
        entrada.addTab(nombrePestaOc, scrollPane);
        entrada.setTabComponentAt(entrada.getTabCount() - 1, tabPanel);
        entrada.setSelectedIndex(entrada.getTabCount() - 1);
        // añadir el path y el nombre a los arreglos ---> control de pestañas
        ruta_ar.add(archivo_seleccionado.getAbsolutePath());
        nombre_Par.add(nombrePestaOc);
    }//GEN-LAST:event_Archivo_abrirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //TokenList.printTokenList();
        TokenList.genHTMLTokenList();
        ErroresList.genHTMLErrorList();
        consola.setText("---> Generando reportes");
        generateHTMLTable(tabla_simbolosG);
        consola.setText("listo! --------------> reportes generados");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int tabIndex = entrada.getSelectedIndex();
        System.out.print("EJECUTANDO CODIGO -----------> ");

        JTextArea textArea = ((JTextArea) ((JScrollPane) entrada.getComponentAt(tabIndex)).getViewport().getView());
        String entrada_f = textArea.getText();
        analizar(entrada_f);
        String accumulatedText = acumulador.getOutputText();
        consola.setText(accumulatedText);
        System.out.println("texto");
        System.out.println(accumulatedText);
        
    }//GEN-LAST:event_jButton2ActionPerformed
///////////////////////////// abrirb arhivo - funcion //////////////
    private String leer_Abierto(File file) {
        StringBuilder codigo = new StringBuilder();
        System.out.println("LEYENDO EL ARCHIVO");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                codigo.append(scanner.nextLine()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }
        return codigo.toString();
    }
    
    private String nombre_archi_pesta(File file) {
        String nombrePesta = file.getName();
        int puntoIndex = nombrePesta.lastIndexOf('.');
        if (puntoIndex > 0) {
            nombrePesta = nombrePesta.substring(0, puntoIndex);
        }
        return nombrePesta;
    }
///////////////////////////////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenuItem Archivo_abrir;
    private javax.swing.JMenuItem Archivo_guardar;
    private javax.swing.JMenuItem Archivo_nuevo;
    private javax.swing.JTextArea consola;
    private javax.swing.JTabbedPane entrada;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
