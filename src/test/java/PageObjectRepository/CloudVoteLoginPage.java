package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CloudVoteLoginPage {
    public static WebElement element=null;

    public static WebElement UserEmail(WebDriver driver)
    {
      element =  driver.findElement(By.xpath("//*[@id=\"AccessKey\"]"));
        return element;
    }
    public static WebElement UserPassword(WebDriver driver)
    {
       element= driver.findElement(By.id("Password"));
        return element;
    }
    public static WebElement LoginButton(WebDriver driver)
    {
      element=  driver.findElement(By.xpath("//*[@value='Login']"));
        return element;
    }
}
