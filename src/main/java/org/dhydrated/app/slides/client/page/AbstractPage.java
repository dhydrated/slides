package org.dhydrated.app.slides.client.page;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.HorizontalPanel;
import com.extjs.gxt.ui.client.widget.Info;
import com.extjs.gxt.ui.client.widget.InfoConfig;
import com.extjs.gxt.ui.client.widget.Layout;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.Widget;

public abstract class AbstractPage extends LayoutContainer {

	private static String FRAME_WIDTH = "900px";
	private static String FRAME_SHORT_WIDTH = "445px";
	private static int FRAME_BORDER = 0;
	private static String FRAME_SCROLL = "no";

	public AbstractPage() {
		super();
	}

	public AbstractPage(Layout layout) {
		super(layout);
	}

	protected Frame longFrame(String anchor, String height) {
	
	    Frame frame = new Frame(getUrl() + "#" + anchor);
	    frame.getElement().setPropertyInt("frameBorder", FRAME_BORDER);
	    frame.getElement().setPropertyString("scrolling", FRAME_SCROLL);
	    frame.setSize(FRAME_WIDTH, height);
	    
	    return frame;
	}

	protected Frame shortFrame(String anchor, String height) {
	
	    Frame frame = new Frame(getUrl() + "#" + anchor);
	    frame.getElement().setPropertyInt("frameBorder", FRAME_BORDER);
	    frame.getElement().setPropertyString("scrolling", FRAME_SCROLL);
	    frame.setSize(FRAME_SHORT_WIDTH, height);
	    
	    return frame;
	}

	protected abstract String getUrl();

	protected LayoutContainer addToHorizontalPanel(Widget widgetA, Widget widgetB) {
		
		HorizontalPanel hp = new HorizontalPanel();
		hp.add(widgetA);
		hp.addText("&nbsp;");
		hp.addText("&nbsp;");
		hp.add(widgetB);
		return hp;
	}
	
	protected Button awardButton(final String message, final String imagePath){
		
		return new Button("?",
				new SelectionListener<ButtonEvent>() {

			public void componentSelected(ButtonEvent ce) {
				
				notifyAward(message, imagePath);
			}
		});
	}
	
	protected void notifyAward(String message, String imagePath){
		
		if(imagePath == null){
			imagePath = "images/icon/award.jpeg";
		}
		
		InfoConfig conf = new InfoConfig("Congratulations!", "<div style=\"float:left\"><img src=\""+imagePath+"\" alt=\"Congratulation!\" title=\"Congratulation!\" /></div>" + "<div>" + message + "</div>");
	    conf.display = 5 * 1000;
	    conf.height = 100;
	    conf.width = 400;
		
	    Info.display(conf);
	}

}