package org.dhydrated.app.slides.client.page.function;

import org.dhydrated.app.slides.client.page.AbstractPage;

import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.google.gwt.user.client.Element;

public class Function extends AbstractPage {

	private static String SAMPLE_URL = "code/cleancode/functions.html";
	
	@Override
	protected void onRender(Element parent, int pos) {
		super.onRender(parent, pos);

	    VerticalPanel vp = new VerticalPanel();
	    vp.setSpacing(10);
	    
	    vp.addText("<p>");
	    vp.addText("<ul>");
	    vp.addText("<li>Small.</li>");
	    vp.addText("<li>Do one thing.</li>");
	    vp.addText("<li>One level of abstraction.</li>");
	    vp.addText("<li>Readable from top to bottom.</li>");
	    vp.addText("<li>Has descriptive names.</li>");
	    vp.add(addToHorizontalPanel(shortFrame("#bad_sample_1", "420px"), shortFrame("#good_sample_1", "420px")));
	    vp.addText("<br/>");
	    vp.addText("<ul>");
	    vp.addText("</p>");
	    
	    add(vp);
	    
	}

	@Override
	protected String getUrl() {

		return SAMPLE_URL;
	}
	

}
