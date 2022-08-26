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
import java.io.File
import java.sql.Timestamp
import java.time.format.DateTimeFormatter
import java.time.Instant

class App {
}

fun main() {
    val wdm = WebDriverManager.chromedriver().browserInDocker().enableVnc();
    val driver = wdm.create();
    driver.get("https://example.org/");
    val heading1 = driver.findElement(By.tagName("h1"));
    println("Heading: " + heading1.text);
    val resultFile = File("result-" + DateTimeFormatter.ISO_INSTANT.format(Instant.now()) + ".txt")
    resultFile.appendText("Result:\n");
    resultFile.appendText(heading1.text);
    wdm.quit();
}