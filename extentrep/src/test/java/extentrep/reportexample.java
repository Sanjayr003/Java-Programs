package extentrep;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class reportexample {
	
	WebDriver d;
	ExtentReports exeRep;
	ExtentHtmlReporter htmlRep;
	ExtentTest testcase;
	
	@Test
	public void opengoogle()throws IOException
	{
		testcase=exeRep.createTest("Verify Google");
		testcase.log(Status.INFO, "Navigating to Google");
		d.get("https://www.google.com/");
		String title=d.getTitle();
		if(title.equals("Google"))
		{
			testcase.log(Status.PASS, "Actual and Expected Result Are Equal");
		}
		else
		{
			testcase.log(Status.FAIL, "Actual and Expected Result Are Not Equal");
		}
	}
	
	@Test
	public void openbing()throws IOException
	{
		testcase=exeRep.createTest("Verify Bing");
		testcase.log(Status.INFO, "Navigating to Bing");
		d.get("https://www.bing.com/");
		String title=d.getTitle();
		if(title.equals("bing"))
		{
			testcase.log(Status.PASS, "Actual and Expected Result Are Equal");
		}
		else
		{
			testcase.log(Status.FAIL, "Actual and Expected Result Are Not Equal");
		}
	}
	
	
	
	@BeforeTest
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\Desktop\\Selenium\\ChromeDriver\\New2Driver\\chromedriver.exe");
		//exeRep =new ExtentReports("C:\\Users\\sanja\\Desktop\\Selenium\\ExtentRep\\Rep.html",true);
		
		d=new ChromeDriver();
		htmlRep = new ExtentHtmlReporter("C:\\Users\\sanja\\eclipse-workspace\\extentrep\\test-output\\myreport.html");
		exeRep = new ExtentReports();
		exeRep.attachReporter(htmlRep);
		
		
	}
	
	@AfterTest
	public void closebrowser()
	{
		d.quit();
		exeRep.flush();
	}

}
