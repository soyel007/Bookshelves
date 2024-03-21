package test_Cases;
 
import java.io.IOException;
 

import org.testng.annotations.BeforeMethod;
 
//import java.time.Duration;
 
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
//import dev.failsafe.internal.util.Durations;
import pageObjects.Home_Page;
import test_Base.Base_Class;
 
public class TS_2 extends Base_Class {
	Home_Page hp;
	@BeforeMethod
	public void set2() {
		hp=new Home_Page(driver);
	}
	@Test(priority=1)
	public void clickBook_shelves() throws InterruptedException {
		logger.info("***Starting TS_2 Test ***");
		hp.clickBookShelves();
		logger.info("Clicked on Bookshelves.");
		Thread.sleep(3000);
	}
	@Test(priority=2)
	public void Pop2() throws InterruptedException {
		Thread.sleep(2000);
	hp.clickPopup();
	logger.info("Clicked on popup.");
	}
	@Test(priority=2)
	public void hover_price() throws InterruptedException {
		hp.Price();
		hp.Slider();
		Thread.sleep(5000);
		logger.info("Price range is Selected By using the slider.");
	}

	@Test(priority=4)
	public void hover_storage() throws InterruptedException {
		Thread.sleep(2000);
		hp.Hover();
		hp.StorageType();
		logger.info("Storage type open is selected by hovering on Storage type.");
	}
		@Test(priority=5)
		public void select_stock() {
		hp.Stock();
		logger.info("Out of stack products are excluded.");
		}
		@Test(priority=6)
		public void select_Home_dkr() throws InterruptedException{
		hp.Brand();
		Thread.sleep(2000);
		hp.Home();
		logger.info("Brand by \"The Home Dekor\" is selected.");
		}
		@Test(priority=7)
		public void Print_Book2() throws InterruptedException, IOException {
		int n=hp.no_of_item();
		hp.print_item(n);
		logger.info("All the available options in bookshelf is printed after applying the filters.***");
		}
		@Test(priority=8)
		public void print_collection() throws InterruptedException, IOException {
		hp.Trending();
		int size=hp.size_of_collection();
		hp.Collections(size);
		logger.info("All the sub-menus under collections is printed.");
		logger.info("***TS_2 test case passed successfully.....***");
		System.out.println("TS_2 Completed............................................");
		}


	}