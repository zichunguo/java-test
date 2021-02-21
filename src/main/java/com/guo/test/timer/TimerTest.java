package com.guo.test.timer;

import java.util.Timer;

/**
 * @author guo
 * @date 2021/2/21
 */
public class TimerTest {
	public static void main(String[] args) {
		testTimer();
	}

	public static void testTimer() {
		// 1.创建Timer实例
		Timer timer = new Timer();
		// 2.创建任务对象
		TimerTaskTest task = new TimerTaskTest();
		// 3.通过Timer定时定频率调用TestTimerTask的业务代码
		timer.schedule(task, 3000L, 2000L);
	}
}
