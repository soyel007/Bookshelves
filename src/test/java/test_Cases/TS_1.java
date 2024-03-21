package test_Cases;
 
import java.io.IOException;
 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import pageObjects.Home_Page;
import test_Base.Base_Class;

 

public class TS_1  extends Base_Class{
 
	
		Home_Page hp;
		@BeforeMethod
		public void set1(){
			hp=new Home_Page(driver);
		}
		@Test(priority=1)
		public void PrintBook_1() throws InterruptedException {
		logger.info("***Starting TS_1 Test ***");
		hp.clickBookShelves();
		logger.info("Clicked on Bookshelves.");
		Thread.sleep(5000);}
		@Test(priority=2)
		public void Popup() {
		hp.clickPopup();
		logger.info("Clicked on popup.");}
		@Test(priority=3)
		public void price() {
		hp.Price();
		}
		@Test(priority=4)
		public void Slide() throws InterruptedException {
		hp.Slider();
		Thread.sleep(5000);
		logger.info("Price range is Selected By using the slider.");}
		@Test(priority=5)
		public void hover() {
		hp.Hover();}
		@Test(priority=6)
		public void Storage() {
		hp.StorageType();
		logger.info("Storage type open is selected by hovering on Storage type.");}
		@Test(priority=7)
		public void out_of_stock_exclude() {
		hp.Stock();
		logger.info("Out of stack products are excluded.");}
		@Test(priority=8)
		public void Books() throws InterruptedException, IOException {
		Thread.sleep(2000);
		hp.BookShelveName();
		logger.info("Getting top three Bookshelves info.");
		logger.info("***TS_1 test case passed successfully.....***");
		System.out.println("TS_1 Completed............................................");
		}
 
 
	}