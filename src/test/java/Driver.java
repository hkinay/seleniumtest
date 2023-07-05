import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    static WebDriver driver = WebDriverManager.chromedriver().capabilities(new ChromeOptions().addArguments("--start-maximized")).avoidShutdownHook().create();

}
