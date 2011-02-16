package org.dhydrated.app.slides.client.ui;


import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.KeyListener;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.FlexTable;

public class CustomBorderLayout extends LayoutContainer {

	protected void onRender(Element target, int index) {
		
		super.onRender(target, index);
		final BorderLayout layout = new BorderLayout();
		setLayout(layout);

		ContentPanel west = new ContentPanel();
		ContentPanel center = new ContentPanel();
		center.setHeading("");
		center.setScrollMode(Scroll.AUTOX);

		FlexTable table = new FlexTable();
		table.getElement().getStyle().setProperty("margin", "10px");
		table.setCellSpacing(8);
		table.setCellPadding(4);

		BorderLayoutData westData = new BorderLayoutData(LayoutRegion.WEST, 300);
		westData.setSplit(true);
		westData.setCollapsible(true);
		westData.setMargins(new Margins(5));
		
		west.add(new BasicTreePanel(center));
		
		
		BorderLayoutData centerData = new BorderLayoutData(LayoutRegion.CENTER);
		centerData.setMargins(new Margins(5));

		add(west, westData);
		add(center, centerData);

		
		
		/*addListener(Events.KeyDown, new KeyListener(){

			
			
			@Override
			public void componentKeyDown(ComponentEvent event) {
				// TODO Auto-generated method stub
				super.componentKeyDown(event);

				GWT.log("componentKeyDown keycode: " + event.getKeyCode());
				
				MessageBox.info("componentKeyDown test", "keycode: " + event.getKeyCode(), null);
				
			}

			@Override
			public void handleEvent(ComponentEvent e) {
				// TODO Auto-generated method stub
				super.handleEvent(e);

				GWT.log("handleEvent keycode: " + e.getKeyCode());
				
				MessageBox.info("handleEvent test", "keycode: " + e.getKeyCode(), null);
			}
			
			
		});*/

	}  
	
	
}
