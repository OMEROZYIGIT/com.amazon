import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.amazon.com/");

        


    }
}
