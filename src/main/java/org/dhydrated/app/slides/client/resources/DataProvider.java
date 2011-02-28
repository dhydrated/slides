package org.dhydrated.app.slides.client.resources;

import org.dhydrated.app.slides.client.model.Folder;
import org.dhydrated.app.slides.client.model.TreeMenuItem;
import org.dhydrated.app.slides.client.page.Introduction;
import org.dhydrated.app.slides.client.page.clazz.Clazz;
import org.dhydrated.app.slides.client.page.clazz.Clazz2;
import org.dhydrated.app.slides.client.page.comment.Comment;
import org.dhydrated.app.slides.client.page.function.Function;
import org.dhydrated.app.slides.client.page.function.FunctionArgument;
import org.dhydrated.app.slides.client.page.name.IntentionRevealingNames;
import org.dhydrated.app.slides.client.page.name.NamesToAvoid;

public class DataProvider {

	 public static Folder getFolders() {
		 
		    Folder[] folders = new Folder[] {
		        new Folder("Clean Code",
		            new Folder[] {

		                new Folder("Introduction",
		                    new TreeMenuItem[] {
		                        new TreeMenuItem("Introduction", "Introduction", new Introduction())
		                    }),

		                new Folder("Naming Your Stuff",
		                    new TreeMenuItem[] {
		                        new TreeMenuItem("Intention Revealing Names", "Intention Revealing Names", new IntentionRevealingNames()),
		                        new TreeMenuItem("Names To Avoid", "Names To Avoid", new NamesToAvoid())
		                    }),
		                  
	                    new Folder("How Function Should Be",
			                    new TreeMenuItem[] {
			                        new TreeMenuItem("Function", "Function", new Function()),
			                        new TreeMenuItem("Arguments", "Arguments", new FunctionArgument())
			                    }),
				                  
	                    new Folder("Comments",
			                    new TreeMenuItem[] {
			                        new TreeMenuItem("Comments", "Comments", new Comment())
			                    }),
				                  
	                    new Folder("Class",
			                    new TreeMenuItem[] {
			                        new TreeMenuItem("Class", "Class", new Clazz()),
			                        new TreeMenuItem("Class (2)", "Class (2)", new Clazz2())
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
