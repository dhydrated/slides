package org.dhydrated.app.slides.client.page;

import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Frame;

public class MeaningfulNames extends LayoutContainer {

	private static String SAMPLE_URL = "code/cleancode/meaningfulnames.html";
	private static String FRAME_WIDTH = "800px";
	private static int FRAME_BORDER = 0;
	private static String FRAME_SCROLL = "no";
	
	@Override
	protected void onRender(Element parent, int pos) {
		super.onRender(parent, pos);

	    VerticalPanel hp = new VerticalPanel();
	    hp.setSpacing(10);
	    
	    Frame f1 = new Frame(SAMPLE_URL + "#sample1");
	    f1.getElement().setPropertyInt("frameBorder", FRAME_BORDER);
	    f1.getElement().setPropertyString("scrolling", FRAME_SCROLL);
	    f1.setSize(FRAME_WIDTH, "50px");

	    Frame f2 = new Frame(SAMPLE_URL + "#sample2");
	    f2.getElement().setPropertyInt("frameBorder", FRAME_BORDER);
	    f2.getElement().setPropertyString("scrolling", FRAME_SCROLL);
	    f2.setSize(FRAME_WIDTH, "100px");
	    
	    hp.addText("<p>");
	    hp.addText("<ul>");
	    hp.addText("<li>Use intention revealing names</li>");
	    hp.add(f1);
	    hp.addText("<li>Use intention revealing names</li>");
	    hp.add(f2);
	    hp.addText("<ul>");
	    hp.addText("</p>");
	    
	    add(hp);
	    
	}
	
}
