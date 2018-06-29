package StringNull;



/**
 * Java String 对 null 对象的容错处理
 * http://www.importnew.com/27601.html
 */
/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/27 16:46
 */
public class StringOfNullTest {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s);
        //null

        Integer i = null;
        System.out.println(i);
        //null

        String s1 = null;
        s1 = s1 + "!";
        System.out.print(s1);
        //null!
    }
}
