package org.pageobjectmanager;

import org.fbloginpojo.FBLogInPojo;

public class PageObjectManager {
	private PageObjectManager() {	
	}
	
	private static PageObjectManager pageObjectManager;
	private FBLogInPojo fbLoginPojo;
	
	public static PageObjectManager getPageObjectManager() {
		return (pageObjectManager == null)?pageObjectManager = new PageObjectManager():pageObjectManager;
	}
	
	public FBLogInPojo getFbLogin() {
		return (fbLoginPojo == null)?fbLoginPojo=new FBLogInPojo():fbLoginPojo;
	}
}
