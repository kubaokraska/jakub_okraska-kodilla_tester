package com.kodilla.selenium.Allegro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","home/andrzej/dev/codemy/selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        WebElement inputField = driver.findElement(By.xpath("//*[@class=\"mg9e_8 mg9e_16_s mj7a_8 mj7a_16_s mh36_16 mh36_24_l mvrt_16 mvrt_24_l munh_56 m3h2_56 mpof_ki m389_6m m7f5_sf mjyo_6x mjru_ua mwdn_1 mwdn_0_l\"]/div/div/div/form/input"));
        inputField.sendKeys("mavic mini");

        WebElement yearCombo = driver.findElement(By.xpath("//*[@class=\"mp7g_oh mr3m_1 _r65gb\"]//select"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(3);

        inputField = driver.findElement(By.xpath("//div[@class=\"mg9e_8 mg9e_16_s mj7a_8 mj7a_16_s mh36_16 mh36_24_l mvrt_16 mvrt_24_l munh_56 m3h2_56 mpof_ki m389_6m m7f5_sf mjyo_6x mjru_ua mwdn_1 mwdn_0_l\"]/div/div/div/form/button"));
        inputField.submit();
    }
}