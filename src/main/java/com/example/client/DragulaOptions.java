package com.example.client;

import com.fasterxml.jackson.annotation.JsonProperty;

import jsinterop.annotations.JsType;

@JsType
public class DragulaOptions {

	@JsonProperty
	public boolean copy;

	@JsonProperty
	public boolean removeOnSpill;

	@JsonProperty
	public boolean revertOnSpill;

	@JsonProperty
	public boolean ignoreInputTextSelection;

}
