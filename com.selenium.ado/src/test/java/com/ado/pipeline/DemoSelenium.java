package com.ado.pipeline;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jamilz\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.seleniumeasy.com/");
		Thread.sleep(3000);
		wd.manage().window().maximize();
		WebElement input = wd.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[2]/a"));
		
		Actions act = new Actions(wd);
		act.moveToElement(input).click();
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		
		wd.close();
		
	}

}
