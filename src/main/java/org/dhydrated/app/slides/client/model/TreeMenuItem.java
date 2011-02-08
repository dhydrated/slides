package org.dhydrated.app.slides.client.model;

import com.extjs.gxt.ui.client.data.BaseTreeModel;

public class TreeMenuItem extends BaseTreeModel {

	private static final long serialVersionUID = 1L;

	public TreeMenuItem() {
	}

	public TreeMenuItem(String name) {
		set("name", name);
	}

	public TreeMenuItem(String name, String description) {
		set("name", name);
		set("description", description);
	}

	public String getName() {
		return (String) get("name");
	}

	public String getDescription() {
		return (String) get("description");
	}

	public String toString() {
		return getName();
	}
}
