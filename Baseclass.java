package com.pages;



	import org.testng.annotations.Test;


	  import java.io.File;
	  import java.io.IOException;
	  import java.sql.Date;
	  import java.text.SimpleDateFormat;
	  import java.time.Duration;

	  import org.openqa.selenium.OutputType;
	  import org.openqa.selenium.TakesScreenshot;
	  import org.openqa.selenium.WebDriver;
	  import org.openqa.selenium.chrome.ChromeDriver;
	  import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

	//import com.pageclass.CartPage;
	//import com.pageclass.ProductStore;
	import com.pages.Homepage;

	  public class Baseclass {

	  	public static WebDriver driver;
	  	public Homepage hp;
	  	public  IndexPage indexPage;
	  	//public ProductStore pp;
	  	
	  	@BeforeTest
	  	public void setup() {
	  		 driver = new ChromeDriver();
	  		  driver.get("https://www.demoblaze.com/");
	  		  driver.manage().window().maximize();
	  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  		hp=new Homepage(driver);
	  		indexPage = new IndexPage(driver);
	  	   // pp = new ProductStore(driver);
	  	}
	  	
	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}
	  	
	  
	
	  

