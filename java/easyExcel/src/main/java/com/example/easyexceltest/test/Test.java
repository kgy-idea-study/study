package com.example.easyexceltest.test;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author kouguangyuan
 * @date 2019/3/7 16:57
 */
public class Test {
    public static void main(String[] args) {
        String filePath = "e:/海贼王.xlsx";
        //解析excel，
        List<Person> personList = FileUtil.importExcel(filePath, 1, 1, Person.class);
        //也可以使用MultipartFile,使用 FileUtil.importExcel(MultipartFile file, Integer titleRows, Integer headerRows, Class<T> pojoClass)导入
        System.out.println("导入数据一共【" + personList.size() + "】行");

        System.out.println(ArrayUtils.toString(personList));

    }

    @org.junit.Test
    public void export() {

        //模拟从数据库获取需要导出的数据
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("路飞", "1", "2019-03-07");
        Person person2 = new Person("娜美", "2", "2019-03-07");
        Person person3 = new Person("索隆", "1", "2019-03-07");
        Person person4 = new Person("小狸猫", "1", "2019-03-07");
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        //导出操作
        try {
            FileUtil.exportExcel(personList, "花名册", "草帽一伙", Person.class, "海贼王.xls");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
