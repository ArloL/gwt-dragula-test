package com.example.client.dragula;

import com.example.client.browser.Element;
import com.example.client.browser.JsArray;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Dragula {

	@JsMethod(namespace = JsPackage.GLOBAL)
	public native static Dragula dragula(Element... elements);

	@JsMethod(namespace = JsPackage.GLOBAL)
	public native static Dragula dragula(Element[] elements, DragulaOptions options);

	@JsMethod(namespace = JsPackage.GLOBAL)
	public native static Dragula dragula(DragulaOptions options);

	@JsOverlay
	public static Dragula dragula(Element element, DragulaOptions options) {
		return dragula(new Element[] { element }, options);
	}

	@JsOverlay
	public static Dragula dragula(Element element, Element element2, DragulaOptions options) {
		return dragula(new Element[] { element, element2 }, options);
	}

	@JsOverlay
	public static Dragula dragula(Element element, Element element2, Element element3, DragulaOptions options) {
		return dragula(new Element[] { element, element2, element3 }, options);
	}

	@JsOverlay
	public static Dragula dragula(DragulaOptions options, Element... elements) {
		return dragula(elements, options);
	}

	@JsProperty
	public native JsArray<Element> getContainers();

}
