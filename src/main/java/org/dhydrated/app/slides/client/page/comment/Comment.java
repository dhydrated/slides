package org.dhydrated.app.slides.client.page.comment;

import org.dhydrated.app.slides.client.page.AbstractPage;

import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.google.gwt.user.client.Element;

public class Comment extends AbstractPage {

	private static String SAMPLE_URL = "code/cleancode/comments.html";
	
	@Override
	protected void onRender(Element parent, int pos) {
		super.onRender(parent, pos);

	    VerticalPanel vp = new VerticalPanel();
	    vp.setSpacing(10);
	    
	    vp.addText("<p>");
	    vp.addText("<ul>");
	    vp.addText("<li>Always try to express intent in code, not comments.</li>");
	    vp.addText("<li>Comments tends to become obsolete.</li>");
	    vp.addText("<li>Don’t use a comment when you can use a function or a variable.</li>");
	    vp.add(addToHorizontalPanel(shortFrame("bad_sample_1", "100px"), shortFrame("good_sample_1", "50px")));
	    vp.addText("<li>Avoid noise comments.</li>");
	    vp.add(longFrame("noise_comment", "250px"));
	    vp.addText("<li>Don't leave behind commented-out code.</li>");
	    vp.add(longFrame("commented_out_code", "100px"));
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
