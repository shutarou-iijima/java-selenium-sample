import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import java.util.concurrent.TimeUnit

class App

fun main() {
    // 84 は Chrome driver が local (or whitelist ips) にしかアクセスできない
    System.setProperty("webdriver.chrome.driver", "selenium/chromedriver/83.0.4103.39/chromedriver");

    val options = ChromeOptions()
    options.addArguments("--headless")
    val driver = ChromeDriver(options)

    driver.get("https://www.google.com")
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS)
    println(driver.title)
}
