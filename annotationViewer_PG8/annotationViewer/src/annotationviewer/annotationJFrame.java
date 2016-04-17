package annotationviewer;

import java.awt.event.ItemEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Joel
 */
public class annotationJFrame extends javax.swing.JFrame {

    /**
     * Creates new form annotationJFrame
     */
    public annotationJFrame() {
        initComponents();
    }
String sequence = null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        HelpButton = new javax.swing.JButton();
        AnalyseerButton = new javax.swing.JButton();
        PortTextField = new javax.swing.JTextField();
        UsernameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        URLTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DNACheckBox = new javax.swing.JCheckBox();
        GeneCheckBox = new javax.swing.JCheckBox();
        EiwitCheckBox = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        DNATextArea = new javax.swing.JTextArea();
        GenTextArea = new javax.swing.JTextArea();
        EiwitTextArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPaneQuery = new javax.swing.JScrollPane();
        queryTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("AnnotationViewer PG7");

        HelpButton.setText("Help");
        HelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpButtonActionPerformed(evt);
            }
        });

        AnalyseerButton.setText("Get data");
        AnalyseerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalyseerButtonActionPerformed(evt);
            }
        });

        PortTextField.setText("3306");

        UsernameTextField.setText("anonymous");

        jLabel3.setText("Username");

        jLabel4.setText("Port");

        URLTextField.setText("ensembldb.ensembl.org");
        URLTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URLTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("URL");

        jLabel5.setText("DB query");

        DNACheckBox.setText("DNA");
        DNACheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNACheckBoxActionPerformed(evt);
            }
        });

        GeneCheckBox.setText("Genen");
        GeneCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneCheckBoxActionPerformed(evt);
            }
        });

        EiwitCheckBox.setText("Eiwitten");
        EiwitCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EiwitCheckBoxActionPerformed(evt);
            }
        });

        jLabel6.setText("Select:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(999999999, 32737));

        jPanel1.setMaximumSize(new java.awt.Dimension(999999999, 32767));

        DNATextArea.setColumns(20);
        DNATextArea.setRows(5);

        GenTextArea.setColumns(20);
        GenTextArea.setRows(5);

        EiwitTextArea.setColumns(20);
        EiwitTextArea.setRows(5);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("DNA");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Eiwitten");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Genen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GenTextArea)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 760, Short.MAX_VALUE))
                    .addComponent(EiwitTextArea)
                    .addComponent(DNATextArea, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DNATextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EiwitTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GenTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        DNATextArea.getAccessibleContext().setAccessibleParent(jScrollPane1);
        GenTextArea.getAccessibleContext().setAccessibleParent(jScrollPane1);
        EiwitTextArea.getAccessibleContext().setAccessibleParent(jScrollPane1);

        jScrollPane1.setViewportView(jPanel1);

        queryTextArea.setColumns(20);
        queryTextArea.setRows(5);
        queryTextArea.setText("SELECT sequence, saccharomyces_cerevisiae_core_48_1h.dna.seq_region_id, saccharomyces_cerevisiae_core_48_1h.gene.gene_id, seq_region_start, seq_region_end, stable_id\nFROM saccharomyces_cerevisiae_core_48_1h.dna, saccharomyces_cerevisiae_core_48_1h.gene, saccharomyces_cerevisiae_core_48_1h.gene_stable_id\nWHERE saccharomyces_cerevisiae_core_48_1h.dna.seq_region_id = saccharomyces_cerevisiae_core_48_1h.gene.seq_region_id \nAND saccharomyces_cerevisiae_core_48_1h.gene.gene_id = saccharomyces_cerevisiae_core_48_1h.gene_stable_id.gene_id\nAND saccharomyces_cerevisiae_core_48_1h.dna.seq_region_id = 1\nGROUP BY saccharomyces_cerevisiae_core_48_1h.gene.seq_region_start limit 20;");
        jScrollPaneQuery.setViewportView(queryTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DNACheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EiwitCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GeneCheckBox)
                        .addGap(6, 6, 6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HelpButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneQuery)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AnalyseerButton)
                                    .addComponent(URLTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(UsernameTextField)
                                    .addComponent(PortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(HelpButton))
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(EiwitCheckBox)
                    .addComponent(DNACheckBox)
                    .addComponent(GeneCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(URLTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnalyseerButton)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpButtonActionPerformed
        JOptionPane popUp = new JOptionPane();
        String hulp = "Met de knoppen rechts onderin is een selectie aan te geven welke gegevens u wilt zien uit de database.\n"
                + "In het bovenste textveld is de DNA sequentie te zien, daaronder de genen en daar onder de eiwitten.\n"
                + "In de tekstvelden zijn de details over de connectie naar de database in te vullen,\n"
                + "bij de URL dient het volledige path van de database opgegeven te worden.";

        JOptionPane.showMessageDialog(rootPane, hulp, "Help", WIDTH);
    }//GEN-LAST:event_HelpButtonActionPerformed

    private void AnalyseerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyseerButtonActionPerformed
        String url = URLTextField.getText();
        String port = PortTextField.getText();
        String user = UsernameTextField.getText();
        String query = queryTextArea.getText();
        String url_port = url + ":" + port;
        try {
            sequence = dbConnect.dbConnect(query, url_port, user);
            System.out.println(sequence);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(annotationJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_AnalyseerButtonActionPerformed

    private void DNACheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNACheckBoxActionPerformed
        if (DNACheckBox.isSelected() == true) {
            try{
                String DNA = showDNA.showDNA(sequence);
                String[] parts = DNA.split("-");
                String dna_seq = parts[0]; //DNA sequentie
                String gc_perc = parts[1]; //GC percentage
                DNATextArea.setText(dna_seq.toUpperCase());
                DNATextArea.append("\n\nGC percentage: "+gc_perc+"%");
            }
            catch(Exception e){
                DNATextArea.setText("Can not load data. Please get data first, then refresh the checkbox.");
            }
        } else {
            DNATextArea.setText("");
        }
    }//GEN-LAST:event_DNACheckBoxActionPerformed

    private void GeneCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneCheckBoxActionPerformed
        if (GeneCheckBox.isSelected() == true) {
            try{
            String GEN = showGenes.showGenes(sequence);
            GenTextArea.setText(GEN);
            }
            catch(Exception e){
            GenTextArea.setText("Can not load data. Please get data first, then refresh the checkbox.");
            }
        } else {
            GenTextArea.setText("");
        }
    }//GEN-LAST:event_GeneCheckBoxActionPerformed

    private void EiwitCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EiwitCheckBoxActionPerformed
        if (EiwitCheckBox.isSelected() == true) {
            try{
                String PROTEIN = showProtein.showProtein(sequence);
                EiwitTextArea.setText(PROTEIN.toUpperCase());
            }
            catch(Exception e){
                EiwitTextArea.setText("Can not load data. Please get data first, then refresh the checkbox.");
            }
        } else {
            EiwitTextArea.setText("");
        }
    }//GEN-LAST:event_EiwitCheckBoxActionPerformed

    private void URLTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URLTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_URLTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(annotationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(annotationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(annotationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(annotationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new annotationJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalyseerButton;
    private javax.swing.JCheckBox DNACheckBox;
    private javax.swing.JTextArea DNATextArea;
    private javax.swing.JCheckBox EiwitCheckBox;
    private javax.swing.JTextArea EiwitTextArea;
    private javax.swing.JTextArea GenTextArea;
    private javax.swing.JCheckBox GeneCheckBox;
    private javax.swing.JButton HelpButton;
    private javax.swing.JTextField PortTextField;
    private javax.swing.JTextField URLTextField;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneQuery;
    private javax.swing.JTextArea queryTextArea;
    // End of variables declaration//GEN-END:variables
}
