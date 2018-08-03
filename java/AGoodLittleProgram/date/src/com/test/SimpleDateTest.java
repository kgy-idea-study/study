package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author kouguangyuan
 * @date 2018/8/1 8:59
 */
public class SimpleDateTest {
    public static void main(String[] args) {
        String format = "yyyyMMddHHmmss";
        String value = "20180730195046";

        SimpleDateFormat simpleFormat = new SimpleDateFormat(format);
        try {
            System.out.println(simpleFormat.parse(value).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
