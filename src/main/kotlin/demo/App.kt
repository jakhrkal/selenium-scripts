package demo

import org.openqa.selenium.By
import io.github.bonigarcia.wdm.WebDriverManager
import java.io.File
import java.time.format.DateTimeFormatter
import java.time.Instant

fun main() {
    val wdm = WebDriverManager.chromedriver().remoteAddress("http://chrome:4444/wd/hub");
    val driver = wdm.create();
    driver.get("https://example.org/");
    val heading1 = driver.findElement(By.tagName("h1"));
    println("Heading: " + heading1.text);
    // todo pull file out of Docker container
    val resultFile = File("result-" + DateTimeFormatter.ISO_INSTANT.format(Instant.now()) + ".txt")
    resultFile.appendText("Result:\n");
    resultFile.appendText(heading1.text);
    wdm.quit();
}