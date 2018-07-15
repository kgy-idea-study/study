package StringEquals;

/**
 * @author kouguangyuan
 * @date 2018/7/6 9:46
 */
public class StringEqTest {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        String str3 = "he" + "llo";
        System.out.println(str1 == str2);//false
        System.out.println(str1 == str3);//true

        String a = "abcdefg";
        String b = "abcdefg";
        System.out.println(a == b);//true
    }
}
