package com.weis;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

/**
 * @ClassName TestDemo
 * @Description TODO
 * @Author weis
 * @Date 2021/10/9 11:15
 * @Version
 */
@SpringBootTest
public class TestDemo {

    @Test
    public void test1() {
        List<String> list = Arrays.asList("a", "b", "c");
//        list.add("e");
        ArrayList<String> arrayList = new ArrayList<>(list);
        arrayList.add("e");
        arrayList.add("e");
        System.out.println(arrayList);
        Set<String> set = new HashSet<>(arrayList);
        System.out.println(set);
    }

    @Test
    public void test2() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
//            String next = iterator.next();
//            /*if (next.equals("a")) {
//            }*/
            iterator.remove();
        }
        System.out.println(list);
    }

    @Test
    public void test3(){
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        System.out.println(list);
        for (String s : list) {
            list.add("e");
        }
        System.out.println(list);
    }

}
