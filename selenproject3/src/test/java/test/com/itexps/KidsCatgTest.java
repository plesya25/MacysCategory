/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ukiel
 */
public class KidsCatgTest {
  private WebDriver driver;
  private String baseUrl;
    public KidsCatgTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
            driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }
     @Test
  public void testKidsCatgTest3() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.macys.com/");
    driver.findElement(By.xpath("//li[@id='flexid_5991']/a/span")).click();
    driver.findElement(By.xpath("//div[@id='bd']/div/div[3]/div/h1")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='bd']/div/div[3]/div/h1 | ]]
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='bd']/div/div[3]/div/h1")).getText(), "Kids");
    } catch (Error e) {
        System.out.println(e.toString());
    }
    driver.findElement(By.xpath("//img[@alt='Toddler Girls, 2T-5T']")).click();
    driver.findElement(By.xpath("//div[@id='reskin-header1']/div/h1")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='reskin-header1']/div/h1 | ]]
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='reskin-header1']/div/h1")).getText(), "Toddler Girls (2T-5T)");
    } catch (Error e) {
        System.out.println(e.toString());
    }
    driver.findElement(By.xpath("//li[@id='BUSINESS_CATEGORY']/h2/span")).click();
    driver.findElement(By.xpath("//li[@id='PRODUCT_DEPARTMENT']/h2/span")).click();
    driver.findElement(By.xpath("//li[@id='PRODUCT_DEPARTMENT']/div/ul/li[4]/a")).click();
    driver.close();
  }

}
