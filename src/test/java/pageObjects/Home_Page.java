package pageObjects;
 
import java.io.IOException;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.ExcelUtils;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
public class Home_Page extends Base_Page {
 

	public Home_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	String path="C:\\Users\\2318161\\OneDrive - Cognizant\\eclipse workspace\\BookShelves\\testData\\sheet1.xlsx";
	ExcelUtils util=new ExcelUtils(path);

	//Locators
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div[3]/a[5]") 
	WebElement bookShelf;
	@FindBy(xpath="//a[@class='close-reveal-modal hide-mobile']") 
	WebElement Popup;
	@FindBy(xpath="//div[@class='gname'][normalize-space()='Price']") 
	WebElement price;
	 
	
	@FindBy(xpath="//div[@class='noUi-handle noUi-handle-upper']") 
	WebElement slider;
	@FindBy(xpath="//div[normalize-space()='Storage Type']") 
	WebElement hover;
	@FindBy(xpath="//label[@for='filters_storage_type_Open']") 
	WebElement storageType;
	@FindBy(xpath="//div[@class='option']/input") 
	WebElement stock;
	@FindBy(xpath="//*[@id=\\\"content\\\"]/div[3]/ul/li[1]/div/div[5]/a/div[1]/span")
	WebElement bookShelveName1;
	 
	@FindBy(xpath="//span[@class='topnav_itemname'][normalize-space()='Lighting & Decor']")
	 
	WebElement txt_hover;//delete
	 
	@FindBy(xpath="//div[normalize-space()='Brand']")
	WebElement brand;
	 
	@FindBy(xpath="//input[@id='filters_brand_name_By_The_Home_Dekor']")
	WebElement home;
	 
	@FindBy(xpath="//*[normalize-space()='Trending']")
	WebElement trending;
	 
	 
	@FindBy(xpath="//*[@id=\"header\"]/section/div/ul[2]/li[3]/a")
	 
	WebElement btn_gift;
	//Actions Method
	public void clickBookShelves()
	{
		bookShelf.click();
	}
	public void clickPopup()
	{
		Popup.click();
	}
	public void Price()
	{
		price.click();
	}
	public void Slider() {
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider,-273,0).perform();
	}
	public void Hover() {
		Actions act=new Actions(driver);
		act.moveToElement(hover).perform();
	}
	public void StorageType() {
		storageType.click();
	}
	public void Stock() {
		stock.click();
	}
	public void BookShelveName() throws InterruptedException, IOException {
		for(int r=1;r<=3;r++) {
			String t=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/ul/li["+r+"]/div/div[5]/a/div[1]/span")).getText();
			System.out.print("Bookshelf"+r+ ": ");
			System.out.println(t);
			util.setCellData("Sheet1",0,0,"BookShelves");
			util.setCellData("Sheet1",0,1,"Price");
			String BookShelve=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/ul/li["+r+"]/div/div[5]/a/div[1]/span")).getText();
			String Price=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/ul/li["+r+"]/div/div[5]/a/div[2]/span")).getText();
			util.setCellData("Sheet1",r,0,BookShelve);
			util.setCellData("Sheet1",r,1,Price);
			}
		}
	//	System.out.println("------------------------------------------------------");
	// }
	 
	 
	public void Brand() {
		Actions act=new Actions(driver);
		act.moveToElement(brand).perform();
	}
	 
	public void Home() {
		home.click();
	}
	 
	 
	public void click_giftCard() {
		btn_gift.click();
	}
	public int no_of_item() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> list_of_item=driver.findElements(By.xpath("//*[@id=\"content\"]/div[3]/ul/li[\"+i+\"]/div/div[5]/a/div[1]/span"));
		return list_of_item.size();
		}
	public void print_item(int n) throws InterruptedException, IOException {
		Thread.sleep(3000);
		for(int i=1;i<=n;i++) {
			String s=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/ul/li["+i+"]/div/div[5]/a/div[1]/span")).getText();
		    System.out.println(s);
			util.setCellData("Sheet1",5,0,"Bookshelf Name ");
			String BookShelveName=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/ul/li["+i+"]/div/div[5]/a/div[1]/span")).getText();
			util.setCellData("Sheet1",i+5,0,BookShelveName);
	
	 
		}
	}
	 
	public void Trending() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//*[@id='header']/section/div/ul[2]/li[3]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element);
		//js.executeScript("document.getElementsByClassName('one-col ul_desktop body_taxons')[0].scrollBy(0,-500)");
	 
		System.out.println("Scroll Done");
		Actions act=new Actions(driver);
		act.moveToElement(trending).perform();
	
	 
	}
	public int size_of_collection() {
		List<WebElement> l=driver.findElements(By.xpath("//*[normalize-space()='UL Collections']/following-sibling::ul/li[\"+i+\"]/a/span"));
		return l.size();
	}
	 
	public void Collections(int n) throws InterruptedException, IOException{
		for(int i=1;i<=n;i++) {
			Thread.sleep(2000);
			String a=driver.findElement(By.xpath("//*[normalize-space()='UL Collections']/following-sibling::ul/li["+i+"]/a/span")).getText();
			System.out.println("Collections sub-menu "+i+ ": " +a);	
			util.setCellData("Sheet1",13,0,"Collections List ");
			String Collection=driver.findElement(By.xpath("//*[normalize-space()='UL Collections']/following-sibling::ul/li["+i+"]/a/span")).getText();
			util.setCellData("Sheet1",i+13,0,Collection);
	   }
	
	}
	 
	 
		
}
	