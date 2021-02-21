package com.guo.test.threadpool;

import javax.script.ScriptException;
import java.util.concurrent.*;

/**
 * @author guo
 * @date 2021/1/12
 */
public class TestThreadPool {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(100);

		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(4, 4, 3,
				TimeUnit.SECONDS, arrayBlockingQueue);

//		for (int i = 0; i<10; i++) {
//			System.out.println("for--" + i);
//			threadPool.submit(new DealRunnable(i));
//			System.out.println("for-end-" + i);
//		}
		System.out.println("*****");
		for (int i = 0; i<10; i++) {
			System.out.println("for--" + i);

			Future<Integer> future = threadPool.submit(new DealCallable(i));
			Integer integer = future.get(3L, TimeUnit.SECONDS);
			System.out.println("for-end-" + i);
		}

		System.out.println("&&&&&&&&");
	}
}

class DealCallable implements Callable<Integer> {

	int i;
	public DealCallable(int i) {
		this.i = i;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " -- run start.");
		for(int i = 0; i < 10; i++) {
			System.out.println(" t -- " + this.i);
			Thread.sleep(2000);
		}
		System.out.println(Thread.currentThread().getName() + " -- run end.");
		return i;
	}
}

class DealRunnable implements Runnable {
	private int i;

	public DealRunnable(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " -- run start.");
		for(int i = 0; i < 10; i++) {
			System.out.println(" t -- " + this.i);
		}
		System.out.println(Thread.currentThread().getName() + " -- run end.");
	}
}