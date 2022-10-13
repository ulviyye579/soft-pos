/*
 * Copyright (c) 2020.
 *
 *
 *  @author Sanan Garibli
 *
 */

package az.unibank.softpos.utils;

import az.unibank.softpos.exceptions.CryptoException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import java.security.PrivateKey;
import java.security.PublicKey;


@Slf4j
@Component
public class RSAUtil {

    public static byte[] encrypt(String plainText, PublicKey publicKey) throws Exception {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-512ANDMGF1PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            return cipher.doFinal(plainText.getBytes());
        } catch (Exception ex) {
            log.error(ex.getLocalizedMessage());
            throw new CryptoException("Cannot encrypt data. " + ex);
        }
    }

    public String decrypt(byte[] cipherTextArray, PrivateKey privateKey) throws Exception {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-512ANDMGF1PADDING");
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] decryptedTextArray = cipher.doFinal(cipherTextArray);
            return new String(decryptedTextArray);
        } catch (Exception ex) {
            log.error(ex.getLocalizedMessage());
            throw new CryptoException("Cannot decrypt data. " + ex);
        }
    }
}
