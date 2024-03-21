package test_Cases;
 
import java.io.IOException;
 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import pageObjects.Login_Page;
import test_Base.Base_Class;
 
public class TS_Login extends Base_Class{
	Login_Page lp;
	@BeforeMethod
	public void set() {
		lp=new Login_Page(driver);
	}
	@Test(priority=1)
	public void Login() throws InterruptedException {
		lp.Icon();
		logger.info("***Starting Login Test ***");
	}
	@Test(priority=2)
	public void LoginClick() throws InterruptedException {
		lp.Login();
		logger.info("Clicking on login.... ");
		Thread.sleep(2000);
		}
	@Test(priority=3)
	public void EmailWrite() throws InterruptedException, IOException {
		lp.Email();
		logger.info("providing email id...");
		}
	@Test(priority=4)
	public void Passwrd() throws InterruptedException, IOException {
		lp.Password();
		logger.info("providing password...");
		}
	@Test(priority=5)
	public void Login_Btnn(){
		lp.Login_Btn();
		//logger.info("Login successful....");
		
	}
	
	@Test(priority=6)
	public void Error() throws InterruptedException {
			lp.ErrorMess();
			logger.info("Error Message Printed");
			driver.navigate().back();
			Thread.sleep(3000);
		}
	@Test(priority=7)
	public void Loginnew() throws InterruptedException {
			lp.Icon();
			logger.info("***Starting Login Test ***");
		}
	@Test(priority=8)
	public void LoginClicknew() throws InterruptedException {
			lp.Login();
			logger.info("Clicking on login.... ");
			}
	@Test(priority=9)
	public void Emailnew1() throws InterruptedException, IOException {
		lp.Emailnew();
		}
	@Test(priority=10)
	public void Passnew() throws InterruptedException, IOException {
		lp.Passwordnew();
		}
	@Test(priority=11)
	public void loginnew() {
		lp.Login_Btn();
		System.out.println("Login completed.........................................");
		}






 
}