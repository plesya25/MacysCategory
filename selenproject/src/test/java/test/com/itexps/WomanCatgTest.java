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
public class WomanCatgTest {
      private WebDriver driver;
     private String baseUrl;
    public WomanCatgTest() {
    }


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
  public void testWomenCatgTest1() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.macys.com/");
    driver.findElement(By.xpath("//li[@id='flexid_118']/a/span")).click();
    driver.findElement(By.xpath("//div[@id='bd']/div/div[3]/div/h1")).click();
    driver.findElement(By.xpath("//div[@id='bd']/div/div[3]/div/h1")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='bd']/div/div[3]/div/h1 | ]]
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='bd']/div/div[3]/div/h1")).getText(), "Women");
    } catch (Error e) {
        System.out.println(e.toString());
    }
    driver.findElement(By.xpath("//img[@alt='Coats and Jackets']")).click();
    driver.findElement(By.xpath("//div[@id='visual-navigation']/div/div[2]/a/span")).click();
    driver.close();
  }
}
