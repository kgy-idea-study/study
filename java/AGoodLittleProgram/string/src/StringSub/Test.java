package StringSub;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/26 9:48
 */
public class Test {

    public static String getResult(String value,String type) {
        String result = "";
        String[] tempArr = null;
        String[] tempArr1 = null;
        String[] temp = value.split(" ");

        for (int i = 0; i < temp.length; i++) {
            if(temp[i].split("/").length > 3) {
                tempArr = temp[i].split("/");
            }
            if(temp[i].indexOf(":") > 0) {
                tempArr1 = temp[i].split(":");
            }
        }

        try {
            if("1".equals(type)) {
                if(tempArr1.length > 1) {
                    result = tempArr1[1].indexOf(".") > 0 ? tempArr1[1].split("\\.")[0] : tempArr1[1];
                }
            }else if("2".equals(type)) {
                if(tempArr1.length > 1) {
                    result = tempArr1[1].indexOf(".") > 0 ? tempArr1[1].split("\\.")[1] : "";
                }
            }else if("3".equals(type)) {
                result = tempArr == null ? "" : tempArr[0];
            }
            /*if("1".equals(type)) {
                result = value.substring(value.indexOf(":") + 1, value.indexOf("."));
            }else if("2".equals(type)) {
                result = value.substring(value.indexOf(".") + 1, value.indexOf(" ",value.indexOf(".")));
            }else if("3".equals(type)) {
                Matcher m = compile("((\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3}))").matcher(value);

                while (m.find()) {
                    result = m.group(1);
                }

            }*/else if("4".equals(type)) {
                result = tempArr == null ? "" : tempArr[1];
            }else if("5".equals(type)) {
                result = tempArr == null ? "" : tempArr[2];
            }else if("6".equals(type)) {
                result = tempArr == null ? "" : tempArr[3];
            }else if("7".equals(type)) {
                result = tempArr == null ? "" : tempArr[4];
            }else if("8".equals(type)) {
                result = tempArr == null ? "" : tempArr[5];
            }else if("9".equals(type)) {
                result = tempArr == null ? value : tempArr[6];
            }
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println("数据解析失败");
        }

        return result;
    }

    public static void main(String[] args) {
        String value = "trunk 1/0/0:3169.14 172.31.231.4/1/1/9/0/1/000000000000002960351748 GP";
        //String value = "0/0/100:3306.402 172.31.251.164/1/1/03/0/04/000000000000ALCLF245CCD0 GP";
        //String value = "0000001000001017";
        //String value = "trunk 1/1/1:3123.23 0/0/0/0/0/0";
        //String value = "0/0/10:100";
        System.out.println(getResult(value,"1"));
        System.out.println(getResult(value,"2"));
        System.out.println(getResult(value,"3"));
        System.out.println(getResult(value,"4"));
        System.out.println(getResult(value,"5"));
        System.out.println(getResult(value,"6"));
        System.out.println(getResult(value,"7"));
        System.out.println(getResult(value,"8"));
        System.out.println(getResult(value,"9"));
    }
}
