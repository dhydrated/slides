package org.dhydrated.app.slides.client.resources;

import org.dhydrated.app.slides.client.model.Folder;
import org.dhydrated.app.slides.client.model.TreeMenuItem;
import org.dhydrated.app.slides.client.page.Page1;
import org.dhydrated.app.slides.client.page.Page2;

public class DataProvider {

	 public static Folder getFolders() {
		 
		    Folder[] folders = new Folder[] {
		        new Folder("Section 1",
		            new Folder[] {

		                new Folder("Chapter 1",
		                    new TreeMenuItem[] {
		                        new TreeMenuItem("Six String Quartets", "Beethoven", new Page1()),
		                        new TreeMenuItem("Three String Quartets", "Beethoven", new Page2()),
		                        new TreeMenuItem("Grosse Fugue for String Quartets", "Beethoven", new Page1()),})
		                }),
		        };

		    Folder root = new Folder("root");
		    for (int i = 0; i < folders.length; i++) {
		    	root.add((Folder) folders[i]);
		    }

		    return root;
		  }
}
