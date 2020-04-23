package FacadePattern.problem2;

import sun.misc.BASE64Decoder;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;

public class newCipherMachine {
    public static final String KEY_MD5 = "MD5";
    public String encrypt(String plainText) {
        BigInteger bigInteger;
        bigInteger = null;

        try {
            MessageDigest md = MessageDigest.getInstance(KEY_MD5);
            byte[] inputData = plainText.getBytes();
            md.update(inputData);
            bigInteger = new BigInteger(md.digest());
        } catch (Exception e) {e.printStackTrace();}

        System.out.println("MD5加密后:" + bigInteger.toString(16));
        return bigInteger.toString(16);

    }
}
