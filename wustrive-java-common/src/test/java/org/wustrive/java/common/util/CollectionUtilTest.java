package org.wustrive.java.common.util;

import java.util.Map;

public class CollectionUtilTest {
    public static void main(String[] args) {
        Map<String,String> map = CollectionUtil.newHashMap();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        
        //遍历Map
        CollectionUtil.forEach(map, new CollectionUtil.KVConsumer<String, String>(){
            @Override
            public void accept(String key, String value, int index) {
                System.out.println(key);
            }});
    }
}   
