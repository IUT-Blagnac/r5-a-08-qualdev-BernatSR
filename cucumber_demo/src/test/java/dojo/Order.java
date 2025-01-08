package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String owner;
    private String target;
    private List<String> cocktails;
    private String message;

    public Order() {
        this.cocktails = new ArrayList<>();
    }

    public void declareOwner(String name) {
        this.owner = name;
    }

    public void declareTarget(String name) {
        this.target = name;
    }

    public void addMessage(String msg) {
        this.message = msg;
    }

    public List<String> getCocktails() {
        return cocktails;
    }

    public String generateTicket() {
        StringBuilder ticket = new StringBuilder();
        ticket.append("From ").append(owner).append(" to ").append(target).append(": ");
        if (message != null && !message.isEmpty()) {
            ticket.append(message);
        }
        return ticket.toString();
    }

    public void addCocktail(String cocktail) {
        this.cocktails.add(cocktail);
    }
}
