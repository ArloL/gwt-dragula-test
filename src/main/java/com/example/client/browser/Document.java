package com.example.client.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name = "document", isNative = true)
public class Document {

	public native static Element getElementById(String id);

	public native static Element querySelector(String selectors);

	public native static NodeList<Element> querySelectorAll(String selectors);

}
