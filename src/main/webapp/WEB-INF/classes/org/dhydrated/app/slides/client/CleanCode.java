package org.dhydrated.app.slides.client;

import org.dhydrated.app.slides.client.ui.CustomBorderLayout;

import com.extjs.gxt.ui.client.widget.MessageBox;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CleanCode implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		buildApp();
	}

	private void buildApp() {

		/*
		 * ContentPanel cp = new ContentPanel();
		 * cp.setHeading("Folder Contents"); cp.setSize(250,140);
		 * cp.setPosition(10, 10); cp.setCollapsible(true); cp.setFrame(true);
		 * cp.setBodyStyle("backgroundColor: white;");
		 * cp.getHeader().addTool(new ToolButton("x-tool-gear"));
		 * cp.getHeader().addTool(new ToolButton("x-tool-close"));
		 * cp.addText("Testing text"); cp.addButton(new Button("Ok"));
		 * cp.setIconStyle("tree-folder-open"); RootPanel.get().add(cp);
		 * cp.layout();
		 */

		CustomBorderLayout cbl = new CustomBorderLayout();

		RootPanel.get().add(cbl);
		cbl.layout();

		hideLoadingIndicator();

		/*
		 * Page1 page = new Page1();
		 * 
		 * RootPanel.get().add(page);
		 * 
		 * page.layout();
		 */

		// MessageBox.info("Message", "Hello World!!", null);
	}

	private void hideLoadingIndicator() {
		NodeList<Element> list = RootPanel.getBodyElement()
				.getElementsByTagName("div");
		String names = "";
		for (int i = 0; i < list.getLength(); i++) {

			Element el = list.getItem(i);
			names += el.getId() + ", ";
			if (el.getId().equals("loading")) {
				el.setAttribute("style", "display:none");
				break;
			}
		}
	}
}
