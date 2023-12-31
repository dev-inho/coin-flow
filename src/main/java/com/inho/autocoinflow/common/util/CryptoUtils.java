package com.inho.autocoinflow.common.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * 암호화 및 복호화
 */
public class CryptoUtils {

    /**
     * 암호
     * @param data 암호화할 문자열
     * @param secret 시크릿 키
     * @return
     * @throws Exception
     */
    public static String encrypt(String data, String secret) throws Exception {
        SecretKeySpec key = generateKey(secret);
        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encVal);
    }

    /**
     * 복호화
     * @param encryptedData 복호화할 문자열
     * @param secret 시크릿 키
     * @return
     * @throws Exception
     */
    public static String decrypt(String encryptedData, String secret) throws Exception {
        SecretKeySpec key = generateKey(secret);
        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedValue = Base64.getDecoder().decode(encryptedData);
        byte[] decValue = c.doFinal(decodedValue);
        return new String(decValue);
    }


    /**
     * 암호화 키 생성
     * @param password 암호화할 대상
     * @return 암호화 문자열
     * @throws NoSuchAlgorithmException
     */
    private static SecretKeySpec generateKey(String password) throws NoSuchAlgorithmException {
        final byte[] key = password.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
        return secretKeySpec;
    }

}
