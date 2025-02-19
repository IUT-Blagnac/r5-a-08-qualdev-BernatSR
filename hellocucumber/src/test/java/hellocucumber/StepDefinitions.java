package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    private String today;
    private String actualAnswer;

    @Given("today is {string}")
    public void today_is(String day) {
        this.today = day;
    }


    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        // Call the method that determines if it's Friday
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        // Compare the actual answer with the expected answer
        assertEquals(expectedAnswer, actualAnswer);
    }

}


