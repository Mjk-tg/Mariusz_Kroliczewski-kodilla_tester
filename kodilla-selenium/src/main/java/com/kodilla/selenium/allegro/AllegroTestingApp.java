package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "e:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");
        driver.g

//        Alert alert = driver.switchTo().alert();
//        alert.accept();

        WebElement allegroInfo = driver.findElement(By.xpath("//html/body/div[2]/div[6]/div/div[2]/div/div[2]/button[2]"));
        allegroInfo.submit();

        WebElement allegroProductSelection = driver.findElement(By.xpath("//*[@data-prototype-id=\"allegro.metrumHeader.search\"]/div/form/input"));
        allegroProductSelection.sendKeys(("Mavic mini"));
        allegroProductSelection = driver.findElement(By.xpath("//*[@class=class=\"_r65gb _1fwkl\"]/select[@class=\"_d25db_2P-5I _1h7wt _k70df _7qjq4\"]"));
        Select categorySelect = new Select(allegroProductSelection);
        categorySelect.selectByValue("/kategoria/elektronika");
        allegroProductSelection = driver.findElement(By.xpath("//button[@class=\"_d25db_1t06j _13q9y _8tsq7 _1q2ua\"]/"));
        allegroProductSelection.submit();
    }
}
