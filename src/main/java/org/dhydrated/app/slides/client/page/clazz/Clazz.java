package org.dhydrated.app.slides.client.page.clazz;

import org.dhydrated.app.slides.client.page.AbstractPage;

import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.google.gwt.user.client.Element;

public class Clazz extends AbstractPage {

	private static String SAMPLE_URL = "code/cleancode/class.html";
	
	@Override
	protected void onRender(Element parent, int pos) {
		super.onRender(parent, pos);

	    VerticalPanel vp = new VerticalPanel();
	    vp.setSpacing(10);
	    
	    vp.addText("<p>");
	    vp.addText("<ul>");
	    vp.addText("<li>Encapsulation.</li>");
	    vp.addText("<li>Keep it small.</li>");
	    vp.add(addToHorizontalPanel(shortFrame("large_class", "550px"), shortFrame("small_class", "100px")));
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
