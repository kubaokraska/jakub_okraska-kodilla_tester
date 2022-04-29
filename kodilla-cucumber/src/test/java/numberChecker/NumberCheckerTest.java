package numberChecker;

import io.cucumber.java8.En;
import org.junit.Assert;
import numberChecker.NumberChecker;

public class NumberCheckerTest implements En {
    private int number;
    private String answer;

    public NumberCheckerTest() {
        Given("the number is 6", () -> {
            this.number = 6;
        });
        Given("the number is 10", () -> {
            this.number = 10;
        });
        Given("the number is 15", () -> {
            this.number = 15;
        });
        Given("the number is 14", () -> {
            this.number = 14;
        });
        When("calculator check if the number is divisible by 3 or 5 or both or none", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkMyNumber(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}