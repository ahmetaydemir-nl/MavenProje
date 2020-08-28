package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_IkinciOrnek {
    static WebDriver driver; //instance variable diyoruz buna.

    @BeforeClass
    public static void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDownd() {

        driver.quit();
    }
        @Before // her test method un dan once calisir.
        public void testtenOnce () {

        driver.get("http://google.com");


        }

        @After // her test methodundan sonra calisir.
        public void testtenSonra () {

            WebElement sonucSayisi = driver.findElement(By.id("result-stats"));
            System.out.println(sonucSayisi.getText());


        }

        @Test
    public void test1(){
            WebElement aramaKutusu = driver.findElement(By.name("q"));

            aramaKutusu.sendKeys(("elma"));
            aramaKutusu.submit();
        }
    @Test
    public void test2(){
        WebElement aramaKutusu = driver.findElement(By.name("q"));

        aramaKutusu.sendKeys(("samsung"));
        aramaKutusu.submit();
    }

    @Test
    public void test3(){

        WebElement aramaKutusu = driver.findElement(By.name("q"));

        aramaKutusu.sendKeys(("hollanda"));
        aramaKutusu.submit();

    }
    }

