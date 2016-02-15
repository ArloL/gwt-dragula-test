package com.example.client;

import static com.example.client.browser.Document.getElementById;
import static com.example.client.browser.Document.querySelector;
import static com.example.client.dragula.Dragula.dragula;

import com.example.client.dragula.Dragula;
import com.example.client.dragula.DragulaOptions;
import com.google.gwt.core.client.EntryPoint;

public class GwtDragulaTestEntryPoint implements EntryPoint {

	public void onModuleLoad() {
		DragulaOptions dragulaOptions = new DragulaOptions();
		dragulaOptions.copy = true;
		Dragula dragula = dragula(querySelector("#left-defaults"), dragulaOptions);
		dragula.getContainers().push(getElementById("right-defaults"));
	}

}
