package org.dhydrated.app.slides.client.page.clazz;

import org.dhydrated.app.slides.client.page.AbstractPage;

import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.google.gwt.user.client.Element;

public class Clazz2 extends AbstractPage {

	private static String SAMPLE_URL = "code/cleancode/class.html";
	
	@Override
	protected void onRender(Element parent, int pos) {
		super.onRender(parent, pos);

	    VerticalPanel vp = new VerticalPanel();
	    vp.setSpacing(10);
	    
	    vp.addText("<p>");
	    vp.addText("<ul>");
	    vp.addText("<li>The Single Responsibility Principle.</li>");
	    vp.add(longFrame("srp", "100px"));
	    vp.addText("<li>Cohesion.</li>");
	    vp.add(longFrame("cohesion", "420px"));
	    vp.addText("<br/>");
	    vp.addText("<ul>");
	    vp.addText("</p>");
	    
		vp.add(awardButton("You have received a \"Cool Classes\" award", null));
	    
	    add(vp);
	    
	}

	@Override
	protected String getUrl() {

		return SAMPLE_URL;
	}
	

}
