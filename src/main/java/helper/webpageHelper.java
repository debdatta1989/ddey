package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.configurationUtil;

import java.util.concurrent.TimeUnit;

public class webpageHelper {



    public static WebDriver driver;

        public static void getTheMainPage() {

            System.setProperty("webdriver.chrome.driver", configurationUtil.getPathChromeDriver());
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.navigate().to(configurationUtil.getTheURl());
        }

    }

