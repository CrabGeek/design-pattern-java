package com.crabgeek.pattern.behavior.iterator;

import java.util.Iterator;
import java.util.Vector;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-02-07 21:49
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Vector<String> vectors = new Vector<>();
        vectors.add("向量1");
        vectors.add("向量2");
        vectors.add("向量3");
        vectors.add("向量4");
        show(vectors.iterator());
    }
    public static void show(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
