package dojo;

import cucumber.api.java.en.*;


import static org.junit.Assert.*;

public class CocktailSteps {

    private Order order;

    // Step: Given <from> who wants to buy a drink
    @Given("^(.+) who wants to buy a drink$")
    public void given_who_wants_to_buy_a_drink(String from) {
        order = new Order();
        order.declareOwner(from);
    }

    // Step: When an order is declared for <to>
    @When("^an order is declared for (.+)$")
    public void when_an_order_is_declared_for(String to) {
        order.declareTarget(to);
    }

    // Step: And a message saying "<message>" is added
    @And("^a message saying \"([^\"]*)\" is added$")
    public void and_a_message_saying_is_added(String message) {
        order.addMessage(message);
    }

    // Step: Then there is <nbCocktails> cocktails in the order
    @Then("^there is (\\d+) cocktails in the order$")
    public void then_there_is_cocktails_in_the_order(int nbCocktails) {
        assertEquals(nbCocktails, order.getCocktails().size());
    }

    // Step: Then the ticket must say "<expected>"
    @Then("^the ticket must say \"([^\"]*)\"$")
    public void then_the_ticket_must_say(String expected) {
        assertEquals(expected, order.generateTicket());
    }
}
