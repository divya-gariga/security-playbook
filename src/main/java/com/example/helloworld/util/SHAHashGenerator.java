package com.example.helloworld.util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SHAHashGenerator {

    public static String generateSHA1Hash(String input) {
        try {
            SecureRandom random = new SecureRandom();
            byte[] salt = new byte[16];
            random.nextBytes(salt);
            MessageDigest sha1Digest = MessageDigest.getInstance("SHA-256");
            sha1Digest.update(salt);
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