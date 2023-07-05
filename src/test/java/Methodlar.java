import io.github.bonigarcia.wdm.WebDriverManager;

public class Methodlar {

    public void gotoURL(String URL_){
        WebDriverManager.chromedriver().setup();
        Driver.driver.navigate().to(URL_);
    }
    public  void click_byXpath(){
        WebElementler.acceptbtn.click();
    }
}
