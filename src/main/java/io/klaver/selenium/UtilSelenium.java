package io.klaver.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class UtilSelenium {
	public void parseHTML(String url) {
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.setJavascriptEnabled(true);
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		List<WebElement> elements = driver.findElements(By.xpath("html/body/div[7]/section/div/div/div/div/div[2]/div/div/div/div/div"));
		
		System.out.println("elements-" + elements.toString());
		driver.quit();
	}
}
