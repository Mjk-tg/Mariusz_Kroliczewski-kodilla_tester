package com.kodilla.selenium.allegro;

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

//        Alert alert = driver.switchTo().alert();
//        alert.accept();

        WebElement allegroInfo = driver.findElement(By.xpath("//*[@class=\"_13q9y _8hkto _11eg6 _7qjq4 _ey68j\"]"));
        allegroInfo.click();


        WebElement allegroProductSelection = driver.findElement(By.xpath("//*[@data-prototype-id=\"allegro.metrumHeader.search\"]/div/form/input"));
        allegroProductSelection.sendKeys(("Mavic mini"));
        allegroProductSelection = driver.findElement(By.xpath("//*[@class=\"_d25db_2P-5I _1h7wt _k70df _7qjq4\"]"));
        Select categorySelect = new Select(allegroProductSelection);
        categorySelect.selectByVisibleText("Elektronika");
        allegroProductSelection = driver.findElement(By.xpath("//*[@class=\"_d25db_1t06j _13q9y _8tsq7 _1q2ua\"]"));
        allegroProductSelection.submit();
    }
}
