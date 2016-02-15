package com.example.client.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name = "console", isNative = true)
public class Console {

	public native static void log(String message);

	public native static void log(Object object);

}
