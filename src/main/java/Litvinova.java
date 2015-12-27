import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Litvinova {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.herzen.spb.ru/students/");
        System.out.println("Page title is: " + driver.getTitle());
        driver.findElement(By.className("news_header_link")).click();

        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }
}
