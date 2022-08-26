package demo

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    val wdm = WebDriverManager.chromedriver().browserInDocker().enableVnc().enableRecording();
    val driver = wdm.create();
    driver.get("https://example.org/");
    val heading1 = driver.findElement(By.tagName("h1"));
    println("Heading:" + heading1.text);
    wdm.quit();
}