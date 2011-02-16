package org.dhydrated.app.slides.client.resources;

import org.dhydrated.app.slides.client.model.Folder;
import org.dhydrated.app.slides.client.model.TreeMenuItem;
import org.dhydrated.app.slides.client.page.MeaningfulNames;
import org.dhydrated.app.slides.client.page.Page2;

public class DataProvider {

	 public static Folder getFolders() {
		 
		    Folder[] folders = new Folder[] {
		        new Folder("Presentation",
		            new Folder[] {

		                new Folder("Clean Code",
		                    new TreeMenuItem[] {
		                        new TreeMenuItem("Meaningful Names", "Meaningful Names", new MeaningfulNames()),
		                        new TreeMenuItem("Three String Quartets", "Beethoven", new Page2()),
		                        new TreeMenuItem("Grosse Fugue for String Quartets", "Beethoven", new MeaningfulNames()),})
		                }),
		        };

		    Folder root = new Folder("root");
		    for (int i = 0; i < folders.length; i++) {
		    	root.add((Folder) folders[i]);
		    }

		    return root;
		  }
}
