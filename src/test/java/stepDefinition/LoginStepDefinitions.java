package stepDefinition;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.companyname.library.CommonLibrary;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BaseWebdriver;

public class LoginStepDefinitions {
	
	public BaseWebdriver baseWebdriver = new BaseWebdriver();
	WebDriver driver = baseWebdriver.WebDriverManager();
	
	CommonLibrary commonLib = new CommonLibrary(baseWebdriver.WebDriverManager());
	
	
	@Given("Navigate to tokopedia login page")
	public void navigate_to_tokopedia_login_page() {
		
		commonLib.clickFirstLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	}
	
	@When("^user login into web with (.+) and password (.+)$")
	public void user_input_name_and_password(String username, String password) {
		commonLib.setUsername(username);
		commonLib.clickNextButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		commonLib.setUserPassword(password);
	}

	
	@When("click login button")
	public void click_login_button() {
		commonLib.click("loginUI.btn_click_login");
		
		commonLib.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@Then("user home page is displayed")
	public void user_home_page_is_displayed() {
		assertTrue(commonLib.popUpCheck());
		driver.quit();
	}
	
	@When("user login into web with {string}")
	public void user_login_into_web(String username) {
		commonLib.setUsername(username);
	}
	
	@When("click next button")
	public void click_next_button() {
		commonLib.clickNextButton();
		
	}
	
	@Then("unregistered pop-up information is displayed")
	public void unregistered_popup_info_is_displayed() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Assert.assertEquals(commonLib.unregisteredEmailPopupInfo(),"Email belum terdaftar");  
		driver.quit();
	}
	
	@When("user click Metode lain button")
	public void user_click_metode_lain() {
		commonLib.clickOtherMethodButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Assert.assertTrue(commonLib.chooseAccountTextisDisplayed());
		driver.quit();
	}
//	@When("^user login into web with (.+) and password (.+)$")
//	public void user_input_name_and_password(String username, String password) {
//		System.out.println("Name and pwd inputted");
//	}
	
//	@When("user login into web with {string} and password {string}")
//	public void user_input_name_and_password(String username, String password) {
//		commonLib.setUsername(username);
//		commonLib.clickNextButton();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		commonLib.setUserPassword(password);
//	}
//	@Given("Open tokopedia login page")
//	public void open_tokopedia_login_page() {
//		System.out.println("Land in Homepage and go to login page 2");
//		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
//		driver.get("https://tokopedia.com/");
//		commonLib.clickFirstLoginButton();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	}
}
