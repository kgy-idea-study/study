package com.map;

import java.util.Iterator;
import java.util.Map;

/**
 * @author kouguangyuan
 * @date 2018/7/5 15:19
 */
public class MapBianLi {

    public void method1(Map<Object, Object> map) {
        // 第一种：
        /*
         * Set<Integer> set = map.keySet(); //得到所有key的集合
         *
         * for (Integer in : set) { String str = map.get(in);
         * System.out.println(in + "     " + str); }
         */
        System.out.println("第一种：通过Map.keySet遍历key和value：");
        for (Object in : map.keySet()) {
            //map.keySet()返回的是所有key的值

            /**
             * 得到每个key多对用value的值
             */
            Object str = map.get(in);
            System.out.println(in + "     " + str);
        }
    }

    public void method2(Map<Object, Object> map) {
        // 第二种：
        System.out.println("第二种：通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<Object, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Object> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }

    public void method3(Map<Object, Object> map) {
        // 第三种：推荐，尤其是容量大时
        System.out.println("第三种：通过Map.entrySet遍历key和value");
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            //Map.entry<Integer,String> 映射项（键-值对）  有几个方法：用上面的名字entry
            //entry.getKey() ;entry.getValue(); entry.setValue();
            //map.entrySet()  返回此映射中包含的映射关系的 Set视图。
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }

    public void method4(Map<Object, Object> map) {
        // 第四种：
        System.out.println("第四种：通过Map.values()遍历所有的value，但不能遍历key");
        for (Object v : map.values()) {
            System.out.println("value= " + v);
        }
    }
}
