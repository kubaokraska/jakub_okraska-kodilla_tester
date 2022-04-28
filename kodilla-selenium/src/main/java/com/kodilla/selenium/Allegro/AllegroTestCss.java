package com.kodilla.selenium.Allegro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;

public class AllegroTestCss {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");
        List<WebElement> allegroClassContainer = new ArrayList<>();
        List<WebElement> allegroArticles = new ArrayList<>();

        WebElement inputField = driver.findElement(By.xpath("div>form[class*='mpof_ki mqu1_21 mp4t_0 m3h2_0 mryx_0 munh_0 mgn2_14 mp0t_0a mgmw_wo mli8_k4 _535b5_3gmLS mp7g_oh']>input"));
        inputField.sendKeys("mavic mini");

        WebElement yearCombo = driver.findElement(By.xpath("div>form[class*='mpof_ki mqu1_21 mp4t_0 m3h2_0 mryx_0 munh_0 mgn2_14 mp0t_0a mgmw_wo mli8_k4 _535b5_3gmLS mp7g_oh']>div>div>select"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(3);

        inputField = driver.findElement(By.xpath("div>form[class*='mpof_ki mqu1_21 mp4t_0 m3h2_0 mryx_0 munh_0 mgn2_14 mp0t_0a mgmw_wo mli8_k4 _535b5_3gmLS mp7g_oh']>button"));
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        ////////////////////////////////////////////////////////////////////// new page

        allegroClassContainer = driver.findElements(By.className("div[class*='mgn2_13 mqu1_ae mp0t_0a mgmw_ia mli8_k4 mjru_vb']"));
        allegroArticles = allegroClassContainer.get(0).findElements(By.tagName("articles"));

        for (WebElement allegroArticle : allegroArticles)
            allegroArticle.getText();
    }
}