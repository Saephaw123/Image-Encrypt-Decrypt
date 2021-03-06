package des;

import javax.swing.*;

public class KSMA_TEST extends JFrame {
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;

    public KSMA_TEST() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("encode");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 146, 123, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 124, 326, 96));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("plain");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 150, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 326, 98));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("cipher");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("decode");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 123, -1));

        jTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 326, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("key");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton2.setText("binary");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 102, 0));
        jRadioButton1.setText("Hex");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 94, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 102));
        jLabel4.setText("The DES Algorithm");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Khun SMA Testing");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 55, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ws.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 330, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        pack();
    }

    String type = "";

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jTextArea2.setText("");
        String pl = jTextArea1.getText();
        int x = pl.replace(" ", "").length();
        pl = pl.replace(" ", "");
        String key = jTextField1.getText();
        String Res = "";

        dES_encode encode = new dES_encode();

        if (type == "hex") {
            if (pl.replace(" ", "").matches("[0-9A-Fa-f]+") && key.replace(" ", "").matches("[0-9A-Fa-f]+")) {
                if (key.length() == 16) {

                    key = encode.hex_to_bin(key.toUpperCase());
                    encode.setBig_key(key);
                    double size = 0;
                    size = Math.ceil((double) x / (double) 16);
                    int ind = 0;
                    for (int i = 0; i < size; i++) {
                        String h = "";
                        for (int j = 0; j < 16; j++) {
                            if (ind < x) {
                                if (pl.toCharArray()[ind] != ' ') {
                                    h += pl.toCharArray()[ind];
                                } else {
                                    j--;

                                }
                                ind++;
                            } else {
                                h += "A";
                            }

                        }
                        System.out.println("h " + h);
                        encode.setPlain(encode.hex_to_bin(h.toUpperCase()));
                        encode.setHex_plain(h.toUpperCase());
                        encode.encode();
                        Res = (encode.bin_to_hex(encode.getCipher()));
                    }
                    jTextArea2.setText(Res);
                }
            } else {
                JOptionPane.showMessageDialog(null, "plain text and key must be hex and key size 16");

            }
        } else if (type == "bin") {
            if (pl.replace(" ", "").matches("[01]+") && key.replace(" ", "").matches("[01]+")) {
                if (key.length() == 16 * 4) {

                    encode.setBig_key(key.toUpperCase());
                    double size = 0;
                    size = Math.ceil((double) x / (double) 64);
                    int ind = 0;
                    for (int i = 0; i < size; i++) {
                        String h = "";
                        for (int j = 0; j < 64; j++) {
                            if (ind < x) {
                                if (pl.toCharArray()[ind] != ' ') {
                                    h += pl.toCharArray()[ind++];
                                }

                            } else {
                                h += "1";
                            }

                        }
                        System.out.println("h " + h);
                        encode.setPlain((h.toUpperCase()));
                        encode.setHex_plain(encode.bin_to_hex(h.toUpperCase()));
                        encode.encode();
                        Res += ((encode.getCipher()));
                    }
                    jTextArea2.setText(Res);
                }
            } else {
                JOptionPane.showMessageDialog(null, "plain text and key must be binary and key size 64");

            }
        } else {
            JOptionPane.showMessageDialog(null, "must choose hex or binary");
        }

    }

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        type = "hex";        // TODO add your handling code here:
    }

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        type = "bin";          // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jTextArea1.setText("");
        String ci = jTextArea2.getText();
        int x = ci.replace(" ", "").length();
        ci = ci.replace(" ", "");
        String key = jTextField1.getText();
        key = key.replace(" ", "");
        String Res = "";

        des_decode decode = new des_decode();

        if (type == "hex") {
            key = decode.hex_to_bin(key);
            decode.setBig_key(key);
            double size = 0;
            size = Math.ceil((double) x / (double) 16);
            int ind = 0;
            for (int i = 0; i < size; i++) {
                String h = "";
                for (int j = 0; j < 16; j++) {
                    if (ind < x) {
                        if (ci.toCharArray()[ind] != ' ') {
                            h += ci.toCharArray()[ind];
                        } else {
                            j--;

                        }
                        ind++;
                    } else {
                        h += "A";
                    }

                }
                System.out.println("h " + h);
                decode.setCipher(decode.hex_to_bin(h));
                decode.setHex_cipher(h);
                decode.decode();
                Res = (decode.bin_to_hex(decode.getPlain()));
            }
            jTextArea1.setText(Res);
        } else if (type == "bin") {

            decode.setBig_key(key);
            double size = 0;
            size = Math.ceil((double) x / (double) 64);
            int ind = 0;
            for (int i = 0; i < size; i++) {
                String h = "";
                for (int j = 0; j < 64; j++) {
                    if (ind < x) {
                        if (ci.toCharArray()[ind] != ' ') {
                            h += ci.toCharArray()[ind++];
                        }

                    } else {
                        h += "1";
                    }

                }
                System.out.println("h " + h);
                decode.setCipher((h));
                decode.setHex_cipher(decode.bin_to_hex(h));
                decode.decode();
                Res += ((decode.getPlain()));
            }
            jTextArea1.setText(Res);
        } else {
            JOptionPane.showMessageDialog(null, "must choose hex or binary");
        } // TODO add your handling code here:
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KSMA_TEST().setVisible(true);
            }
        });
    }
}
