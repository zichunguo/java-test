package com.guo.test.threadpool;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author guo
 * @date 2021/1/13
 */
public class TestCompletableFuture {
	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
			CompletableFuture<String> future = new CompletableFuture<>();
			int finalI = i;
			new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println("run start " + finalI);
					try {
						Thread.sleep(3000);
						System.out.println("run end " + finalI);
						future.complete("cccccc" + finalI);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}).start();
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

	}
}
