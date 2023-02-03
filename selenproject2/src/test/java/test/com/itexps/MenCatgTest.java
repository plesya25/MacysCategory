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
public class MenCatgTest {
     private WebDriver driver;
  private String baseUrl;
    public MenCatgTest() {
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
     
    }
    
  @Test
  public void testMenCatgTest2() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.macys.com/");
    driver.findElement(By.xpath("//li[@id='flexid_1']/a/span")).click();
    driver.findElement(By.xpath("//div[@id='bd']/div/div[3]/div/h1")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='bd']/div/div[3]/div/h1 | ]]
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='bd']/div/div[3]/div/h1")).getText(), "Men");
    } catch (Error e) {
        System.out.println(e.toString());
    }
    driver.findElement(By.xpath("//img[@alt='Shoes']")).click();
    driver.findElement(By.xpath("//div[@id='visual-navigation']/div/div/a/span")).click();
    driver.close();
  }
}
