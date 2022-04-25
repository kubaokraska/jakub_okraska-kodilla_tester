package pages;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class='g']")                  // [1]
    private List<WebElement> results;                // [2]

    public GoogleResults(WebDriver driver) {         // [3]
        super(driver);                                // [4]
        PageFactory.initElements(this.driver, this);  // [5]
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public int getSize() {
        return results.size();
    }

    public GoogleResults randomPage() {
        Random random = new Random();
        int randomNumber = random.nextInt(results.size());

        List<WebElement> resultsToClick = results.get(0).findElements(By.className("LC20lb MBeuO DKV0Md"));
        resultsToClick.get(randomNumber).click();
        return (GoogleResults) (this.results = resultsToClick);
    }
}