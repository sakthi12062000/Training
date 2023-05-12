package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleRadio {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/checkboxradio/");
        // maximize the window
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));

        driver.switchTo().frame(frame);

        // click on radio button named New york

        WebElement radio = driver.findElement(By.xpath("(//span[@class = 'ui-checkboxradio-icon-space'])[1] "));

        if(radio.isEnabled()) {
            radio.click();
        }

        driver.close();


    }
}
