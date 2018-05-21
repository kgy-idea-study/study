package com.designPattern.behaviorPattern.iteratorPattern;

public class Test {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = (Iterator) collection.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
