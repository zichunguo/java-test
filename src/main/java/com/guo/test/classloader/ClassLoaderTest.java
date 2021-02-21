package com.guo.test.classloader;

/**
 * @author guo
 * @date 2021/2/21
 */
public class ClassLoaderTest {
	public static void main(String[] args) throws Exception {
		// 获取系统类的加载器
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
		System.out.println(systemClassLoader);

		// 获取系统类加载器的父类加载器 -> 扩展类加载器
		ClassLoader extClassLoader = systemClassLoader.getParent();
		System.out.println(extClassLoader);

		// 获取扩展类加载器的父类加载器 -> 根加载器
		ClassLoader bootstrapClassLoader = extClassLoader.getParent();
		System.out.println(bootstrapClassLoader);

		// 测试 Object（JDK 内部类）的类加载器，java.long 包在 rt.jar 中，所有使用的是根加载器
		ClassLoader classLoader = Class.forName("java.lang.Object").getClassLoader();
		System.out.println(classLoader);

		// 测试当前类的类加载器 -> 系统类的加载器
		ClassLoader classLoader2 = Class.forName("com.guo.java.classloader.ClassLoaderTest").getClassLoader();
		System.out.println(classLoader2);

		// 获取类加载器加载的路径
		String path = System.getProperty("java.class.path");
		System.out.println(path);
	}
}
