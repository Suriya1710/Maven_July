package com.helper.files;

import org.openqa.selenium.WebDriver;

import com.pom.Home_Page;
import com.pom.Login_Page;

public class Page_Object_Manager {

	public WebDriver driver; // ---> null

	private Home_Page home; // ---> null

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;

	}

	public Home_Page getHome() {

		if (home == null) {

			home = new Home_Page(driver);

		}

		return home;
	}

	private Login_Page login; // --> null

	public Login_Page getLogin() {

		if (login == null) {

			login = new Login_Page(driver);

		}

		return login;
	}

}
