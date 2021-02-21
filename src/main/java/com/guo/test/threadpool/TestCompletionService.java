package com.guo.test.threadpool;

import java.util.concurrent.*;

/**
 * @author guo
 * @date 2021/1/13
 */
public class TestCompletionService {

	public static void main(String[] args) {
		ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(100);

		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 2, 3, TimeUnit.SECONDS, arrayBlockingQueue);
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(threadPool);

		int num = 0;
		for(int i = 0 ; i < 10; i++) {
			System.out.println("add task start "+i);
			Future<Integer> future = completionService.submit(new Task(i+1));
			num++;
			System.out.println("add task end "+i);
		}
		System.out.println("num : " + num);
		for(int i = 0 ; i < num; i++) {
			Integer result = null;
			try {
				result = completionService.poll(1, TimeUnit.SECONDS).get(1, TimeUnit.SECONDS);
				System.out.println("任务i=="+result+"完成!");
			} catch (InterruptedException | TimeoutException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		System.out.println("------------");
	}

}


class Task implements Callable<Integer> {

	int i;
	public Task(int i) {
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