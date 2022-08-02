package com.automation.runner;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.helper.files.Page_Object_Manager;
import com.utilityfiles.Utility_Files;

public class Runner extends Utility_Files {

	public static WebDriver driver = Utility_Files.get_Browser("chrome");

	public static Page_Object_Manager obj_Manager = new Page_Object_Manager(driver);

	public static Logger log = Logger.getLogger(Runner.class);

	public static void main(String[] args) throws IOException {

		PropertyConfigurator.configure("log4j.properties");

		get("http://automationpractice.com/index.php");

		log.info("url launch");

		click_On_Element(obj_Manager.getHome().getSignin_Btn());

		String email = read_Data("D:\\Test Cases\\testcase1 - Copy.xlsx", 0, 2, 5);

		send_Keys(obj_Manager.getLogin().getEmail(), email);

		send_Keys(obj_Manager.getLogin().getPassword(), "abc");

		click_On_Element(obj_Manager.getLogin().getSignin_Btn());

		log.info("close the driver");

	}

}
