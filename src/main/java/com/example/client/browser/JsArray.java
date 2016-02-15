package com.example.client.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Array")
public class JsArray<T> {

	public native void push(T item);

}
