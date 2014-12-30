package org.rapidoid.app;

import org.rapidoid.annotation.Session;
import org.rapidoid.http.HttpExchange;

public abstract class Screen extends AppGUI {

	@Session
	public String modal = null;

	public void onCloseModal() {
		modal = null;
	}

	public void onCancel(HttpExchange x) {
		if (modal != null) {
			modal = null;
		} else {
			x.goBack(1);
		}
	}

	public void onBack(HttpExchange x) {
		x.goBack(1);
	}

}