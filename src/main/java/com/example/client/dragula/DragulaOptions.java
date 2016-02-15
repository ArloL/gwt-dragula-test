package com.example.client.dragula;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class DragulaOptions {

	@JsProperty
	public boolean copy;

	@JsProperty
	public boolean removeOnSpill;

	@JsProperty
	public boolean revertOnSpill;

	@JsProperty
	public boolean ignoreInputTextSelection;

}
