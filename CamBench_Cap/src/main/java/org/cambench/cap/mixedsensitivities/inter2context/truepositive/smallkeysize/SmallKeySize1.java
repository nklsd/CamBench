package main.java.org.cambench.cap.mixedsensitivities.inter2context.truepositive.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class SmallKeySize1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        int keySize1 = Identity(1024);
        int keySize2 = Identity(2048);
        method1(keySize1);
    }

    public static int Identity(int i){
        return i;
    }

    public static void method1(int keySize) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");

        keyGen.initialize(keySize);
        KeyPair keyPair = keyGen.generateKeyPair();

        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
    }
}