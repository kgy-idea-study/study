package com.test;

import org.junit.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kouguangyuan
 * @date 2018/7/19 11:21
 */
//https://www.cnblogs.com/jingmoxukong/p/6026474.html
public class MatchTest {
    public static void main(String[] args) {
        //案例：lookingAt vs find vs matches
        checkLookingAt("hello", "helloworld");
        checkLookingAt("world", "helloworld");

        checkFind("hello", "helloworld");
        checkFind("world", "helloworld");

        checkMatches("hello", "helloworld");
        checkMatches("world", "helloworld");
        checkMatches("helloworld", "helloworld");

        //使用start()、end()、group() 查找所有匹配正则条件的子序列
        final String regex = "world";
        final String content = "helloworld helloworld";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);
        System.out.println("content: " + content);

        int i = 0;
        while (m.find()) {
            i++;
            System.out.println("[" + i + "th] found");
            System.out.print("start: " + m.start() + ", ");
            System.out.print("end: " + m.end() + ", ");
            System.out.print("group: " + m.group() + "\n");
        }

        //案例：replaceFirst vs replaceAll
        String regex1 = "can";
        String replace = "can not";
        String content1 = "I can because I think I can.";

        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(content1);

        System.out.println("content: " + content1);
        System.out.println("replaceFirst: " + m1.replaceFirst(replace));
        System.out.println("replaceAll: " + m1.replaceAll(replace));

        //案例：appendReplacement、appendTail和replaceAll
        String regex2 = "can";
        String replace2 = "can not";
        String content2 = "I can because I think I can.";
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        System.out.println("content: " + content2);
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(content2);
        while (m2.find()) {
            m2.appendReplacement(sb, replace2);
        }
        System.out.println("appendReplacement: " + sb);
        m2.appendTail(sb);
        System.out.println("appendTail: " + sb);

        //案例：quoteReplacement和replaceAll，解决特殊字符替换问题
        String regex3 = "\\$\\{.*?\\}";
        String replace3 = "${product}";
        String content3 = "product is ${productName}.";

        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(content3);
        String replaceAll = m3.replaceAll(Matcher.quoteReplacement(replace));

        System.out.println("content: " + content3);
        System.out.println("replaceAll: " + replaceAll);



        //例 匹配多个可选的字符串
        Assert.assertTrue(checkMatches("yes|no", "yes"));
        Assert.assertTrue(checkMatches("yes|no", "no"));
        Assert.assertFalse(checkMatches("yes|no", "right"));

        //例 匹配组合字符串
        Assert.assertTrue(checkMatches("(play|end)(ing|ed)", "ended"));
        Assert.assertTrue(checkMatches("(play|end)(ing|ed)", "ending"));
        Assert.assertTrue(checkMatches("(play|end)(ing|ed)", "playing"));
        Assert.assertTrue(checkMatches("(play|end)(ing|ed)", "played"));
        Assert.assertFalse(checkMatches("(play|end)(ing|ed)", "play"));

        //例 字符在指定范围
        // 测试正则表达式字符：[]
        Assert.assertTrue(checkMatches("[abc]", "b"));  // 字符只能是a、b、c
        Assert.assertTrue(checkMatches("[a-z]", "m")); // 字符只能是a - z
        Assert.assertTrue(checkMatches("[A-Z]", "O")); // 字符只能是A - Z
        Assert.assertTrue(checkMatches("[a-zA-Z]", "K")); // 字符只能是a - z和A - Z
        Assert.assertTrue(checkMatches("[a-zA-Z]", "k"));
        Assert.assertTrue(checkMatches("[0-9]", "5")); // 字符只能是0 - 9

        //例 字符不能在指定范围
        // 测试正则表达式字符：[^]
        Assert.assertFalse(checkMatches("[^abc]", "b")); // 字符不能是a、b、c
        Assert.assertFalse(checkMatches("[^a-z]", "m")); // 字符不能是a - z
        Assert.assertFalse(checkMatches("[^A-Z]", "O")); // 字符不能是A - Z
        Assert.assertFalse(checkMatches("[^a-zA-Z]", "K")); // 字符不能是a - z和A - Z
        Assert.assertFalse(checkMatches("[^a-zA-Z]", "k"));
        Assert.assertFalse(checkMatches("[^0-9]", "5")); // 字符不能是0 - 9

        //例 限制字符出现次数
        // {n}: n 是一个非负整数。匹配确定的 n 次。
        checkMatches("ap{1}", "a");
        checkMatches("ap{1}", "ap");
        checkMatches("ap{1}", "app");
        checkMatches("ap{1}", "apppppppppp");

        // {n,}: n 是一个非负整数。至少匹配 n 次。
        checkMatches("ap{1,}", "a");
        checkMatches("ap{1,}", "ap");
        checkMatches("ap{1,}", "app");
        checkMatches("ap{1,}", "apppppppppp");

        // {n,m}: m 和 n 均为非负整数，其中 n <= m。最少匹配 n 次且最多匹配 m 次。
        checkMatches("ap{2,5}", "a");
        checkMatches("ap{2,5}", "ap");
        checkMatches("ap{2,5}", "app");
        checkMatches("ap{2,5}", "apppppppppp");

        //例 限制字符串头部
        Assert.assertTrue(checkMatches("^app[a-z]{0,}", "apple")); // 字符串必须以app开头
        Assert.assertFalse(checkMatches("^app[a-z]{0,}", "aplause"));

        //例 限制字符串尾部
        Assert.assertTrue(checkMatches("[a-z]{0,}ing$", "playing")); // 字符串必须以ing结尾
        Assert.assertFalse(checkMatches("[a-z]{0,}ing$", "long"));
    }

    private static void checkLookingAt(String regex, String content) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);
        if (m.lookingAt()) {
            System.out.println(content + "\tlookingAt： " + regex);
        } else {
            System.out.println(content + "\tnot lookingAt： " + regex);
        }
    }

    private static void checkFind(String regex, String content) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);
        if (m.find()) {
            System.out.println(content + "\tfind： " + regex);
        } else {
            System.out.println(content + "\tnot find： " + regex);
        }
    }

    private static boolean checkMatches(String regex, String content) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);
        if (m.matches()) {
            System.out.println(content + "\tmatches： " + regex);
            return true;
        } else {
            System.out.println(content + "\tnot matches： " + regex);
            return false;
        }
    }
}
