package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class stepDefs {

    private int total;

    @Given("1 + 1 = 2")
    public void one_plus_one_equals_two() {
        total = 1 + 1;
    }

    @Then("this scenario is true")
    public void this_scenario_is_true() {
        assertEquals(2, total);
    }

}
