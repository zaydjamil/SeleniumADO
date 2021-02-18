package com.ado.pipeline;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jamilz\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.provartesting.com/provar-vs-selenium/");
		wd.manage().window().maximize();
		
		WebElement elem = wd.findElement(By.xpath("//*[@id='accordion-602e8eb71f3c4-0']"));
		Thread.sleep(3000);
		
		JavascriptExecutor js = ((JavascriptExecutor)wd);
		js.executeScript("arguments[0].scrollIntoView(true)", elem);
		
		Thread.sleep(2000);
		
		wd.close();
		
		
		
	}

}
