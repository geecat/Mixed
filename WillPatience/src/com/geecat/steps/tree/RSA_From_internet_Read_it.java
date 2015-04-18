package com.geecat.steps.tree;

import java.util.Vector;

public class RSA_From_internet_Read_it {
    Vector<Object> vectEnc;
    Object enc[];
    private long P, Q;
    private long N, M, E = 11;
    private long D;
    public RSA_From_internet_Read_it() {
        P = 6151;
        Q = 8807;
        N = P * Q;
        M = (P - 1) * (Q - 1);
        E = 11;
        D = 44310191;
        vectEnc = new Vector<Object>();
    }
    public String doEncryption(String message) {
        try {
            String str = "";//new BASE64Encoder().encode(message.getBytes("UTF-8"));
            String encString = "";
            for (int i = 0; i < str.length(); i += 3) {
                String tempAsci = "1";
                String tempStr;
                for (int h = 0; h < 3; h++) {
                    int total = i + h;
                    if (total < str.length()) {
                        tempStr = String.valueOf((int) (str.subSequence(total,
                                total + 1).charAt(0)) - 30);
                        if (tempStr.length() < 2) {
                            tempStr = "0" + tempStr;
                        }
                    } else {
                        break;
                    }
                    tempAsci = tempAsci + tempStr;
                }
                vectEnc.add(tempAsci + "1");
            }
            enc = vectEnc.toArray();
            vectEnc.removeAllElements();
            for (int i = 0; i < enc.length; i++) {
                long base = Long.parseLong(enc[i].toString());
                long powMod = powMod(base, E, N);
                encString = encString + String.valueOf(powMod) + " ";
            }
            return encString;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String doDecryption(String codeMsg) {
        String[] decryptArray = codeMsg.split(" ");
        String decryptStr = "";
        String originalStr = "";
        for (int i = 0; i < decryptArray.length; i++) {
            long base = Long.parseLong(decryptArray[i]);
            long powMod = powMod(base, D, N);
            String powModString = String.valueOf(powMod);
            decryptStr = decryptStr
                    + powModString.subSequence(1, powModString.length() - 1);
        }
        for (int i = 0; i < decryptStr.length(); i += 2) {
            char ch = (char) (Integer.parseInt(decryptStr.subSequence(i, i + 2)
                    .toString()) + 30);
            originalStr = originalStr + ch;
        }
       // BASE64Decoder decoder = new BASE64Decoder();
        byte[] decBytes = null;
       // try {
           // decBytes = decoder.decodeBuffer(originalStr);
        //} //catch (IOException e) {
            // TODO Auto-generated catch block
          //  e.printStackTrace();
     //   }
       // String decodeStr = new String(decBytes);
       // return decodeStr;
		return originalStr;
    }
    public long powMod(long base, long exp, long modula) {
        long accum = 1;
        int i = 0;
        long base2 = base;
        while ((exp >> i) > 0) {
            if (((exp >> i) & 1) == 1) {
                accum = mo((accum * base2), modula);
            }
            base2 = mo((base2 * base2), modula);
            i++;
        }
        return accum;
    }
    public long mo(long g, long l) {
        return (long) (g - (l * Math.floor(g / l)));
    }
}