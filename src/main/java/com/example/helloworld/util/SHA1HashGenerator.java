package com.example.helloworld.util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1HashGenerator {

    public static String generateSHA1Hash(String input) {
        try {
            MessageDigest sha1Digest = MessageDigest.getInstance("SHA-1");
            byte[] hashBytes = sha1Digest.digest(input.getBytes());
            StringBuilder hexBuilder = new StringBuilder();
            for (byte b : hashBytes) {
                hexBuilder.append(String.format("%02x", b));
            }
            return hexBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}