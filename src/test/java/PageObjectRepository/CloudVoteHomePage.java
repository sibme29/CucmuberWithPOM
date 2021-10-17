package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CloudVoteHomePage {


    public static WebElement element;

    public static WebElement MySubscription(WebDriver driver)
    {

       element= driver.findElement(By.xpath("//*[@class=\"HeaderLarge\"][contains(text(),\"My Subscription\")]"));
        return element;
    }
}
