package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MTSTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");


        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]"));
        if (blockTitle.isDisplayed()) {
            System.out.println("Название блока найдено: " + blockTitle.getText());
        } else {
            System.out.println("Название блока не найдено");
        }

        WebElement logos = driver.findElement(By.xpath("//div[@class='pay__partners']"));
        if (logos.isDisplayed()) {
            System.out.println("Логотипы платежных систем найдены");
        } else {
            System.out.println("Логотипы платежных систем не найдены");
        }

        WebElement moreInfoLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        if (moreInfoLink.isDisplayed()) {
            System.out.println("Кнопка найдена");
        }
        moreInfoLink.click();
        driver.navigate().back();

        WebElement phoneNumberField = driver.findElement(By.id("connection-phone"));
        phoneNumberField.sendKeys("297777777");
        WebElement phoneSumField = driver.findElement(By.id("connection-sum"));
        phoneSumField.sendKeys("100");
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Продолжить')]"));
        continueButton.click();
        System.out.println("Форма оплаты работает");
    }
}
