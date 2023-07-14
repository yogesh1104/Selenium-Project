package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("$$$$$$$");
        driver.findElement(By.id("pass")).sendKeys("########");
        Thread.sleep(5000);
        String login_button = "//button[contains(text(),'Log in')]";
        driver.findElement(By.xpath(login_button)).click();
        Thread.sleep(7000);
//        String search_button = "//input[@placeholder='Search Facebook']";
//        driver.findElement(By.xpath(search_button)).click();
//        driver.findElement(By.xpath(search_button)).sendKeys("Ramanujganj");
//        WebElement m = driver.findElement(By.xpath(search_button));
//        m.sendKeys(Keys.RETURN);
        driver.get("https://www.facebook.com/search/people/?q=Ramanujganj");
        Thread.sleep(5000);
//        String search_People = "//div[@role='list']/div[3]/div/a/div[2]";
//        driver.findElement(By.xpath(search_People)).click();
//        String name_People = "//div[@class='x193iq5w x1xwk8fm']/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div[@class='xu06os2 x1ok221b']/span/div/a";
        for (int i=1;i<15;i++){
            System.out.println(driver.findElement(By.xpath("//div[@class='x193iq5w x1xwk8fm']/div[" + i + "]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div[@class='xu06os2 x1ok221b']/span/div/a")).getText());
        }

    }
}