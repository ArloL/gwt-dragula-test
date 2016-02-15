package com.example.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Dragula {

	@JsMethod(namespace = JsPackage.GLOBAL)
	public native static Dragula dragula(Element... elements);

}
