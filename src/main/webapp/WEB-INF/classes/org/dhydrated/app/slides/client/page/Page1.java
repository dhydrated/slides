package org.dhydrated.app.slides.client.page;

import com.extjs.gxt.ui.client.widget.HorizontalPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.google.gwt.user.client.Element;

public class Page1 extends LayoutContainer {


	@Override
	protected void onRender(Element parent, int pos) {
		super.onRender(parent, pos);

	    HorizontalPanel hp = new HorizontalPanel();
	    hp.setSpacing(10);

	    hp.addText("<div>Test DIV 1</div>");
	    
	    add(hp);
	}
}
