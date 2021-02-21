package com.guo.test.uuid;

import java.util.UUID;

/**
 * @author guo
 * @date 2021/2/21
 */
public class UUIDTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			UUID uuid = UUID.randomUUID();
			System.out.println(uuid);
			UUID uuid2 = UUID.fromString(uuid.toString());
			System.out.println(uuid2);
			System.out.println("************************");
		}
	}
}
