package applicationModule;


import java.io.FileNotFoundException;

import applicationModule.ActionListenerInitializer;
import applicationModule.ElementInitializer;
import applicationModule.LayoutInitializer;
import applicationModule.MAIN;

public class ApplicationInitializer {
	
	//01_ATTRIBUTES
	//*************************************************************
	private MAIN application;
	private ElementInitializer elements;
	private LayoutInitializer layout;
	private ActionListenerInitializer actionListeners;
	//private HotKeysInitializer hotKeys;
	
	
	//02_CONSTRUCTOR
	//*************************************************************
	public ApplicationInitializer(MAIN application){
		this.application=application;
		elements=new ElementInitializer();
		layout=new LayoutInitializer(elements);
		actionListeners=new ActionListenerInitializer(elements, layout);
		//hotKeys=new HotKeysInitializer(elements);
		
		
		
	}
	
	//03_METHODS
	//*************************************************************
	public void initialize() throws FileNotFoundException{
		elements.initialize();
		
		layout.initialize();
		application.setLayout(elements.getLayout());
		
		actionListeners.initialize();
		//hotKeys.initialize();
		
	}
	
	
}
