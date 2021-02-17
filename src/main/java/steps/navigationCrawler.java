package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static helper.webpageHelper.driver;
import static helper.webpageHelper.getTheMainPage;
import static org.openqa.selenium.Keys.ENTER;

public class navigationCrawler {

    @Given("navigate to google webpage and accept the privacy consent")
    public void navigateToGoogleWebPage() {
        getTheMainPage();
        Assert.assertEquals("Google",
                (driver.getTitle()));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("#introAgreeButton > span > span")).click();
    }


        @When("I search the {} in the search box and enter")
        public void searchTheWord(String key){
        driver.findElement(By.cssSelector("body > div.L3eUgb > " +
                "div.o3j99.ikrT4e.om7nvf > form > div:nth-child(2) > div.A8SBwf > " +
                "div.RNNXgb > div > div.a4bIc > input")).sendKeys(key,ENTER);


        }

    @Then("I got the result and validate the search result")
    public void verifyResult(){
        Assert.assertTrue("The search result page is not reachable",
                driver.findElement(By.cssSelector("#rcnt")).isDisplayed());
        driver.close();
    }

}


