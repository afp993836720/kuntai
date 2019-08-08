package com.shengpingj.kuntai.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class PasswordMD5 {

    public static String md5(String password){
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("md5");
            byte[] bytes = md.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(bytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean passwordChecking(String password,String password2){
        return md5(password).equals(password2);
    }

}
