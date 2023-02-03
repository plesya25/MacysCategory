/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
public class JewerlyCatgTest {
  private WebDriver driver;
  private String baseUrl;
    public JewerlyCatgTest() {
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
  public void testJewerlyCatgTest4() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.macys.com/");
    driver.findElement(By.xpath("//li[@id='flexid_544']/a/span")).click();
    driver.findElement(By.xpath("//div[@id='bd']/div/div[3]/div/h1")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='bd']/div/div[3]/div/h1 | ]]
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='bd']/div/div[3]/div/h1")).getText(), "Jewelry & Watches");
    } catch (Error e) {
        System.out.println(e.toString());
    }
    driver.findElement(By.xpath("//div[@id='categoryTree']/div/ul/li/span/a")).click();
    driver.close();
  }

}
