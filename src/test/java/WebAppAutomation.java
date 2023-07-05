import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import java.util.concurrent.TimeUnit;

public class WebAppAutomation {
    static Methodlar mt= new Methodlar();
    static Constants cs=new Constants();

    public static void main(String[] args) throws InterruptedException {
        mt.gotoURL(cs.URL);
        Driver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;

        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmm-cookie-banner[class='hydrated']";
        String cssSelectorForHost2 = " div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > cmm-buttons-wrapper:nth-child(3) > div:nth-child(1) > div:nth-child(1) > wb7-button:nth-child(3)";
        Driver.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        SearchContext shadow0 = Driver.driver.findElement(By.cssSelector("cmm-cookie-banner[class='hydrated']")).getShadowRoot();
        Driver.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > cmm-buttons-wrapper:nth-child(3) > div:nth-child(1) > div:nth-child(1) > wb7-button:nth-child(3)")).getShadowRoot();
        Driver.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        shadow1.findElement(By.cssSelector(".button"));

    }
}
