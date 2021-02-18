package com.ado.pipeline;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jamilz\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.google.co.in");
		wd.findElement(By.xpath("//input[@name='q']")).sendKeys("imaginea");
		
		Actions act = new Actions(wd);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		
		wd.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
		Thread.sleep(5000);
		
		wd.close();
	}
}
