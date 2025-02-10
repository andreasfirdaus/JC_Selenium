package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args)

    {
        String path = ("D:\\mytools\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver(); //instanse
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://demoqa.com/text-box");
        System.out.println("Open Browser");
        driver.manage().window().maximize();
        System.out.println("layar berhasil diperbesar");

       WebElement FullnameLocator = driver.findElement(By.id("userName"));
       FullnameLocator.sendKeys("andreas firdaus qa");

        WebElement EmailLocator = driver.findElement(By.id("userEmail"));
        EmailLocator.sendKeys("aritno12@gmail.com");

        WebElement TextAreaLocator = driver.findElement(By.id("currentAddress"));
        TextAreaLocator.sendKeys("LOREM");

        WebElement PermanentAddresLocator = driver.findElement(By.id("permanentAddress"));
        PermanentAddresLocator.sendKeys("LOREM");

        js.executeScript("window.scrollBy(0,500)");
        System.out.println("scroll berhasil");

        WebElement btnSubmit = driver.findElement(By.id("submit"));
        btnSubmit.click();
        delay();
        System.out.println("klik submit berhasil");

    }

    public static void delay()
    {
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}