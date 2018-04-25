package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kouguangyuan
 * @Description
 * @Date Created in 2017/12/28 11:07
 * @Modified By
 */
public class RegexMatches {
    public static void main(String args[]) {
        String str = "abbc";
        String pattern = "a.c";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
    }
}
