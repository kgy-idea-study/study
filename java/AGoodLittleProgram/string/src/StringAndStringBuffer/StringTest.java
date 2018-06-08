package StringAndStringBuffer;

import java.util.Date;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.intern());
        System.out.println(s1 == s1.intern());

        int i=0;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println("s1的值是：---"+ s1 + "，当前方法=StringTest.main()");
        
        //10.fori
        for (int i1 = 0; i1 < 10; i1++) {
            System.out.println("i1的值是：---"+ i1 + "，当前方法=StringTest.main()");
        }

        System.out.println(new Date());

        System.out.println(1 / 2 * 9);
        System.out.println(1/2);
        System.out.println((double) 1 / 2);
    }

    public static double a(byte x, double y){
        return (short)x/y*2;
    }
}
