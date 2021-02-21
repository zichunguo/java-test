package com.guo.test.lambda;

/**
 * @author guo
 * @date 2021/2/21
 */
public class LambdaTest {
	public static void main(String[] args) {
		testPrint((String s) -> {
			System.out.println(s);
		});
		System.out.println("-------- lambda 省略 -------");
		testPrint((s) -> System.out.println(s));
		System.out.println("-------- 方法引用 类的静态方法 -------");
		testPrint(System.out::println);

		System.out.println("=========================");
		testAdd((int i, int j) -> {
			return i + j;
		});
		System.out.println("-------- lambda 省略 -------");
		testAdd((i, j) -> i + j);
		System.out.println("-------- 方法引用 类的静态方法 -------");
		testAdd(MyInt::sAdd);
		System.out.println("-------- 方法应用 对象的实例方法 -------");
		MyInt myInt = new MyInt();
		testAdd(myInt::pAdd);

		System.out.println("=========================");
		testSub((String s, int i, int j) -> {
			return s.substring(i, j);
		});
		System.out.println("-------- lambda 省略 -------");
		testSub((s,i,j) -> s.substring(i, j));
		System.out.println("-------- 方法引用 类的实例方法 -------");
		testSub(String::substring);

		System.out.println("=========================");
		testTwo((s) -> System.out.println(s), (i,j) -> {return i + j;});
		System.out.println("---------------");
		testTwo((s) -> System.out.println(s), MyInt::sAdd);
		System.out.println("---------------");
		testTwo(System.out::println, MyInt::sAdd);

		System.out.println("=========================");
		testNew((String s) -> {
			return new User(s);
		});
		System.out.println("------- lambda 省略 --------");
		testNew((s) -> new User(s));
		System.out.println("------- 方法引用 类的构造方法 --------");
		testNew(User::new);

	}
	private static void testPrint(MyInter1 i) {
		i.print("hello");
	}
	private static void testAdd(MyInter2 i) {
		int x = i.add(1, 2);
		System.out.println(x);
	}
	private static void testSub(MyInter3 i) {
		String str = i.sub("hello", 2, 4);
		System.out.println(str);
	}
	private static void testTwo(MyInter1 i1, MyInter2 i2) {
		i1.print("hello");
		int x = i2.add(2, 4);
		System.out.println(x);
	}
	public static void testNew(MyInter4 i) {
		User user = i.getUser("zhangsan");
		System.out.println(user.name);
	}
}

class MyInt {
	public static int sAdd(int i, int j) {
		return i + j;
	}
	public int pAdd(int i, int j) {
		return i + j;
	}
}

class User {
	String name;
	public User() {}
	public User(String name) {
		this.name = name;
	}
}

interface MyInter1 {
	void print(String s);
}

interface MyInter2 {
	int add(int i, int j);
}

interface MyInter3 {
	String sub(String str, int i, int j);
}

interface MyInter4 {
	User getUser(String name);
}
