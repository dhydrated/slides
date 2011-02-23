package org.dhydrated.app.slides.client.page.name;

import org.dhydrated.app.slides.client.page.AbstractPage;

import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.google.gwt.user.client.Element;

public class NamesToAvoid extends AbstractPage {

	private static String SAMPLE_URL = "code/cleancode/meaningfulnames.html";
	
	@Override
	protected void onRender(Element parent, int pos) {
		super.onRender(parent, pos);

	    VerticalPanel vp = new VerticalPanel();
	    vp.setSpacing(10);
	    
	    vp.addText("<p>");
	    vp.addText("<ul>");
	    vp.addText("<li>Number-series</li>");
	    vp.add(addToHorizontalPanel(shortFrame("#bad_sample_number_series", "170px"), shortFrame("#good_sample_number_series", "170px")));
	    vp.addText("<br/>");
	    vp.addText("<li>Noise words</li>");
	    vp.add(longFrame("#bad_sample_noise_words", "55px"));
	    vp.addText("<br/>");
	    vp.addText("<li>Unpronounceable names</li>");
	    vp.addText("<li>Not Search-Friendly Names</li>");
	    vp.add(longFrame("#bad_sample_pronounceable_words", "70px"));
	    vp.addText("<ul>");
	    vp.addText("</p>");
	    
	    add(vp);
	    
	}

	@Override
	protected String getUrl() {

		return SAMPLE_URL;
	}
	
	
}
