package com.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kouguangyuan
 * @date 2018/7/5 15:36
 */
public class Test {

    @org.junit.Test
    public void bianLiMapTest() {
        MapBianLi mapBianLi = new MapBianLi();
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "ab");
        map.put(4, "ab");
        map.put(4, "ab");// 和上面相同 ， 会自己筛选
        System.out.println(map.size());

        mapBianLi.method1(map);
        mapBianLi.method2(map);
        mapBianLi.method3(map);
        mapBianLi.method4(map);
    }
}
