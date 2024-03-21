package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import test_Base.Base_Class;

public class Gift_page extends Base_Page  {

	public Gift_page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[3]") 
	WebElement btn_bNa;
	//Birthday & Anniversary btn
	
	@FindBy(xpath="//*[@id=\"ip_2251506436\"]")
    WebElement amount;

	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/button")
    WebElement btn_next;

	@FindBy(xpath="//*[contains(normalize-space(),'month')]/parent::select")
	WebElement select;
	
	@FindBy(xpath="(//select)[2]")
	WebElement date;
	
	@FindBy(xpath="//input[@name='recipient_name']")
	WebElement rName;
	@FindBy(xpath="//input[@name='recipient_email']")
	WebElement rEmail;
	@FindBy(xpath="//input[@name='recipient_mobile_number']")
	WebElement rMobileNum;
	@FindBy(xpath="//input[@name='customer_name']")
	WebElement yName;
	@FindBy(xpath="//input[@name='customer_email']")
	WebElement yEmail;
	@FindBy(xpath="//input[@name='customer_mobile_number']")
	WebElement yMobileNum;
	@FindBy(xpath="//input[@name='customer_address']")
	WebElement yAddress;
	@FindBy(xpath="//input[@id='ip_567727260']")
	WebElement pincode;
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[3]/form/button")
	WebElement btn_confirm;
	@FindBy(xpath="//input[@name='recipient_mobile_number']")
	WebElement error_msg;


	
	//*[@id="app-container"]/div/main/section/section[3]/form/button
	
	
	
	
	public void click_bNa() {
		btn_bNa.click();
		
	}
	public void Amount() {
		amount.sendKeys("50000");
	}

	public void SelectMonth() {
		Select s=new Select(select);
		s.selectByValue("4/2024");
	}

	public void SelectDate() {
		Select s=new Select(date);
		s.selectByVisibleText("22");
	}

	public void Next() {
		btn_next.click();
	}
	
	public void fill_rname() {
		
		rName.sendKeys(Base_Class.randomeString());
	}
	public void fill_rEmail() {
		
		rEmail.sendKeys(Base_Class.randomAlphaNumeric());
	}
	public void fill_rMobileNum() {
			
			rMobileNum.sendKeys(Base_Class.randomeNumber(8));
	}
	
public void fill_yname() {
		
		yName.sendKeys(Base_Class.randomeString());
	}
	public void fill_yEmail() {
		
		yEmail.sendKeys(Base_Class.randomAlphaNumeric());
	}
	public void fill_yMobileNum() {
			
			yMobileNum.sendKeys(Base_Class.randomeNumber(10));
	}
	public void fill_yAddress() {
		
		yAddress.sendKeys(Base_Class.randomeString());
	}
	public void fill_pin() {
			
	          pincode.sendKeys("400001");
		}
	public void click_confirm() {
		btn_confirm.click();
	}
	public String getErrorMsg() {
		String s=error_msg.getAttribute("title");
		return s;
	}
	
	
	

	
	
	
	
	
	
	
	
	

}
