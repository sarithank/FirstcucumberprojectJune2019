package step.def;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutomationPracticeTest {
	private WebDriver driver=null;
	private WebDriverWait wait=null;
	
	@Given("^user suould be on home page$")
	public void user_is_on_homepage() {
		//set the chromedriver.exe file
		System.setProperty("webdriver.chrome.driver","/Users/Ganaparthi/Documents/browserfiles/BrowserExeFiles/chromedriver");

		//interface refvar=new implementingclass();
		 driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//add implicit wait command
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//create object for WebDriverWait class
		 wait=new WebDriverWait(driver,30);
		 
		 //open url
		 driver.get("http://automationpractice.com/index.php");
		
	}
	
	@Given("^click on Add to Cart button that appears on mouseover$")
	public void click_on_add_to_cart() throws InterruptedException {
		
		//assign driver variable to JavascriptExecuteor interface variable
		JavascriptExecutor jsx=(JavascriptExecutor)driver;
		
		//scroll down
		jsx.executeScript("window.scrollBy(0,500)"," ");
		
		Thread.sleep(3000);
		
		
		//if you want scroll for particular element 
		//identyfy the element
		//WebElement popimg=driver.findElement(By.xpath("//*[contains(@class,'replace-2x img-responsive')]"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(ObjectMap.POPULAR_IMG));
		//jsx.executeScript("arguments[0].scrollIntoView(true);",ObjectMap.POPULAR_IMG);
		
		//Thread.sleep(5000);
		WebElement img =driver.findElement( ObjectMap.POPULAR_IMG);
		//create object for actions class
				Actions act=new Actions(driver);
				act.moveToElement(img).perform();
				driver.findElement(ObjectMap.ADDTOCART_ELE).click();
	
	}
	
	@When("^transfer control to popup that appears$")
	public void transfer_control_to_pop_up_window() throws InterruptedException {
	//fetch the parent window id
	String pid=driver.getWindowHandle();
	
	//fetch all window ids
	Set<String>handles=driver.getWindowHandles();

	
	for(String h:handles) {
		if(!pid.equals(h)) {
			//switch to child window
			driver.switchTo().window(h);
			Thread.sleep(3000);
			
		}
	}
	
	
	//veryfy the naukri logo( wecan use this css formula also->css=tagname.classname or css=tagname(class='classvalue')
	wait.until(ExpectedConditions.visibilityOfElementLocated(ObjectMap.CHIWIN_ADDSUCCESS));
	driver.findElement(ObjectMap.CONTINUE_SHOPPING).click();
	
}
	 @When("^verify product added message$")
	 public void veryfy_product_added_message() {
		//veryfy product added msg
			wait.until(ExpectedConditions.visibilityOfElementLocated(ObjectMap.CHIWIN_ADDSUCCESS));
			
		 
	 }
	 
	 @Then("^click on Continue Shopping button in popup$")
	 public void click_on_continue_shopping() {
		 driver.findElement(ObjectMap.CONTINUE_SHOPPING).click();
		 
	 }
	 
	 @When("^transfer control to main page$")
	 public void switch_to_main_page() {
		//fetch the parent window id
			String pid=driver.getWindowHandle();
		//switch back to parent window
			driver.switchTo().window(pid);
		 
	 }
	 @Then("^close window$")
	 public void close_window() throws InterruptedException {
		 driver.close();
		
	 }


}
