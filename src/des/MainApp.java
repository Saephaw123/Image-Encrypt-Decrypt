package des;

public class MainApp {

    private static String encode(String inputData, String key) {
        String pl = inputData.trim();
        int x = pl.length();
        String Res = "";

        desEncode encode = new desEncode();
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

    private String decode(String inputdata, String key) {
        String ci = inputdata.replace(" ", "");
        int x = ci.length();
        String Res = "";

        desDecode decode = new desDecode();
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

    public static void main(String argsl[]){
        String message = "48656C6C6FAAAAAA";
        String key = "ADBCE12C";


        System.out.println("Message = "+message);
        System.out.println("Key = "+key);
        System.out.println();

        String encodedValue = encode(message, key);

        System.out.println("Encoded Value = "+encodedValue);
        System.out.println();


        //System.out.println("Decoded Value = ");
        //System.out.println();
    }


}
