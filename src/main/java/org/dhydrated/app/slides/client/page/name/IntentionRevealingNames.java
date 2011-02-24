package org.dhydrated.app.slides.client.page.name;

import org.dhydrated.app.slides.client.page.AbstractPage;

import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.google.gwt.user.client.Element;

public class IntentionRevealingNames extends AbstractPage {

	private static String SAMPLE_URL = "code/cleancode/meaningfulnames.html";
	
	@Override
	protected void onRender(Element parent, int pos) {
		super.onRender(parent, pos);

	    VerticalPanel vp = new VerticalPanel();
	    vp.setSpacing(10);
	    
	    vp.addText("<p>");
	    vp.addText("<ul>");
	    vp.addText("<li>Use intention revealing name</li>");
	    vp.add(addToHorizontalPanel(shortFrame("bad_sample_1", "55px"), shortFrame("good_sample_1", "55px")));
	    vp.addText("<br/>");
	    vp.addText("<li>Bad names make it hard to digest</li>");
	    vp.add(addToHorizontalPanel(shortFrame("bad_sample_2", "180px"), shortFrame("good_sample_2", "180px")));
	    vp.addText("<ul>");
	    vp.addText("</p>");
	    
	    add(vp);
	    
	}

	@Override
	protected String getUrl() {

		return SAMPLE_URL;
	}
	

}
