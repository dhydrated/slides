package org.dhydrated.app.slides.client.page;

import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.google.gwt.user.client.Element;

public class Reference extends AbstractPage {

	private static String SAMPLE_URL = "code/cleancode/functions.html";

	@Override
	protected void onRender(Element parent, int pos) {
		super.onRender(parent, pos);

		VerticalPanel vp = new VerticalPanel();
		vp.setSpacing(10);
		
		
		vp.addText("<p>");
		vp.addText("Books:");
		vp.addText("<li>Clean Code. Prentice Hall. Robert C. Martin.<img src=\"images/icon/clean_code.png\" alt=\"Clean Code\" title=\"Clean Code\" /></li>");
		vp.addText("<li>Refactoring: Improving the Design of Existing Code. Martin Fowler.<img src=\"images/icon/fowler_refactoring.jpeg\" alt=\"Refactoring\" title=\"Refactoring\" /></li>");
		vp.addText("<br/>");
		vp.addText("<br/>");
		vp.addText("Images:");
		vp.addText("<li>Hitwise logo. http://www.hitwise.com/themes/experian/imgs/logo-ExperianHitwise-SM.png.</li>");
		vp.addText("<li>Cover image. http://decomicshop.nl/four-color-fear-forgotten-horror-comics-of-the-1950s-tp-p-29490.html.</li>");
		vp.addText("<li>Award icon. http://www.standard-icons.com/stock-icons/standard-portfolio/award-icon.gif.</li>");
		vp.addText("</p>");
		
		add(vp);

		
	}

	@Override
	protected String getUrl() {

		return SAMPLE_URL;
	}

}
