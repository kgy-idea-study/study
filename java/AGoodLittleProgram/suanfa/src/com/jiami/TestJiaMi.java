package com.jiami;

import java.util.Base64;

/**
 * @author kouguangyuan
 * @date 2018/10/8 9:22
 */
public class TestJiaMi {
    public static void main(String[] args) {
        String test = "aaaa";
        SecurityHelper securityHelper = SecurityHelper.getInstance();

        System.out.println(securityHelper.getEncrypt(test));
        System.out.println(securityHelper.getDecrypt("D228B209EEFE2C12"));

        try {
            final Base64.Decoder decoder = Base64.getDecoder();
            final Base64.Encoder encoder = Base64.getEncoder();
            final String text = "字串文字";
            final byte[] textByte = text.getBytes("UTF-8");
            //编码
            final String encodedText = encoder.encodeToString(textByte);
            System.out.println(encodedText);
            //解码
            System.out.println(new String(decoder.decode(encodedText), "UTF-8"));
        } catch (Exception e) {
        }
    }
}
