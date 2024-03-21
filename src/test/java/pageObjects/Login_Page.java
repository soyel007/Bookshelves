package pageObjects;
 
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
 
public class Login_Page extends Base_Page {
 
	public Login_Page(WebDriver driver) {
		super(driver);
	}
	public Properties p;
	@FindBy(xpath="//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[2]/span")
	WebElement icon_btn;
	@FindBy(xpath="//*[@class='dropdown']/li[1]/a")
	WebElement login;
	@FindBy(xpath="//*[@id='password-credentials']/input")
	WebElement email;
	@FindBy(xpath="//*[@class='password-wrap']/div/input")
	WebElement password;
	@FindBy(xpath="//*[@id=\"ul_site_login\"]")
	WebElement login_btn;
	@FindBy(xpath="//*[@id='existing-customer']/div/div")
	WebElement error_mess;



	public void Icon() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(icon_btn).perform();
		Thread.sleep(3000);
	}
	public void Login() throws InterruptedException {
		Actions act=new Actions(driver);
		act.doubleClick(login).perform();
		Thread.sleep(3000);
	}
	public void Email() throws InterruptedException, IOException {
		FileReader file=new FileReader("C:\\Users\\2318161\\OneDrive - Cognizant\\eclipse workspace\\BookShelves\\src\\test\\resources\\config.properties");
		 p=new Properties();
		 p.load(file);
		email.sendKeys(p.getProperty("id1"));
		Thread.sleep(3000);
	}
	public void Password() throws InterruptedException, IOException {
		FileReader file=new FileReader("C:\\Users\\2318161\\OneDrive - Cognizant\\eclipse workspace\\BookShelves\\src\\test\\resources\\config.properties");
		 p=new Properties();
		 p.load(file);
		password.sendKeys(p.getProperty("password1"));
		Thread.sleep(2000);
	}
	public void Login_Btn(){
		login_btn.click();
	}
	
	public void ErrorMess() throws InterruptedException {
		String error=error_mess.getText();
		System.out.println(error);
		Thread.sleep(3000);
	}
	public void Emailnew() throws InterruptedException, IOException {
		FileReader file=new FileReader("C:\\Users\\2318161\\OneDrive - Cognizant\\eclipse workspace\\BookShelves\\src\\test\\resources\\config.properties");
		 p=new Properties();
		 p.load(file);
		email.clear();
		email.sendKeys(p.getProperty("id"));
    }
	public void Passwordnew() throws InterruptedException, IOException {
		FileReader file=new FileReader("C:\\Users\\2318161\\OneDrive - Cognizant\\eclipse workspace\\BookShelves\\src\\test\\resources\\config.properties");
		 p=new Properties();
		 p.load(file);
		password.clear();
		password.sendKeys(p.getProperty("password"));	
	}

 
}
