package org.dhydrated.app.slides.client.ui;

import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.FlexTable;

public class CustomBorderLayout extends LayoutContainer {

	protected void onRender(Element target, int index) {
		
		super.onRender(target, index);
		final BorderLayout layout = new BorderLayout();
		setLayout(layout);

		ContentPanel west = new ContentPanel();
		ContentPanel center = new ContentPanel();
		center.setHeading("BorderLayout Example");
		center.setScrollMode(Scroll.AUTOX);

		FlexTable table = new FlexTable();
		table.getElement().getStyle().setProperty("margin", "10px");
		table.setCellSpacing(8);
		table.setCellPadding(4);

		BorderLayoutData westData = new BorderLayoutData(LayoutRegion.WEST, 150);
		westData.setSplit(true);
		westData.setCollapsible(true);
		westData.setMargins(new Margins(5));
		
		west.add(new BasicTreePanel());
		
		BorderLayoutData centerData = new BorderLayoutData(LayoutRegion.CENTER);
		centerData.setMargins(new Margins(5));

		add(west, westData);
		add(center, centerData);
	}  
}
