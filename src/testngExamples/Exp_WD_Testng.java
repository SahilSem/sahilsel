package testngExamples;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exp_WD_Testng {
@BeforeClass
   public void startUp() {
     WebDriver driver = new ChromeDriver();	
}
@AfterClass
    public void tearDown() {
     
}
@Test
   public void tc001() {
	
}
}
