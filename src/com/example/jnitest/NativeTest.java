package com.example.jnitest;

public class NativeTest {

	static {
		System.loadLibrary("com_example_jnitest_NativeTest");
	}

	public static native void test();
}
