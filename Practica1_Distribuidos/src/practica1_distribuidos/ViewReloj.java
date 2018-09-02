
package practica1_distribuidos;

public class ViewReloj extends javax.swing.JFrame implements Runnable {

    private Reloj reloj1;
    private Reloj reloj2;
    private Reloj reloj3;
    private Reloj reloj4;
    
    private int cambio1;
    private int cambio2;
    private int cambio3;
    private int cambio4;
    private int boton;
    
    private int h1, h2, h3, h4;
    private int m1, m2, m3, m4;
    private int s1, s2, s3, s4;

       
    Thread t1 = new Thread(this);
    Thread t2 = new Thread(this);
    Thread t3 = new Thread(this);
    Thread t4 = new Thread(this);
    

    public ViewReloj() {
        initComponents();
        this.setTitle("Practica1_Relojes");
        panelCambio.setVisible(false);
                
        reloj1 = new Reloj();
        reloj2 = new Reloj();
        reloj3 = new Reloj();
        reloj4 = new Reloj();

        t1.start();
        t2.start();
        t3.start();
        t4.start();        
    }

    @Override
    public void run() {
        Thread ct = Thread.currentThread();

        while (ct == t1) {
            if(cambio1 != 1){
                reloj1.Calcula();
            }
            else{
                reloj1.Actualiza1(h1,m1,s1);
                h1 = Integer.parseInt(reloj1.getHora());
                m1 = Integer.parseInt(reloj1.getMin());
                s1 = Integer.parseInt(reloj1.getSeg());                
            }
            lblreloj1.setText(reloj1.getHora() + ":" + reloj1.getMin() + ":" + reloj1.getSeg());         
            try {
                t1.sleep(1000);                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        while (ct == t2) {           
            if(cambio2 != 1){
                reloj2.Calcula();
            }
            else{
                reloj2.Actualiza1(h2,m2,s2);
                h2 = Integer.parseInt(reloj2.getHora());
                m2 = Integer.parseInt(reloj2.getMin());
                s2 = Integer.parseInt(reloj2.getSeg());
            }
            lblreloj2.setText(reloj2.getHora() + ":" + reloj2.getMin() + ":" + reloj2.getSeg());
            try {
                t2.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        while (ct == t3) {           
            if(cambio3 != 1){
                reloj3.Calcula();
            }
            else{
                reloj3.Actualiza1(h3,m3,s3);
                h3 = Integer.parseInt(reloj3.getHora());
                m3 = Integer.parseInt(reloj3.getMin());
                s3 = Integer.parseInt(reloj3.getSeg());
            }
            lblreloj3.setText(reloj3.getHora() + ":" + reloj3.getMin() + ":" + reloj3.getSeg());            
            try {
                t3.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (ct == t4) {         
            if(cambio4 != 1){
            reloj4.Calcula();
            }
            else{
                reloj4.Actualiza1(h4,m4,s4);
                h4 = Integer.parseInt(reloj4.getHora());
                m4 = Integer.parseInt(reloj4.getMin());
                s4 = Integer.parseInt(reloj4.getSeg());
            }
            lblreloj4.setText(reloj4.getHora() + ":" + reloj4.getMin() + ":" + reloj4.getSeg());
            try {              
                t4.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblreloj1 = new javax.swing.JLabel();
        btnReloj1 = new javax.swing.JButton();
        lblreloj2 = new javax.swing.JLabel();
        btnReloj2 = new javax.swing.JButton();
        lblreloj3 = new javax.swing.JLabel();
        lblreloj4 = new javax.swing.JLabel();
        btnReloj3 = new javax.swing.JButton();
        btnReloj4 = new javax.swing.JButton();
        panelCambio = new javax.swing.JPanel();
        txtHora = new javax.swing.JTextField();
        txtMin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCambiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSeg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 255));

        lblreloj1.setBackground(new java.awt.Color(255, 255, 255));
        lblreloj1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblreloj1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblreloj1.setText("reloj1");
        lblreloj1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnReloj1.setText("Editar Reloj1");
        btnReloj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloj1ActionPerformed(evt);
            }
        });

        lblreloj2.setBackground(new java.awt.Color(255, 255, 255));
        lblreloj2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblreloj2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblreloj2.setText("reloj2");
        lblreloj2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnReloj2.setText("Editar Reloj2");
        btnReloj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloj2ActionPerformed(evt);
            }
        });

        lblreloj3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblreloj3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblreloj3.setText("reloj3");
        lblreloj3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblreloj4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblreloj4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblreloj4.setText("reloj4");
        lblreloj4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnReloj3.setText("Editar Reloj3");
        btnReloj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloj3ActionPerformed(evt);
            }
        });

        btnReloj4.setText("Editar Reloj4");
        btnReloj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloj4ActionPerformed(evt);
            }
        });

        panelCambio.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("HORAS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("MINUTOS");

        btnCambiar.setText("Cambiar");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("SEGUNDOS");

        javax.swing.GroupLayout panelCambioLayout = new javax.swing.GroupLayout(panelCambio);
        panelCambio.setLayout(panelCambioLayout);
        panelCambioLayout.setHorizontalGroup(
            panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23))
            .addGroup(panelCambioLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCambioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCambioLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnCambiar)))
                .addGap(84, 84, 84))
        );
        panelCambioLayout.setVerticalGroup(
            panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCambiar)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnReloj3)
                .addGap(190, 190, 190)
                .addComponent(btnReloj4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblreloj1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblreloj3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblreloj2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblreloj4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnReloj1)
                        .addGap(196, 196, 196)
                        .addComponent(btnReloj2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(panelCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblreloj1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblreloj2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReloj2)
                            .addComponent(btnReloj1))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblreloj4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblreloj3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReloj3)
                    .addComponent(btnReloj4))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReloj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloj1ActionPerformed
        panelCambio.setVisible(true);
        boton = 1;
    }//GEN-LAST:event_btnReloj1ActionPerformed
  
    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        if(boton == 1){
            h1 = Integer.parseInt(txtHora.getText());
            m1 = Integer.parseInt(txtMin.getText());
            s1 = Integer.parseInt(txtSeg.getText());
            cambio1 = 1;
        }
        if(boton == 2){
            h2 = Integer.parseInt(txtHora.getText());
            m2 = Integer.parseInt(txtMin.getText());
            s2 = Integer.parseInt(txtSeg.getText());
            cambio2 = 1;
        }
        if(boton == 3){
            h3 = Integer.parseInt(txtHora.getText());
            m3 = Integer.parseInt(txtMin.getText());
            s3 = Integer.parseInt(txtSeg.getText());
            cambio3 = 1;
        }
        if(boton == 4){
            h4 = Integer.parseInt(txtHora.getText());
            m4 = Integer.parseInt(txtMin.getText());
            s4 = Integer.parseInt(txtSeg.getText());
            cambio4 = 1;
        }
        panelCambio.setVisible(false);
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnReloj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloj2ActionPerformed
        panelCambio.setVisible(true);
        boton = 2;
    }//GEN-LAST:event_btnReloj2ActionPerformed

    private void btnReloj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloj3ActionPerformed
        panelCambio.setVisible(true);
        boton = 3;
    }//GEN-LAST:event_btnReloj3ActionPerformed

    private void btnReloj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloj4ActionPerformed
        panelCambio.setVisible(true);
        boton = 4;
    }//GEN-LAST:event_btnReloj4ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReloj().setVisible(true);
                
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnReloj1;
    private javax.swing.JButton btnReloj2;
    private javax.swing.JButton btnReloj3;
    private javax.swing.JButton btnReloj4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblreloj1;
    private javax.swing.JLabel lblreloj2;
    private javax.swing.JLabel lblreloj3;
    private javax.swing.JLabel lblreloj4;
    private javax.swing.JPanel panelCambio;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtSeg;
    // End of variables declaration//GEN-END:variables
}