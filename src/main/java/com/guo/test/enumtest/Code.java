package com.guo.test.enumtest;

/**
 * @author guo
 * @date 2021/2/21
 */
public enum Code implements INumberEnum {
	SUCCESS(200, "成功"),
	ERROR(404, "错误");

	private int code;
	private String msg;

	Code(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	@Override
	public int getCode() {
		return code;
	}

	@Override
	public String getMsg() {
		return msg;
	}
}
