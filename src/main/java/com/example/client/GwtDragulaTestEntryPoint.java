package com.example.client;

import static com.example.client.Document.getElementById;
import static com.example.client.Dragula.dragula;

import com.google.gwt.core.client.EntryPoint;

public class GwtDragulaTestEntryPoint implements EntryPoint {

	public void onModuleLoad() {
		DragulaOptions dragulaOptions = new DragulaOptions();
		dragulaOptions.copy = true;
		Dragula dragula = dragula(getElementById("left-defaults"), dragulaOptions);
		dragula.getContainers().push(getElementById("right-defaults"));
	}

}
