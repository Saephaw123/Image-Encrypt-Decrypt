package des;

import org.netbeans.lib.awtextra.AbsoluteConstraints;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KSMA_GUI extends JFrame implements ActionListener {

    JTextField tfPlainText, tHexKey;
    JLabel lPlainText, lEnterHexKey, lPlainText1;
    JButton btnChangeHex, btnChangeHex1, btnEncode, btnDecode, btnChangePlainText;
    JTextArea taHexValue, taHexValue1, taEncodedValue, taDecodedValue;
    JPanel jPanel1;
    JScrollPane jScrollPane1, jScrollPane2, jScrollPane3, jScrollPane4;

    KSMA_GUI() {
        lPlainText = new JLabel("Enter Plain Text");
        lPlainText.setBounds(50, 50, 150, 30);
        add(lPlainText);

        tfPlainText = new JTextField();
        tfPlainText.setBounds(50, 80, 150, 30);
        add(tfPlainText);

        btnChangeHex = new JButton("Hex >>");
        btnChangeHex.setBounds(210, 80, 100, 30);
        add(btnChangeHex);

        taHexValue = new JTextArea("Hex Value from plain text ... ");
        taHexValue.setRows(5);

        jScrollPane1 = new JScrollPane(taHexValue);
        jScrollPane1.setBounds(320, 80, 300, 50);
        add(jScrollPane1);

        lEnterHexKey = new JLabel("Enter 8 plain text Key");
        lEnterHexKey.setBounds(50, 110, 200, 50);
        add(lEnterHexKey);

        tHexKey = new JTextField();
        tHexKey.setBounds(50, 150, 150, 30);
        add(tHexKey);

        btnChangeHex1 = new JButton(("Hex >>"));
        btnChangeHex1.setBounds(210, 150, 100, 30);
        add(btnChangeHex1);

        taHexValue1 = new JTextArea("Hex value from plain text key ...");
        taHexValue1.setRows(5);


        jScrollPane2 = new JScrollPane(taHexValue1);
        jScrollPane2.setBounds(320, 150, 300, 50);
        add(jScrollPane2);

        btnEncode = new JButton("Encode >>");
        btnEncode.setBounds(210, 210, 100, 30);
        add(btnEncode);

        taEncodedValue = new JTextArea("Encoded Value in Hex format ... ");
        taEncodedValue.setRows(5);

        jScrollPane3 = new JScrollPane(taEncodedValue);
        jScrollPane3.setBounds(320, 210, 300, 50);
        add(jScrollPane3);

        btnDecode = new JButton("Decode >>");
        btnDecode.setBounds(210, 270, 100, 30);
        add(btnDecode);

        taDecodedValue = new JTextArea("Decoded Value in Hex format ...");
        taDecodedValue.setRows(5);

        jScrollPane4 = new JScrollPane(taDecodedValue);
        jScrollPane4.setBounds(320, 270, 300, 50);
        add(jScrollPane4);

        btnChangePlainText = new JButton("Plain Text >>");
        btnChangePlainText.setBounds(210, 330, 100, 30);
        add(btnChangePlainText);

        lPlainText1 = new JLabel("Plaing Text from decoded value...");
        lPlainText1.setBounds(320, 330, 300, 30);
        add(lPlainText1);

        btnChangeHex.addActionListener(this);
        btnChangeHex1.addActionListener(this);
        btnEncode.addActionListener(this);
        btnDecode.addActionListener(this);
        btnChangePlainText.addActionListener(this);

        setTitle("KSMA-UI for DES Algorithm Testing");
        setSize(650, 500);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnChangeHex) {
            String plainText = tfPlainText.getText().trim();
            if (plainText.length() > 0) {
                String hexPlainText = plainTextInputTo64BitHex(plainText);
                taHexValue.setText(hexPlainText.toUpperCase());
            } else {
                JOptionPane.showMessageDialog(null, "Please enter plain text first");
            }
        } else if (e.getSource() == btnChangeHex1) {
            String plainKey = tHexKey.getText().trim();
            if (plainKey.length()==8){
                String hexKey = plainTextKeyTo16BitHex(plainKey);
                taHexValue1.setText(hexKey.toUpperCase());
            }else {
                JOptionPane.showMessageDialog(null, "Plain text key must be 8 charaters");
            }

        } else if (e.getSource() == btnEncode) {
            String hexPlainText = taHexValue.getText().trim();
            String hexKey = taHexValue1.getText().trim();
            if (isHex(hexPlainText) && isHex(hexKey)) {
                String encodedValue = Encode(hexPlainText, hexKey);
                taEncodedValue.setText(encodedValue);
            } else {
                JOptionPane.showMessageDialog(null, "Please get Hex value from plain text and key first");
            }
        } else if (e.getSource() == btnDecode) {
            String encodedValue = taEncodedValue.getText().trim();
            String hexKey = taHexValue1.getText().trim();
            if (isHex(encodedValue) && isHex(hexKey)) {
                String decodedValue = Decode(encodedValue, hexKey);
                taDecodedValue.setText(decodedValue);
            } else {
                JOptionPane.showMessageDialog(null, "Encoded value and Key Must be Hex");
            }
        } else if (e.getSource() == btnChangePlainText) {
            String decodedValue = taDecodedValue.getText().trim();
            if (isHex(decodedValue)) {
                lPlainText1.setText(fromHexString(decodedValue));
            } else {
                JOptionPane.showMessageDialog(null, "Decoded Value must be Hex.");
            }

        }
    }

    private String plainTextInputTo64BitHex(String plainText) {
        String textInputInHex = toHexString(plainText.getBytes());

        //Add Cariage Return '0D' and Line feed '0A'
        textInputInHex +="0D0A";

        //Check the hexadecimal length and make to be multiple of 16. If require any bit, add '0'.
        int textInputHexLength = textInputInHex.length();
        int requireExtraLength = 16 - (textInputHexLength % 16);
        if (requireExtraLength != 0 && requireExtraLength != 16) {
            for (int i = 0; i < requireExtraLength; i++)
                textInputInHex += "0";
        }

        return textInputInHex;
    }

    private String plainTextKeyTo16BitHex(String plainTextKey) {
        String textInputKeyInHex = toHexString(plainTextKey.getBytes());
        String key = "";

        //According to the DES Algorithm, make the key to be 16 Hexadecimals
        if (textInputKeyInHex.length() > 16) {
            key += textInputKeyInHex.substring(0, 15);
        }else if (textInputKeyInHex.length()<16){
            int require = 16 - textInputKeyInHex.length();
            for (int i = 0; i<require; i++){
                textInputKeyInHex+='0';
            }
            key =textInputKeyInHex;
        }
        return textInputKeyInHex;
    }

    private boolean isHex(String inputData) {
        return inputData.trim().matches("[0-9A-Fa-f]+");
    }

    private String Encode(String inputData, String key) {
        String pl = inputData.trim();
        int x = pl.length();
        String Res = "";

        dES_encode encode = new dES_encode();
        encode.setBig_key(encode.hex_to_bin(key.toUpperCase()));


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
            System.out.println("h >>>" + h);
            encode.setPlain(encode.hex_to_bin(h.toUpperCase()));
            encode.setHex_plain(h.toUpperCase());
            encode.encode();
            Res = (encode.bin_to_hex(encode.getCipher()));
        }
        return Res;
    }

    private String Decode(String inputdata, String key) {
        String ci = inputdata.replace(" ", "");
        int x = ci.length();
        String Res = "";

        des_decode decode = new des_decode();
        decode.setBig_key(decode.hex_to_bin(key));

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
        return Res;
    }

    public static String toHexString(byte[] ba) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < ba.length; i++)
            str.append(String.format("%x", ba[i]));
        return str.toString();
    }

    public static String fromHexString(String hex) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < hex.length(); i += 2) {
            str.append((char) Integer.parseInt(hex.substring(i, i + 2), 16));
        }
        return str.toString();
    }

    public static void main(String args[]) {
        new KSMA_GUI();
    }
}
