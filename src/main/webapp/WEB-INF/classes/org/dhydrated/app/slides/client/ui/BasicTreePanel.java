package org.dhydrated.app.slides.client.ui;

import org.dhydrated.app.slides.client.Resources;
import org.dhydrated.app.slides.client.model.Folder;
import org.dhydrated.app.slides.client.model.TreeMenuItem;
import org.dhydrated.app.slides.client.resources.DataProvider;

import com.extjs.gxt.ui.client.Style.Direction;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionChangedEvent;
import com.extjs.gxt.ui.client.event.SelectionChangedListener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.fx.FxConfig;
import com.extjs.gxt.ui.client.store.TreeStore;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.button.ButtonBar;
import com.extjs.gxt.ui.client.widget.layout.FlowData;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanel;
import com.google.gwt.user.client.Element;

public class BasicTreePanel extends LayoutContainer {
	
	private ContentPanel panel;
	
	public BasicTreePanel(ContentPanel panel){
		
		super();
		this.panel = panel;
	}
	
	private ContentPanel getPanel(){
		
		return this.panel;
	}
	
	@Override
	protected void onRender(Element parent, int pos) {
		super.onRender(parent, pos);

		Folder model = DataProvider.getFolders();

		TreeStore<ModelData> store = new TreeStore<ModelData>();
		store.add(model.getChildren(), true);

		final TreePanel<ModelData> tree = new TreePanel<ModelData>(store);
		tree.setWidth(300);
		tree.setDisplayProperty("name");
		tree.getStyle().setLeafIcon(Resources.ICONS.text());
		tree.getSelectionModel().addSelectionChangedListener(new SelectionChangedListener<ModelData>() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent<ModelData> se) {
				
				if (se.getSelectedItem() != null && se.getSelectedItem() instanceof TreeMenuItem) {
					getPanel().removeAll();
					ModelData record = se.getSelectedItem();
					TreeMenuItem item = (TreeMenuItem) record;
					getPanel().setHeading(item.getName());
					getPanel().add(item.getPage());
					getPanel().layout();
					getPanel().el().slideIn(Direction.DOWN, FxConfig.NONE);
				}
			}
		});

		ButtonBar buttonBar = new ButtonBar();

		buttonBar.add(new Button("Expand All",
				new SelectionListener<ButtonEvent>() {
					public void componentSelected(ButtonEvent ce) {
						tree.expandAll();
					}
				}));
		buttonBar.add(new Button("Collapse All",
				new SelectionListener<ButtonEvent>() {
					public void componentSelected(ButtonEvent ce) {
						tree.collapseAll();
					}
				}));

		add(buttonBar, new FlowData(10));
		add(tree, new FlowData(10));
	}
}
