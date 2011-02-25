package org.dhydrated.app.slides.client.page.function;

import org.dhydrated.app.slides.client.page.AbstractPage;

import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.google.gwt.user.client.Element;

public class FunctionArgument extends AbstractPage {

	private static String SAMPLE_URL = "code/cleancode/functions.html";
	
	@Override
	protected void onRender(Element parent, int pos) {
		super.onRender(parent, pos);

	    VerticalPanel vp = new VerticalPanel();
	    vp.setSpacing(10);
	    
	    vp.addText("<p>");
	    vp.addText("<ul>");
	    vp.addText("<li>Ideal arguments is NONE.</li>");
	    vp.add(longFrame("function_argument_one_argument", "50px"));
	    vp.addText("<li>Then one or two but avoid using 3 arguments.</li>");
	    vp.add(longFrame("function_argument_two_argument", "50px"));
	    vp.addText("<li>Harder to read and test with more arguments.</li>");
	    vp.addText("<li>Use object to replace long list arguments.</li>");
	    vp.add(addToHorizontalPanel(shortFrame("bad_function_argument_1", "150px"), shortFrame("good_function_argument_1", "50px")));
	    vp.addText("<br/>");
	    vp.addText("<ul>");
	    vp.addText("</p>");

		vp.add(awardButton("You has received an \"Awesome Function\" award", null));
	    
	    add(vp);
	    
	}

	@Override
	protected String getUrl() {

		return SAMPLE_URL;
	}
	

}
