package demo

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
    val caps = DesiredCapabilities();
    caps.setJavascriptEnabled(true); // not really needed: JS enabled by default
    caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "src/test/resources/phantomjs");

    val driver = PhantomJSDriver(caps);
    driver.get("https://devqa.io");
}