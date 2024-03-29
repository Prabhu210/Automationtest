package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	private void tc1() {
		System.setProperty("webdriver.edge.driver","D:\\java module2\\TestngRun\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}
}
