package com.guo.test.timer;

import java.util.TimerTask;

/**
 * @author guo
 * @date 2021/2/21
 */
public class TimerTaskTest extends TimerTask {
	@Override
	public void run() {
		System.out.println("test timer : " + System.currentTimeMillis());
	}
}
