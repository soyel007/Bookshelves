
Problem Statement : Display Bookshelves
Website           : "https://www.urbanladder.com/"
---------------------------------------------------------------------

1) Display the name, price of

   * Bookshelves- below Rs. 15000, Storage type should be open, Including out of stock 
               Take first 3 Book-Shelf
   *If more than one item with same price displayed, include that details as well.

2) Display the name, price of
   * Bookshelves from brand 'By the home dekor' , use same filters as above.

3) Verify the error message from the ‘Gift Cards’ page.



Steps of the Procedure:
----------------------------------------------------------------------

1)  Launch any browser (In this code we have used Chrome browser and Microsoft Edge browser). 
2)  Goto “https://www.urbanladder.com/”. 
3)  Scroll the page and click on ‘Bookshelves’ option. (It will take user to ‘Bookshelves’ page).
4)  Drag and drop the ‘price’ slider to Rs.15000.
5)  Choose ‘Storage Type’ as ‘Open’.
6)  Select the ‘Exclude Out Of Stock’ checkbox field.
7)  Take the list of first 3 bookshelves and print it on the console.
8)  Select the ‘By the home dekor’ from the ‘Brand’ menu option.
9)  Take the list of all the bookshelves under 'By the home dekor' and print it on the console. 
10) Scroll the page up and click on ‘Gift Cards’ Option. (It will take user to ‘Gift Cards’ page).
11) Click on the ‘Birthday/Anniversary’ option.
12) In the ‘Amount’ textbox, enter the amount.
13) Click ‘NEXT’ Button.
14) Fill all the mandatory fields except ‘Recipient’s mobile no.’ textbox.
15) Enter invalid value in the ‘Recipient’s mobile no.’ textbox.
16) Click ‘CONFIRM’ Button.
17) Check whether error message is displayed.
18) Display the error message on the console.


Folders
----------------------------------------------------------------------

1) src/test/java
       i)   dataTables
           
       ii)  pageObjectsRepository
            -Base_Page.java
            -Gift_page.java
            -Home_Page.java
            -Login_Page.java
       iii) testScenarios
            -Diplaying Bookshelves below 15000Rs.
            -Selecting the ‘By the home dekor’ from the ‘Brand’.
             Taking the list of all the bookshelves under 'By the home dekor' and print the name on the console.
            -Capturing & displaying the error message.
       iv)  userDefinedLibraries
            -Base_Class.java
            -ExcelUtils.java
            -ExtentReportManager.java
           

2) logs.

3) reports- (extent report saved here)
      
4) ScreenShots
     
5) testData



Data Driven Concepts
-----------------------------------------------------------------------
1) Properties File (Reading Data)

   * (config.properties)- This properties file conists of login id , password  and URL value.



3) Excel File (Writing data)

   1. (sheet.xlsx)- This Excel file is present in    

      * The bookshelves below 15000 after applying appropriate filters are written to this file. 
      * The bookshelves under brand 'By the home dekor' are written to this file.



Key Automation Scope
-------------------------------------------------------------------------

-> Using drag & drop
-> Locating elements precisely.
-> Using appropriate synchronization technique.
-> Extracting menu items & store in collections
-> Scrolling up and down in web page
-> Filling form (in different objects in web page)
-> Capture warning message   
-> Taking Screenshots



Technology/Automation Tools Used
-------------------------------------------------------------------------
1) Selenium Webdriver and it's concepts.
2) Maven
3) TestNG framework and it's concepts.
4) Data Driven approach
5) Page Object Model
6) Extent Report/ TestNG Report
7) Excel and Property file concepts
8) Multiple Browser testing concepts
9) Java Concepts