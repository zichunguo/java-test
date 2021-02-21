package com.guo.test.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author guo
 * @date 2021/2/21
 */
public class AtomicTest {
	private static final AtomicInteger atomicInteger = new AtomicInteger(0);

	public static void main(String[] args) {
		atomicInteger.compareAndSet(0, 1);
		System.out.println(atomicInteger.get());
		atomicInteger.incrementAndGet();
		System.out.println(atomicInteger.get());
	}
}
