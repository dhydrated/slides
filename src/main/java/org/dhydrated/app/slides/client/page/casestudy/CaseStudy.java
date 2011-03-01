package org.dhydrated.app.slides.client.page.casestudy;

import org.dhydrated.app.slides.client.page.AbstractPage;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.button.ButtonBar;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Element;

public class CaseStudy extends AbstractPage {

	private static String SAMPLE_URL = "code/cleancode/functions.html";

	private boolean displayExample;
	
	private LayoutContainer exampleContainer;
	
	private Button exampleButton;

	@Override
	protected void onRender(Element parent, int pos) {
		super.onRender(parent, pos);

		VerticalPanel vp = new VerticalPanel();
		vp.setSpacing(10);
		

		
		vp.addText("<p>");
		vp.addText("<ul>");
		vp.addText("<li>Case Study 1:</li>");
		vp.addText("<ul>");
		vp.addText("<li>SFAMS ContactConfirm.php (before) - <a href='code/cleancode/casestudy1/BeforeRefactoredContactConfirm.html' >click me</a></li>");
		vp.addText("<li>SFAMS ContactConfirm.php (after) - <a href='code/cleancode/casestudy1/AfterRefactoredContactConfirm.html' >click me</a> <a href='code/cleancode/casestudy1/ContactConfirmDisplayPreview.html' >click me</a></li>");
		vp.addText("</p>");

		add(vp);


	}

	@Override
	protected String getUrl() {

		return SAMPLE_URL;
	}

}
