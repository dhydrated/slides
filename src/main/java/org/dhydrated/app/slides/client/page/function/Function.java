package org.dhydrated.app.slides.client.page.function;

import org.dhydrated.app.slides.client.page.AbstractPage;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.button.ButtonBar;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Element;

public class Function extends AbstractPage {

	private static String SAMPLE_URL = "code/cleancode/functions.html";

	private boolean displayExample;
	
	private LayoutContainer exampleContainer;
	
	private Button exampleButton;

	@Override
	protected void onRender(Element parent, int pos) {
		super.onRender(parent, pos);

		VerticalPanel vp = new VerticalPanel();
		vp.setSpacing(10);
		
		exampleContainer = addToHorizontalPanel(
				shortFrame("bad_sample_1", "420px"),
				shortFrame("good_sample_1", "160px"));
		displayExample = false;

		exampleContainer.hide();
		
		exampleButton = new Button("Show Example",
				new SelectionListener<ButtonEvent>() {

			public void componentSelected(ButtonEvent ce) {
				if (!displayExample) {
					exampleContainer.show();
					exampleContainer.layout(true);
					exampleButton.setText("Hide Example");
					GWT.log(ce.getBoxComponent().getTitle());
				}
				else {
					exampleContainer.hide();
					exampleButton.setText("Show Example");
				}
				
				displayExample = !displayExample;
			}
		});

		ButtonBar buttonBar = new ButtonBar();
		buttonBar.add(exampleButton);

		
		vp.addText("<p>");
		vp.addText("<ul>");
		vp.addText("<li>Small.</li>");
		vp.addText("<li>Do one thing.</li>");
		vp.addText("<li>One level of abstraction.</li>");
		vp.addText("<li>Readable from top to bottom.</li>");
		vp.addText("<li>Has descriptive names.</li>");
		vp.addText("<li>Verbs and Keywords.</li>");
		vp.addText("<li>Has no side effects.</li>");
		vp.add(buttonBar);
		vp.add(exampleContainer);
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
