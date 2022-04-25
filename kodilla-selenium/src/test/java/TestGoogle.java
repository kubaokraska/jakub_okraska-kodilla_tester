import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleSearch;

public class TestGoogle {

    WebDriver driver;

    @BeforeAll
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KaToV-PC\\kodilla2\\Kodilla_tester\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.navigate().to("http://www.google.com");
    }

    @AfterAll
    public void tearDown() {
        driver.close();                   // [1]
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        googleSearch.loadResults(driver).randomPage();
    }
}