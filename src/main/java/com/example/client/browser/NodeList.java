package com.example.client.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class NodeList<T> {

	@JsProperty
	public native int getLength();

	@JsMethod
	public native T item(int index);

	@SuppressWarnings("unchecked")
	@JsOverlay
	public final T[] toArray() {
		Object[] result = new Object[getLength()];
		for (int i = 0; i < getLength(); i++) {
			result[i] = item(i);
		}
		return (T[]) result;
	}

}
