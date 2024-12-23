package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class ReflectionsPage {

	public AppiumDriver driver;
	
	public ReflectionsPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement loginButton;
	@FindBy(xpath = "//android.widget.EditText[@text=\"Email or Phone Number\"]")
	private WebElement username;
	@FindBy(xpath = "//android.widget.EditText[@text=\"Password (6-digit)\"]")
	private WebElement password;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Submit\"]")
	private WebElement submitButton;
	
	//reflection pages webelement
	@FindBy(xpath = "//android.view.View[@text=\"Reflections\"]")
	private WebElement reflectionsText;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Feedback\"]")
	private WebElement feedbackTab;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Coaching Session\"]")
	private WebElement coachingSessionTab;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Latest first (5 reflections)\"]")
	private WebElement latest5ReflectionsText;
	
	
	public void login() throws InterruptedException {
		Thread.sleep(10000);
		loginButton.click();
		Thread.sleep(10000);
		username.sendKeys("6598321470");
		Thread.sleep(10000);
		password.sendKeys("123456");
		Thread.sleep(10000);
		submitButton.click();
		Thread.sleep(10000);
	}
}
