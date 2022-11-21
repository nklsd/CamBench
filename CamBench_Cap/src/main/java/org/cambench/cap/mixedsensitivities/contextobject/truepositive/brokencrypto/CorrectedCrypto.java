package main.java.org.cambench.cap.mixedsensitivities.contextobject.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CorrectedCrypto {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass cryptoClass1 = GetObject("AES/CBC/PKCS5Padding");

        Cipher cipher = Cipher.getInstance(cryptoClass1.algorithm);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static CryptoClass GetObject(String algo){
        CryptoClass object = new CryptoClass();
        object.algorithm = algo;
        return object;
    }

    public static class CryptoClass {
        String algorithm;
    }
}