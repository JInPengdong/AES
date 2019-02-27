package main;

import util.AES;

public class MainCla {

    public static void main(String[] args) {
        String data = "hello";

        String key = AES.generateString(16);
        System.out.println("key: "+key);

        String cipherText = AES.encryptToBase64(data,key);
        System.out.println("密文: "+cipherText);

        String laws = AES.decryptFromBase64(cipherText,key);
        System.out.println("明文: "+laws);

    }

}
