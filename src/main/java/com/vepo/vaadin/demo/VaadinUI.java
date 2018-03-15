package com.vepo.vaadin.demo;

import javax.inject.Inject;

import com.vaadin.annotations.Theme;
import com.vaadin.cdi.CDIUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

/**
 *
 * @author Matti Tahvonen
 */
@Theme("valo")
@CDIUI("")
public class VaadinUI extends UI {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7785378168118154219L;
	
	@Inject
	Greeter greeter;

	@Override
	protected void init(VaadinRequest request) {
		setContent(new Button("Greet", e -> Notification.show(greeter.greet())));
	}

}