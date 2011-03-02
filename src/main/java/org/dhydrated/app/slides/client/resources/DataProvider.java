package org.dhydrated.app.slides.client.resources;

import org.dhydrated.app.slides.client.model.Folder;
import org.dhydrated.app.slides.client.model.TreeMenuItem;
import org.dhydrated.app.slides.client.page.Cover;
import org.dhydrated.app.slides.client.page.Reference;
import org.dhydrated.app.slides.client.page.Introduction;
import org.dhydrated.app.slides.client.page.casestudy.CaseStudy;
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

		                new Folder("",
		                    new TreeMenuItem[] {
		                        new TreeMenuItem("Cover", "Cover", new Cover()),
		                        new TreeMenuItem("Introduction", "Introduction", new Introduction())
		                    }),

		                new Folder("Naming Your Stuff",
		                    new TreeMenuItem[] {
		                        new TreeMenuItem("Good names", "Good names", new IntentionRevealingNames()),
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
			                    }),
				                  
	                    new Folder("Case Study",
			                    new TreeMenuItem[] {
			                        new TreeMenuItem("CaseStudy", "CaseStudy", new CaseStudy())
			                    }),
				                  
	                    new Folder("",
			                    new TreeMenuItem[] {
			                        new TreeMenuItem("References", "References", new Reference())
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
