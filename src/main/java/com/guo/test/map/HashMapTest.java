package com.guo.test.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author guo
 * @date 2021/2/21
 */
public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Object, String> map = new HashMap<>();
		map.put(null, "null");// HashMap 的 key 和 value 允许为 null
		map.put("1", "1");
		System.out.println(map.containsKey(null));
		System.out.println(map.get("3"));
		System.out.println(map.get(null));

		Map<Object, String> map2 = new Hashtable<>();
		map2.put(null, "1");// HashTable 的 key 和 value 不允许为 null
		System.out.println(map2.get(null));
	}
}
