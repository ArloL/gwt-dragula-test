package com.example.client;

import static com.example.client.Document.getElementById;
import static com.example.client.Dragula.dragula;

import com.google.gwt.core.client.EntryPoint;

public class GwtDragulaTestEntryPoint implements EntryPoint {

	public void onModuleLoad() {
		dragula(getElementById("left-defaults"), getElementById("right-defaults"));
	}

}
