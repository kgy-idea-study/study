package StringSub;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kouguangyuan
 * @date 2018/8/3 8:39
 */
public class Test1 {
    public static void main(String[] args) {
        String str = "abc<icon>def</icon>deftfh<icon>a</icon>";
        String str1 = "(CERTIFICATION_TIME<=timestamp'2018-08-02 23:59:59')";



        //Pattern p=Pattern.compile("<icon>(\\w+)</icon>");
        Pattern p=Pattern.compile("\\((\\w+)<=");
        Matcher m=p.matcher(str1);
        while(m.find()){
            System.out.println(m.group(1));
        }

        Pattern p1=Pattern.compile("<=timestamp'(.*)'\\)");
        Matcher m1=p1.matcher(str1);
        while(m1.find()){
            System.out.println(m1.group(1));
        }
    }
}
