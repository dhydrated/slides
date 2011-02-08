package org.dhydrated.app.slides.client.model;

import com.extjs.gxt.ui.client.data.BaseTreeModel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;

public class TreeMenuItem extends BaseTreeModel {

	private static final long serialVersionUID = 1L;

	public TreeMenuItem() {
	}

	public TreeMenuItem(String name) {
		set("name", name);
	}

	public TreeMenuItem(String name, String description, LayoutContainer page) {
		set("name", name);
		set("description", description);
		set("page", page);
	}

	public String getName() {
		return (String) get("name");
	}

	public String getDescription() {
		return (String) get("description");
	}

	public LayoutContainer getPage() {
		return (LayoutContainer) get("page");
	}

	public String toString() {
		return getName();
	}
}
