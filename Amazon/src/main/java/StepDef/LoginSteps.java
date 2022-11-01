package StepDef;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class LoginSteps {
    public static WebDriver driver;


    @Given("Open amazon site")
    public void open_amazon_site() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin B\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
    }

    @Then("Click on hamburger menu")
    public void click_on_hamburger_menu() {
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
    }

    @Then("Scroll and click on TV Appliances and Electronics")
    public void scroll_and_click_on_tv_appliances_and_electronics() {
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[16]/a")).click();

    }
    @Then("Click on Televisions under Tv Audio & Cameras sub section")
    public void click_on_televisions_under_tv_audio_cameras_sub_section() {
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[3]/a")).click();
    }
    @Then("Scroll down and filter the results by Brand Samsung")
    public void scroll_down_and_filter_the_results_by_brand_samsung() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String sam = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[21]/ul/li[3]/span/a/span")).getText();
        String sam2 = "Samsung";
        if (sam.equals(sam2)) {
            WebElement x = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[21]/ul/li[3]/span/a/span"));
            Thread.sleep(3000);
            js.executeScript("arguments[0].scrollIntoView(true)", x);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[21]/ul/li[3]/span/a/span")).click();
        }
    }

    @Then("Sort the Samsung results with price High to Low")
    public void sort_the_samsung_results_with_price_high_to_low() {
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_2\"]")).click();
    }
    @Then("Click on the second highest priced item")
    public void click_on_the_second_highest_priced_item() {
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div[2]/div[1]/h2/a/span")).click();

    }
    @Then("Switch the Window")
    public void switch_the_window() throws InterruptedException{
        ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(wid.get(1));
        WebElement abt = driver.findElement(By.xpath("//*[@id=\"feature-bullets\"]/h1"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)",abt);
        Thread.sleep(3000);
    }
    @Then("Section is present and log this section text to console or report.")
    public void section_is_present_and_log_this_section_text_to_console_or_report() {
        String x = driver.findElement(By.xpath("//*[@id=\"feature-bullets\"]/h1")).getText();
        String y = driver.findElement(By.xpath("//*[@id=\"feature-bullets\"]/ul")).getText();
        System.out.println(x);
        System.out.println(y);
    }

}