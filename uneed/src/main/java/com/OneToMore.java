package com;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * @author WangYeKun
 * @version 1.0
 * @date 2019/9/21 20:56
 */
public class OneToMore {
    public static void main(String[] args) {
        Map<String, List<String>> map = Maps.newHashMap();
        List<String> list = Lists.newArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        map.put("oneToMore", list);
        // 得到key
        List<String> results = map.get("oneToMore");
        // 输出key(List集合方式存在)
        System.out.println("######################## 集合方式存在 ##############################");
        System.out.println("key = " + results);
        // 增强for输出
        System.out.println("######################## 循环方式存在 ##############################");
        for (Object key : results) {
            System.out.println("key = " + key);
        }

    }
}