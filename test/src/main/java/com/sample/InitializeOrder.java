package com.sample;

/**
 * Sample Program from http://www.task-notes.com/entry/20151027/1445914800
 *
 */
public class InitializeOrder extends SuperClass {

	public InitializeOrder() {
		System.out.println("サブクラスのコンストラクタの実行");
	}

	public static void main(String[] args) {
		new InitializeOrder();
		System.out.println("mainメソッドの実行");
	}

	{
		System.out.println("サブクラスの" + OBJECT_INIT + "の実行");
	}

	static {
		System.out.println("サブクラスの" + STATIC_INIT + "の実行");
	}
}

class SuperClass {

	public static final String STATIC_INIT = "static初期化ブロック";
	public static final String OBJECT_INIT = "初期化ブロック";

	static {
		System.out.println("スーパークラスの" + STATIC_INIT + "の実行");
	}

	{
		System.out.println("スーパークラスの" + OBJECT_INIT + "の実行");
	}

	public SuperClass() {
		System.out.println("スーパークラスのコンストラクタ実行");
	}
}
