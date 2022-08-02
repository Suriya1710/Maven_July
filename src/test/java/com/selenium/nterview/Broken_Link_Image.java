package com.selenium.nterview;

import java.awt.AWTException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Link_Image {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Selenium_July\\Driver\\chromedriver.exe");

		driver = new ChromeDriver(); // upcasting

		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> all_Links = driver.findElements(By.tagName("a"));

		System.out.println("count : " + all_Links.size());

		for (WebElement links : all_Links) {

			String link = links.getAttribute("href");

			if (link == null || link.isEmpty()) {

				continue;

			}

			URL url = new URL(link); // Malformed URL exception

			URLConnection connection = url.openConnection(); // IOException

			HttpURLConnection http = (HttpURLConnection) connection;

			http.connect();

			int code = http.getResponseCode();

			String message = http.getResponseMessage();

			if (code >= 400) {

				System.out.println("link : " + link + " code : " + code + " message : " + message);

			}

			http.disconnect();

		}

	}

}
