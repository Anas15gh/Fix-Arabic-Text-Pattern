package fix.arabic.text;

import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JFrame {
    public MainMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollOriginalPane = new javax.swing.JScrollPane();
        scrollOriginalText = new javax.swing.JTextArea();
        scrollFixedPane = new javax.swing.JScrollPane();
        scrollFixedText = new javax.swing.JTextArea();
        transferButton = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        MenuExit = new javax.swing.JMenuItem();
        MenuHelp = new javax.swing.JMenu();
        MenuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fix Arabic Text Pattern");
        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(620, 360));
        setPreferredSize(new java.awt.Dimension(620, 360));

        scrollOriginalText.setColumns(20);
        scrollOriginalText.setRows(5);
        scrollOriginalPane.setViewportView(scrollOriginalText);

        scrollFixedText.setColumns(20);
        scrollFixedText.setRows(5);
        scrollFixedText.setToolTipText("");
        scrollFixedPane.setViewportView(scrollFixedText);

        transferButton.setLabel("Transfer");
        transferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferButtonActionPerformed(evt);
            }
        });

        label1.setText("Original Text:");
        label1.setToolTipText("");

        label2.setText("Fixed Text:");
        label2.setToolTipText("");

        MenuFile.setText("File");

        MenuExit.setLabel("Exit");
        MenuExit.setName(""); // NOI18N
        MenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExitActionPerformed(evt);
            }
        });
        MenuFile.add(MenuExit);
        MenuExit.getAccessibleContext().setAccessibleName("Exit");

        MenuBar.add(MenuFile);

        MenuHelp.setLabel("Help");
        MenuHelp.setName(""); // NOI18N

        MenuAbout.setLabel("About");
        MenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAboutActionPerformed(evt);
            }
        });
        MenuHelp.add(MenuAbout);
        MenuAbout.getAccessibleContext().setAccessibleName("About");
        MenuAbout.getAccessibleContext().setAccessibleDescription("");

        MenuBar.add(MenuHelp);
        MenuHelp.getAccessibleContext().setAccessibleName("Help");

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1)
                            .addComponent(label2))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(transferButton)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollFixedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addComponent(scrollOriginalPane))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1)
                    .addComponent(scrollOriginalPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(transferButton))
                    .addComponent(scrollFixedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferButtonActionPerformed
        scrollFixedText.setText(new FixArabicText().Transfer(scrollOriginalText.getText()));
    }//GEN-LAST:event_transferButtonActionPerformed

    private void MenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAboutActionPerformed
        JOptionPane.showMessageDialog(null, "Anas15gh\nVersion: 0.2\nLast update: 1/7/2023", "About", JOptionPane.INFORMATION_MESSAGE);
        System.out.print(new FixArabicText().GetRightSymbol('ب', 'ل', 'آ') + "");
    }//GEN-LAST:event_MenuAboutActionPerformed

    private void MenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuExitActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAbout;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem MenuExit;
    private javax.swing.JMenu MenuFile;
    private javax.swing.JMenu MenuHelp;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JScrollPane scrollFixedPane;
    private javax.swing.JTextArea scrollFixedText;
    private javax.swing.JScrollPane scrollOriginalPane;
    private javax.swing.JTextArea scrollOriginalText;
    private javax.swing.JButton transferButton;
    // End of variables declaration//GEN-END:variables
}
