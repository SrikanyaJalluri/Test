package stepDefinitions;

import gherkin.lexer.Id;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public void waitForFrames(WebDriver driver,WebElement element,int seconds){
        WebDriverWait wait = new WebDriverWait(driver,seconds);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
    }
}
