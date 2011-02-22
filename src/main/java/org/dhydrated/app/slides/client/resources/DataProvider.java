package org.dhydrated.app.slides.client.resources;

import org.dhydrated.app.slides.client.model.Folder;
import org.dhydrated.app.slides.client.model.TreeMenuItem;
import org.dhydrated.app.slides.client.page.IntentionRevealingNames;
import org.dhydrated.app.slides.client.page.NamesToAvoid;

public class DataProvider {

	 public static Folder getFolders() {
		 
		    Folder[] folders = new Folder[] {
		        new Folder("Clean Code",
		            new Folder[] {

		                new Folder("Naming Your Stuff",
		                    new TreeMenuItem[] {
		                        new TreeMenuItem("Intention Revealing Names", "Intention Revealing Names", new IntentionRevealingNames()),
		                        new TreeMenuItem("Names To Avoid", "Names To Avoid", new NamesToAvoid())
		                    })
		                }),
		        };

		    Folder root = new Folder("root");
		    for (int i = 0; i < folders.length; i++) {
		    	root.add((Folder) folders[i]);
		    }

		    return root;
		  }
}
